package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class HighPriorityExecutor implements Executor {
    public static volatile Executor e;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new AnonymousClass1());

    /* renamed from: androidx.camera.core.impl.utils.executor.HighPriorityExecutor$1, reason: invalid class name */
    public class AnonymousClass1 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }
}
