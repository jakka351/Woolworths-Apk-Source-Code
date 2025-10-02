package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {
        public final SingleObserver d;
        public boolean e;
        public Subscription f;

        public OtherSubscriber(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.cancel();
            DisposableHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            throw null;
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
            this.f.cancel();
            onComplete();
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        new OtherSubscriber(singleObserver);
        throw null;
    }
}
