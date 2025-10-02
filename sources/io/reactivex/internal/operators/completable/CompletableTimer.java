package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableTimer extends Completable {
    public final long d;
    public final Scheduler e;

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final CompletableObserver d;

        public TimerDisposable(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.onComplete();
        }
    }

    public CompletableTimer(long j, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = j;
        this.e = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        TimerDisposable timerDisposable = new TimerDisposable(completableObserver);
        completableObserver.d(timerDisposable);
        DisposableHelper.d(timerDisposable, this.e.e(timerDisposable, this.d, TimeUnit.SECONDS));
    }
}
