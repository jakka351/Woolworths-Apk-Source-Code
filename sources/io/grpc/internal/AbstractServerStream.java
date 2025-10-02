package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.Status;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.MessageFramer;

/* loaded from: classes7.dex */
public abstract class AbstractServerStream extends AbstractStream implements ServerStream, MessageFramer.Sink {

    public interface Sink {
        void a(WritableBuffer writableBuffer, boolean z, int i);
    }

    public static abstract class TransportState extends AbstractStream.TransportState {
        public Runnable h;

        /* renamed from: io.grpc.internal.AbstractServerStream$TransportState$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.AbstractServerStream$TransportState$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public final void c(boolean z) {
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
                this.h = null;
            }
        }

        @Override // io.grpc.internal.AbstractStream.TransportState
        public final StreamListener h() {
            return null;
        }

        public final void i(Status status) {
            Preconditions.r(!status.f());
            if (!status.f()) {
                throw null;
            }
            throw null;
        }
    }

    @Override // io.grpc.internal.MessageFramer.Sink
    public final void o(WritableBuffer writableBuffer, boolean z, boolean z2, int i) {
        if (writableBuffer == null) {
            return;
        }
        if (z) {
            z2 = false;
        }
        r().a(writableBuffer, z2, i);
        throw null;
    }

    @Override // io.grpc.internal.AbstractStream
    public final Framer p() {
        return null;
    }

    public abstract Sink r();

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract TransportState q();
}
