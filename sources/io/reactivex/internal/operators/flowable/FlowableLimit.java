package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public long e = 0;
        public Subscription f;

        public LimitSubscriber(Subscriber subscriber) {
            this.d = subscriber;
            lazySet(0L);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                long j = this.e;
                Subscriber subscriber = this.d;
                if (j == 0) {
                    subscription.cancel();
                    EmptySubscription.a(subscriber);
                } else {
                    this.f = subscription;
                    subscriber.m(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e > 0) {
                this.e = 0L;
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e <= 0) {
                RxJavaPlugins.b(th);
            } else {
                this.e = 0L;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.e;
            if (j > 0) {
                long j2 = j - 1;
                this.e = j2;
                Subscriber subscriber = this.d;
                subscriber.onNext(obj);
                if (j2 == 0) {
                    this.f.cancel();
                    subscriber.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (SubscriptionHelper.f(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.f.request(j3);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new LimitSubscriber(flowableSubscriber));
    }
}
