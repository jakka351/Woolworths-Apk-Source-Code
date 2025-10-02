package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler e;

    public static final class SubscribeOnObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicReference e = new AtomicReference();

        public SubscribeOnObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.e, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.e);
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    public final class SubscribeTask implements Runnable {
        public final SubscribeOnObserver d;

        public SubscribeTask(SubscribeOnObserver subscribeOnObserver) {
            this.d = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.d.a(this.d);
        }
    }

    public ObservableSubscribeOn(Observable observable, Scheduler scheduler) {
        super(observable);
        this.e = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.d(subscribeOnObserver);
        DisposableHelper.f(subscribeOnObserver, this.e.d(new SubscribeTask(subscribeOnObserver)));
    }
}
