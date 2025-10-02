package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {
    public final Function e;

    public static final class OnErrorNextObserver<T> implements Observer<T> {
        public final Observer d;
        public final Function e;
        public final SequentialDisposable f = new SequentialDisposable();
        public boolean g;
        public boolean h;

        public OnErrorNextObserver(Observer observer, Function function) {
            this.d = observer;
            this.e = function;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.g = true;
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            boolean z = this.g;
            Observer observer = this.d;
            if (z) {
                if (this.h) {
                    RxJavaPlugins.b(th);
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            this.g = true;
            try {
                ObservableSource observableSource = (ObservableSource) this.e.mo0apply(th);
                if (observableSource != null) {
                    observableSource.a(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                observer.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            this.d.onNext(obj);
        }
    }

    public ObservableOnErrorNext(Observable observable, Function function) {
        super(observable);
        this.e = function;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer, this.e);
        observer.d(onErrorNextObserver.f);
        this.d.a(onErrorNextObserver);
    }
}
