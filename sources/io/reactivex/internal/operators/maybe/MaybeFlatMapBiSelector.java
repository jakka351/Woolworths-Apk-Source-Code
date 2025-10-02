package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractMaybeWithUpstream<T, R> {

    public static final class FlatMapBiMainObserver<T, U, R> implements MaybeObserver<T>, Disposable {
        public final InnerObserver d;

        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {
            public final MaybeObserver d;
            public Object e;

            public InnerObserver(MaybeObserver maybeObserver) {
                this.d = maybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.d.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                this.d.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.e = null;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.d.onError(th);
                }
            }
        }

        public FlatMapBiMainObserver(MaybeObserver maybeObserver) {
            this.d = new InnerObserver(maybeObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(this.d.get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            InnerObserver innerObserver = this.d;
            if (DisposableHelper.f(innerObserver, disposable)) {
                innerObserver.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.d);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.d.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new FlatMapBiMainObserver(maybeObserver));
    }
}
