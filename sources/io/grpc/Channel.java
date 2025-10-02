package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public abstract class Channel {
    public abstract String a();

    public abstract ClientCall h(MethodDescriptor methodDescriptor, CallOptions callOptions);
}
