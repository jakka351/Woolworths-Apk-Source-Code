package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class SingleDetach<T> extends Single<T> {

    public static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {
        public Disposable d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.b();
        }

        @Override // io.reactivex.SingleObserver
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

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d = DisposableHelper.d;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d = DisposableHelper.d;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        throw null;
    }
}
