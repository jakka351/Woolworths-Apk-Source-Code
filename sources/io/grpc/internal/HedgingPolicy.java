package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes7.dex */
final class HedgingPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final int f24019a;
    public final long b;
    public final ImmutableSet c;

    public HedgingPolicy(int i, long j, Set set) {
        this.f24019a = i;
        this.b = j;
        this.c = ImmutableSet.q(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HedgingPolicy.class != obj.getClass()) {
            return false;
        }
        HedgingPolicy hedgingPolicy = (HedgingPolicy) obj;
        return this.f24019a == hedgingPolicy.f24019a && this.b == hedgingPolicy.b && Objects.a(this.c, hedgingPolicy.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24019a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(this.f24019a, "maxAttempts");
        toStringHelperB.b(this.b, "hedgingDelayNanos");
        toStringHelperB.c(this.c, "nonFatalStatusCodes");
        return toStringHelperB.toString();
    }
}
