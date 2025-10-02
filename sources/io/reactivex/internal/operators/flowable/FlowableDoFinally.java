package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        public final ConditionalSubscriber d;
        public Subscription e;
        public QueueSubscription f;
        public boolean g;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber conditionalSubscriber) {
            this.d = conditionalSubscriber;
        }

        public final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
            b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            QueueSubscription queueSubscription = this.f;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iL = queueSubscription.l(i);
            if (iL != 0) {
                this.g = iL == 1;
            }
            return iL;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f = (QueueSubscription) subscription;
                }
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.onComplete();
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null && this.g) {
                b();
            }
            return objPoll;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            return this.d.q(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.e.request(j);
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final Subscriber d;
        public Subscription e;
        public QueueSubscription f;
        public boolean g;

        public DoFinallySubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
            b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            QueueSubscription queueSubscription = this.f;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int iL = queueSubscription.l(i);
            if (iL != 0) {
                this.g = iL == 1;
            }
            return iL;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f = (QueueSubscription) subscription;
                }
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.onComplete();
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null && this.g) {
                b();
            }
            return objPoll;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.e.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new DoFinallyConditionalSubscriber((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowable.a(new DoFinallySubscriber(flowableSubscriber));
        }
    }
}
