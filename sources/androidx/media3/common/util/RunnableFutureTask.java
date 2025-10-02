package androidx.media3.common.util;

import java.lang.Exception;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {
    public Exception d;
    public Object e;
    public Thread f;
    public boolean g;

    public void a() {
    }

    public abstract Object b();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        throw null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        TimeUnit.MILLISECONDS.convert(j, timeUnit);
        throw null;
    }
}
