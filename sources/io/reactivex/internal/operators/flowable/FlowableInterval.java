package io.reactivex.internal.operators.flowable;

import android.support.v4.media.session.a;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableInterval extends Flowable<Long> {

    public static final class IntervalSubscriber extends AtomicLong implements Subscription, Runnable {
        public final Subscriber d;
        public long e;
        public final AtomicReference f = new AtomicReference();

        public IntervalSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.a(this.f);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this, j);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AtomicReference atomicReference = this.f;
            if (atomicReference.get() != DisposableHelper.d) {
                long j = get();
                Subscriber subscriber = this.d;
                if (j == 0) {
                    subscriber.onError(new MissingBackpressureException(a.l(this.e, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.a(atomicReference);
                } else {
                    long j2 = this.e;
                    this.e = j2 + 1;
                    subscriber.onNext(Long.valueOf(j2));
                    BackpressureHelper.e(this, 1L);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new IntervalSubscriber(flowableSubscriber));
        throw null;
    }
}
