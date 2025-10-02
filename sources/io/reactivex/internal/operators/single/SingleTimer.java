package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleTimer extends Single<Long> {

    public static final class TimerDisposable extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final SingleObserver d;

        public TimerDisposable(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.onSuccess(0L);
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(new TimerDisposable(singleObserver));
        throw null;
    }
}
