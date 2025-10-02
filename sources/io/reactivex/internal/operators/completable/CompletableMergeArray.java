package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class CompletableMergeArray extends Completable {

    public static final class InnerCompletableObserver extends AtomicInteger implements CompletableObserver {
        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            throw null;
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new AtomicBoolean();
        throw null;
    }
}
