package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDematerialize<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class DematerializeSubscriber<T, R> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public boolean e;
        public Subscription f;

        public DematerializeSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (!this.e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.f.cancel();
                    onError(th);
                    return;
                }
            }
            if (obj instanceof Notification) {
                Notification notification = (Notification) obj;
                if (NotificationLite.m(notification.f24218a)) {
                    RxJavaPlugins.b(notification.b());
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new DematerializeSubscriber(flowableSubscriber));
    }
}
