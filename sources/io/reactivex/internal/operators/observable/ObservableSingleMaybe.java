package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {
    public final Observable d;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        public final MaybeObserver d;
        public Disposable e;
        public Object f;
        public boolean g;

        public SingleElementObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
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
            MaybeObserver maybeObserver = this.d;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
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

    public ObservableSingleMaybe(Observable observable) {
        this.d = observable;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new SingleElementObserver(maybeObserver));
    }
}
