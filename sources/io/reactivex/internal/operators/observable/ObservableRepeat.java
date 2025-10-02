package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer d;
        public final SequentialDisposable e;
        public final ObservableSource f;
        public long g = -1;

        public RepeatObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.d = observer;
            this.e = sequentialDisposable;
            this.f = observableSource;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.e.b()) {
                    this.f.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            long j = this.g;
            if (j != Long.MAX_VALUE) {
                this.g = j - 1;
            }
            if (j != 0) {
                a();
            } else {
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.d(sequentialDisposable);
        new RepeatObserver(observer, sequentialDisposable, this.d).a();
    }
}
