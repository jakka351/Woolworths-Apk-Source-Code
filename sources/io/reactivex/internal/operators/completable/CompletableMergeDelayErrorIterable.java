package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes7.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {
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
