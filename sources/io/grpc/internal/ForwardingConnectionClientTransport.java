package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ManagedClientTransport;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
abstract class ForwardingConnectionClientTransport implements ConnectionClientTransport {
    public abstract ConnectionClientTransport a();

    @Override // io.grpc.InternalWithLogId
    public final InternalLogId b() {
        return a().b();
    }

    @Override // io.grpc.internal.ClientTransport
    public final void c(ClientTransport.PingCallback pingCallback, Executor executor) {
        a().c(pingCallback, executor);
    }

    @Override // io.grpc.internal.ClientTransport
    public ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr) {
        return a().d(methodDescriptor, metadata, callOptions, clientStreamTracerArr);
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public final Runnable e(ManagedClientTransport.Listener listener) {
        return a().e(listener);
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public void f(Status status) {
        a().f(status);
    }

    @Override // io.grpc.internal.ManagedClientTransport
    public void g(Status status) {
        a().g(status);
    }

    @Override // io.grpc.internal.ConnectionClientTransport
    public final Attributes getAttributes() {
        return a().getAttributes();
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(a(), "delegate");
        return toStringHelperB.toString();
    }
}
