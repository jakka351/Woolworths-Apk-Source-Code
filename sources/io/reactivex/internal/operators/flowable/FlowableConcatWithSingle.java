package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableConcatWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {
        public final AtomicReference h;

        public ConcatWithSubscriber(Subscriber subscriber) {
            super(subscriber);
            this.h = new AtomicReference();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.a(this.h);
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.h, disposable);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e = SubscriptionHelper.d;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.g++;
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new ConcatWithSubscriber(flowableSubscriber));
    }
}
