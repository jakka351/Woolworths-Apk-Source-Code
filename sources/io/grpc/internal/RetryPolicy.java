package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes7.dex */
final class RetryPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final int f24096a;
    public final long b;
    public final long c;
    public final double d;
    public final Long e;
    public final ImmutableSet f;

    public RetryPolicy(int i, long j, long j2, double d, Long l, Set set) {
        this.f24096a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = ImmutableSet.q(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RetryPolicy)) {
            return false;
        }
        RetryPolicy retryPolicy = (RetryPolicy) obj;
        return this.f24096a == retryPolicy.f24096a && this.b == retryPolicy.b && this.c == retryPolicy.c && Double.compare(this.d, retryPolicy.d) == 0 && Objects.a(this.e, retryPolicy.e) && Objects.a(this.f, retryPolicy.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24096a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(this.f24096a, "maxAttempts");
        toStringHelperB.b(this.b, "initialBackoffNanos");
        toStringHelperB.b(this.c, "maxBackoffNanos");
        toStringHelperB.e("backoffMultiplier", String.valueOf(this.d));
        toStringHelperB.c(this.e, "perAttemptRecvTimeoutNanos");
        toStringHelperB.c(this.f, "retryableStatusCodes");
        return toStringHelperB.toString();
    }
}
