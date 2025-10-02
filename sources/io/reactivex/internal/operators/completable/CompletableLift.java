package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class CompletableLift extends Completable {
    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }
}
