package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    public static final class LastObserver<T> implements Observer<T>, Disposable {
        public Disposable d;
        public Object e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d == DisposableHelper.d;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.d;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d = DisposableHelper.d;
            this.e = null;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.e = obj;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        throw null;
    }
}
