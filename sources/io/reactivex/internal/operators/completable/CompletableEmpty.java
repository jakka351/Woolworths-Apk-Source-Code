package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes7.dex */
public final class CompletableEmpty extends Completable {
    public static final CompletableEmpty d = new CompletableEmpty();

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(EmptyDisposable.d);
        completableObserver.onComplete();
    }
}
