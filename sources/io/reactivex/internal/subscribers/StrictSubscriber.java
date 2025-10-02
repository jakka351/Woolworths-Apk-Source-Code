package io.reactivex.internal.subscribers;

import androidx.camera.core.impl.b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
    public final Subscriber d;
    public final AtomicThrowable e = new AtomicThrowable();
    public final AtomicLong f = new AtomicLong();
    public final AtomicReference g = new AtomicReference();
    public final AtomicBoolean h = new AtomicBoolean();
    public volatile boolean i;

    public StrictSubscriber(Subscriber subscriber) {
        this.d = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.i) {
            return;
        }
        SubscriptionHelper.a(this.g);
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (this.h.compareAndSet(false, true)) {
            this.d.m(this);
            SubscriptionHelper.c(this.g, this.f, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.i = true;
        HalfSerializer.b(this.d, this, this.e);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.i = true;
        HalfSerializer.d(this.d, th, this, this.e);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        HalfSerializer.f(this.d, obj, this, this.e);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.b(this.g, this.f, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(b.k(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
