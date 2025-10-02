package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {
    public static final FutureTask f;
    public static final FutureTask g;
    public final Runnable d;
    public Thread e;

    static {
        Runnable runnable = Functions.b;
        f = new FutureTask(runnable, null);
        g = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.d = runnable;
    }

    public final void a(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f) {
                return;
            }
            if (future2 == g) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        Future<?> future = get();
        return future == f || future == g;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == f || future == (futureTask = g) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.e != Thread.currentThread());
    }
}
