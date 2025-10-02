package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;

/* loaded from: classes7.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.h != 0) {
                this.d.onNext(null);
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
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
                return true;
            }
        }
    }

    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.h != 0) {
                this.d.onNext(null);
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
            if (this.f.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new MapConditionalSubscriber((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowable.a(new MapSubscriber(flowableSubscriber));
        }
    }
}
