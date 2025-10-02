package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public interface ClientInterceptor {
    ClientCall a(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel);
}
