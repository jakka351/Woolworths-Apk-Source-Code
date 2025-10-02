package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
class ImmediateFuture<V> implements ListenableFuture<V> {
    public static final ListenableFuture e = new ImmediateFuture(null);
    public static final LazyLogger f = new LazyLogger(ImmediateFuture.class);
    public final Object d;

    public static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {
        static {
            if (AbstractFuture.g) {
                return;
            }
            new ImmediateCancelledFuture().cancel(false);
        }
    }

    public static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
    }

    public ImmediateFuture(Object obj) {
        this.d = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        Preconditions.j(runnable, "Runnable was null.");
        Preconditions.j(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        return android.support.v4.media.session.a.o(this.d, "]]", sb);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.d;
    }
}
