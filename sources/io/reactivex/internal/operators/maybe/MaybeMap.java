package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes7.dex */
public final class MaybeMap<T, R> extends AbstractMaybeWithUpstream<T, R> {

    public static final class MapMaybeObserver<T, R> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public Disposable e;

        public MapMaybeObserver(MaybeObserver maybeObserver) {
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
            Disposable disposable = this.e;
            this.e = DisposableHelper.d;
            disposable.dispose();
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
        this.d.a(new MapMaybeObserver(maybeObserver));
    }
}
