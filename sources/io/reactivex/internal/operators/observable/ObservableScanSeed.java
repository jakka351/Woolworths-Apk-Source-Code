package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableScanSeed<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class ScanSeedObserver<T, R> implements Observer<T>, Disposable {
        public boolean d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.e(th, observer);
        }
    }
}
