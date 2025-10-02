package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class Utils {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f15282a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1
            public final /* synthetic */ AtomicLong d;

            /* renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1 */
            class C03221 extends BackgroundPriorityRunnable {
                public final /* synthetic */ Runnable d;

                public C03221(Runnable runnable) {
                    runnable = runnable;
                }

                @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                public final void a() {
                    runnable.run();
                }
            }

            public AnonymousClass1(AtomicLong atomicLong) {
                atomicLong = atomicLong;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1
                    public final /* synthetic */ Runnable d;

                    public C03221(Runnable runnable2) {
                        runnable = runnable2;
                    }

                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public final void a() {
                        runnable.run();
                    }
                });
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2
            public final /* synthetic */ ExecutorService d;

            public AnonymousClass2(ExecutorService executorServiceUnconfigurableExecutorService2) {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                executorService = executorServiceUnconfigurableExecutorService2;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public final void a() {
                Logger logger = Logger.f15258a;
                ExecutorService executorService = executorService;
                try {
                    logger.b("Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    executorService.shutdown();
                    if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        return;
                    }
                    logger.b("awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    logger.b("Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f15282a = executorServiceUnconfigurableExecutorService2;
    }

    public static void a(Task task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f15282a, new au.com.woolworths.product.details.epoxy.a(countDownLatch, 17));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            task.getResult();
        } else {
            if (task.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            }
            if (!task.isComplete()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(task.getException());
        }
    }
}
