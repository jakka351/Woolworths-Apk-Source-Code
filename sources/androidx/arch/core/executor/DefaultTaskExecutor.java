package androidx.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo
/* loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f200a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1
        public final AtomicInteger d = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.d.getAndIncrement());
            return thread;
        }
    });
    public volatile Handler c;

    @RequiresApi
    public static class Api28Impl {
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public final void c(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.f200a) {
                try {
                    if (this.c == null) {
                        this.c = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.c.post(runnable);
    }
}
