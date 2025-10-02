package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class ForwardingChannelBuilder2<T extends ManagedChannelBuilder<T>> extends ManagedChannelBuilder<T> {
    @Override // io.grpc.ManagedChannelBuilder
    public ManagedChannel a() {
        return d().a();
    }

    @Override // io.grpc.ManagedChannelBuilder
    public void c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d().c();
    }

    public abstract ManagedChannelBuilder d();

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(d(), "delegate");
        return toStringHelperB.toString();
    }
}
