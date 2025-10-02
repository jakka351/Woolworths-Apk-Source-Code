package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends Observable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicQueueDisposable<R> implements MaybeObserver<T> {
        public Disposable d;
        public volatile Iterator e;
        public volatile boolean f;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.e = null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f = true;
            this.d.dispose();
            this.d = DisposableHelper.d;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.e == null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 2;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d = DisposableHelper.d;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.e;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            ObjectHelper.b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.e = null;
            }
            return next;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
