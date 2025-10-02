package io.reactivex.internal.operators.observable;

import YU.a;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes7.dex */
public final class ObservableFromArray<T> extends Observable<T> {
    public final Object[] d;

    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        public final Observer d;
        public final Object[] e;
        public int f;
        public boolean g;
        public volatile boolean h;

        public FromArrayDisposable(Observer observer, Object[] objArr) {
            this.d = observer;
            this.e = objArr;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f = this.e.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.h = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f == this.e.length;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.g = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            int i = this.f;
            Object[] objArr = this.e;
            if (i == objArr.length) {
                return null;
            }
            this.f = i + 1;
            Object obj = objArr[i];
            ObjectHelper.b(obj, "The array element is null");
            return obj;
        }
    }

    public ObservableFromArray(Object[] objArr) {
        this.d = objArr;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        Object[] objArr = this.d;
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, objArr);
        observer.d(fromArrayDisposable);
        if (fromArrayDisposable.g) {
            return;
        }
        int length = objArr.length;
        for (int i = 0; i < length && !fromArrayDisposable.h; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                fromArrayDisposable.d.onError(new NullPointerException(a.e(i, "The element at index ", " is null")));
                return;
            }
            fromArrayDisposable.d.onNext(obj);
        }
        if (fromArrayDisposable.h) {
            return;
        }
        fromArrayDisposable.d.onComplete();
    }
}
