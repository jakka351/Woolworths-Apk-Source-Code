package io.reactivex.internal.operators.mixed;

import au.com.woolworths.product.details.epoxy.a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleFlatMapObservable<T, R> extends Observable<R> {
    public final Single d;
    public final a e;

    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, SingleObserver<T>, Disposable {
        public final Observer d;
        public final a e;

        public FlatMapObserver(Observer observer, a aVar) {
            this.d = observer;
            this.e = aVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.d(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
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

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                ((ObservableSource) this.e.mo0apply(obj)).a(this);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }
    }

    public SingleFlatMapObservable(Single single, a aVar) {
        this.d = single;
        this.e = aVar;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(observer, this.e);
        observer.d(flatMapObserver);
        this.d.a(flatMapObserver);
    }
}
