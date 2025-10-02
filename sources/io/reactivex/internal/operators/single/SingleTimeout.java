package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleTimeout<T> extends Single<T> {
    public final Single d;
    public final Scheduler e;

    public static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {
        public final SingleObserver d;
        public final AtomicReference e;
        public final TimeoutFallbackObserver f;
        public final long g;
        public final TimeUnit h;

        public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public TimeoutMainObserver(SingleObserver singleObserver) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.d = singleObserver;
            this.g = 10L;
            this.h = timeUnit;
            this.e = new AtomicReference();
            this.f = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.e);
            TimeoutFallbackObserver timeoutFallbackObserver = this.f;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.a(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this.e);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.a(this.e);
            this.d.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            this.d.onError(new TimeoutException(ExceptionHelper.c(this.g, this.h)));
        }
    }

    public SingleTimeout(Single single, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = single;
        this.e = scheduler;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        TimeoutMainObserver timeoutMainObserver = new TimeoutMainObserver(singleObserver);
        singleObserver.d(timeoutMainObserver);
        DisposableHelper.d(timeoutMainObserver.e, this.e.e(timeoutMainObserver, 10L, timeUnit));
        this.d.a(timeoutMainObserver);
    }
}
