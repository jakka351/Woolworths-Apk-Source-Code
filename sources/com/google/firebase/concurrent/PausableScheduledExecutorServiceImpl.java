package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class PausableScheduledExecutorServiceImpl extends DelegatingScheduledExecutorService implements PausableScheduledExecutorService {
    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
