package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {
        public final Observer d;
        public Disposable e;
        public volatile Iterator f;
        public volatile boolean g;

        public FlatMapIterableObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f = null;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
            this.e.dispose();
            this.e = DisposableHelper.d;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f == null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 2;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.e = DisposableHelper.d;
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.f;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            ObjectHelper.b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f = null;
            }
            return next;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        new FlatMapIterableObserver(observer);
        throw null;
    }
}
