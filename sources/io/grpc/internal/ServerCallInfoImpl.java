package io.grpc.internal;

import io.grpc.ServerStreamTracer;

/* loaded from: classes7.dex */
final class ServerCallInfoImpl<ReqT, RespT> extends ServerStreamTracer.ServerCallInfo<ReqT, RespT> {
    public final boolean equals(Object obj) {
        if (obj instanceof ServerCallInfoImpl) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
