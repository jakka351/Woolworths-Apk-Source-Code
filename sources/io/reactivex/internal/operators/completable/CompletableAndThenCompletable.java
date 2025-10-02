package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableAndThenCompletable extends Completable {
    public final Completable d;
    public final CompletableSource e;

    public static final class NextObserver implements CompletableObserver {
        public final AtomicReference d;
        public final CompletableObserver e;

        public NextObserver(AtomicReference atomicReference, CompletableObserver completableObserver) {
            this.d = atomicReference;
            this.e = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            DisposableHelper.d(this.d, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.e.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.e.onError(th);
        }
    }

    public static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver d;
        public final CompletableSource e;

        public SourceObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.d = completableObserver;
            this.e = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.e.a(new NextObserver(this, this.d));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }
    }

    public CompletableAndThenCompletable(Completable completable, CompletableSource completableSource) {
        this.d = completable;
        this.e = completableSource;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new SourceObserver(completableObserver, this.e));
    }
}
