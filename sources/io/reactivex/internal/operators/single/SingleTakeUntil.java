package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {

    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver d;
        public final TakeUntilOtherSubscriber e = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        public final void a(Throwable th) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.b(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.d.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.e;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.e;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.e;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onSuccess(obj);
            }
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
        public final TakeUntilMainObserver d;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver takeUntilMainObserver) {
            this.d = takeUntilMainObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.d.a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (SubscriptionHelper.a(this)) {
                this.d.a(new CancellationException());
            }
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(new TakeUntilMainObserver(singleObserver));
        throw null;
    }
}
