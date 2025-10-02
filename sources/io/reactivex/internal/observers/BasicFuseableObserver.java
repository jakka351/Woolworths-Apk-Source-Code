package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    public final Observer d;
    public Disposable e;
    public QueueDisposable f;
    public boolean g;
    public int h;

    public BasicFuseableObserver(Observer observer) {
        this.d = observer;
    }

    public final void a(Throwable th) {
        Exceptions.b(th);
        this.e.dispose();
        onError(th);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.e.b();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f.clear();
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.l(this.e, disposable)) {
            this.e = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f = (QueueDisposable) disposable;
            }
            this.d.d(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int l(int i) {
        QueueDisposable queueDisposable = this.f;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int iL = queueDisposable.l(i);
        if (iL == 0) {
            return iL;
        }
        this.h = iL;
        return iL;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.g) {
            RxJavaPlugins.b(th);
        } else {
            this.g = true;
            this.d.onError(th);
        }
    }
}
