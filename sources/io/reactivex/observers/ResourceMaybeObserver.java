package io.reactivex.observers;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes7.dex */
public abstract class ResourceMaybeObserver<T> implements MaybeObserver<T>, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void d(Disposable disposable) {
        EndConsumerHelper.b(null, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }
}
