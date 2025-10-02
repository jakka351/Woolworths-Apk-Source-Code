package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    public abstract void a(Object obj);

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }
}
