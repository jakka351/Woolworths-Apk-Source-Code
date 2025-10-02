package okhttp3.internal.connection;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/FastFallbackExchangeFinder;", "Lokhttp3/internal/connection/ExchangeFinder;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RoutePlanner f26714a;
    public final TaskRunner b;
    public final long c;
    public long d;
    public final CopyOnWriteArrayList e;
    public final BlockingQueue f;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        Intrinsics.h(taskRunner, "taskRunner");
        this.f26714a = routePlanner;
        this.b = taskRunner;
        this.c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.d = Long.MIN_VALUE;
        this.e = new CopyOnWriteArrayList();
        this.f = new LinkedBlockingDeque();
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws IOException {
        RoutePlanner.ConnectResult connectResultD;
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        IOException iOException = null;
        while (true) {
            try {
                boolean zIsEmpty = copyOnWriteArrayList.isEmpty();
                RoutePlanner routePlanner = this.f26714a;
                if (zIsEmpty && !routePlanner.a(null)) {
                    c();
                    Intrinsics.e(iOException);
                    throw iOException;
                }
                if (routePlanner.isCanceled()) {
                    throw new IOException("Canceled");
                }
                TaskRunner.RealBackend realBackend = this.b.d;
                long jNanoTime = System.nanoTime();
                long j = this.d - jNanoTime;
                if (copyOnWriteArrayList.isEmpty() || j <= 0) {
                    connectResultD = d();
                    j = this.c;
                    this.d = jNanoTime + j;
                } else {
                    connectResultD = null;
                }
                if (connectResultD == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (copyOnWriteArrayList.isEmpty() || (connectResultD = (RoutePlanner.ConnectResult) this.f.poll(j, timeUnit)) == null) {
                        connectResultD = null;
                    } else {
                        copyOnWriteArrayList.remove(connectResultD.f26720a);
                    }
                    if (connectResultD == null) {
                    }
                }
                RoutePlanner.Plan plan = connectResultD.f26720a;
                boolean z = false;
                if (connectResultD.b == null && connectResultD.c == null) {
                    c();
                    if (!plan.isReady()) {
                        connectResultD = plan.getD();
                    }
                    if (connectResultD.b == null && connectResultD.c == null) {
                        z = true;
                    }
                    if (z) {
                        return connectResultD.f26720a.getD();
                    }
                }
                Throwable th = connectResultD.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        ExceptionsKt.a(iOException, th);
                    }
                }
                RoutePlanner.Plan plan2 = connectResultD.b;
                if (plan2 != null) {
                    routePlanner.getP().addFirst(plan2);
                }
            } finally {
                c();
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    /* renamed from: b, reason: from getter */
    public final RoutePlanner getF26714a() {
        return this.f26714a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        Intrinsics.g(it, "iterator(...)");
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan planG = plan.g();
            if (planG != null) {
                this.f26714a.getP().addLast(planG);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RoutePlanner routePlanner = this.f26714a;
        if (routePlanner.a(null)) {
            try {
                failedPlan = routePlanner.e();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.isReady()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).d;
            }
            this.e.add(failedPlan);
            final String str = _UtilJvmKt.b + " connect " + routePlanner.getJ().h.k();
            this.b.d().c(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long a() throws InterruptedException {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.e();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.e.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.f.put(connectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
