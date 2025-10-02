package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractObservableWithUpstream<T, GroupedObservable<K, V>> {

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {
        public static final Object h = new Object();
        public final Observer d;
        public Disposable f;
        public final AtomicBoolean g = new AtomicBoolean();
        public final ConcurrentHashMap e = new ConcurrentHashMap();

        public GroupByObserver(Observer observer) {
            this.d = observer;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g.get();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            ArrayList arrayList = new ArrayList(this.e.values());
            this.e.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.e.values());
            this.e.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.f.dispose();
                onError(th);
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        @Override // io.reactivex.Observable
        public final void h(Observer observer) {
            throw null;
        }
    }

    public static final class State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {
        public volatile boolean d;
        public Throwable e;

        @Override // io.reactivex.ObservableSource
        public final void a(Observer observer) {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new GroupByObserver(observer));
    }
}
