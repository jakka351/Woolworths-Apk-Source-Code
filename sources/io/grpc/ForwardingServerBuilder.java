package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ServerBuilder;

/* loaded from: classes7.dex */
public abstract class ForwardingServerBuilder<T extends ServerBuilder<T>> extends ServerBuilder<T> {
    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "delegate");
        return toStringHelperB.toString();
    }
}
