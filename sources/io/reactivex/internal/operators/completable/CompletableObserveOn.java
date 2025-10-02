package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableObserveOn extends Completable {
    public final Completable d;
    public final Scheduler e;

    public static final class ObserveOnCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        public final CompletableObserver d;
        public final Scheduler e;
        public Throwable f;

        public ObserveOnCompletableObserver(CompletableObserver completableObserver, Scheduler scheduler) {
            this.d = completableObserver;
            this.e = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f = th;
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.f;
            CompletableObserver completableObserver = this.d;
            if (th == null) {
                completableObserver.onComplete();
            } else {
                this.f = null;
                completableObserver.onError(th);
            }
        }
    }

    public CompletableObserveOn(Completable completable, Scheduler scheduler) {
        this.d = completable;
        this.e = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new ObserveOnCompletableObserver(completableObserver, this.e));
    }
}
