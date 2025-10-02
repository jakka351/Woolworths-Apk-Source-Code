package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        public final MaybeObserver d;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }
    }

    public static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {
        public final DelayMaybeObserver d;
        public Maybe e;
        public Subscription f;

        public OtherSubscriber(MaybeObserver maybeObserver, Maybe maybe) {
            this.d = new DelayMaybeObserver(maybeObserver);
            this.e = maybe;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(this.d.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.cancel();
            this.f = SubscriptionHelper.d;
            DisposableHelper.a(this.d);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.d.d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = this.f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription != subscriptionHelper) {
                this.f = subscriptionHelper;
                Maybe maybe = this.e;
                this.e = null;
                maybe.a(this.d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = this.f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.b(th);
            } else {
                this.f = subscriptionHelper;
                this.d.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = this.f;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f = subscriptionHelper;
                Maybe maybe = this.e;
                this.e = null;
                maybe.a(this.d);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        new OtherSubscriber(maybeObserver, this.d);
        throw null;
    }
}
