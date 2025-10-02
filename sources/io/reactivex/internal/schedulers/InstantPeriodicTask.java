package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {
    public static final FutureTask i = new FutureTask(Functions.b, null);
    public final Runnable d;
    public final ExecutorService g;
    public Thread h;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference e = new AtomicReference();

    public InstantPeriodicTask(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.d = runnable;
        this.g = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f;
            Future future2 = (Future) atomicReference.get();
            if (future2 == i) {
                future.cancel(this.h != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.f.get() == i;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.h = Thread.currentThread();
        try {
            this.d.run();
            Future futureSubmit = this.g.submit(this);
            AtomicReference atomicReference = this.e;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future != i) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.h != Thread.currentThread());
            }
            this.h = null;
        } catch (Throwable th) {
            this.h = null;
            RxJavaPlugins.b(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference = this.f;
        FutureTask futureTask = i;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.h != Thread.currentThread());
        }
        Future future2 = (Future) this.e.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.h != Thread.currentThread());
    }
}
