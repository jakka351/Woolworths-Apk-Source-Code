package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableRetryBiPredicate<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RetryBiObserver<T> extends AtomicInteger implements Observer<T> {
        public final Observer d;
        public final SequentialDisposable e;
        public final ObservableSource f;
        public int g;

        public RetryBiObserver(Observer observer, SequentialDisposable sequentialDisposable, ObservableSource observableSource) {
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
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            try {
                this.g++;
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                this.d.onError(new CompositeException(th, th2));
            }
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
        RetryBiObserver retryBiObserver = new RetryBiObserver(observer, sequentialDisposable, this.d);
        if (retryBiObserver.getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!retryBiObserver.e.b()) {
                retryBiObserver.f.a(retryBiObserver);
                iAddAndGet = retryBiObserver.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }
}
