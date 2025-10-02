package io.reactivex.internal.operators.observable;

import com.woolworths.scanlibrary.domain.login.c;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class ObservableOnErrorReturn<T> extends AbstractObservableWithUpstream<T, T> {
    public final c e;

    public static final class OnErrorReturnObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public final c e;
        public Disposable f;

        public OnErrorReturnObserver(Observer observer, c cVar) {
            this.d = observer;
            this.e = cVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Observer observer = this.d;
            try {
                Object objMo0apply = this.e.mo0apply(th);
                if (objMo0apply != null) {
                    observer.onNext(objMo0apply);
                    observer.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    observer.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    public ObservableOnErrorReturn(ObservableSubscribeOn observableSubscribeOn, c cVar) {
        super(observableSubscribeOn);
        this.e = cVar;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new OnErrorReturnObserver(observer, this.e));
    }
}
