package io.grpc.internal;

import com.google.common.base.Stopwatch;
import io.grpc.SynchronizationContext;
import io.grpc.internal.ManagedChannelImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final class Rescheduler {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f24078a;
    public final SynchronizationContext b;
    public final Runnable c;
    public final Stopwatch d;
    public long e;
    public boolean f;
    public ScheduledFuture g;

    public final class ChannelFutureRunnable implements Runnable {
        public ChannelFutureRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rescheduler rescheduler = Rescheduler.this;
            if (!rescheduler.f) {
                rescheduler.g = null;
                return;
            }
            Stopwatch stopwatch = rescheduler.d;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jA = rescheduler.e - stopwatch.a();
            if (jA > 0) {
                rescheduler.g = rescheduler.f24078a.schedule(rescheduler.new FutureRunnable(), jA, timeUnit);
                return;
            }
            rescheduler.f = false;
            rescheduler.g = null;
            ((ManagedChannelImpl.IdleModeTimer) rescheduler.c).run();
        }
    }

    public final class FutureRunnable implements Runnable {
        public FutureRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rescheduler rescheduler = Rescheduler.this;
            rescheduler.b.execute(rescheduler.new ChannelFutureRunnable());
        }
    }

    public Rescheduler(Runnable runnable, SynchronizationContext synchronizationContext, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.c = runnable;
        this.b = synchronizationContext;
        this.f24078a = scheduledExecutorService;
        this.d = stopwatch;
        stopwatch.b();
    }
}
