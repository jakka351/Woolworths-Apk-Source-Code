package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<Subscription> implements Disposable {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get(0) == SubscriptionHelper.d;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Subscription andSet;
        Subscription subscription = get(0);
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
        if (subscription != subscriptionHelper) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }
}
