package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.ClientCall;
import io.grpc.Context;
import io.grpc.Deadline;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class DelayedClientCall<ReqT, RespT> extends ClientCall<ReqT, RespT> {
    public static final Logger j = Logger.getLogger(DelayedClientCall.class.getName());
    public static final ClientCall k = new AnonymousClass8();

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f24002a;
    public final Executor b;
    public final Context c;
    public volatile boolean d;
    public ClientCall.Listener e;
    public ClientCall f;
    public Status g;
    public List h = new ArrayList();
    public DelayedListener i;

    /* renamed from: io.grpc.internal.DelayedClientCall$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.DelayedClientCall$8, reason: invalid class name */
    public class AnonymousClass8 extends ClientCall<Object, Object> {
        @Override // io.grpc.ClientCall
        public final void a(String str, Throwable th) {
        }

        @Override // io.grpc.ClientCall
        public final void b() {
        }

        @Override // io.grpc.ClientCall
        public final void c() {
        }

        @Override // io.grpc.ClientCall
        public final void d(GeneratedMessageLite generatedMessageLite) {
        }

        @Override // io.grpc.ClientCall
        public final void e(ClientCall.Listener listener, Metadata metadata) {
        }
    }

    public final class CloseListenerRunnable extends ContextRunnable {
        public final ClientCall.Listener e;
        public final Status f;

        public CloseListenerRunnable(DelayedClientCall delayedClientCall, ClientCall.Listener listener, Status status) {
            super(delayedClientCall.c);
            this.e = listener;
            this.f = status;
        }

        @Override // io.grpc.internal.ContextRunnable
        public final void a() {
            this.e.a(this.f, new Metadata());
        }
    }

    public static final class DelayedListener<RespT> extends ClientCall.Listener<RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final ClientCall.Listener f24003a;
        public volatile boolean b;
        public List c = new ArrayList();

        public DelayedListener(ClientCall.Listener listener) {
            this.f24003a = listener;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void a(final Status status, final Metadata metadata) {
            e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.3
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedListener.this.f24003a.a(status, metadata);
                }
            });
        }

        @Override // io.grpc.ClientCall.Listener
        public final void b(final Metadata metadata) {
            if (this.b) {
                this.f24003a.b(metadata);
            } else {
                e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedListener.this.f24003a.b(metadata);
                    }
                });
            }
        }

        @Override // io.grpc.ClientCall.Listener
        public final void c(final Object obj) {
            if (this.b) {
                this.f24003a.c(obj);
            } else {
                e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedListener.this.f24003a.c(obj);
                    }
                });
            }
        }

        @Override // io.grpc.ClientCall.Listener
        public final void d() {
            if (this.b) {
                this.f24003a.d();
            } else {
                e(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.DelayedListener.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedListener.this.f24003a.d();
                    }
                });
            }
        }

        public final void e(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.b) {
                        runnable.run();
                    } else {
                        this.c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public DelayedClientCall(Executor executor, ScheduledExecutorService scheduledExecutorService, Deadline deadline) {
        long jE;
        ScheduledFuture<?> scheduledFutureSchedule;
        Preconditions.j(executor, "callExecutor");
        this.b = executor;
        Preconditions.j(scheduledExecutorService, "scheduler");
        Context contextD = Context.d();
        this.c = contextD;
        Deadline deadlineF = contextD.f();
        if (deadline == null && deadlineF == null) {
            scheduledFutureSchedule = null;
        } else {
            if (deadline != null) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                jE = deadline.e();
            } else {
                jE = Long.MAX_VALUE;
            }
            if (deadlineF != null) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (deadlineF.e() < jE) {
                    jE = deadlineF.e();
                    Level level = Level.FINE;
                    Logger logger = j;
                    if (logger.isLoggable(level)) {
                        Locale locale = Locale.US;
                        StringBuilder sb = new StringBuilder(androidx.camera.core.impl.b.l(jE, "Call timeout set to '", "' ns, due to context deadline."));
                        if (deadline == null) {
                            sb.append(" Explicit call timeout was not set.");
                        } else {
                            sb.append(" Explicit call timeout was '" + deadline.e() + "' ns.");
                        }
                        logger.fine(sb.toString());
                    }
                }
            }
            long jAbs = Math.abs(jE);
            TimeUnit timeUnit3 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit3.toNanos(1L);
            long jAbs2 = Math.abs(jE) % timeUnit3.toNanos(1L);
            final StringBuilder sb2 = new StringBuilder();
            String str = deadline == null ? true : deadlineF == null ? false : deadlineF.c(deadline) ? "Context" : "CallOptions";
            if (jE < 0) {
                androidx.compose.ui.input.pointer.a.w(sb2, "ClientCall started after ", str, " deadline was exceeded. Deadline has been exceeded for ");
            } else {
                androidx.compose.ui.input.pointer.a.w(sb2, "Deadline ", str, " will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.1DeadlineExceededRunnable
                @Override // java.lang.Runnable
                public final void run() {
                    Status statusI = Status.h.i(sb2.toString());
                    Logger logger2 = DelayedClientCall.j;
                    DelayedClientCall.this.g(statusI, true);
                }
            }, jE, TimeUnit.NANOSECONDS);
        }
        this.f24002a = scheduledFutureSchedule;
    }

    @Override // io.grpc.ClientCall
    public final void a(String str, Throwable th) {
        Status status = Status.f;
        Status statusI = str != null ? status.i(str) : status.i("Call cancelled without message");
        if (th != null) {
            statusI = statusI.h(th);
        }
        g(statusI, false);
    }

    @Override // io.grpc.ClientCall
    public final void b() {
        h(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.7
            @Override // java.lang.Runnable
            public final void run() {
                DelayedClientCall.this.f.b();
            }
        });
    }

    @Override // io.grpc.ClientCall
    public final void c() {
        if (this.d) {
            this.f.c();
        } else {
            h(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.6
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedClientCall.this.f.c();
                }
            });
        }
    }

    @Override // io.grpc.ClientCall
    public final void d(final GeneratedMessageLite generatedMessageLite) {
        if (this.d) {
            this.f.d(generatedMessageLite);
        } else {
            h(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.4
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedClientCall.this.f.d(generatedMessageLite);
                }
            });
        }
    }

    @Override // io.grpc.ClientCall
    public final void e(final ClientCall.Listener listener, final Metadata metadata) {
        Status status;
        boolean z;
        Preconditions.q("already started", this.e == null);
        synchronized (this) {
            try {
                this.e = listener;
                status = this.g;
                z = this.d;
                if (!z) {
                    DelayedListener delayedListener = new DelayedListener(listener);
                    this.i = delayedListener;
                    listener = delayedListener;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (status != null) {
            this.b.execute(new CloseListenerRunnable(this, listener, status));
        } else if (z) {
            this.f.e(listener, metadata);
        } else {
            h(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.2
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedClientCall.this.f.e(listener, metadata);
                }
            });
        }
    }

    public void f() {
    }

    public final void g(final Status status, boolean z) {
        ClientCall.Listener listener;
        synchronized (this) {
            try {
                ClientCall clientCall = this.f;
                boolean z2 = true;
                if (clientCall == null) {
                    ClientCall clientCall2 = k;
                    if (clientCall != null) {
                        z2 = false;
                    }
                    Preconditions.p("realCall already set to %s", clientCall, z2);
                    ScheduledFuture scheduledFuture = this.f24002a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = clientCall2;
                    listener = this.e;
                    this.g = status;
                    z2 = false;
                } else if (z) {
                    return;
                } else {
                    listener = null;
                }
                if (z2) {
                    h(new Runnable() { // from class: io.grpc.internal.DelayedClientCall.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ClientCall clientCall3 = DelayedClientCall.this.f;
                            Status status2 = status;
                            clientCall3.a(status2.b, status2.c);
                        }
                    });
                } else {
                    if (listener != null) {
                        this.b.execute(new CloseListenerRunnable(this, listener, status));
                    }
                    i();
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.d) {
                    runnable.run();
                } else {
                    this.h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L24
            io.grpc.internal.DelayedClientCall$DelayedListener r0 = r3.i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.b
            io.grpc.internal.DelayedClientCall$1DrainListenerRunnable r2 = new io.grpc.internal.DelayedClientCall$1DrainListenerRunnable
            r2.<init>(r3)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.h     // Catch: java.lang.Throwable -> L24
            r3.h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.DelayedClientCall.i():void");
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f, "realCall");
        return toStringHelperB.toString();
    }
}
