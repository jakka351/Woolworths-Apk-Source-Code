package io.grpc.internal;

import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalChannelz;
import io.grpc.InternalInstrumented;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public interface ClientTransport extends InternalInstrumented<InternalChannelz.SocketStats> {

    public interface PingCallback {
        void c();
    }

    void c(PingCallback pingCallback, Executor executor);

    ClientStream d(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions, ClientStreamTracer[] clientStreamTracerArr);
}
