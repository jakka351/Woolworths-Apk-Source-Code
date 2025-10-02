package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final ExecutorScheduler f;

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final Scheduler e;
        public Subscription f;

        public final class Cancellation implements Runnable {
            public Cancellation() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeSubscriber.this.f.cancel();
            }
        }

        public UnsubscribeSubscriber(Subscriber subscriber, ExecutorScheduler executorScheduler) {
            this.d = subscriber;
            this.e = executorScheduler;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.e.d(new Cancellation());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.b(th);
            } else {
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.f.request(j);
        }
    }

    public FlowableUnsubscribeOn(FlowableSubscribeOn flowableSubscribeOn, ExecutorScheduler executorScheduler) {
        super(flowableSubscribeOn);
        this.f = executorScheduler;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new UnsubscribeSubscriber(flowableSubscriber, this.f));
    }
}
