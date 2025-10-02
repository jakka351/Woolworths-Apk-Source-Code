package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes7.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    public final boolean a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = get(i);
            if (disposable2 == DisposableHelper.d) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get(0) == DisposableHelper.d;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable andSet;
        Disposable disposable = get(0);
        DisposableHelper disposableHelper = DisposableHelper.d;
        if (disposable != disposableHelper) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != disposableHelper && (andSet = getAndSet(i, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
