package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public final Subscriber l;
        public boolean m;
        public boolean n;
        public long o;

        public OnErrorNextSubscriber(Subscriber subscriber) {
            super(false);
            this.l = subscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.n) {
                return;
            }
            this.n = true;
            this.m = true;
            this.l.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            boolean z = this.m;
            Subscriber subscriber = this.l;
            if (z) {
                if (this.n) {
                    RxJavaPlugins.b(th);
                    return;
                } else {
                    subscriber.onError(th);
                    return;
                }
            }
            this.m = true;
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.b(th2);
                subscriber.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.n) {
                return;
            }
            if (!this.m) {
                this.o++;
            }
            this.l.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(flowableSubscriber);
        flowableSubscriber.m(onErrorNextSubscriber);
        this.e.a(onErrorNextSubscriber);
    }
}
