package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* loaded from: classes7.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {
        public Disposable d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.b();
        }

        @Override // io.reactivex.CompletableObserver
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

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.d = DisposableHelper.d;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.d = DisposableHelper.d;
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        throw null;
    }
}
