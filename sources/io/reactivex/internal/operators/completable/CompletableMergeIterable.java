package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class CompletableMergeIterable extends Completable {

    public static final class MergeCompletableObserver extends AtomicBoolean implements CompletableObserver {
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
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(new CompositeDisposable());
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            completableObserver.onError(th);
        }
    }
}
