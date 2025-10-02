package io.grpc.stub;

import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;

/* loaded from: classes7.dex */
public final class ServerCalls {

    public interface BidiStreamingMethod<ReqT, RespT> extends StreamingRequestMethod<ReqT, RespT> {
    }

    public interface ClientStreamingMethod<ReqT, RespT> extends StreamingRequestMethod<ReqT, RespT> {
    }

    public static class NoopStreamObserver<V> implements StreamObserver<V> {
    }

    public static final class ServerCallStreamObserverImpl<ReqT, RespT> extends ServerCallStreamObserver<RespT> {
    }

    public interface ServerStreamingMethod<ReqT, RespT> extends UnaryRequestMethod<ReqT, RespT> {
    }

    public interface StreamingRequestMethod<ReqT, RespT> {
    }

    public static final class StreamingServerCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {

        public final class StreamingServerCallListener extends ServerCall.Listener<ReqT> {
        }
    }

    public interface UnaryMethod<ReqT, RespT> extends UnaryRequestMethod<ReqT, RespT> {
    }

    public interface UnaryRequestMethod<ReqT, RespT> {
    }

    public static final class UnaryServerCallHandler<ReqT, RespT> implements ServerCallHandler<ReqT, RespT> {

        public final class UnaryServerCallListener extends ServerCall.Listener<ReqT> {
        }
    }
}
