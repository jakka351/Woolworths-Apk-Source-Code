package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final ExecutorScheduler f;
    public final boolean g;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Subscription, Runnable {
        public final Subscriber d;
        public final Scheduler.Worker e;
        public final AtomicReference f = new AtomicReference();
        public final AtomicLong g = new AtomicLong();
        public final boolean h;
        public Publisher i;

        public static final class Request implements Runnable {
            public final Subscription d;
            public final long e;

            public Request(long j, Subscription subscription) {
                this.d = subscription;
                this.e = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.request(this.e);
            }
        }

        public SubscribeOnSubscriber(Subscriber subscriber, Scheduler.Worker worker, Publisher publisher, boolean z) {
            this.d = subscriber;
            this.e = worker;
            this.i = publisher;
            this.h = !z;
        }

        public final void a(long j, Subscription subscription) {
            if (this.h || Thread.currentThread() == get()) {
                subscription.request(j);
            } else {
                this.e.c(new Request(j, subscription));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.f);
            this.e.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this.f, subscription)) {
                long andSet = this.g.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, subscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.onComplete();
            this.e.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
            this.e.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                AtomicReference atomicReference = this.f;
                Subscription subscription = (Subscription) atomicReference.get();
                if (subscription != null) {
                    a(j, subscription);
                    return;
                }
                AtomicLong atomicLong = this.g;
                BackpressureHelper.a(atomicLong, j);
                Subscription subscription2 = (Subscription) atomicReference.get();
                if (subscription2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        a(andSet, subscription2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            Publisher publisher = this.i;
            this.i = null;
            publisher.e(this);
        }
    }

    public FlowableSubscribeOn(FlowableCreate flowableCreate, ExecutorScheduler executorScheduler, boolean z) {
        super(flowableCreate);
        this.f = executorScheduler;
        this.g = z;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Scheduler.Worker workerC = this.f.c();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(flowableSubscriber, workerC, this.e, this.g);
        flowableSubscriber.m(subscribeOnSubscriber);
        workerC.c(subscribeOnSubscriber);
    }
}
