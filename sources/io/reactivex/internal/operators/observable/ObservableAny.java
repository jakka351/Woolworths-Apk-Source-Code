package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableAny<T> extends AbstractObservableWithUpstream<T, Boolean> {

    public static final class AnyObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;
        public boolean f;

        public AnyObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            Boolean bool = Boolean.FALSE;
            Observer observer = this.d;
            observer.onNext(bool);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
            } else {
                this.f = true;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new AnyObserver(observer));
    }
}
