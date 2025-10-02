package io.grpc.okhttp;

import io.grpc.Status;
import io.grpc.internal.AbstractServerStream;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.WritableBuffer;
import io.grpc.okhttp.OkHttpServerTransport;
import io.grpc.okhttp.OutboundFlowController;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;

/* loaded from: classes7.dex */
class OkHttpServerStream extends AbstractServerStream {

    public class Sink implements AbstractServerStream.Sink {
        @Override // io.grpc.internal.AbstractServerStream.Sink
        public final void a(WritableBuffer writableBuffer, boolean z, int i) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                if (((int) ((OkHttpWritableBuffer) writableBuffer).f24128a.e) <= 0) {
                    throw null;
                }
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

    public static class TransportState extends AbstractServerStream.TransportState implements OutboundFlowController.Stream, OkHttpServerTransport.StreamState {
        public boolean i;
        public int j;

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void b(int i) {
            int i2 = this.j - i;
            this.j = i2;
            if (i2 > 0 * 0.5f) {
                return;
            }
            this.j = (0 - i2) + i2;
            throw null;
        }

        @Override // io.grpc.internal.ApplicationThreadDeframerListener.TransportExecutor
        public final void d(Runnable runnable) {
            throw null;
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void f(Throwable th) {
            Status.e(th);
            if (this.i) {
                return;
            }
            this.i = true;
            throw null;
        }
    }

    @Override // io.grpc.internal.AbstractServerStream, io.grpc.internal.AbstractStream
    public final AbstractStream.TransportState q() {
        return null;
    }

    @Override // io.grpc.internal.AbstractServerStream
    public final AbstractServerStream.Sink r() {
        return null;
    }

    @Override // io.grpc.internal.AbstractServerStream
    /* renamed from: s */
    public final AbstractServerStream.TransportState q() {
        return null;
    }
}
