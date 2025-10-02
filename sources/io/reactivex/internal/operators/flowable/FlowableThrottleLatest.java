package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public Subscription d;
        public volatile boolean e;
        public Throwable f;
        public volatile boolean g;

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.g || !this.e || this.f != null) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.g = true;
            this.d.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f = th;
            this.e = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }
}
