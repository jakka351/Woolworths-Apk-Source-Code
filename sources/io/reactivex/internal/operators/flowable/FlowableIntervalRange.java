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
public final class FlowableIntervalRange extends Flowable<Long> {

    public static final class IntervalRangeSubscriber extends AtomicLong implements Subscription, Runnable {
        public final Subscriber d;
        public final AtomicReference f = new AtomicReference();
        public long e = 0;

        public IntervalRangeSubscriber(Subscriber subscriber) {
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
            Object obj = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (obj != disposableHelper) {
                long j = get();
                Subscriber subscriber = this.d;
                if (j == 0) {
                    subscriber.onError(new MissingBackpressureException(a.l(this.e, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                    DisposableHelper.a(atomicReference);
                    return;
                }
                long j2 = this.e;
                subscriber.onNext(Long.valueOf(j2));
                if (j2 == 0) {
                    if (atomicReference.get() != disposableHelper) {
                        subscriber.onComplete();
                    }
                    DisposableHelper.a(atomicReference);
                } else {
                    this.e = j2 + 1;
                    if (j != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new IntervalRangeSubscriber(flowableSubscriber));
        throw null;
    }
}
