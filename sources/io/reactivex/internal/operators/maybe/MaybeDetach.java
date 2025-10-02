package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class MaybeDetach<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DetachMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public MaybeObserver d;
        public Disposable e;

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
            this.d = null;
            this.e.dispose();
            this.e = DisposableHelper.d;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.e = DisposableHelper.d;
            MaybeObserver maybeObserver = this.d;
            if (maybeObserver != null) {
                this.d = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.e = DisposableHelper.d;
            MaybeObserver maybeObserver = this.d;
            if (maybeObserver != null) {
                this.d = null;
                maybeObserver.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.e = DisposableHelper.d;
            MaybeObserver maybeObserver = this.d;
            if (maybeObserver != null) {
                this.d = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        DetachMaybeObserver detachMaybeObserver = new DetachMaybeObserver();
        detachMaybeObserver.d = maybeObserver;
        this.d.a(detachMaybeObserver);
    }
}
