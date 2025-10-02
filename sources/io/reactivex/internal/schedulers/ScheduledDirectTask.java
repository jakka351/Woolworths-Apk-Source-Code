package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes7.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.f;
        this.e = Thread.currentThread();
        try {
            this.d.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.e = null;
        }
    }
}
