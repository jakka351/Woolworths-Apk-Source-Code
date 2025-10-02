package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class AsyncQueue {
    public final ArrayList c = new ArrayList();
    public final ArrayList b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedShutdownAwareExecutor f15594a = new SynchronizedShutdownAwareExecutor();

    public class DelayedTask {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f15595a;
        public ScheduledFuture b;

        public DelayedTask(Runnable runnable) {
            this.f15595a = runnable;
        }

        public final void a() {
            AsyncQueue.this.d();
            ScheduledFuture scheduledFuture = this.b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                b();
            }
        }

        public final void b() {
            Assert.b(this.b != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.b = null;
            Assert.b(AsyncQueue.this.b.remove(this), "Delayed task not found.", new Object[0]);
        }
    }

    public class SynchronizedShutdownAwareExecutor implements Executor {
        public final ScheduledThreadPoolExecutor d;
        public final Thread e;

        /* renamed from: com.google.firebase.firestore.util.AsyncQueue$SynchronizedShutdownAwareExecutor$1, reason: invalid class name */
        class AnonymousClass1 extends ScheduledThreadPoolExecutor implements AutoCloseable {
            public AnonymousClass1(ThreadFactory threadFactory) {
                super(1, threadFactory);
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) throws ExecutionException, InterruptedException {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    }
                }
                if (th != null) {
                    AsyncQueue.this.c(th);
                }
            }

            @Override // java.lang.AutoCloseable
            public final /* synthetic */ void close() throws InterruptedException {
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
        }

        public class DelayedStartFactory implements Runnable, ThreadFactory {
            public final CountDownLatch d = new CountDownLatch(1);
            public Runnable e;

            public DelayedStartFactory() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Assert.b(this.e == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.e = runnable;
                this.d.countDown();
                return SynchronizedShutdownAwareExecutor.this.e;
            }

            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                try {
                    this.d.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.e.run();
            }
        }

        public SynchronizedShutdownAwareExecutor() {
            DelayedStartFactory delayedStartFactory = new DelayedStartFactory();
            Thread threadNewThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(delayedStartFactory);
            this.e = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.google.firebase.firestore.util.c
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    AsyncQueue.this.c(th);
                }
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(delayedStartFactory);
            this.d = anonymousClass1;
            anonymousClass1.setKeepAliveTime(3L, TimeUnit.SECONDS);
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(Runnable runnable) {
            this.d.execute(runnable);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimerId {
        public static final TimerId d;
        public static final TimerId e;
        public static final TimerId f;
        public static final TimerId g;
        public static final TimerId h;
        public static final TimerId i;
        public static final TimerId j;
        public static final TimerId k;
        public static final TimerId l;
        public static final /* synthetic */ TimerId[] m;

        /* JADX INFO: Fake field, exist only in values array */
        TimerId EF0;

        static {
            TimerId timerId = new TimerId("ALL", 0);
            TimerId timerId2 = new TimerId("LISTEN_STREAM_IDLE", 1);
            d = timerId2;
            TimerId timerId3 = new TimerId("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
            e = timerId3;
            TimerId timerId4 = new TimerId("WRITE_STREAM_IDLE", 3);
            f = timerId4;
            TimerId timerId5 = new TimerId("WRITE_STREAM_CONNECTION_BACKOFF", 4);
            g = timerId5;
            TimerId timerId6 = new TimerId("HEALTH_CHECK_TIMEOUT", 5);
            h = timerId6;
            TimerId timerId7 = new TimerId("ONLINE_STATE_TIMEOUT", 6);
            i = timerId7;
            TimerId timerId8 = new TimerId("GARBAGE_COLLECTION", 7);
            j = timerId8;
            TimerId timerId9 = new TimerId("RETRY_TRANSACTION", 8);
            TimerId timerId10 = new TimerId("CONNECTIVITY_ATTEMPT_TIMER", 9);
            k = timerId10;
            TimerId timerId11 = new TimerId("INDEX_BACKFILL", 10);
            l = timerId11;
            m = new TimerId[]{timerId, timerId2, timerId3, timerId4, timerId5, timerId6, timerId7, timerId8, timerId9, timerId10, timerId11};
        }

        public static TimerId valueOf(String str) {
            return (TimerId) Enum.valueOf(TimerId.class, str);
        }

        public static TimerId[] values() {
            return (TimerId[]) m.clone();
        }
    }

    public final DelayedTask a(TimerId timerId, long j, Runnable runnable) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (this.c.contains(timerId)) {
            j = 0;
        }
        System.currentTimeMillis();
        DelayedTask delayedTask = new DelayedTask(runnable);
        SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor = this.f15594a;
        a aVar = new a(delayedTask, 1);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (synchronizedShutdownAwareExecutor) {
            scheduledFutureSchedule = synchronizedShutdownAwareExecutor.d.schedule(aVar, j, timeUnit);
        }
        delayedTask.b = scheduledFutureSchedule;
        this.b.add(delayedTask);
        return delayedTask;
    }

    public final void b(Runnable runnable) {
        b bVar = new b(runnable);
        SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor = this.f15594a;
        synchronizedShutdownAwareExecutor.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            synchronizedShutdownAwareExecutor.execute(new d(1, taskCompletionSource, bVar));
        } catch (RejectedExecutionException unused) {
            Logger.c("AsyncQueue", "Refused to enqueue task after panic", new Object[0]);
        }
        taskCompletionSource.getTask();
    }

    public final void c(Throwable th) {
        this.f15594a.d.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new a(th, 0));
    }

    public final void d() {
        Thread threadCurrentThread = Thread.currentThread();
        SynchronizedShutdownAwareExecutor synchronizedShutdownAwareExecutor = this.f15594a;
        Thread thread = synchronizedShutdownAwareExecutor.e;
        if (thread == threadCurrentThread) {
            return;
        }
        Assert.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", thread.getName(), Long.valueOf(synchronizedShutdownAwareExecutor.e.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        throw null;
    }
}
