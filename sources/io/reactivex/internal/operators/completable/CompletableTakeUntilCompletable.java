package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableTakeUntilCompletable extends Completable {

    public static final class TakeUntilMainObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver d;
        public final OtherObserver e = new OtherObserver(this);
        public final AtomicBoolean f = new AtomicBoolean();

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final TakeUntilMainObserver d;

            public OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.d = takeUntilMainObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = this.d;
                if (takeUntilMainObserver.f.compareAndSet(false, true)) {
                    DisposableHelper.a(takeUntilMainObserver);
                    takeUntilMainObserver.d.onComplete();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = this.d;
                if (!takeUntilMainObserver.f.compareAndSet(false, true)) {
                    RxJavaPlugins.b(th);
                } else {
                    DisposableHelper.a(takeUntilMainObserver);
                    takeUntilMainObserver.d.onError(th);
                }
            }
        }

        public TakeUntilMainObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.get();
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f.compareAndSet(false, true)) {
                DisposableHelper.a(this);
                DisposableHelper.a(this.e);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            if (this.f.compareAndSet(false, true)) {
                DisposableHelper.a(this.e);
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.f.compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this.e);
                this.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(new TakeUntilMainObserver(completableObserver));
        throw null;
    }
}
