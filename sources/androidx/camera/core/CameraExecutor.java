package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraFactory;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo
/* loaded from: classes2.dex */
public class CameraExecutor implements Executor {
    public static final ThreadFactory f = new ThreadFactory() { // from class: androidx.camera.core.CameraExecutor.1
        public final AtomicInteger d = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.d.getAndIncrement());
            return thread;
        }
    };
    public final Object d = new Object();
    public ThreadPoolExecutor e;

    public CameraExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f);
        threadPoolExecutor.setRejectedExecutionHandler(new c());
        this.e = threadPoolExecutor;
    }

    public final void a(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        cameraFactory.getClass();
        synchronized (this.d) {
            try {
                if (this.e.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f);
                    threadPoolExecutor2.setRejectedExecutionHandler(new c());
                    this.e = threadPoolExecutor2;
                }
                threadPoolExecutor = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, cameraFactory.c().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.d) {
            this.e.execute(runnable);
        }
    }
}
