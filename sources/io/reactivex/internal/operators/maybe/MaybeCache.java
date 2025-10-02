package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {
    public Object d;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {
        public final MaybeObserver d;

        public CacheDisposable(MaybeObserver maybeObserver, MaybeCache maybeCache) {
            super(maybeCache);
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(new CacheDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void d(Disposable disposable) {
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
        this.d = obj;
        throw null;
    }
}
