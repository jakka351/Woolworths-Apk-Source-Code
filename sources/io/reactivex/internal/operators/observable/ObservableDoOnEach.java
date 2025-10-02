package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {
    public final Consumer e;
    public final Consumer f;
    public final Action g;
    public final Action h;

    public static final class DoOnEachObserver<T> implements Observer<T>, Disposable {
        public final Observer d;
        public final Consumer e;
        public final Consumer f = Functions.d;
        public final Action g;
        public final Action h;
        public Disposable i;
        public boolean j;

        public DoOnEachObserver(Observer observer, Consumer consumer) {
            this.d = observer;
            this.e = consumer;
            Action action = Functions.c;
            this.g = action;
            this.h = action;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.i.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.i, disposable)) {
                this.i = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.i.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.j) {
                RxJavaPlugins.b(th);
            } else {
                this.j = true;
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.j) {
                return;
            }
            try {
                this.e.accept(obj);
                this.d.onNext(obj);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.i.dispose();
                onError(th);
            }
        }
    }

    public ObservableDoOnEach(Observable observable, Consumer consumer) {
        super(observable);
        this.e = consumer;
        this.f = Functions.d;
        Action action = Functions.c;
        this.g = action;
        this.h = action;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DoOnEachObserver(observer, this.e));
    }
}
