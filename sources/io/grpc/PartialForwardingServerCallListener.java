package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ServerCall;

/* loaded from: classes7.dex */
abstract class PartialForwardingServerCallListener<ReqT> extends ServerCall.Listener<ReqT> {
    public abstract ServerCall.Listener a();

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(a(), "delegate");
        return toStringHelperB.toString();
    }
}
