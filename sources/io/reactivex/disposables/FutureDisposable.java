package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        Future<?> future = get();
        return future == null || future.isDone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }
}
