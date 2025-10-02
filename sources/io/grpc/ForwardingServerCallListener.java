package io.grpc;

import io.grpc.ServerCall;

/* loaded from: classes7.dex */
public abstract class ForwardingServerCallListener<ReqT> extends PartialForwardingServerCallListener<ReqT> {

    public static abstract class SimpleForwardingServerCallListener<ReqT> extends ForwardingServerCallListener<ReqT> {
        @Override // io.grpc.PartialForwardingServerCallListener
        public final ServerCall.Listener a() {
            return null;
        }
    }
}
