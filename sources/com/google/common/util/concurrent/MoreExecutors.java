package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$2, reason: invalid class name */
    class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3, reason: invalid class name */
    class AnonymousClass3 extends WrappingExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final Callable a(Callable callable) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final void b(Runnable runnable) {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4, reason: invalid class name */
    class AnonymousClass4 extends WrappingScheduledExecutorService {
        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final Callable a(Callable callable) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public final void b(Runnable runnable) {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$5, reason: invalid class name */
    class AnonymousClass5 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            try {
                runnable.run();
            } catch (RejectedExecutionException unused) {
                throw null;
            }
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    @J2ktIncompatible
    public static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static class ListeningDecorator extends AbstractListeningExecutorService {
        public final ExecutorService d;

        public ListeningDecorator(ExecutorService executorService) {
            executorService.getClass();
            this.d = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.d.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.d.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.d.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.d.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.d.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.d.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.d + "]";
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        public final ScheduledExecutorService e;

        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            public final ScheduledFuture e;

            public ListenableScheduledTask(AbstractFuture abstractFuture, ScheduledFuture scheduledFuture) {
                super(abstractFuture);
                this.e = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.e.cancel(z);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.e.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.e.getDelay(timeUnit);
            }
        }

        @GwtIncompatible
        @J2ktIncompatible
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            public final Runnable k;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                runnable.getClass();
                this.k = runnable;
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public final String k() {
                return "task=[" + this.k + "]";
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.k.run();
                } catch (Throwable th) {
                    n(th);
                    throw th;
                }
            }
        }

        public ScheduledListeningDecorator(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.e = scheduledExecutorService;
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final ListenableScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(callable);
            return new ListenableScheduledTask(trustedListenableFutureTask, this.e.schedule(trustedListenableFutureTask, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final ListenableScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.e.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final ListenableScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.e.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final ListenableScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(Executors.callable(runnable, null));
            return new ListenableScheduledTask(trustedListenableFutureTask, this.e.schedule(trustedListenableFutureTask, j, timeUnit));
        }
    }

    public static Executor a() {
        return DirectExecutor.d;
    }

    public static ListeningExecutorService b(ExecutorService executorService) {
        return executorService instanceof ListeningExecutorService ? (ListeningExecutorService) executorService : executorService instanceof ScheduledExecutorService ? new ScheduledListeningDecorator((ScheduledExecutorService) executorService) : new ListeningDecorator(executorService);
    }
}
