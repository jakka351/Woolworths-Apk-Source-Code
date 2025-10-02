package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.AsyncTimeout;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lokhttp3/internal/concurrent/Lockable;", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    public final OkHttpClient d;
    public final Request e;
    public final boolean f;
    public final RealConnectionPool g;
    public final EventListener h;
    public final RealCall$timeout$1 i;
    public final AtomicBoolean j;
    public Object k;
    public ExchangeFinder l;
    public RealConnection m;
    public boolean n;
    public Exchange o;
    public boolean p;
    public boolean q;
    public boolean r;
    public volatile boolean s;
    public volatile Exchange t;
    public final CopyOnWriteArrayList u;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class AsyncCall implements Runnable {
        public final Callback d;
        public volatile AtomicInteger e = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.d = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OkHttpClient okHttpClient;
            String str = "OkHttp " + RealCall.this.e.f26690a.k();
            RealCall realCall = RealCall.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                realCall.i.j();
                boolean z = false;
                try {
                    try {
                    } catch (IOException e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        this.d.onResponse(realCall, realCall.d());
                        okHttpClient = realCall.d;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        if (z) {
                            Platform.f26752a.getClass();
                            Platform.b.h(4, "Callback failure for " + RealCall.a(realCall), e);
                        } else {
                            this.d.onFailure(realCall, e);
                        }
                        okHttpClient = realCall.d;
                        okHttpClient.f26688a.e(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        realCall.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ExceptionsKt.a(iOException, th);
                            this.d.onFailure(realCall, iOException);
                        }
                        throw th;
                    }
                    okHttpClient.f26688a.e(this);
                } catch (Throwable th3) {
                    realCall.d.f26688a.e(this);
                    throw th3;
                }
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f26716a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.f26716a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(OkHttpClient okHttpClient, Request originalRequest, boolean z) {
        Intrinsics.h(originalRequest, "originalRequest");
        this.d = okHttpClient;
        this.e = originalRequest;
        this.f = z;
        this.g = okHttpClient.E.f26670a;
        EventListener eventListener = (EventListener) okHttpClient.d.e;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        this.h = eventListener;
        ?? r4 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // okio.AsyncTimeout
            public final void l() {
                this.n.cancel();
            }
        };
        r4.h(okHttpClient.w, TimeUnit.MILLISECONDS);
        this.i = r4;
        this.j = new AtomicBoolean();
        this.r = true;
        this.u = new CopyOnWriteArrayList();
    }

    public static final String a(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.s ? "canceled " : "");
        sb.append(realCall.f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(realCall.e.f26690a.k());
        return sb.toString();
    }

    @Override // okhttp3.Call
    public final void U1(Callback callback) {
        AsyncCall asyncCallC;
        if (!this.j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f26752a.getClass();
        this.k = Platform.b.f();
        this.h.f(this);
        Dispatcher dispatcher = this.d.f26688a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.b.add(asyncCall);
            if (!this.f && (asyncCallC = dispatcher.c(this.e.f26690a.d)) != null) {
                asyncCall.e = asyncCallC.e;
            }
        }
        dispatcher.f();
    }

    public final IOException b(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketG;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        RealConnection realConnection = this.m;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketG = g();
            }
            if (this.m == null) {
                if (socketG != null) {
                    _UtilJvmKt.c(socketG);
                }
                this.h.l(this, realConnection);
                realConnection.o.getClass();
                if (socketG != null) {
                    realConnection.o.getClass();
                }
            } else if (socketG != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.n && k()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.h.d(this);
            return interruptedIOException;
        }
        EventListener eventListener = this.h;
        Intrinsics.e(interruptedIOException);
        eventListener.e(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void c(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.r) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (exchange = this.t) != null) {
            exchange.d.cancel();
            exchange.f26713a.e(exchange, true, true, null);
        }
        this.o = null;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        if (this.s) {
            return;
        }
        this.s = true;
        Exchange exchange = this.t;
        if (exchange != null) {
            exchange.d.cancel();
        }
        Iterator it = this.u.iterator();
        Intrinsics.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.h.g(this);
    }

    public final Object clone() {
        return new RealCall(this.d, this.e, this.f);
    }

    public final Response d() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.h(this.d.b, arrayList);
        arrayList.add(new RetryAndFollowUpInterceptor(this.d));
        arrayList.add(new BridgeInterceptor(this.d.j));
        arrayList.add(new CacheInterceptor(this.d.k));
        arrayList.add(ConnectInterceptor.f26710a);
        if (!this.f) {
            CollectionsKt.h(this.d.c, arrayList);
        }
        arrayList.add(new CallServerInterceptor(this.f));
        Request request = this.e;
        OkHttpClient okHttpClient = this.d;
        try {
            try {
                Response responseC = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.x, okHttpClient.y, okHttpClient.z).c(this.e);
                if (this.s) {
                    _UtilCommonKt.b(responseC);
                    throw new IOException("Canceled");
                }
                f(null);
                return responseC;
            } catch (IOException e) {
                IOException iOExceptionF = f(e);
                Intrinsics.f(iOExceptionF, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionF;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                f(null);
            }
            throw th;
        }
    }

    public final IOException e(Exchange exchange, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        Intrinsics.h(exchange, "exchange");
        if (exchange.equals(this.t)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.p) {
                            if (z2 || !this.q) {
                                z4 = false;
                            }
                        }
                        if (z) {
                            this.p = false;
                        }
                        if (z2) {
                            this.q = false;
                        }
                        boolean z5 = this.p;
                        boolean z6 = (z5 || this.q) ? false : true;
                        if (!z5 && !this.q) {
                            if (!this.r) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.t = null;
                RealConnection realConnection = this.m;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.t++;
                    }
                }
            }
            if (z4) {
                return b(iOException);
            }
        }
        return iOException;
    }

    @Override // okhttp3.Call
    public final Response execute() {
        if (!this.j.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        j();
        Platform.f26752a.getClass();
        this.k = Platform.b.f();
        this.h.f(this);
        try {
            Dispatcher dispatcher = this.d.f26688a;
            synchronized (dispatcher) {
                dispatcher.d.add(this);
            }
            return d();
        } finally {
            Dispatcher dispatcher2 = this.d.f26688a;
            dispatcher2.d(dispatcher2.d, this);
        }
    }

    public final IOException f(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.r) {
                this.r = false;
                if (!this.p) {
                    if (!this.q) {
                        z = true;
                    }
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket g() {
        RealConnection realConnection = this.m;
        Intrinsics.e(realConnection);
        TimeZone timeZone = _UtilJvmKt.f26699a;
        ArrayList arrayList = realConnection.w;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.m = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.x = System.nanoTime();
        RealConnectionPool realConnectionPool = this.g;
        ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.g;
        TimeZone timeZone2 = _UtilJvmKt.f26699a;
        if (!realConnection.q && realConnectionPool.f26717a != 0) {
            realConnectionPool.e.c(realConnectionPool.f, 0L);
            return null;
        }
        realConnection.q = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            TaskQueue taskQueue = realConnectionPool.e;
            synchronized (taskQueue.f26707a) {
                if (taskQueue.a()) {
                    taskQueue.f26707a.c(taskQueue);
                }
            }
        }
        Address address = realConnection.g.f26694a;
        Intrinsics.h(address, "address");
        RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.addressStates.get(address);
        if (addressState == null) {
            return realConnection.i;
        }
        realConnectionPool.b(addressState);
        throw null;
    }

    @Override // okhttp3.Call
    /* renamed from: isCanceled, reason: from getter */
    public final boolean getS() {
        return this.s;
    }

    @Override // okhttp3.Call
    /* renamed from: n, reason: from getter */
    public final RealCall$timeout$1 getI() {
        return this.i;
    }

    @Override // okhttp3.Call
    /* renamed from: x, reason: from getter */
    public final Request getE() {
        return this.e;
    }
}
