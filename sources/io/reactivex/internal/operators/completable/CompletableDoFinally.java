package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class CompletableDoFinally extends Completable {

    public static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {
        public final CompletableObserver d;
        public Disposable e;

        public DoFinallyObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.d.onComplete();
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
            a();
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new DoFinallyObserver(completableObserver);
        throw null;
    }
}
