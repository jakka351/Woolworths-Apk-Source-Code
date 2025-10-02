package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {

    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public Disposable e;

        public IsEmptyMaybeObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.MaybeObserver
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

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(Boolean.FALSE);
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new IsEmptyMaybeObserver(maybeObserver));
    }
}
