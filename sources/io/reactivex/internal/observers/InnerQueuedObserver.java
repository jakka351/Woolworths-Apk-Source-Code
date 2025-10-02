package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public SimpleQueue d;
    public volatile boolean e;
    public int f;

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return DisposableHelper.c(get());
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.f(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iL = queueDisposable.l(3);
                if (iL == 1) {
                    this.f = iL;
                    this.d = queueDisposable;
                    this.e = true;
                    throw null;
                }
                if (iL == 2) {
                    this.f = iL;
                    this.d = queueDisposable;
                    return;
                }
            }
            this.d = new SpscArrayQueue(0);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f != 0) {
            throw null;
        }
        throw null;
    }
}
