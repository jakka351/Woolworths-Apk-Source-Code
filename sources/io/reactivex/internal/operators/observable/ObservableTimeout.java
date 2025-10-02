package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableTimeout<T, U, V> extends AbstractObservableWithUpstream<T, T> {

    public static final class TimeoutConsumer extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (obj == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Object obj = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (obj == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = (Disposable) get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            disposable.dispose();
            lazySet(disposableHelper);
            throw null;
        }
    }

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, TimeoutSelectorSupport {
        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void c(long j) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements Observer<T>, Disposable, TimeoutSelectorSupport {
        public final Observer d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicReference f = new AtomicReference();

        public TimeoutObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this.f);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.f.get());
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void c(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.a(this.f);
                this.d.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.f, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.f);
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.e;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            long j = get();
            if (j == Long.MAX_VALUE || !compareAndSet(j, 1 + j)) {
                return;
            }
            Disposable disposable = this.e.get();
            if (disposable != null) {
                disposable.dispose();
            }
            Observer observer = this.d;
            observer.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                ((Disposable) this.f.get()).dispose();
                getAndSet(Long.MAX_VALUE);
                observer.onError(th);
            }
        }
    }

    public interface TimeoutSelectorSupport extends ObservableTimeoutTimed.TimeoutSupport {
        void a(long j, Throwable th);
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        TimeoutObserver timeoutObserver = new TimeoutObserver(observer);
        observer.d(timeoutObserver);
        this.d.a(timeoutObserver);
    }
}
