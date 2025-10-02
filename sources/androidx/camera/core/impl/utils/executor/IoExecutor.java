package androidx.camera.core.impl.utils.executor;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class IoExecutor implements Executor {
    public static volatile Executor e;
    public final ExecutorService d = Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.IoExecutor.1
        public final AtomicInteger d = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.d.getAndIncrement());
            return thread;
        }
    });

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }
}
