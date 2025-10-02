package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public Subscription d;
        public boolean e;
        public Object f;

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
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.d = SubscriptionHelper.d;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            if (this.f == null) {
                this.f = obj;
                return;
            }
            this.e = true;
            this.d.cancel();
            this.d = SubscriptionHelper.d;
            throw null;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        throw null;
    }
}
