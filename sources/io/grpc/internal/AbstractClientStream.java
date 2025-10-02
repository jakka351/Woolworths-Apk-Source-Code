package io.grpc.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.Codec;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.Decompressor;
import io.grpc.DecompressorRegistry;
import io.grpc.Grpc;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StreamTracer;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.MessageFramer;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public abstract class AbstractClientStream extends AbstractStream implements ClientStream, MessageFramer.Sink {
    public static final Logger g = Logger.getLogger(AbstractClientStream.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final TransportTracer f23979a;
    public final Framer b;
    public final boolean c;
    public final boolean d;
    public Metadata e;
    public volatile boolean f;

    public class GetFramer implements Framer {

        /* renamed from: a, reason: collision with root package name */
        public Metadata f23980a;
        public boolean b;
        public final StatsTraceContext c;
        public byte[] d;

        public GetFramer(Metadata metadata, StatsTraceContext statsTraceContext) {
            Preconditions.j(metadata, "headers");
            this.f23980a = metadata;
            this.c = statsTraceContext;
        }

        @Override // io.grpc.internal.Framer
        public final Framer a(Compressor compressor) {
            return this;
        }

        @Override // io.grpc.internal.Framer
        public final void b(InputStream inputStream) {
            Preconditions.q("writePayload should not be called multiple times", this.d == null);
            try {
                this.d = ByteStreams.c(inputStream);
                StatsTraceContext statsTraceContext = this.c;
                StreamTracer[] streamTracerArr = statsTraceContext.f24108a;
                StreamTracer[] streamTracerArr2 = statsTraceContext.f24108a;
                for (StreamTracer streamTracer : streamTracerArr) {
                    streamTracer.e(0);
                }
                byte[] bArr = this.d;
                long length = bArr.length;
                long length2 = bArr.length;
                for (StreamTracer streamTracer2 : statsTraceContext.f24108a) {
                    streamTracer2.f(0, length, length2);
                }
                long length3 = this.d.length;
                for (StreamTracer streamTracer3 : streamTracerArr2) {
                    streamTracer3.g(length3);
                }
                long length4 = this.d.length;
                for (StreamTracer streamTracer4 : streamTracerArr2) {
                    streamTracer4.h(length4);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // io.grpc.internal.Framer
        public final void close() {
            this.b = true;
            Preconditions.q("Lack of request message. GET request is only supported for unary requests", this.d != null);
            AbstractClientStream.this.r().g(this.f23980a, this.d);
            this.d = null;
            this.f23980a = null;
        }

        @Override // io.grpc.internal.Framer
        public final void d(int i) {
        }

        @Override // io.grpc.internal.Framer
        public final void flush() {
        }

        @Override // io.grpc.internal.Framer
        public final boolean isClosed() {
            return this.b;
        }
    }

    public interface Sink {
        void e(Status status);

        void f(WritableBuffer writableBuffer, boolean z, boolean z2, int i);

        void g(Metadata metadata, byte[] bArr);
    }

    public static abstract class TransportState extends AbstractStream.TransportState {
        public final StatsTraceContext h;
        public boolean i;
        public ClientStreamListener j;
        public DecompressorRegistry k;
        public boolean l;
        public Runnable m;
        public volatile boolean n;
        public boolean o;
        public boolean p;

        /* renamed from: io.grpc.internal.AbstractClientStream$TransportState$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            public final /* synthetic */ Status d;
            public final /* synthetic */ ClientStreamListener.RpcProgress e;
            public final /* synthetic */ Metadata f;

            public AnonymousClass1(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
                this.d = status;
                this.e = rpcProgress;
                this.f = metadata;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TransportState.this.i(this.d, this.e, this.f);
            }
        }

        public TransportState(int i, StatsTraceContext statsTraceContext, TransportTracer transportTracer) {
            super(i, statsTraceContext, transportTracer);
            this.k = DecompressorRegistry.d;
            this.l = false;
            this.h = statsTraceContext;
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public void c(boolean z) {
            Preconditions.q("status should have been reported on deframer closed", this.o);
            this.l = true;
            if (this.p && z) {
                k(new Metadata(), Status.m.i("Encountered end-of-stream mid-frame"), true);
            }
            Runnable runnable = this.m;
            if (runnable != null) {
                ((AnonymousClass1) runnable).run();
                this.m = null;
            }
        }

        @Override // io.grpc.internal.AbstractStream.TransportState
        public final StreamListener h() {
            return this.j;
        }

        public final void i(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
            if (this.i) {
                return;
            }
            this.i = true;
            StatsTraceContext statsTraceContext = this.h;
            if (statsTraceContext.b.compareAndSet(false, true)) {
                for (StreamTracer streamTracer : statsTraceContext.f24108a) {
                    streamTracer.i(status);
                }
            }
            if (this.c != null) {
                status.f();
            }
            this.j.c(status, rpcProgress, metadata);
        }

        public final void j(Metadata metadata) {
            Preconditions.q("Received headers on closed stream", !this.o);
            for (StreamTracer streamTracer : this.h.f24108a) {
                ((ClientStreamTracer) streamTracer).k();
            }
            String str = (String) metadata.c(GrpcUtil.d);
            if (str != null) {
                Decompressor decompressorA = this.k.a(str);
                if (decompressorA == null) {
                    f(Status.m.i("Can't find decompressor for ".concat(str)).a());
                    return;
                } else if (decompressorA != Codec.Identity.f23926a) {
                    this.f23981a.d(decompressorA);
                }
            }
            this.j.b(metadata);
        }

        public final void k(Metadata metadata, Status status, boolean z) {
            l(status, ClientStreamListener.RpcProgress.d, z, metadata);
        }

        public final void l(Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z, Metadata metadata) {
            Preconditions.j(status, "status");
            if (!this.o || z) {
                this.o = true;
                this.p = status.f();
                synchronized (this.b) {
                    this.g = true;
                }
                if (this.l) {
                    this.m = null;
                    i(status, rpcProgress, metadata);
                    return;
                }
                this.m = new AnonymousClass1(status, rpcProgress, metadata);
                if (z) {
                    this.f23981a.close();
                } else {
                    this.f23981a.f();
                }
            }
        }
    }

    public AbstractClientStream(WritableBufferAllocator writableBufferAllocator, StatsTraceContext statsTraceContext, TransportTracer transportTracer, Metadata metadata, CallOptions callOptions, boolean z) {
        Preconditions.j(metadata, "headers");
        Preconditions.j(transportTracer, "transportTracer");
        this.f23979a = transportTracer;
        this.c = !Boolean.TRUE.equals(callOptions.a(GrpcUtil.n));
        this.d = z;
        if (z) {
            this.b = new GetFramer(metadata, statsTraceContext);
        } else {
            this.b = new MessageFramer(this, writableBufferAllocator, statsTraceContext);
            this.e = metadata;
        }
    }

    @Override // io.grpc.internal.ClientStream
    public final void c(int i) {
        q().f23981a.c(i);
    }

    @Override // io.grpc.internal.ClientStream
    public final void d(int i) {
        this.b.d(i);
    }

    @Override // io.grpc.internal.ClientStream
    public final void e(Status status) {
        Preconditions.f("Should not cancel with OK status", !status.f());
        this.f = true;
        r().e(status);
    }

    @Override // io.grpc.internal.ClientStream
    public final void i() {
        if (q().n) {
            return;
        }
        q().n = true;
        p().close();
    }

    @Override // io.grpc.internal.AbstractStream, io.grpc.internal.Stream
    public final boolean isReady() {
        return super.isReady() && !this.f;
    }

    @Override // io.grpc.internal.ClientStream
    public final void j(DecompressorRegistry decompressorRegistry) {
        TransportState transportStateQ = q();
        Preconditions.q("Already called start", transportStateQ.j == null);
        Preconditions.j(decompressorRegistry, "decompressorRegistry");
        transportStateQ.k = decompressorRegistry;
    }

    @Override // io.grpc.internal.ClientStream
    public final void k() {
        q().getClass();
    }

    @Override // io.grpc.internal.ClientStream
    public final void l(InsightBuilder insightBuilder) {
        Attributes attributes = getAttributes();
        insightBuilder.a(attributes.f23916a.get(Grpc.f23938a), "remote_addr");
    }

    @Override // io.grpc.internal.ClientStream
    public final void m(Deadline deadline) {
        Metadata metadata = this.e;
        Metadata.Key key = GrpcUtil.c;
        metadata.a(key);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.e.f(key, Long.valueOf(Math.max(0L, deadline.e())));
    }

    @Override // io.grpc.internal.ClientStream
    public final void n(ClientStreamListener clientStreamListener) {
        TransportState transportStateQ = q();
        Preconditions.q("Already called setListener", transportStateQ.j == null);
        Preconditions.j(clientStreamListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        transportStateQ.j = clientStreamListener;
        if (this.d) {
            return;
        }
        r().g(this.e, null);
        this.e = null;
    }

    @Override // io.grpc.internal.MessageFramer.Sink
    public final void o(WritableBuffer writableBuffer, boolean z, boolean z2, int i) {
        Preconditions.f("null frame before EOS", writableBuffer != null || z);
        r().f(writableBuffer, z, z2, i);
    }

    @Override // io.grpc.internal.AbstractStream
    public final Framer p() {
        return this.b;
    }

    public abstract Sink r();

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract TransportState q();
}
