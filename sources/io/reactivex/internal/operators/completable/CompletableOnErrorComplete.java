package io.reactivex.internal.operators.completable;

import au.com.woolworths.feature.shop.delivery.address.a;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;

/* loaded from: classes7.dex */
public final class CompletableOnErrorComplete extends Completable {
    public final Completable d;
    public final a e;

    public final class OnError implements CompletableObserver {
        public final CompletableObserver d;

        public OnError(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            CompletableObserver completableObserver = this.d;
            try {
                if (CompletableOnErrorComplete.this.e.test(th)) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                completableObserver.onError(new CompositeException(th, th2));
            }
        }
    }

    public CompletableOnErrorComplete(Completable completable, a aVar) {
        this.d = completable;
        this.e = aVar;
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        this.d.a(new OnError(completableObserver));
    }
}
