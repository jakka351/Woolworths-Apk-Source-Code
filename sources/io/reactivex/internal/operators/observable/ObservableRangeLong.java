package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes7.dex */
public final class ObservableRangeLong extends Observable<Long> {

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        public final Observer d;
        public long e = 0;
        public boolean f;

        public RangeDisposable(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.e = 0L;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.e == 0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.f = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            long j = this.e;
            if (j != 0) {
                this.e = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        Observer observer2;
        RangeDisposable rangeDisposable = new RangeDisposable(observer);
        observer.d(rangeDisposable);
        if (rangeDisposable.f) {
            return;
        }
        long j = rangeDisposable.e;
        while (true) {
            observer2 = rangeDisposable.d;
            if (j == 0 || rangeDisposable.get() != 0) {
                break;
            }
            observer2.onNext(Long.valueOf(j));
            j++;
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
