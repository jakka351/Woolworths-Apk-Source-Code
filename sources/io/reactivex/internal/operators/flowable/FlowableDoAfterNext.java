package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

/* loaded from: classes7.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
            if (this.h != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            boolean zQ = this.d.q(obj);
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
                return zQ;
            }
        }
    }

    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            this.d.onNext(obj);
            if (this.h != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new DoAfterConditionalSubscriber((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowable.a(new DoAfterSubscriber(flowableSubscriber));
        }
    }
}
