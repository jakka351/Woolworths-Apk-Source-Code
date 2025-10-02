package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;

/* loaded from: classes7.dex */
abstract class ForwardingClientStreamListener implements ClientStreamListener {
    @Override // io.grpc.internal.StreamListener
    public final void a(StreamListener.MessageProducer messageProducer) {
        d().a(messageProducer);
    }

    @Override // io.grpc.internal.ClientStreamListener
    public final void b(Metadata metadata) {
        d().b(metadata);
    }

    @Override // io.grpc.internal.ClientStreamListener
    public void c(Status status, ClientStreamListener.RpcProgress rpcProgress, Metadata metadata) {
        d().c(status, rpcProgress, metadata);
    }

    public abstract ClientStreamListener d();

    @Override // io.grpc.internal.StreamListener
    public final void onReady() {
        d().onReady();
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(d(), "delegate");
        return toStringHelperB.toString();
    }
}
