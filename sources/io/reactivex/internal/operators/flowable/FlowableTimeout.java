package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TimeoutConsumer extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (obj == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(subscriptionHelper);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = (Subscription) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                return;
            }
            subscription.cancel();
            lazySet(subscriptionHelper);
            throw null;
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {
        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void c(long j) {
            throw null;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            throw null;
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(null, subscription)) {
                e(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        void a(long j, Throwable th);
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, TimeoutSelectorSupport {
        public final Subscriber d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicReference f = new AtomicReference();
        public final AtomicLong g = new AtomicLong();

        public TimeoutSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.b(th);
            } else {
                SubscriptionHelper.a(this.f);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void c(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.f);
                this.d.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.f);
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.c(this.f, this.g, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                SequentialDisposable sequentialDisposable = this.e;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = get();
            if (j == Long.MAX_VALUE || !compareAndSet(j, 1 + j)) {
                return;
            }
            Disposable disposable = this.e.get();
            if (disposable != null) {
                disposable.dispose();
            }
            Subscriber subscriber = this.d;
            subscriber.onNext(obj);
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                ((Subscription) this.f.get()).cancel();
                getAndSet(Long.MAX_VALUE);
                subscriber.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.b(this.f, this.g, j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(flowableSubscriber);
        flowableSubscriber.m(timeoutSubscriber);
        this.e.a(timeoutSubscriber);
    }
}
