package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int l(int i) {
        return 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (SubscriptionHelper.f(j) && compareAndSet(0, 1)) {
            throw null;
        }
    }
}
