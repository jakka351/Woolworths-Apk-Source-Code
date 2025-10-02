package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableLastSingle<T> extends Single<T> {

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public Subscription d;
        public Object e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.cancel();
            this.d = SubscriptionHelper.d;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d = SubscriptionHelper.d;
            this.e = null;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.e = obj;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        throw null;
    }
}
