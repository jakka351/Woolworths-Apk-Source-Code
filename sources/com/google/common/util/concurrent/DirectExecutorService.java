package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.List;
import java.util.concurrent.TimeUnit;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
final class DirectExecutorService extends AbstractListeningExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        timeUnit.toNanos(j);
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw null;
    }
}
