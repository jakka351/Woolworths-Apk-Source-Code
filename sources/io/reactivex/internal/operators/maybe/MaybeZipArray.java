package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {

    public final class SingletonArrayFunc implements Function<T, R> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                throw null;
            }
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
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

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        throw null;
    }
}
