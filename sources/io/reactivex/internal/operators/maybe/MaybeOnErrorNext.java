package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeOnErrorNext<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class OnErrorNextMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;

        public static final class NextMaybeObserver<T> implements MaybeObserver<T> {
            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(null, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public OnErrorNextMaybeObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            boolean z = th instanceof Exception;
            MaybeObserver maybeObserver = this.d;
            if (!z) {
                maybeObserver.onError(th);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                maybeObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new OnErrorNextMaybeObserver(maybeObserver));
    }
}
