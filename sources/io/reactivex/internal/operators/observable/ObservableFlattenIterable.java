package io.reactivex.internal.operators.observable;

import com.woolworths.scanlibrary.domain.login.c;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final c e;

    public static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {
        public final Observer d;
        public final c e;
        public Disposable f;

        public FlattenIterableObserver(Observer observer, c cVar) {
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
            this.f = DisposableHelper.d;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = this.f;
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            this.f = disposableHelper;
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Disposable disposable = this.f;
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                this.f = disposableHelper;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f == DisposableHelper.d) {
                return;
            }
            try {
                for (T t : (Iterable) this.e.mo0apply(obj)) {
                    try {
                        try {
                            ObjectHelper.b(t, "The iterator returned a null value");
                            this.d.onNext(t);
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            this.f.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        this.f.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.b(th3);
                this.f.dispose();
                onError(th3);
            }
        }
    }

    public ObservableFlattenIterable(ObservableMap observableMap, c cVar) {
        super(observableMap);
        this.e = cVar;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new FlattenIterableObserver(observer, this.e));
    }
}
