package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    @Override // io.reactivex.MaybeSource
    public final void a(MaybeObserver maybeObserver) {
        ObjectHelper.b(maybeObserver, "observer is null");
        try {
            c(maybeObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(MaybeObserver maybeObserver);
}
