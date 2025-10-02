package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;

        public final class DisposeTask implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public UnsubscribeObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get();
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
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.b(th);
            } else {
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new UnsubscribeObserver(observer));
    }
}
