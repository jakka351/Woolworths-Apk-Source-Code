package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public final void b() {
            throw null;
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public final void a() {
            this.d.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.e;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.d;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription {
        public final SerializedSubscriber d;
        public final AtomicLong e = new AtomicLong();
        public final AtomicReference f = new AtomicReference();
        public Subscription g;

        public SamplePublisherSubscriber(SerializedSubscriber serializedSubscriber) {
            this.d = serializedSubscriber;
        }

        public abstract void a();

        public abstract void b();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.f);
            this.g.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
                if (this.f.get() == null) {
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SubscriptionHelper.a(this.f);
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.f);
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
            }
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {
        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            throw null;
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

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new SampleMainNoLast(new SerializedSubscriber(flowableSubscriber));
        throw null;
    }
}
