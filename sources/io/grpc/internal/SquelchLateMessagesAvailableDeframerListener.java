package io.grpc.internal;

import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
final class SquelchLateMessagesAvailableDeframerListener extends ForwardingDeframerListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24107a;

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    public final void a(StreamListener.MessageProducer messageProducer) throws IOException {
        if (!this.f24107a) {
            super.a(messageProducer);
        } else if (messageProducer instanceof Closeable) {
            GrpcUtil.b((Closeable) messageProducer);
        }
    }

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    public final void c(boolean z) {
        this.f24107a = true;
        super.c(z);
    }

    @Override // io.grpc.internal.ForwardingDeframerListener
    public final MessageDeframer.Listener d() {
        return null;
    }

    @Override // io.grpc.internal.ForwardingDeframerListener, io.grpc.internal.MessageDeframer.Listener
    public final void f(Throwable th) {
        this.f24107a = true;
        super.f(th);
    }
}
