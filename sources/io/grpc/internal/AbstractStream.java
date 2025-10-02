package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.Compressor;
import io.grpc.internal.ApplicationThreadDeframer;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class AbstractStream implements Stream {

    public static abstract class TransportState implements ApplicationThreadDeframer.TransportExecutor, MessageDeframer.Listener {

        /* renamed from: a, reason: collision with root package name */
        public Deframer f23981a;
        public final Object b = new Object();
        public final TransportTracer c;
        public final MessageDeframer d;
        public int e;
        public boolean f;
        public boolean g;

        public TransportState(int i, StatsTraceContext statsTraceContext, TransportTracer transportTracer) {
            Preconditions.j(transportTracer, "transportTracer");
            this.c = transportTracer;
            MessageDeframer messageDeframer = new MessageDeframer(this, i, statsTraceContext, transportTracer);
            this.d = messageDeframer;
            this.f23981a = messageDeframer;
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void a(StreamListener.MessageProducer messageProducer) {
            h().a(messageProducer);
        }

        public final void e(int i) {
            boolean z;
            boolean zG;
            synchronized (this.b) {
                Preconditions.q("onStreamAllocated was not called, but it seems the stream is active", this.f);
                int i2 = this.e;
                z = false;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.e = i3;
                boolean z3 = i3 < 32768;
                if (!z2 && z3) {
                    z = true;
                }
            }
            if (z) {
                synchronized (this.b) {
                    zG = g();
                }
                if (zG) {
                    h().onReady();
                }
            }
        }

        public final boolean g() {
            boolean z;
            synchronized (this.b) {
                try {
                    z = this.f && this.e < 32768 && !this.g;
                } finally {
                }
            }
            return z;
        }

        public abstract StreamListener h();
    }

    @Override // io.grpc.internal.Stream
    public final void a(Compressor compressor) {
        Framer framerP = p();
        Preconditions.j(compressor, "compressor");
        framerP.a(compressor);
    }

    @Override // io.grpc.internal.Stream
    public final void b(final int i) {
        final TransportState transportStateQ = q();
        if (!(transportStateQ.f23981a instanceof ThreadOptimizedDeframer)) {
            PerfMark.d();
            transportStateQ.d(new Runnable() { // from class: io.grpc.internal.AbstractStream.TransportState.1RequestRunnable
                @Override // java.lang.Runnable
                public final void run() {
                    TransportState transportState = TransportState.this;
                    try {
                        PerfMark.e();
                        TaskCloseable taskCloseable = TaskCloseable.d;
                        try {
                            PerfMark.c();
                            transportState.f23981a.b(i);
                            taskCloseable.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        transportState.f(th);
                    }
                }
            });
            return;
        }
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            transportStateQ.f23981a.b(i);
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

    @Override // io.grpc.internal.Stream
    public final void flush() {
        if (p().isClosed()) {
            return;
        }
        p().flush();
    }

    @Override // io.grpc.internal.Stream
    public final void g(InputStream inputStream) throws IOException {
        Preconditions.j(inputStream, "message");
        try {
            if (!p().isClosed()) {
                p().b(inputStream);
            }
        } finally {
            GrpcUtil.b(inputStream);
        }
    }

    @Override // io.grpc.internal.Stream
    public final void h() {
        TransportState transportStateQ = q();
        MessageDeframer messageDeframer = transportStateQ.d;
        messageDeframer.d = transportStateQ;
        transportStateQ.f23981a = messageDeframer;
    }

    @Override // io.grpc.internal.Stream
    public boolean isReady() {
        return q().g();
    }

    public abstract Framer p();

    public abstract TransportState q();
}
