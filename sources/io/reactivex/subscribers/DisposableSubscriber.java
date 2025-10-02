package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    public final AtomicReference d = new AtomicReference();

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.d.get() == SubscriptionHelper.d;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.a(this.d);
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        Class<?> cls = getClass();
        AtomicReference atomicReference = this.d;
        if (EndConsumerHelper.c(atomicReference, subscription, cls)) {
            ((Subscription) atomicReference.get()).request(Long.MAX_VALUE);
        }
    }
}
