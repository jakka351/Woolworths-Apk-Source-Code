package io.reactivex.disposables;

import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    public final void a(Object obj) {
        ((Subscription) obj).cancel();
    }
}
