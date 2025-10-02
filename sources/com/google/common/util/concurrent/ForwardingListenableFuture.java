package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {
        public final AbstractFuture d;

        public SimpleForwardingListenableFuture(AbstractFuture abstractFuture) {
            this.d = abstractFuture;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.d;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: R1 */
        public final Future P1() {
            return this.d;
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture
        /* renamed from: U1 */
        public final ListenableFuture P1() {
            return this.d;
        }
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public abstract ListenableFuture P1();

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        P1().addListener(runnable, executor);
    }
}
