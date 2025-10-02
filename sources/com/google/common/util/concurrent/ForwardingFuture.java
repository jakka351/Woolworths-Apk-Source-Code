package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* renamed from: R1 */
        public final Future P1() {
            return null;
        }
    }

    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Future P1();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return P1().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return P1().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return P1().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return P1().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return P1().get(j, timeUnit);
    }
}
