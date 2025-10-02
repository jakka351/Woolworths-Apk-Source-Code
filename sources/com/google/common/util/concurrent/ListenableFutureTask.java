package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ExecutionList;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {
    public final ExecutionList d;

    public ListenableFutureTask(au.com.woolworths.foundation.shop.collectionmode.c cVar) {
        super(cVar);
        this.d = new ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        ExecutionList executionList = this.d;
        executionList.getClass();
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        synchronized (executionList) {
            try {
                if (executionList.b) {
                    ExecutionList.a(runnable, executor);
                } else {
                    executionList.f14963a = new ExecutionList.RunnableExecutorPair(runnable, executor, executionList.f14963a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        ExecutionList executionList = this.d;
        synchronized (executionList) {
            try {
                if (executionList.b) {
                    return;
                }
                executionList.b = true;
                ExecutionList.RunnableExecutorPair runnableExecutorPair = executionList.f14963a;
                ExecutionList.RunnableExecutorPair runnableExecutorPair2 = null;
                executionList.f14963a = null;
                while (runnableExecutorPair != null) {
                    ExecutionList.RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.c;
                    runnableExecutorPair.c = runnableExecutorPair2;
                    runnableExecutorPair2 = runnableExecutorPair;
                    runnableExecutorPair = runnableExecutorPair3;
                }
                while (runnableExecutorPair2 != null) {
                    ExecutionList.a(runnableExecutorPair2.f14964a, runnableExecutorPair2.b);
                    runnableExecutorPair2 = runnableExecutorPair2.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }
}
