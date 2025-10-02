package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {
    public static volatile ArchTaskExecutor b;
    public static final a c = new a(0);
    public static final a d = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final DefaultTaskExecutor f199a = new DefaultTaskExecutor();

    public static ArchTaskExecutor d() {
        if (b != null) {
            return b;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (b == null) {
                    b = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public final boolean b() {
        return this.f199a.b();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public final void c(Runnable runnable) {
        this.f199a.c(runnable);
    }
}
