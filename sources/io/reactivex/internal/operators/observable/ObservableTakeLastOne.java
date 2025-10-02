package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;
        public Object f;

        public TakeLastOneObserver(Observer observer) {
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
            this.f = null;
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Object obj = this.f;
            Observer observer = this.d;
            if (obj != null) {
                this.f = null;
                observer.onNext(obj);
            }
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f = null;
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f = obj;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new TakeLastOneObserver(observer));
    }
}
