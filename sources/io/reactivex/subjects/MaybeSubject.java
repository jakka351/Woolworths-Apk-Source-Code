package io.reactivex.subjects;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {
        public final MaybeObserver d;

        public MaybeDisposable(MaybeObserver maybeObserver, MaybeSubject maybeSubject) {
            this.d = maybeObserver;
            lazySet(maybeSubject);
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
        maybeObserver.d(new MaybeDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void d(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        ObjectHelper.b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
