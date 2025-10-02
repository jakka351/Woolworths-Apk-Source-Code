package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {
    public final Flowable d;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final MaybeObserver d;
        public Subscription e;
        public long f;
        public boolean g;

        public ElementAtSubscriber(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.cancel();
            this.e = SubscriptionHelper.d;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e = SubscriptionHelper.d;
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
                return;
            }
            this.g = true;
            this.e = SubscriptionHelper.d;
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            long j = this.f;
            if (j != 0) {
                this.f = j + 1;
                return;
            }
            this.g = true;
            this.e.cancel();
            this.e = SubscriptionHelper.d;
            this.d.onSuccess(obj);
        }
    }

    public FlowableElementAtMaybe(Flowable flowable) {
        this.d = flowable;
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new ElementAtSubscriber(maybeObserver));
    }
}
