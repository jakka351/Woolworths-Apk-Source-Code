package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ObservablePublishClassic<T> {

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
        public final Observer d;

        public InnerDisposable(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == this;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            throw null;
        }
    }

    public static final class PublishObserver<T> implements Observer<T>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    public static final class PublishSource<T> implements ObservableSource<T> {
        @Override // io.reactivex.ObservableSource
        public final void a(Observer observer) {
            observer.d(new InnerDisposable(observer));
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
