package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableRangeLong extends Flowable<Long> {

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        public long d = 0;
        public volatile boolean e;

        public abstract void a();

        public abstract void b(long j);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.d = 0L;
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
            long j = this.d;
            if (j == 0) {
                return null;
            }
            this.d = 1 + j;
            return Long.valueOf(j);
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

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public final void a() {
            ConditionalSubscriber conditionalSubscriber = this.f;
            for (long j = this.d; j != 0; j++) {
                if (this.e) {
                    return;
                }
                conditionalSubscriber.q(Long.valueOf(j));
            }
            if (this.e) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        
            r10.d = r0;
            r11 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(long r11) {
            /*
                r10 = this;
                long r0 = r10.d
                io.reactivex.internal.fuseable.ConditionalSubscriber r2 = r10.f
                r3 = 0
            L6:
                r5 = r3
            L7:
                int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r7 == 0) goto L23
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L23
                boolean r7 = r10.e
                if (r7 == 0) goto L14
                goto L42
            L14:
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                boolean r7 = r2.q(r7)
                r8 = 1
                if (r7 == 0) goto L21
                long r5 = r5 + r8
            L21:
                long r0 = r0 + r8
                goto L7
            L23:
                int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r11 != 0) goto L2f
                boolean r11 = r10.e
                if (r11 != 0) goto L42
                r2.onComplete()
                return
            L2f:
                long r11 = r10.get()
                int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r7 != 0) goto L7
                r10.d = r0
                long r11 = -r5
                long r11 = r10.addAndGet(r11)
                int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r5 != 0) goto L6
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeConditionalSubscription.b(long):void");
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {
        public final Subscriber f;

        public RangeSubscription(Subscriber subscriber) {
            this.f = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public final void a() {
            Subscriber subscriber = this.f;
            for (long j = this.d; j != 0; j++) {
                if (this.e) {
                    return;
                }
                subscriber.onNext(Long.valueOf(j));
            }
            if (this.e) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            r9.d = r0;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(long r10) {
            /*
                r9 = this;
                long r0 = r9.d
                org.reactivestreams.Subscriber r2 = r9.f
                r3 = 0
            L6:
                r5 = r3
            L7:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L20
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 == 0) goto L20
                boolean r7 = r9.e
                if (r7 == 0) goto L14
                goto L3f
            L14:
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                long r0 = r0 + r7
                goto L7
            L20:
                int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r10 != 0) goto L2c
                boolean r10 = r9.e
                if (r10 != 0) goto L3f
                r2.onComplete()
                return
            L2c:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L7
                r9.d = r0
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L6
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeSubscription.b(long):void");
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
