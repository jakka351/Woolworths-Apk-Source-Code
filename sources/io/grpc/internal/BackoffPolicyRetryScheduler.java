package io.grpc.internal;

import io.grpc.SynchronizationContext;
import io.grpc.internal.ExponentialBackoffPolicy;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class BackoffPolicyRetryScheduler implements RetryScheduler {
    public static final Logger f = Logger.getLogger(BackoffPolicyRetryScheduler.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f23988a;
    public final SynchronizationContext b;
    public final ExponentialBackoffPolicy.Provider c;
    public BackoffPolicy d;
    public SynchronizationContext.ScheduledHandle e;

    public BackoffPolicyRetryScheduler(ExponentialBackoffPolicy.Provider provider, ScheduledExecutorService scheduledExecutorService, SynchronizationContext synchronizationContext) {
        this.c = provider;
        this.f23988a = scheduledExecutorService;
        this.b = synchronizationContext;
    }

    public final void a(Runnable runnable) {
        this.b.e();
        if (this.d == null) {
            this.d = this.c.get();
        }
        SynchronizationContext.ScheduledHandle scheduledHandle = this.e;
        if (scheduledHandle == null || !scheduledHandle.b()) {
            long jA = this.d.a();
            this.e = this.b.c(runnable, jA, TimeUnit.NANOSECONDS, this.f23988a);
            f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }

    @Override // io.grpc.internal.RetryScheduler
    public final void reset() {
        SynchronizationContext synchronizationContext = this.b;
        synchronizationContext.e();
        synchronizationContext.execute(new a(this, 0));
    }
}
