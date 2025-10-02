package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {
    public Node e;
    public int f;

    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        public final Observer d;
        public final ObservableCache e;
        public volatile boolean f;

        public CacheDisposable(Observer observer, ObservableCache observableCache) {
            this.d = observer;
            this.e = observableCache;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.getClass();
            throw null;
        }
    }

    public static final class Node<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f24232a;

        public Node(int i) {
            this.f24232a = new Object[i];
        }
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(new CacheDisposable(observer, this));
        throw null;
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
        int i = this.f;
        if (i == 0) {
            Node node = new Node(i);
            node.f24232a[0] = obj;
            this.f = 1;
            this.e = node;
        } else {
            this.e.f24232a[i] = obj;
            this.f = i + 1;
        }
        throw null;
    }
}
