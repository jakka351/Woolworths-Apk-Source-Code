package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public final Subscriber d;
        public final AtomicBoolean e;
        public long f;
        public Subscription g;
        public UnicastProcessor h;

        public WindowExactSubscriber(Subscriber subscriber) {
            super(1);
            this.d = subscriber;
            this.e = new AtomicBoolean();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.e.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.h;
            if (unicastProcessor != null) {
                this.h = null;
                unicastProcessor.onComplete();
            }
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.h;
            if (unicastProcessor != null) {
                this.h = null;
                unicastProcessor.onError(th);
            }
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.f;
            UnicastProcessor unicastProcessor = this.h;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = new UnicastProcessor(0, this);
                this.h = unicastProcessor;
                this.d.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            unicastProcessor.onNext(obj);
            if (j2 != 0) {
                this.f = j2;
                return;
            }
            this.f = 0L;
            this.h = null;
            unicastProcessor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                this.g.request(BackpressureHelper.d(0L, j));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.g.cancel();
            }
        }
    }

    public static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public Subscription d;
        public volatile boolean e;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e = true;
            throw null;
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
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (0 != 0 || this.e) {
                throw null;
            }
            getAndIncrement();
            new UnicastProcessor(0, this);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(null, j);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.d.cancel();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public long d;
        public Subscription e;
        public UnicastProcessor f;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            UnicastProcessor unicastProcessor = this.f;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f = null;
            unicastProcessor.onComplete();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            UnicastProcessor unicastProcessor = this.f;
            if (unicastProcessor == null) {
                throw null;
            }
            this.f = null;
            unicastProcessor.onError(th);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            long j = this.d;
            UnicastProcessor unicastProcessor = this.f;
            if (j == 0) {
                getAndIncrement();
                this.f = new UnicastProcessor(0, this);
                throw null;
            }
            long j2 = j + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(obj);
            }
            if (j2 == 0) {
                this.f = null;
                unicastProcessor.onComplete();
            }
            if (j2 == 0) {
                this.d = 0L;
            } else {
                this.d = j2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.e.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new WindowExactSubscriber(flowableSubscriber));
    }
}
