package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

/* loaded from: classes7.dex */
public final class CompletableMergeDelayErrorArray extends Completable {

    public static final class MergeInnerCompletableObserver implements CompletableObserver {
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
        throw null;
    }
}
