package io.grpc.internal;

import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;

/* loaded from: classes7.dex */
final class ApplicationThreadDeframerListener implements MessageDeframer.Listener {

    public interface TransportExecutor {
        void d(Runnable runnable);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public final void a(StreamListener.MessageProducer messageProducer) {
        if (messageProducer.next() != null) {
            throw null;
        }
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public final void b(final int i) {
        new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframerListener.1
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        };
        throw null;
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public final void c(final boolean z) {
        new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframerListener.2
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        };
        throw null;
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public final void f(final Throwable th) {
        new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframerListener.3
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        };
        throw null;
    }
}
