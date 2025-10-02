package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {
    public Object d;
    public Throwable e;
    public Disposable f;
    public volatile boolean g;

    public BlockingMultiObserver() {
        super(1);
    }

    public final Throwable a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.g = true;
                Disposable disposable = this.f;
                if (disposable != null) {
                    disposable.dispose();
                }
                return e;
            }
        }
        return this.e;
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
        this.f = disposable;
        if (this.g) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        this.e = th;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.d = obj;
        countDown();
    }
}
