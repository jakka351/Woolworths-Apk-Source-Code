package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes7.dex */
public final class ObservableRange extends Observable<Integer> {

    public static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        public long d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.d = 0L;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.d == 0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            long j = this.d;
            if (j != 0) {
                this.d = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
