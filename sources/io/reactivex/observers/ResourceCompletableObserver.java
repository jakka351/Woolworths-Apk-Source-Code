package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes7.dex */
public abstract class ResourceCompletableObserver implements CompletableObserver, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void d(Disposable disposable) {
        EndConsumerHelper.b(null, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }
}
