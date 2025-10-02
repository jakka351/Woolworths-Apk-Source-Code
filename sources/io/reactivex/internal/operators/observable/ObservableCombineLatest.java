package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {

    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
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

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        public volatile boolean d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
