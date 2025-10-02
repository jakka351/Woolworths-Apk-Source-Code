package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface zzgpe extends ScheduledExecutorService, zzgpd, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzgpd, java.lang.AutoCloseable
    /* synthetic */ default void close() throws InterruptedException {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzgpc schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzgpc schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzgpc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzgpc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
