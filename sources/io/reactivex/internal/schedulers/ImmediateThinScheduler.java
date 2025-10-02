package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class ImmediateThinScheduler extends Scheduler {
    public static final Scheduler.Worker f = new ImmediateThinWorker();
    public static final Disposable g;

    public static final class ImmediateThinWorker extends Scheduler.Worker {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return false;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.g;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
    }

    static {
        Disposable disposableB = Disposables.b(Functions.b);
        g = disposableB;
        disposableB.dispose();
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return f;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable d(Runnable runnable) {
        runnable.run();
        return g;
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.Scheduler
    public final Disposable f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
