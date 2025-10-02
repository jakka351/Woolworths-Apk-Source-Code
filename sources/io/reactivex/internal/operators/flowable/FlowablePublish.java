package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, FlowablePublishClassic<T> {

    public static final class FlowablePublisher<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        public final void e(Subscriber subscriber) {
            subscriber.m(new InnerSubscriber(subscriber));
            throw null;
        }
    }

    public static final class InnerSubscriber<T> extends AtomicLong implements Subscription {
        public final Subscriber d;

        public InnerSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (get() != Long.MIN_VALUE) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.b(this, j);
            }
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public volatile Serializable d;
        public int e;
        public volatile SimpleQueue f;

        public final void a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(null, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.e = iL;
                        this.f = queueSubscription;
                        this.d = NotificationLite.d;
                        a();
                        return;
                    }
                    if (iL == 2) {
                        this.e = iL;
                        this.f = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.f = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.d == null) {
                this.d = NotificationLite.d;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.d != null) {
                RxJavaPlugins.b(th);
            } else {
                this.d = (Serializable) NotificationLite.e(th);
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e != 0 || this.f.offer(obj)) {
                a();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }
}
