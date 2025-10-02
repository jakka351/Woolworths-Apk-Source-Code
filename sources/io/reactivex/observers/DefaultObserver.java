package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes7.dex */
public abstract class DefaultObserver<T> implements Observer<T> {
    public Disposable d;

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        Disposable disposable2 = this.d;
        Class<?> cls = getClass();
        ObjectHelper.b(disposable, "next is null");
        if (disposable2 == null) {
            this.d = disposable;
            return;
        }
        disposable.dispose();
        if (disposable2 != DisposableHelper.d) {
            EndConsumerHelper.a(cls);
        }
    }
}
