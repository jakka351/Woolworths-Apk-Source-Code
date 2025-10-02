package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class BooleanSubscription extends AtomicBoolean implements Subscription {
    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(true);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.f(j);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
