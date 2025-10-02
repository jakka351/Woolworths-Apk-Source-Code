package io.reactivex.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public abstract class DisposableSingleObserver<T> implements SingleObserver<T>, Disposable {
    public final AtomicReference d = new AtomicReference();

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.d.get() == DisposableHelper.d;
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
        EndConsumerHelper.b(this.d, disposable, getClass());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this.d);
    }
}
