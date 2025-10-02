package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {
    public final ObservableMap d;
    public final Callable e = Functions.b();

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        public final SingleObserver d;
        public Collection e;
        public Disposable f;

        public ToListObserver(SingleObserver singleObserver, Collection collection) {
            this.d = singleObserver;
            this.e = collection;
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
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Collection collection = this.e;
            this.e = null;
            this.d.onSuccess(collection);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.e = null;
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.e.add(obj);
        }
    }

    public ObservableToListSingle(ObservableMap observableMap) {
        this.d = observableMap;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final Observable b() {
        return new ObservableToList(this.d, this.e);
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            Object objCall = this.e.call();
            ObjectHelper.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.d.a(new ToListObserver(singleObserver, (Collection) objCall));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
