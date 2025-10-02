package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    public final Observer d;
    public Object e;

    public DeferredScalarDisposable(Observer observer) {
        this.d = observer;
    }

    public final void a(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        Observer observer = this.d;
        if (i == 8) {
            this.e = obj;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(obj);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == 4;
    }

    public final void c(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.b(th);
        } else {
            lazySet(2);
            this.d.onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.e = null;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        set(4);
        this.e = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int l(int i) {
        lazySet(8);
        return 2;
    }

    public void onError(Throwable th) {
        c(th);
    }

    public void onSuccess(Object obj) {
        a(obj);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.e;
        this.e = null;
        lazySet(32);
        return obj;
    }
}
