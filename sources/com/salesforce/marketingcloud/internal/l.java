package com.salesforce.marketingcloud.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class l {
    private static final String c = "~!SdkExecutors";

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f16929a;
    private final ExecutorService b;

    public class a implements RejectedExecutionHandler {
        public a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            com.salesforce.marketingcloud.g.e(l.c, "Fixed Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    public class b implements RejectedExecutionHandler {
        public b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            com.salesforce.marketingcloud.g.e(l.c, "Cached Thread Pool Task %s rejected.", runnable.toString());
        }
    }

    public l() {
        this(Executors.newFixedThreadPool(1), Executors.newCachedThreadPool());
    }

    @NonNull
    public ExecutorService a() {
        return this.b;
    }

    @NonNull
    public ExecutorService b() {
        return this.f16929a;
    }

    public void c() {
        List<Runnable> listShutdownNow;
        List<Runnable> listShutdownNow2;
        if (!this.f16929a.isShutdown()) {
            this.f16929a.shutdown();
        }
        if (!this.b.isShutdown()) {
            this.b.shutdown();
        }
        try {
            ExecutorService executorService = this.f16929a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit) && (listShutdownNow2 = this.f16929a.shutdownNow()) != null && !listShutdownNow2.isEmpty()) {
                com.salesforce.marketingcloud.g.b(c, "Shutdown DiskIO executor with %d tasks pending", Integer.valueOf(listShutdownNow2.size()));
            }
            if (this.b.awaitTermination(5L, timeUnit) || (listShutdownNow = this.b.shutdownNow()) == null || listShutdownNow.isEmpty()) {
                return;
            }
            com.salesforce.marketingcloud.g.b(c, "Shutdown CachedExecutor executor with %d tasks pending", Integer.valueOf(listShutdownNow.size()));
        } catch (InterruptedException e) {
            com.salesforce.marketingcloud.g.b(c, e, "Unable to complete executors", new Object[0]);
        }
    }

    @VisibleForTesting
    public l(@NonNull ExecutorService executorService, @NonNull ExecutorService executorService2) {
        if (executorService instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService).setRejectedExecutionHandler(new a());
        }
        this.f16929a = executorService;
        if (executorService2 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) executorService2).setRejectedExecutionHandler(new b());
        }
        this.b = executorService2;
    }
}
