package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    public final Executor f;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.f = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final void c(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        Executor executor = this.f;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            ResumeUndispatchedRunnable resumeUndispatchedRunnable = new ResumeUndispatchedRunnable(this, cancellableContinuationImpl);
            CoroutineContext coroutineContext = cancellableContinuationImpl.h;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(resumeUndispatchedRunnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.b(coroutineContext, ExceptionsKt.a("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            cancellableContinuationImpl.s(new CancelFutureOnCancel(scheduledFutureSchedule));
        } else {
            DefaultExecutor.m.c(j, cancellableContinuationImpl);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).f == this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                JobKt.b(coroutineContext, ExceptionsKt.a("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new DisposableFutureHandle(scheduledFutureSchedule) : DefaultExecutor.m.j(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f.execute(runnable);
        } catch (RejectedExecutionException e) {
            JobKt.b(coroutineContext, ExceptionsKt.a("The task was rejected", e));
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler.f.k(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f.toString();
    }
}
