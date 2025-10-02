package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class CompletableDisposeOn extends Completable {

    public static final class DisposeOnObserver implements CompletableObserver, Disposable, Runnable {
        public Disposable d;
        public volatile boolean e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e;
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e = true;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            if (!this.e) {
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.e) {
                throw null;
            }
            RxJavaPlugins.b(th);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.dispose();
            this.d = DisposableHelper.d;
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        throw null;
    }
}
