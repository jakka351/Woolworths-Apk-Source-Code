package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        public final SingleObserver d;

        public SingleDisposable(SingleObserver singleObserver, SingleSubject singleSubject) {
            this.d = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(new SingleDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        ObjectHelper.b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
