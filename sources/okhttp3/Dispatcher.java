package okhttp3;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Dispatcher {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f26676a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public final synchronized void a() {
        try {
            Iterator it = this.b.iterator();
            Intrinsics.g(it, "iterator(...)");
            while (it.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator it2 = this.c.iterator();
            Intrinsics.g(it2, "iterator(...)");
            while (it2.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator it3 = this.d.iterator();
            Intrinsics.g(it3, "iterator(...)");
            while (it3.hasNext()) {
                ((RealCall) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f26676a == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = _UtilJvmKt.b + " Dispatcher";
                Intrinsics.h(name, "name");
                this.f26676a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new okhttp3.internal.a(name, false));
            }
            threadPoolExecutor = this.f26676a;
            Intrinsics.e(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final RealCall.AsyncCall c(String str) {
        Iterator it = this.c.iterator();
        Intrinsics.g(it, "iterator(...)");
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (Intrinsics.c(RealCall.this.e.f26690a.d, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.b.iterator();
        Intrinsics.g(it2, "iterator(...)");
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (Intrinsics.c(RealCall.this.e.f26690a.d, str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final void d(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        f();
    }

    public final void e(RealCall.AsyncCall asyncCall) {
        asyncCall.e.decrementAndGet();
        d(this.c, asyncCall);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.f():void");
    }
}
