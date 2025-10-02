package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e = Thread.currentThread();
        try {
            this.d.run();
            this.e = null;
        } catch (Throwable th) {
            this.e = null;
            lazySet(AbstractDirectTask.f);
            RxJavaPlugins.b(th);
        }
    }
}
