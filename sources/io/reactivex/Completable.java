package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes.dex */
public abstract class Completable implements CompletableSource {
    @Override // io.reactivex.CompletableSource
    public final void a(CompletableObserver completableObserver) {
        ObjectHelper.b(completableObserver, "observer is null");
        try {
            c(completableObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(CompletableObserver completableObserver);
}
