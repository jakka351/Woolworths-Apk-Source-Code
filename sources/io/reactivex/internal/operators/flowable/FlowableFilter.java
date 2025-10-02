package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

/* loaded from: classes7.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (q(obj)) {
                return;
            }
            this.e.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f.poll() == null) {
                return null;
            }
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            if (this.g) {
                return false;
            }
            if (this.h != 0) {
                return this.d.q(null);
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }
    }

    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (q(obj)) {
                return;
            }
            this.e.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f.poll() == null) {
                return null;
            }
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            if (this.g) {
                return false;
            }
            if (this.h != 0) {
                this.d.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new FilterConditionalSubscriber((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowable.a(new FilterSubscriber(flowableSubscriber));
        }
    }
}
