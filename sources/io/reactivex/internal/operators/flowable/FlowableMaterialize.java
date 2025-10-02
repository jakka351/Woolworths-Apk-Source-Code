package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class FlowableMaterialize<T> extends AbstractFlowableWithUpstream<T, Notification<T>> {

    public static final class MaterializeSubscriber<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber
        public final void b(Object obj) {
            Notification notification = (Notification) obj;
            if (NotificationLite.m(notification.f24218a)) {
                RxJavaPlugins.b(notification.b());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            a(Notification.b);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            a(Notification.a(th));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.g++;
            ObjectHelper.b(obj, "value is null");
            this.d.onNext(new Notification(obj));
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new MaterializeSubscriber(flowableSubscriber));
    }
}
