package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class GlideExecutor implements ExecutorService, AutoCloseable {
    public static final long e = TimeUnit.SECONDS.toMillis(10);
    public static volatile int f;
    public final ThreadPoolExecutor d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13841a;
        public int b;
        public int c;
        public final ThreadFactory d = new DefaultPriorityThreadFactory();
        public final UncaughtThrowableStrategy e = UncaughtThrowableStrategy.b;
        public String f;

        public Builder(boolean z) {
            this.f13841a = z;
        }

        public final GlideExecutor a() {
            if (TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
            }
            return new GlideExecutor(new ThreadPoolExecutor(this.b, this.c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory(this.d, this.f, this.f13841a)));
        }
    }

    public static final class DefaultPriorityThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable) { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultPriorityThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws SecurityException, IllegalArgumentException {
                    Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    public static final class DefaultThreadFactory implements ThreadFactory {
        public final ThreadFactory d;
        public final String e;
        public final boolean g;
        public final AtomicInteger h = new AtomicInteger();
        public final UncaughtThrowableStrategy f = UncaughtThrowableStrategy.b;

        public DefaultThreadFactory(ThreadFactory threadFactory, String str, boolean z) {
            this.d = threadFactory;
            this.e = str;
            this.g = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Thread threadNewThread = ((DefaultPriorityThreadFactory) this.d).newThread(new Runnable() { // from class: com.bumptech.glide.load.engine.executor.GlideExecutor.DefaultThreadFactory.1
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultThreadFactory defaultThreadFactory = DefaultThreadFactory.this;
                    if (defaultThreadFactory.g) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        ((UncaughtThrowableStrategy.AnonymousClass2) defaultThreadFactory.f).getClass();
                        if (Log.isLoggable("GlideExecutor", 6)) {
                            Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        }
                    }
                }
            });
            threadNewThread.setName("glide-" + this.e + "-thread-" + this.h.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface UncaughtThrowableStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final UncaughtThrowableStrategy f13842a = null;
        public static final UncaughtThrowableStrategy b = new AnonymousClass2();

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$1, reason: invalid class name */
        public class AnonymousClass1 implements UncaughtThrowableStrategy {
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$2, reason: invalid class name */
        public class AnonymousClass2 implements UncaughtThrowableStrategy {
        }

        /* renamed from: com.bumptech.glide.load.engine.executor.GlideExecutor$UncaughtThrowableStrategy$3, reason: invalid class name */
        public class AnonymousClass3 implements UncaughtThrowableStrategy {
        }
    }

    public GlideExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.d = threadPoolExecutor;
    }

    public static GlideExecutor a() {
        return new GlideExecutor(new ThreadPoolExecutor(0, Integer.MAX_VALUE, e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new DefaultThreadFactory(new DefaultPriorityThreadFactory(), "source-unlimited", false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.d.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (threadPoolExecutor = this.d).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
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
        this.d.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.d.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.d.invokeAny(collection);
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

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.d.submit(runnable);
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.d.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.d.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.d.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.d.submit(callable);
    }
}
