package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class SchedulerWhen extends Scheduler implements Disposable {
    public static final Disposable f = new SubscribedDisposable();

    public static final class CreateWorkerFunction implements Function<ScheduledAction, Completable> {

        public final class WorkerCompletable extends Completable {
            public final ScheduledAction d;

            public WorkerCompletable(CreateWorkerFunction createWorkerFunction, ScheduledAction scheduledAction) {
                this.d = scheduledAction;
            }

            @Override // io.reactivex.Completable
            public final void c(CompletableObserver completableObserver) {
                completableObserver.d(this.d);
                throw null;
            }
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            return new WorkerCompletable(this, (ScheduledAction) obj);
        }
    }

    public static class DelayedAction extends ScheduledAction {
        public final Runnable d;

        public DelayedAction(Runnable runnable, long j, TimeUnit timeUnit) {
            this.d = runnable;
        }
    }

    public static class ImmediateAction extends ScheduledAction {
        public final Runnable d;

        public ImmediateAction(Runnable runnable) {
            this.d = runnable;
        }
    }

    public static class OnCompletedAction implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class QueueWorker extends Scheduler.Worker {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable c(Runnable runnable) {
            new ImmediateAction(runnable);
            throw null;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            new DelayedAction(runnable, j, timeUnit);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    public static abstract class ScheduledAction extends AtomicReference<Disposable> implements Disposable {
        public ScheduledAction() {
            super(SchedulerWhen.f);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get().b();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable;
            EmptyDisposable emptyDisposable;
            Disposable disposable2 = SchedulerWhen.f;
            do {
                disposable = get();
                Disposable disposable3 = SchedulerWhen.f;
                emptyDisposable = EmptyDisposable.d;
                if (disposable == emptyDisposable) {
                    return;
                }
            } while (!compareAndSet(disposable, emptyDisposable));
            if (disposable != SchedulerWhen.f) {
                disposable.dispose();
            }
        }
    }

    public static final class SubscribedDisposable implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        throw null;
    }
}
