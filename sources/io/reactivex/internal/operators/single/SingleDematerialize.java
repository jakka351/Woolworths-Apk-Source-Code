package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

@Experimental
/* loaded from: classes7.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {

    public static final class DematerializeObserver<T, R> implements SingleObserver<T>, Disposable {
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
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        throw null;
    }
}
