package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.GeneratedMessageLite;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.ClientStreamTracer;
import io.grpc.CompressorRegistry;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class ClientCallImpl<ReqT, RespT> extends ClientCall<ReqT, RespT> {
    public static final Logger q = Logger.getLogger(ClientCallImpl.class.getName());
    public static final double r;

    /* renamed from: a, reason: collision with root package name */
    public final MethodDescriptor f23996a;
    public final Executor b;
    public final boolean c;
    public final CallTracer d;
    public final Context e;
    public volatile ScheduledFuture f;
    public final boolean g;
    public CallOptions h;
    public ClientStream i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final ClientStreamProvider m;
    public final ScheduledExecutorService o;
    public final ContextCancellationListener n = new ContextCancellationListener();
    public DecompressorRegistry p = DecompressorRegistry.d;

    /* renamed from: io.grpc.internal.ClientCallImpl$1ClosedByNotFoundCompressor, reason: invalid class name */
    class C1ClosedByNotFoundCompressor extends ContextRunnable {
        @Override // io.grpc.internal.ContextRunnable
        public final void a() {
            Status.m.i("Unable to find compressor by name null");
            Logger logger = ClientCallImpl.q;
            throw null;
        }
    }

    public class ClientStreamListenerImpl implements ClientStreamListener {

        /* renamed from: a, reason: collision with root package name */
        public final ClientCall.Listener f23997a;
        public Status b;

        public ClientStreamListenerImpl(ClientCall.Listener listener) {
            this.f23997a = listener;
        }

        @Override // io.grpc.internal.StreamListener
        public final void a(final StreamListener.MessageProducer messageProducer) {
            ClientCallImpl clientCallImpl = ClientCallImpl.this;
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                PerfMark.a();
                PerfMark.d();
                clientCallImpl.b.execute(new ContextRunnable() { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1MessagesAvailable
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(ClientCallImpl.this.e);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    public final void a() {
                        PerfMark.e();
                        TaskCloseable taskCloseable2 = TaskCloseable.d;
                        try {
                            PerfMark.a();
                            PerfMark.c();
                            b();
                            taskCloseable2.close();
                        } catch (Throwable th) {
                            try {
                                taskCloseable2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }

                    public final void b() throws IOException {
                        ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                        ClientCallImpl clientCallImpl2 = ClientCallImpl.this;
                        Status status = clientStreamListenerImpl.b;
                        StreamListener.MessageProducer messageProducer2 = messageProducer;
                        if (status != null) {
                            Logger logger = GrpcUtil.f24015a;
                            while (true) {
                                InputStream next = messageProducer2.next();
                                if (next == null) {
                                    return;
                                } else {
                                    GrpcUtil.b(next);
                                }
                            }
                        } else {
                            while (true) {
                                try {
                                    InputStream next2 = messageProducer2.next();
                                    if (next2 == null) {
                                        return;
                                    }
                                    try {
                                        clientStreamListenerImpl.f23997a.c(clientCallImpl2.f23996a.e.b(next2));
                                        next2.close();
                                    } catch (Throwable th) {
                                        GrpcUtil.b(next2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    Logger logger2 = GrpcUtil.f24015a;
                                    while (true) {
                                        InputStream next3 = messageProducer2.next();
                                        if (next3 == null) {
                                            Status statusI = Status.f.h(th2).i("Failed to read message.");
                                            clientStreamListenerImpl.b = statusI;
                                            clientCallImpl2.i.e(statusI);
                                            return;
                                        }
                                        GrpcUtil.b(next3);
                                    }
                                }
                            }
                        }
                    }
                });
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void b(final Metadata metadata) {
            ClientCallImpl clientCallImpl = ClientCallImpl.this;
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                PerfMark.a();
                PerfMark.d();
                clientCallImpl.b.execute(new ContextRunnable() { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1HeadersRead
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(ClientCallImpl.this.e);
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    public final void a() {
                        ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                        PerfMark.e();
                        TaskCloseable taskCloseable2 = TaskCloseable.d;
                        try {
                            PerfMark.a();
                            PerfMark.c();
                            if (clientStreamListenerImpl.b == null) {
                                try {
                                    clientStreamListenerImpl.f23997a.b(metadata);
                                } catch (Throwable th) {
                                    Status statusI = Status.f.h(th).i("Failed to read headers");
                                    clientStreamListenerImpl.b = statusI;
                                    ClientCallImpl.this.i.e(statusI);
                                }
                            }
                            taskCloseable2.close();
                        } catch (Throwable th2) {
                            try {
                                taskCloseable2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                });
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        public final void c(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                PerfMark.a();
                d(status, metadata);
                taskCloseable.close();
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(final io.grpc.Status r5, final io.grpc.Metadata r6) {
            /*
                r4 = this;
                java.util.logging.Logger r0 = io.grpc.internal.ClientCallImpl.q
                io.grpc.internal.ClientCallImpl r0 = io.grpc.internal.ClientCallImpl.this
                io.grpc.CallOptions r1 = r0.h
                io.grpc.Deadline r1 = r1.f23919a
                io.grpc.Context r2 = r0.e
                io.grpc.Deadline r2 = r2.f()
                if (r1 != 0) goto L12
            L10:
                r1 = r2
                goto L1e
            L12:
                if (r2 != 0) goto L15
                goto L1e
            L15:
                r1.a(r2)
                boolean r3 = r1.c(r2)
                if (r3 == 0) goto L10
            L1e:
                io.grpc.Status$Code r2 = r5.f23971a
                io.grpc.Status$Code r3 = io.grpc.Status.Code.CANCELLED
                if (r2 != r3) goto L4f
                if (r1 == 0) goto L4f
                boolean r1 = r1.d()
                if (r1 == 0) goto L4f
                io.grpc.internal.InsightBuilder r5 = new io.grpc.internal.InsightBuilder
                r5.<init>()
                io.grpc.internal.ClientStream r6 = r0.i
                r6.l(r5)
                io.grpc.Status r6 = io.grpc.Status.h
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "ClientCall was cancelled at or after deadline. "
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                io.grpc.Status r5 = r6.b(r5)
                io.grpc.Metadata r6 = new io.grpc.Metadata
                r6.<init>()
            L4f:
                io.perfmark.PerfMark.d()
                java.util.concurrent.Executor r0 = r0.b
                io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed r1 = new io.grpc.internal.ClientCallImpl$ClientStreamListenerImpl$1StreamClosed
                r1.<init>()
                r0.execute(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.d(io.grpc.Status, io.grpc.Metadata):void");
        }

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
            ClientCallImpl clientCallImpl = ClientCallImpl.this;
            MethodDescriptor.MethodType methodType = clientCallImpl.f23996a.f23962a;
            methodType.getClass();
            if (methodType == MethodDescriptor.MethodType.d || methodType == MethodDescriptor.MethodType.e) {
                return;
            }
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                PerfMark.a();
                PerfMark.d();
                clientCallImpl.b.execute(new ContextRunnable() { // from class: io.grpc.internal.ClientCallImpl.ClientStreamListenerImpl.1StreamOnReady
                    {
                        Context context = ClientCallImpl.this.e;
                    }

                    @Override // io.grpc.internal.ContextRunnable
                    public final void a() {
                        ClientStreamListenerImpl clientStreamListenerImpl = ClientStreamListenerImpl.this;
                        PerfMark.e();
                        TaskCloseable taskCloseable2 = TaskCloseable.d;
                        try {
                            PerfMark.a();
                            PerfMark.c();
                            if (clientStreamListenerImpl.b == null) {
                                try {
                                    clientStreamListenerImpl.f23997a.d();
                                } catch (Throwable th) {
                                    Status statusI = Status.f.h(th).i("Failed to call onReady.");
                                    clientStreamListenerImpl.b = statusI;
                                    ClientCallImpl.this.i.e(statusI);
                                }
                            }
                            taskCloseable2.close();
                        } catch (Throwable th2) {
                            try {
                                taskCloseable2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                });
                taskCloseable.close();
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

    public interface ClientStreamProvider {
        ClientStream a(MethodDescriptor methodDescriptor, CallOptions callOptions, Metadata metadata, Context context);
    }

    public final class ContextCancellationListener implements Context.CancellationListener {
        public ContextCancellationListener() {
        }

        @Override // io.grpc.Context.CancellationListener
        public final void a(Context context) {
            ClientCallImpl.this.i.e(Contexts.a(context));
        }
    }

    public class DeadlineTimer implements Runnable {
        public final long d;

        public DeadlineTimer(long j) {
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InsightBuilder insightBuilder = new InsightBuilder();
            ClientCallImpl clientCallImpl = ClientCallImpl.this;
            clientCallImpl.i.l(insightBuilder);
            long j = this.d;
            long jAbs = Math.abs(j);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(j) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder("deadline exceeded after ");
            if (j < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) clientCallImpl.h.a(ClientStreamTracer.f23924a)) == null ? 0.0d : r3.longValue() / ClientCallImpl.r)));
            sb.append(insightBuilder);
            clientCallImpl.i.e(Status.h.b(sb.toString()));
        }
    }

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        r = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public ClientCallImpl(MethodDescriptor methodDescriptor, Executor executor, CallOptions callOptions, ClientStreamProvider clientStreamProvider, ScheduledExecutorService scheduledExecutorService, CallTracer callTracer) {
        CompressorRegistry compressorRegistry = CompressorRegistry.b;
        this.f23996a = methodDescriptor;
        String str = methodDescriptor.b;
        System.identityHashCode(this);
        PerfMark.f24217a.getClass();
        if (executor == MoreExecutors.a()) {
            this.b = new SerializeReentrantCallsDirectExecutor();
            this.c = true;
        } else {
            this.b = new SerializingExecutor(executor);
            this.c = false;
        }
        this.d = callTracer;
        this.e = Context.d();
        MethodDescriptor.MethodType methodType = methodDescriptor.f23962a;
        this.g = methodType == MethodDescriptor.MethodType.d || methodType == MethodDescriptor.MethodType.e;
        this.h = callOptions;
        this.m = clientStreamProvider;
        this.o = scheduledExecutorService;
        PerfMark.b();
    }

    @Override // io.grpc.ClientCall
    public final void a(String str, Throwable th) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            f(str, th);
            taskCloseable.close();
        } catch (Throwable th2) {
            try {
                taskCloseable.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.grpc.ClientCall
    public final void b() {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            Preconditions.q("Not started", this.i != null);
            Preconditions.q("call was cancelled", !this.k);
            Preconditions.q("call already half-closed", !this.l);
            this.l = true;
            this.i.i();
            taskCloseable.close();
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    public final void c() {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            Preconditions.q("Not started", this.i != null);
            this.i.b(1);
            taskCloseable.close();
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    public final void d(GeneratedMessageLite generatedMessageLite) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            h(generatedMessageLite);
            taskCloseable.close();
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ClientCall
    public final void e(ClientCall.Listener listener, Metadata metadata) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            i(listener, metadata);
            taskCloseable.close();
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        try {
            if (this.i != null) {
                Status status = Status.f;
                Status statusI = str != null ? status.i(str) : status.i("Call cancelled without message");
                if (th != null) {
                    statusI = statusI.h(th);
                }
                this.i.e(statusI);
            }
            g();
        } catch (Throwable th2) {
            g();
            throw th2;
        }
    }

    public final void g() {
        this.e.h(this.n);
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void h(GeneratedMessageLite generatedMessageLite) {
        Preconditions.q("Not started", this.i != null);
        Preconditions.q("call was cancelled", !this.k);
        Preconditions.q("call was half-closed", !this.l);
        try {
            ClientStream clientStream = this.i;
            if (clientStream instanceof RetriableStream) {
                ((RetriableStream) clientStream).z(generatedMessageLite);
            } else {
                clientStream.g(this.f23996a.d.a(generatedMessageLite));
            }
            if (this.g) {
                return;
            }
            this.i.flush();
        } catch (Error e) {
            this.i.e(Status.f.i("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.e(Status.f.h(e2).i("Failed to stream message"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(final io.grpc.ClientCall.Listener r11, io.grpc.Metadata r12) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.ClientCallImpl.i(io.grpc.ClientCall$Listener, io.grpc.Metadata):void");
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f23996a, "method");
        return toStringHelperB.toString();
    }
}
