package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final class DisposeOnCancel implements Future<Object> {
    public final Disposable d;

    public DisposeOnCancel(Disposable disposable) {
        this.d = disposable;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.d.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
