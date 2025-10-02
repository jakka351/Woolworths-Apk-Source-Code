package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final Handler d;

    /* renamed from: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService$1, reason: invalid class name */
    public class AnonymousClass1 extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return CameraXExecutors.d();
            }
            if (Looper.myLooper() != null) {
                return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    public static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {
        public final AtomicReference d = new AtomicReference(null);
        public final long e;
        public final Callable f;
        public final ListenableFuture g;

        public HandlerScheduledFuture(final Handler handler, long j, final Callable callable) {
            this.e = j;
            this.f = callable;
            this.g = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver<Object>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    completer.a(new Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (HandlerScheduledFuture.this.d.getAndSet(null) != null) {
                                handler.removeCallbacks(HandlerScheduledFuture.this);
                            }
                        }
                    }, CameraXExecutors.a());
                    HandlerScheduledFuture.this.d.set(completer);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return this.g.cancel(z);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.g.get();
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.e - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.g.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.g.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.d.getAndSet(null);
            if (completer != null) {
                try {
                    completer.b(this.f.call());
                } catch (Exception e) {
                    completer.d(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.g.get(j, timeUnit);
        }
    }

    static {
        new AnonymousClass1();
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.d = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.d;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(final Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new Callable<Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public final Void call() {
                runnable.run();
                return null;
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.d;
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(handler, jConvert, callable);
        if (handler.postAtTime(handlerScheduledFuture, jConvert)) {
            return handlerScheduledFuture;
        }
        return Futures.f(new RejectedExecutionException(handler + " is shutting down"));
    }
}
