package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class DirectExecutor implements Executor {
    public static volatile DirectExecutor d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
