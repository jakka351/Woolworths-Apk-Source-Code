package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.InternalLogId;
import io.grpc.Server;
import io.grpc.Status;
import io.grpc.internal.StreamListener;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class ServerImpl extends Server implements InternalInstrumented<InternalChannelz.ServerStats> {
    public static final Logger b = Logger.getLogger(ServerImpl.class.getName());
    public static final ServerStreamListener c = null;

    @VisibleForTesting
    public static final class ContextCloser implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @VisibleForTesting
    public static final class JumpToApplicationThreadServerStreamListener implements ServerStreamListener {

        /* renamed from: io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1Closed, reason: invalid class name */
        final class C1Closed extends ContextRunnable {
            @Override // io.grpc.internal.ContextRunnable
            public final void a() {
                PerfMark.e();
                TaskCloseable taskCloseable = TaskCloseable.d;
                try {
                    throw null;
                } catch (Throwable th) {
                    try {
                        taskCloseable.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1HalfClosed, reason: invalid class name */
        final class C1HalfClosed extends ContextRunnable {
            /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                throw null;
             */
            @Override // io.grpc.internal.ContextRunnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a() {
                /*
                    r3 = this;
                    r0 = 0
                    io.perfmark.PerfMark.e()     // Catch: java.lang.Throwable -> L11
                    io.perfmark.TaskCloseable r1 = io.perfmark.TaskCloseable.d     // Catch: java.lang.Throwable -> L11
                    throw r0     // Catch: java.lang.Throwable -> L7
                L7:
                    r2 = move-exception
                    r1.close()     // Catch: java.lang.Throwable -> Lc
                    goto L10
                Lc:
                    r1 = move-exception
                    r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L11
                L10:
                    throw r2     // Catch: java.lang.Throwable -> L11
                L11:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.C1HalfClosed.a():void");
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1MessagesAvailable, reason: invalid class name */
        final class C1MessagesAvailable extends ContextRunnable {
            /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                throw null;
             */
            @Override // io.grpc.internal.ContextRunnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a() {
                /*
                    r3 = this;
                    r0 = 0
                    io.perfmark.PerfMark.e()     // Catch: java.lang.Throwable -> L11
                    io.perfmark.TaskCloseable r1 = io.perfmark.TaskCloseable.d     // Catch: java.lang.Throwable -> L11
                    throw r0     // Catch: java.lang.Throwable -> L7
                L7:
                    r2 = move-exception
                    r1.close()     // Catch: java.lang.Throwable -> Lc
                    goto L10
                Lc:
                    r1 = move-exception
                    r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L11
                L10:
                    throw r2     // Catch: java.lang.Throwable -> L11
                L11:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.C1MessagesAvailable.a():void");
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$JumpToApplicationThreadServerStreamListener$1OnReady, reason: invalid class name */
        final class C1OnReady extends ContextRunnable {
            /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                throw null;
             */
            @Override // io.grpc.internal.ContextRunnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a() {
                /*
                    r3 = this;
                    r0 = 0
                    io.perfmark.PerfMark.e()     // Catch: java.lang.Throwable -> L11
                    io.perfmark.TaskCloseable r1 = io.perfmark.TaskCloseable.d     // Catch: java.lang.Throwable -> L11
                    throw r0     // Catch: java.lang.Throwable -> L7
                L7:
                    r2 = move-exception
                    r1.close()     // Catch: java.lang.Throwable -> Lc
                    goto L10
                Lc:
                    r1 = move-exception
                    r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L11
                L10:
                    throw r2     // Catch: java.lang.Throwable -> L11
                L11:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ServerImpl.JumpToApplicationThreadServerStreamListener.C1OnReady.a():void");
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void a(StreamListener.MessageProducer messageProducer) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                throw null;
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                throw null;
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static final class NoopListener implements ServerStreamListener {
        @Override // io.grpc.internal.StreamListener
        public final void a(StreamListener.MessageProducer messageProducer) throws IOException {
            while (true) {
                InputStream next = messageProducer.next();
                if (next == null) {
                    return;
                }
                try {
                    next.close();
                } catch (IOException e) {
                    while (true) {
                        InputStream next2 = messageProducer.next();
                        if (next2 == null) {
                            throw new RuntimeException(e);
                        }
                        try {
                            next2.close();
                        } catch (IOException e2) {
                            ServerImpl.b.log(Level.WARNING, "Exception closing stream", (Throwable) e2);
                        }
                    }
                }
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
        }
    }

    public final class ServerListenerImpl implements ServerListener {
    }

    public final class ServerTransportListenerImpl implements ServerTransportListener {

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1HandleServerCall, reason: invalid class name */
        final class C1HandleServerCall extends ContextRunnable {

            /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1HandleServerCall$1ServerStreamCancellationListener, reason: invalid class name */
            final class C1ServerStreamCancellationListener implements Context.CancellationListener {
                @Override // io.grpc.Context.CancellationListener
                public final void a(Context context) {
                    if (Status.h.f23971a.equals(Contexts.a(context).f23971a)) {
                        throw null;
                    }
                }
            }

            @Override // io.grpc.internal.ContextRunnable
            public final void a() {
                PerfMark.e();
                TaskCloseable taskCloseable = TaskCloseable.d;
                try {
                    throw null;
                } catch (Throwable th) {
                    try {
                        taskCloseable.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1MethodLookup, reason: invalid class name */
        final class C1MethodLookup extends ContextRunnable {
            @Override // io.grpc.internal.ContextRunnable
            public final void a() {
                PerfMark.e();
                TaskCloseable taskCloseable = TaskCloseable.d;
                try {
                    throw null;
                } catch (Throwable th) {
                    try {
                        taskCloseable.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }

        /* renamed from: io.grpc.internal.ServerImpl$ServerTransportListenerImpl$1TransportShutdownNow, reason: invalid class name */
        class C1TransportShutdownNow implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public final class ServerCallParameters<ReqT, RespT> {
        }
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return null;
    }

    public final String toString() {
        MoreObjects.b(this);
        throw null;
    }
}
