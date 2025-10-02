package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableTimer e;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicReference e = new AtomicReference();
        public final OtherObserver f = new OtherObserver();
        public final AtomicThrowable g = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public OtherObserver() {
            }

            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.e);
                HalfSerializer.a(takeUntilMainObserver.d, takeUntilMainObserver, takeUntilMainObserver.g);
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.e);
                HalfSerializer.c(takeUntilMainObserver.d, th, takeUntilMainObserver, takeUntilMainObserver.g);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                DisposableHelper.a(this);
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.a(takeUntilMainObserver.e);
                HalfSerializer.a(takeUntilMainObserver.d, takeUntilMainObserver, takeUntilMainObserver.g);
            }
        }

        public TakeUntilMainObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.e.get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.e, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.e);
            DisposableHelper.a(this.f);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.a(this.f);
            HalfSerializer.a(this.d, this, this.g);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            HalfSerializer.c(this.d, th, this, this.g);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            HalfSerializer.e(this.d, obj, this, this.g);
        }
    }

    public ObservableTakeUntil(ObservableSource observableSource, ObservableTimer observableTimer) {
        super(observableSource);
        this.e = observableTimer;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(observer);
        observer.d(takeUntilMainObserver);
        this.e.a(takeUntilMainObserver.f);
        this.d.a(takeUntilMainObserver);
    }
}
