package io.grpc;

import io.grpc.ClientCall;

/* loaded from: classes7.dex */
public abstract class ForwardingClientCallListener<RespT> extends PartialForwardingClientCallListener<RespT> {

    public static abstract class SimpleForwardingClientCallListener<RespT> extends ForwardingClientCallListener<RespT> {
        @Override // io.grpc.PartialForwardingClientCallListener
        public final ClientCall.Listener e() {
            throw null;
        }
    }

    @Override // io.grpc.ClientCall.Listener
    public final void c(Object obj) {
        e().c(obj);
    }
}
