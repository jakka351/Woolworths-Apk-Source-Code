package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Subscription e;
        public Object f;
        public boolean g;

        public ScanSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.f == null) {
                this.f = obj;
                this.d.onNext(obj);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.e.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new ScanSubscriber(flowableSubscriber));
    }
}
