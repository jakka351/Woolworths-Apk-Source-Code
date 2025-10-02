package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes7.dex */
public final class AsyncSubject<T> extends Subject<T> {

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        public final AsyncSubject f;

        public AsyncDisposable(Observer observer, AsyncSubject asyncSubject) {
            super(observer);
            this.f = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(4) == 4) {
                return;
            }
            this.f.getClass();
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(new AsyncDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
