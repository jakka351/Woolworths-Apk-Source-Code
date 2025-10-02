package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    public SequentialDisposable() {
    }

    public final void a(Disposable disposable) {
        DisposableHelper.d(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return DisposableHelper.c(get());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    public SequentialDisposable(SequentialDisposable sequentialDisposable) {
        lazySet(sequentialDisposable);
    }
}
