package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public abstract class TaskExecutor {
    public final void a(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            c(runnable);
        }
    }

    public abstract boolean b();

    public abstract void c(Runnable runnable);
}
