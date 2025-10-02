package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class DelayedStream implements ClientStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f24005a;
    public ClientStreamListener b;
    public ClientStream c;
    public Status d;
    public DelayedStreamListener f;
    public long g;
    public long h;
    public List e = new ArrayList();
    public ArrayList i = new ArrayList();

    /* renamed from: io.grpc.internal.DelayedStream$15, reason: invalid class name */
    class AnonymousClass15 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.DelayedStream$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DelayedStream.this.p();
        }
    }

    /* renamed from: io.grpc.internal.DelayedStream$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static class DelayedStreamListener implements ClientStreamListener {

        /* renamed from: a, reason: collision with root package name */
        public final ClientStreamListener f24006a;
        public volatile boolean b;
        public List c = new ArrayList();

        public DelayedStreamListener(ClientStreamListener clientStreamListener) {
            this.f24006a = clientStreamListener;
        }

        @Override // io.grpc.internal.StreamListener
        public final void a(final StreamListener.MessageProducer messageProducer) {
            if (this.b) {
                this.f24006a.a(messageProducer);
            } else {
                d(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedStreamListener.this.f24006a.a(messageProducer);
                    }
                });
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(final Metadata metadata) {
            d(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.3
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStreamListener.this.f24006a.b(metadata);
                }
            });
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void c(final Status status, final ClientStreamListener.RpcProgress rpcProgress, final Metadata metadata) {
            d(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.4
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStreamListener.this.f24006a.c(status, rpcProgress, metadata);
                }
            });
        }

        public final void d(Runnable runnable) {
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

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
            if (this.b) {
                this.f24006a.onReady();
            } else {
                d(new Runnable() { // from class: io.grpc.internal.DelayedStream.DelayedStreamListener.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelayedStreamListener.this.f24006a.onReady();
                    }
                });
            }
        }
    }

    @Override // io.grpc.internal.Stream
    public final void a(final Compressor compressor) {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.12
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.a(compressor);
            }
        });
    }

    @Override // io.grpc.internal.Stream
    public final void b(int i) {
        Preconditions.q("May only be called after start", this.b != null);
        if (this.f24005a) {
            this.c.b(1);
        } else {
            o(new Runnable() { // from class: io.grpc.internal.DelayedStream.10
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStream.this.c.b(1);
                }
            });
        }
    }

    @Override // io.grpc.internal.ClientStream
    public final void c(final int i) {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.1
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.c(i);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void d(final int i) {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.2
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.d(i);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public void e(final Status status) {
        boolean z = false;
        boolean z2 = true;
        Preconditions.q("May only be called after start", this.b != null);
        Preconditions.j(status, "reason");
        synchronized (this) {
            try {
                ClientStream clientStream = this.c;
                if (clientStream == null) {
                    NoopClientStream noopClientStream = NoopClientStream.f24060a;
                    if (clientStream != null) {
                        z2 = false;
                    }
                    Preconditions.p("realStream already set to %s", clientStream, z2);
                    this.c = noopClientStream;
                    this.h = System.nanoTime();
                    this.d = status;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            o(new Runnable() { // from class: io.grpc.internal.DelayedStream.8
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStream.this.c.e(status);
                }
            });
            return;
        }
        p();
        r(status);
        this.b.c(status, ClientStreamListener.RpcProgress.d, new Metadata());
    }

    @Override // io.grpc.internal.ClientStream
    public final void f() {
        Preconditions.q("May only be called before start", this.b == null);
        Preconditions.j(null, "authority");
        throw null;
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
        Preconditions.q("May only be called after start", this.b != null);
        if (this.f24005a) {
            this.c.flush();
        } else {
            o(new Runnable() { // from class: io.grpc.internal.DelayedStream.7
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStream.this.c.flush();
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    public final void g(final InputStream inputStream) {
        Preconditions.q("May only be called after start", this.b != null);
        Preconditions.j(inputStream, "message");
        if (this.f24005a) {
            this.c.g(inputStream);
        } else {
            o(new Runnable() { // from class: io.grpc.internal.DelayedStream.6
                @Override // java.lang.Runnable
                public final void run() {
                    DelayedStream.this.c.g(inputStream);
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    public final void h() {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.11
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.h();
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void i() {
        Preconditions.q("May only be called after start", this.b != null);
        o(new Runnable() { // from class: io.grpc.internal.DelayedStream.9
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.i();
            }
        });
    }

    @Override // io.grpc.internal.Stream
    public final boolean isReady() {
        if (this.f24005a) {
            return this.c.isReady();
        }
        return false;
    }

    @Override // io.grpc.internal.ClientStream
    public final void j(final DecompressorRegistry decompressorRegistry) {
        Preconditions.q("May only be called before start", this.b == null);
        Preconditions.j(decompressorRegistry, "decompressorRegistry");
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.14
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.j(decompressorRegistry);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void k() {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.13
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.k();
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public void l(InsightBuilder insightBuilder) {
        synchronized (this) {
            try {
                if (this.b == null) {
                    return;
                }
                if (this.c != null) {
                    insightBuilder.a(Long.valueOf(this.h - this.g), "buffered_nanos");
                    this.c.l(insightBuilder);
                } else {
                    insightBuilder.a(Long.valueOf(System.nanoTime() - this.g), "buffered_nanos");
                    insightBuilder.f24022a.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.ClientStream
    public final void m(final Deadline deadline) {
        Preconditions.q("May only be called before start", this.b == null);
        this.i.add(new Runnable() { // from class: io.grpc.internal.DelayedStream.3
            @Override // java.lang.Runnable
            public final void run() {
                DelayedStream.this.c.m(deadline);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    public final void n(ClientStreamListener clientStreamListener) {
        Status status;
        boolean z;
        Preconditions.j(clientStreamListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Preconditions.q("already started", this.b == null);
        synchronized (this) {
            try {
                status = this.d;
                z = this.f24005a;
                if (!z) {
                    DelayedStreamListener delayedStreamListener = new DelayedStreamListener(clientStreamListener);
                    this.f = delayedStreamListener;
                    clientStreamListener = delayedStreamListener;
                }
                this.b = clientStreamListener;
                this.g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (status != null) {
            clientStreamListener.c(status, ClientStreamListener.RpcProgress.d, new Metadata());
        } else if (z) {
            q(clientStreamListener);
        }
    }

    public final void o(Runnable runnable) {
        Preconditions.q("May only be called after start", this.b != null);
        synchronized (this) {
            try {
                if (this.f24005a) {
                    runnable.run();
                } else {
                    this.e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f24005a = r1     // Catch: java.lang.Throwable -> L50
            io.grpc.internal.DelayedStream$DelayedStreamListener r2 = r6.f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.c = r0     // Catch: java.lang.Throwable -> L2d
            r2.b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L2d
            r2.c = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.e     // Catch: java.lang.Throwable -> L50
            r6.e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.DelayedStream.p():void");
    }

    public final void q(ClientStreamListener clientStreamListener) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.c.n(clientStreamListener);
    }

    public void r(Status status) {
    }

    public final Runnable s(ClientStream clientStream) {
        synchronized (this) {
            try {
                if (this.c != null) {
                    return null;
                }
                Preconditions.j(clientStream, "stream");
                ClientStream clientStream2 = this.c;
                Preconditions.p("realStream already set to %s", clientStream2, clientStream2 == null);
                this.c = clientStream;
                this.h = System.nanoTime();
                ClientStreamListener clientStreamListener = this.b;
                if (clientStreamListener == null) {
                    this.e = null;
                    this.f24005a = true;
                }
                if (clientStreamListener == null) {
                    return null;
                }
                q(clientStreamListener);
                return new AnonymousClass4();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
