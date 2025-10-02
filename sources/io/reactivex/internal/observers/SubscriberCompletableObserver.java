package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, Subscription {
    public Disposable d;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.dispose();
    }

    @Override // io.reactivex.CompletableObserver
    public final void d(Disposable disposable) {
        if (DisposableHelper.l(this.d, disposable)) {
            this.d = disposable;
            throw null;
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
