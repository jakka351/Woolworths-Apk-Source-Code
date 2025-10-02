package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
abstract class WrappingExecutorService implements ExecutorService, AutoCloseable {
    public abstract Callable a(Callable callable);

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw null;
    }

    public void b(Runnable runnable) {
        a(Executors.callable(runnable, null));
        throw null;
    }

    public final void c(Collection collection) {
        ImmutableList.Builder builderM = ImmutableList.m();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            a((Callable) it.next());
            throw null;
        }
        builderM.j();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        c(collection);
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

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        c(collection);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        b(runnable);
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        a(callable);
        throw null;
    }
}
