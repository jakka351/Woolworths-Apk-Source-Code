package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

/* loaded from: classes7.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    public static final class FromSingleObserver<T> implements SingleObserver<T>, Disposable {
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
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d = DisposableHelper.d;
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        throw null;
    }
}
