package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableRepeatUntil<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatUntilObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer d;
        public final SequentialDisposable e;
        public final ObservableSource f;

        public RepeatUntilObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
            this.d = observer;
            this.e = sequentialDisposable;
            this.f = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
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
        RepeatUntilObserver repeatUntilObserver = new RepeatUntilObserver(observer, sequentialDisposable, this.d);
        if (repeatUntilObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                repeatUntilObserver.f.a(repeatUntilObserver);
                iAddAndGet = repeatUntilObserver.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
