package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleObserveOn<T> extends Single<T> {
    public final Single d;
    public final Scheduler e;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        public final SingleObserver d;
        public final Scheduler e;
        public Object f;
        public Throwable g;

        public ObserveOnSingleObserver(SingleObserver singleObserver, Scheduler scheduler) {
            this.d = singleObserver;
            this.e = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.g = th;
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.f = obj;
            DisposableHelper.d(this, this.e.d(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.g;
            SingleObserver singleObserver = this.d;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f);
            }
        }
    }

    public SingleObserveOn(Single single, Scheduler scheduler) {
        this.d = single;
        this.e = scheduler;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new ObserveOnSingleObserver(singleObserver, this.e));
    }
}
