package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Subscription e;
        public volatile boolean f;
        public volatile boolean g;
        public final AtomicLong h = new AtomicLong();
        public final AtomicInteger i = new AtomicInteger();

        public TakeLastSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void b() {
            if (this.i.getAndIncrement() == 0) {
                Subscriber subscriber = this.d;
                long jAddAndGet = this.h.get();
                while (!this.g) {
                    if (this.f) {
                        long j = 0;
                        while (j != jAddAndGet) {
                            if (this.g) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onNext(tPoll);
                                j++;
                            }
                        }
                        if (j != 0 && jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.h.addAndGet(-j);
                        }
                    }
                    if (this.i.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.g = true;
            this.e.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (size() == 0) {
                poll();
            }
            offer(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.h, j);
                b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new TakeLastSubscriber(flowableSubscriber));
    }
}
