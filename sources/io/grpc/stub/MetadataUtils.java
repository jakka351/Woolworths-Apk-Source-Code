package io.grpc.stub;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;

/* loaded from: classes7.dex */
public final class MetadataUtils {

    public static final class HeaderAttachingClientInterceptor implements ClientInterceptor {

        public final class HeaderAttachingClientCall<ReqT, RespT> extends ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT> {
            @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
            public final void e(ClientCall.Listener listener, Metadata metadata) {
                metadata.d(null);
                throw null;
            }
        }

        @Override // io.grpc.ClientInterceptor
        public final ClientCall a(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel) {
            return new HeaderAttachingClientCall(channel.h(methodDescriptor, callOptions));
        }
    }

    public static final class MetadataCapturingClientInterceptor implements ClientInterceptor {

        public final class MetadataCapturingClientCall<ReqT, RespT> extends ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT> {

            public final class MetadataCapturingClientCallListener extends ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT> {
                @Override // io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
                public final void a(Status status, Metadata metadata) {
                    throw null;
                }

                @Override // io.grpc.PartialForwardingClientCallListener, io.grpc.ClientCall.Listener
                public final void b(Metadata metadata) {
                    throw null;
                }
            }

            public MetadataCapturingClientCall(ClientCall clientCall) {
                super(clientCall);
            }

            @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
            public final void e(ClientCall.Listener listener, Metadata metadata) {
                MetadataCapturingClientInterceptor.this.getClass();
                throw null;
            }
        }

        @Override // io.grpc.ClientInterceptor
        public final ClientCall a(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel) {
            return new MetadataCapturingClientCall(channel.h(methodDescriptor, callOptions));
        }
    }
}
