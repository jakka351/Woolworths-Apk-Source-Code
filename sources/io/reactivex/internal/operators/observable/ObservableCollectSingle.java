package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {

    public static final class CollectObserver<T, U> implements Observer<T>, Disposable {
        public Disposable d;
        public boolean e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                this.d.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final Observable b() {
        return new ObservableCollect(null);
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
