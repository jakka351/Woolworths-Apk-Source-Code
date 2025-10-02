package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer d;
        public final SpscLinkedArrayQueue e = new SpscLinkedArrayQueue(0);
        public Disposable f;
        public volatile boolean g;

        public TakeLastTimedObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
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
            if (this.g) {
                return;
            }
            this.g = true;
            this.f.dispose();
            if (compareAndSet(false, true)) {
                this.e.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new TakeLastTimedObserver(observer));
    }
}
