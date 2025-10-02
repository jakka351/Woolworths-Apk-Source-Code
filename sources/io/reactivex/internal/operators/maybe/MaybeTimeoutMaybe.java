package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class MaybeTimeoutMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public final TimeoutOtherMaybeObserver e = new TimeoutOtherMaybeObserver(this);
        public final TimeoutFallbackMaybeObserver f = null;

        public TimeoutMainMaybeObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.e);
            TimeoutFallbackMaybeObserver timeoutFallbackMaybeObserver = this.f;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            DisposableHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            DisposableHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onSuccess(obj);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {
        public final TimeoutMainMaybeObserver d;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver timeoutMainMaybeObserver) {
            this.d = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.d;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.d.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.d;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.d.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            TimeoutMainMaybeObserver timeoutMainMaybeObserver = this.d;
            timeoutMainMaybeObserver.getClass();
            if (DisposableHelper.a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.d.onError(new TimeoutException());
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(new TimeoutMainMaybeObserver(maybeObserver));
        throw null;
    }
}
