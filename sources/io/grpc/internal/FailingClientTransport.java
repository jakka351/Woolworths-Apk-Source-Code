package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;

/* loaded from: classes7.dex */
class FailingClientTransport implements ClientTransport {

    /* renamed from: a, reason: collision with root package name */
    public final Status f24011a;
    public final ClientStreamListener.RpcProgress b;

    /* renamed from: io.grpc.internal.FailingClientTransport$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public FailingClientTransport(Status status, ClientStreamListener.RpcProgress rpcProgress) {
        Preconditions.f("error must not be OK", !status.f());
        this.f24011a = status;
        this.b = rpcProgress;
    }

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.ClientTransport
    public final ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
        return new FailingClientStream(this.f24011a, this.b, clientStreamTracerArr);
    }
}
