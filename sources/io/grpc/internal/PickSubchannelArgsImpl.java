package io.grpc.internal;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class PickSubchannelArgsImpl extends LoadBalancer.PickSubchannelArgs {

    /* renamed from: a, reason: collision with root package name */
    public final CallOptions f24074a;
    public final Metadata b;
    public final MethodDescriptor c;

    public PickSubchannelArgsImpl(MethodDescriptor methodDescriptor, Metadata metadata, CallOptions callOptions) {
        Preconditions.j(methodDescriptor, "method");
        this.c = methodDescriptor;
        Preconditions.j(metadata, "headers");
        this.b = metadata;
        Preconditions.j(callOptions, "callOptions");
        this.f24074a = callOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PickSubchannelArgsImpl.class == obj.getClass()) {
            PickSubchannelArgsImpl pickSubchannelArgsImpl = (PickSubchannelArgsImpl) obj;
            if (Objects.a(this.f24074a, pickSubchannelArgsImpl.f24074a) && Objects.a(this.b, pickSubchannelArgsImpl.b) && Objects.a(this.c, pickSubchannelArgsImpl.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24074a, this.b, this.c});
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.f24074a + "]";
    }
}
