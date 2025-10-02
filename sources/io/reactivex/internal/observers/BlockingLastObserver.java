package io.reactivex.internal.observers;

/* loaded from: classes7.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        this.d = null;
        this.e = th;
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.d = obj;
    }
}
