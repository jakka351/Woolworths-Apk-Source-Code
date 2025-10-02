package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {
        public final CompletableObserver d;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.d = completableObserver;
            lazySet(completableSubject);
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

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(new CompletableDisposable(completableObserver, this));
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void d(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
