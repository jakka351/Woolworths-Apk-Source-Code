package io.grpc;

/* loaded from: classes7.dex */
public abstract class ForwardingServerCall<ReqT, RespT> extends PartialForwardingServerCall<ReqT, RespT> {

    public static abstract class SimpleForwardingServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {
        @Override // io.grpc.PartialForwardingServerCall
        public final ServerCall i() {
            return null;
        }
    }

    @Override // io.grpc.ServerCall
    public void h(Object obj) {
        i().h(obj);
    }
}
