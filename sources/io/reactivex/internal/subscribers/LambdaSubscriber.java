package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription, Disposable, LambdaConsumerIntrospection {
    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return get() == SubscriptionHelper.d;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.e(this, subscription)) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
        if (subscription == subscriptionHelper) {
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
        if (subscription == subscriptionHelper) {
            RxJavaPlugins.b(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.b(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (b()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }
}
