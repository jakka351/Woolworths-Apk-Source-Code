package io.grpc.internal;

import com.google.protobuf.GeneratedMessageLite;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientCallImpl;
import io.grpc.internal.ClientStreamListener;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class SubchannelChannel extends Channel {

    /* renamed from: a, reason: collision with root package name */
    public static final Status f24109a;

    /* renamed from: io.grpc.internal.SubchannelChannel$1, reason: invalid class name */
    public class AnonymousClass1 implements ClientCallImpl.ClientStreamProvider {
        @Override // io.grpc.internal.ClientCallImpl.ClientStreamProvider
        public final ClientStream a(MethodDescriptor methodDescriptor, CallOptions callOptions, Metadata metadata, Context context) {
            Status status = SubchannelChannel.f24109a;
            throw null;
        }
    }

    static {
        Status status = Status.n;
        Status statusI = status.i("Subchannel is NOT READY");
        f24109a = status.i("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        new FailingClientTransport(statusI, ClientStreamListener.RpcProgress.g);
    }

    @Override // io.grpc.Channel
    public final String a() {
        throw null;
    }

    @Override // io.grpc.Channel
    public final ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions) {
        final Executor executor = callOptions.b;
        if (executor == null) {
            executor = null;
        }
        if (callOptions.b()) {
            return new ClientCall<Object, Object>() { // from class: io.grpc.internal.SubchannelChannel.2
                @Override // io.grpc.ClientCall
                public final void a(String str, Throwable th) {
                }

                @Override // io.grpc.ClientCall
                public final void b() {
                }

                @Override // io.grpc.ClientCall
                public final void c() {
                }

                @Override // io.grpc.ClientCall
                public final void d(GeneratedMessageLite generatedMessageLite) {
                }

                @Override // io.grpc.ClientCall
                public final void e(final ClientCall.Listener listener, Metadata metadata) {
                    executor.execute(new Runnable() { // from class: io.grpc.internal.SubchannelChannel.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listener.a(SubchannelChannel.f24109a, new Metadata());
                        }
                    });
                }
            };
        }
        callOptions.i(GrpcUtil.n, Boolean.TRUE);
        throw null;
    }
}
