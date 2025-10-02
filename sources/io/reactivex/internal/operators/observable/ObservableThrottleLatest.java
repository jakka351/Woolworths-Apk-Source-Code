package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public Disposable d;
        public volatile boolean e;
        public Throwable f;
        public volatile boolean g;

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.g || !this.e || this.f != null) {
                throw null;
            }
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
            this.d.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.e = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f = th;
            this.e = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
