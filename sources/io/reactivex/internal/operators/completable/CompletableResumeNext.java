package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableResumeNext extends Completable {

    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public final CompletableObserver d;
        public boolean e;

        public ResumeNextObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            DisposableHelper.d(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            boolean z = this.e;
            CompletableObserver completableObserver = this.d;
            if (z) {
                completableObserver.onError(th);
                return;
            }
            this.e = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        completableObserver.d(new ResumeNextObserver(completableObserver));
        throw null;
    }
}
