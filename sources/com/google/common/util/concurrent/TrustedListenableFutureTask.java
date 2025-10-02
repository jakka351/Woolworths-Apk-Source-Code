package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.InterruptibleTask;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {
    public volatile TrustedFutureInterruptibleTask k;

    public final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean c() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object d() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String e() {
            throw null;
        }
    }

    public final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {
        public final Callable f;

        public TrustedFutureInterruptibleTask(Callable callable) {
            callable.getClass();
            this.f = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void a(Throwable th) {
            TrustedListenableFutureTask.this.n(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void b(Object obj) {
            TrustedListenableFutureTask.this.m(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean c() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object d() {
            return this.f.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String e() {
            return this.f.toString();
        }
    }

    public TrustedListenableFutureTask(Callable callable) {
        this.k = new TrustedFutureInterruptibleTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask;
        Object obj = this.d;
        if ((obj instanceof AbstractFuture.Cancellation) && ((AbstractFuture.Cancellation) obj).f14954a && (trustedFutureInterruptibleTask = this.k) != null) {
            Runnable runnable = InterruptibleTask.e;
            Runnable runnable2 = InterruptibleTask.d;
            Runnable runnable3 = (Runnable) trustedFutureInterruptibleTask.get();
            if (runnable3 instanceof Thread) {
                InterruptibleTask.Blocker blocker = new InterruptibleTask.Blocker(trustedFutureInterruptibleTask);
                InterruptibleTask.Blocker.a(blocker, Thread.currentThread());
                if (trustedFutureInterruptibleTask.compareAndSet(runnable3, blocker)) {
                    try {
                        ((Thread) runnable3).interrupt();
                    } finally {
                        if (((Runnable) trustedFutureInterruptibleTask.getAndSet(runnable2)) == runnable) {
                            LockSupport.unpark((Thread) runnable3);
                        }
                    }
                }
            }
        }
        this.k = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask = this.k;
        if (trustedFutureInterruptibleTask == null) {
            return super.k();
        }
        return "task=[" + trustedFutureInterruptibleTask + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        TrustedFutureInterruptibleTask trustedFutureInterruptibleTask = this.k;
        if (trustedFutureInterruptibleTask != null) {
            trustedFutureInterruptibleTask.run();
        }
        this.k = null;
    }
}
