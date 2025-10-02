package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class CompletableTimeout extends Completable {

    public final class DisposeTask implements Runnable {

        public final class DisposeObserver implements CompletableObserver {
            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class TimeOutObserver implements CompletableObserver {
        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(new CompositeDisposable());
        new AtomicBoolean();
        throw null;
    }
}
