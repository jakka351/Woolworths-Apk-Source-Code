package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public volatile boolean d;
        public Subscription e;

        public final void a() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(null, j);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.b(th, flowableSubscriber);
        }
    }
}
