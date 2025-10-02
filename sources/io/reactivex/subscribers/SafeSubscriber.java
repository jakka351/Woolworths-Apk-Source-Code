package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {
    public Subscription d;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        try {
            this.d.cancel();
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.d, subscription)) {
            this.d = subscription;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                try {
                    subscription.cancel();
                    RxJavaPlugins.b(th);
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        try {
            this.d.request(j);
        } catch (Throwable th) {
            Exceptions.b(th);
            try {
                this.d.cancel();
                RxJavaPlugins.b(th);
            } catch (Throwable th2) {
                Exceptions.b(th2);
                RxJavaPlugins.b(new CompositeException(th, th2));
            }
        }
    }
}
