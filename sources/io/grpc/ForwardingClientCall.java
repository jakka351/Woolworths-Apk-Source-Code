package io.grpc;

import com.google.protobuf.GeneratedMessageLite;
import io.grpc.ClientCall;

/* loaded from: classes7.dex */
public abstract class ForwardingClientCall<ReqT, RespT> extends PartialForwardingClientCall<ReqT, RespT> {

    public static abstract class SimpleForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public final ClientCall f23937a;

        public SimpleForwardingClientCall(ClientCall clientCall) {
            this.f23937a = clientCall;
        }

        @Override // io.grpc.PartialForwardingClientCall
        public final ClientCall f() {
            return this.f23937a;
        }
    }

    @Override // io.grpc.ClientCall
    public final void d(GeneratedMessageLite generatedMessageLite) {
        f().d(generatedMessageLite);
    }

    @Override // io.grpc.ClientCall
    public void e(ClientCall.Listener listener, Metadata metadata) {
        f().e(listener, metadata);
    }
}
