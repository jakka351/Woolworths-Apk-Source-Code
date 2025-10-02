package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class CompletableError extends Completable {
    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        EmptyDisposable.c(null, completableObserver);
    }
}
