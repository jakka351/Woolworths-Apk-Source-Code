package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableRange extends Flowable<Integer> {

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        public int d = 0;
        public volatile boolean e;

        public abstract void a();

        public abstract void b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.d = 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.d == 0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            int i = this.d;
            if (i == 0) {
                return null;
            }
            this.d = i + 1;
            return Integer.valueOf(i);
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

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        public final ConditionalSubscriber f;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber) {
            this.f = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void a() {
            ConditionalSubscriber conditionalSubscriber = this.f;
            for (int i = this.d; i != 0; i++) {
                if (this.e) {
                    return;
                }
                conditionalSubscriber.q(Integer.valueOf(i));
            }
            if (this.e) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        
            r8.d = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(long r9) {
            /*
                r8 = this;
                int r0 = r8.d
                io.reactivex.internal.fuseable.ConditionalSubscriber r1 = r8.f
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L22
                if (r0 == 0) goto L22
                boolean r6 = r8.e
                if (r6 == 0) goto L12
                goto L3f
            L12:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                boolean r6 = r1.q(r6)
                if (r6 == 0) goto L1f
                r6 = 1
                long r4 = r4 + r6
            L1f:
                int r0 = r0 + 1
                goto L7
            L22:
                if (r0 != 0) goto L2c
                boolean r9 = r8.e
                if (r9 != 0) goto L3f
                r1.onComplete()
                return
            L2c:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                r8.d = r0
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeConditionalSubscription.b(long):void");
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        public final Subscriber f;

        public RangeSubscription(Subscriber subscriber) {
            this.f = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public final void a() {
            Subscriber subscriber = this.f;
            for (int i = this.d; i != 0; i++) {
                if (this.e) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i));
            }
            if (this.e) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        
            r8.d = r0;
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(long r9) {
            /*
                r8 = this;
                int r0 = r8.d
                org.reactivestreams.Subscriber r1 = r8.f
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L1f
                if (r0 == 0) goto L1f
                boolean r6 = r8.e
                if (r6 == 0) goto L12
                goto L3c
            L12:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r1.onNext(r6)
                r6 = 1
                long r4 = r4 + r6
                int r0 = r0 + 1
                goto L7
            L1f:
                if (r0 != 0) goto L29
                boolean r9 = r8.e
                if (r9 != 0) goto L3c
                r1.onComplete()
                return
            L29:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                r8.d = r0
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
            L3c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeSubscription.b(long):void");
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (flowableSubscriber instanceof ConditionalSubscriber) {
            flowableSubscriber.m(new RangeConditionalSubscription((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowableSubscriber.m(new RangeSubscription(flowableSubscriber));
        }
    }
}
