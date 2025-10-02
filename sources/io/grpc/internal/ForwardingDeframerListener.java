package io.grpc.internal;

import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;

/* loaded from: classes7.dex */
abstract class ForwardingDeframerListener implements MessageDeframer.Listener {
    @Override // io.grpc.internal.MessageDeframer.Listener
    public void a(StreamListener.MessageProducer messageProducer) {
        d().a(messageProducer);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public final void b(int i) {
        d().b(i);
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    public void c(boolean z) {
        d().c(z);
    }

    public abstract MessageDeframer.Listener d();

    @Override // io.grpc.internal.MessageDeframer.Listener
    public void f(Throwable th) {
        d().f(th);
    }
}
