package io.grpc;

import io.grpc.ForwardingChannelBuilder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class ForwardingChannelBuilder<T extends ForwardingChannelBuilder<T>> extends ForwardingChannelBuilder2<T> {
    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public final void c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d().c();
    }
}
