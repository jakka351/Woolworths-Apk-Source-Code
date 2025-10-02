package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class ObservableSingleSingle<T> extends Single<T> {
    public final Observable d;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        public final SingleObserver d;
        public Disposable e;
        public Object f;
        public boolean g;

        public SingleElementObserver(SingleObserver singleObserver) {
            this.d = singleObserver;
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
            if (this.g) {
                return;
            }
            this.g = true;
            Object obj = this.f;
            this.f = null;
            if (obj == null) {
                obj = null;
            }
            SingleObserver singleObserver = this.d;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.f == null) {
                this.f = obj;
                return;
            }
            this.g = true;
            this.e.dispose();
            this.d.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public ObservableSingleSingle(Observable observable) {
        this.d = observable;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new SingleElementObserver(singleObserver));
    }
}
