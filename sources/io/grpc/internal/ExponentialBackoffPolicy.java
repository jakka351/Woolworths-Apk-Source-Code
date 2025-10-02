package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.internal.BackoffPolicy;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class ExponentialBackoffPolicy implements BackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    public Random f24010a;
    public long b;
    public double c;
    public double d;
    public long e;

    public static final class Provider implements BackoffPolicy.Provider {
        @Override // io.grpc.internal.BackoffPolicy.Provider
        public final ExponentialBackoffPolicy get() {
            ExponentialBackoffPolicy exponentialBackoffPolicy = new ExponentialBackoffPolicy();
            exponentialBackoffPolicy.f24010a = new Random();
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            exponentialBackoffPolicy.b = TimeUnit.MINUTES.toNanos(2L);
            exponentialBackoffPolicy.c = 1.6d;
            exponentialBackoffPolicy.d = 0.2d;
            exponentialBackoffPolicy.e = nanos;
            return exponentialBackoffPolicy;
        }
    }

    @Override // io.grpc.internal.BackoffPolicy
    public final long a() {
        long j = this.e;
        double d = j;
        this.e = Math.min((long) (this.c * d), this.b);
        double d2 = this.d;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        Preconditions.g(d4 >= d3);
        return j + ((long) ((this.f24010a.nextDouble() * (d4 - d3)) + d3));
    }
}
