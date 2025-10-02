package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        SubscriptionHelper.b(null, this, j);
        throw null;
    }
}
