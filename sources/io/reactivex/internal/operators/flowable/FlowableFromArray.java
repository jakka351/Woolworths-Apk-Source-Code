package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        public final ConditionalSubscriber d;

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.d = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b(long j) {
            throw null;
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        public final Subscriber d;

        public ArraySubscription(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public final void b(long j) {
            throw null;
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        public abstract void a();

        public abstract void b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j) && BackpressureHelper.a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (flowableSubscriber instanceof ConditionalSubscriber) {
            flowableSubscriber.m(new ArrayConditionalSubscription((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowableSubscriber.m(new ArraySubscription(flowableSubscriber));
        }
    }
}
