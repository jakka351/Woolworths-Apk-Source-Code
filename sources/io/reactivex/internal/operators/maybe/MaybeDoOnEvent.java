package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class MaybeDoOnEvent<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DoOnEventMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public Disposable e;

        public DoOnEventMaybeObserver(MaybeObserver maybeObserver) {
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
            this.e = DisposableHelper.d;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.e = DisposableHelper.d;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.e = DisposableHelper.d;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.d.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.e = DisposableHelper.d;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new DoOnEventMaybeObserver(maybeObserver));
    }
}
