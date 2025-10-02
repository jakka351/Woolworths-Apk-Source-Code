package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {
    public Object d;
    public Throwable e;
    public Disposable f;
    public volatile boolean g;

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.g;
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        this.f = disposable;
        if (this.g) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g = true;
        Disposable disposable = this.f;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }
}
