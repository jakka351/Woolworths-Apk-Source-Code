package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint
/* loaded from: classes6.dex */
public class m extends ThreadPoolExecutor implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16968a = 2;

    public class a implements ThreadFactory {

        /* renamed from: com.salesforce.marketingcloud.media.m$a$a, reason: collision with other inner class name */
        public class C0367a extends Thread {
            public C0367a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new C0367a(runnable);
        }
    }

    public static class b extends FutureTask<e> implements Comparable<Runnable> {
        public b(e eVar) {
            super(eVar, null);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull Runnable runnable) {
            return 0;
        }
    }

    public static class c extends FutureTask<n> implements Comparable<Runnable> {

        /* renamed from: a, reason: collision with root package name */
        private final n f16970a;

        public c(n nVar) {
            super(nVar, null);
            this.f16970a = nVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NonNull Runnable runnable) {
            if (runnable instanceof c) {
                return ((c) runnable).f16970a.l.ordinal() - this.f16970a.l.ordinal();
            }
            return 0;
        }
    }

    public m() {
        super(2, 2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a());
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

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(Runnable runnable) {
        RunnableFuture cVar = runnable instanceof n ? new c((n) runnable) : new b((e) runnable);
        execute(cVar);
        return cVar;
    }
}
