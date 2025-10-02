package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public final Subscriber l;
        public final AtomicInteger m;
        public long n;

        public ConcatArraySubscriber(Subscriber subscriber) {
            super(false);
            this.l = subscriber;
            this.m = new AtomicInteger();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.m.getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.l.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.n++;
            this.l.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(flowableSubscriber);
        flowableSubscriber.m(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
