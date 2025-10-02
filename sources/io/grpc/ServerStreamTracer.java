package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes7.dex */
public abstract class ServerStreamTracer extends StreamTracer {

    public static abstract class Factory {
    }

    @Deprecated
    public static final class ReadOnlyServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {
        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final Attributes b() {
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final String c() {
            throw null;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final boolean d() {
            return false;
        }

        @Override // io.grpc.PartialForwardingServerCall, io.grpc.ServerCall
        public final boolean e() {
            return false;
        }

        @Override // io.grpc.PartialForwardingServerCall
        public final ServerCall i() {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ServerCallInfo<ReqT, RespT> {
    }
}
