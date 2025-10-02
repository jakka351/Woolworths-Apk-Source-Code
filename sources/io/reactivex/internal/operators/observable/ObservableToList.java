package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class ObservableToList<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    public final Callable e;

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable e;
        public Collection f;

        public ToListObserver(Observer observer, Collection collection) {
            this.d = observer;
            this.f = collection;
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
            Collection collection = this.f;
            this.f = null;
            Observer observer = this.d;
            observer.onNext(collection);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f = null;
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f.add(obj);
        }
    }

    public ObservableToList(ObservableMap observableMap, Callable callable) {
        super(observableMap);
        this.e = callable;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        try {
            Object objCall = this.e.call();
            ObjectHelper.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.d.a(new ToListObserver(observer, (Collection) objCall));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.e(th, observer);
        }
    }
}
