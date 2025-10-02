package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class CompletableConcatArray extends Completable {

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        public final CompletableObserver d;
        public int e;
        public final SequentialDisposable f = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.f;
            if (sequentialDisposable.b() || getAndIncrement() != 0 || sequentialDisposable.b()) {
                return;
            }
            this.e++;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void d(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f;
            sequentialDisposable.getClass();
            DisposableHelper.d(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver);
        completableObserver.d(concatInnerObserver.f);
        concatInnerObserver.a();
    }
}
