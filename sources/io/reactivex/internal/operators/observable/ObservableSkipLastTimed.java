package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final SpscLinkedArrayQueue e = new SpscLinkedArrayQueue(0);
        public Disposable f;
        public volatile boolean g;

        public SkipLastTimedObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            if (this.g) {
                this.e.clear();
            } else {
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
            if (getAndIncrement() == 0) {
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
        this.d.a(new SkipLastTimedObserver(observer));
    }
}
