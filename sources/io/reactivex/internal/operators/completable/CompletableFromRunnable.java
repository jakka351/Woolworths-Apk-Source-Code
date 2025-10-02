package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class CompletableFromRunnable extends Completable {
    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        Disposable disposableB = Disposables.b(Functions.b);
        completableObserver.d(disposableB);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            if (disposableB.b()) {
                RxJavaPlugins.b(th);
            } else {
                completableObserver.onError(th);
            }
        }
    }
}
