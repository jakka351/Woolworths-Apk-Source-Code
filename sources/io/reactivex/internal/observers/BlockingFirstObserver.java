package io.reactivex.internal.observers;

/* loaded from: classes7.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.d == null) {
            this.e = th;
        }
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.d == null) {
            this.d = obj;
            this.f.dispose();
            countDown();
        }
    }
}
