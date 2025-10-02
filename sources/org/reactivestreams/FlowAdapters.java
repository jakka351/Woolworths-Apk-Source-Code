package org.reactivestreams;

import java.util.concurrent.Flow;
import org.bouncycastle.pqc.jcajce.provider.bike.a;

/* loaded from: classes8.dex */
public final class FlowAdapters {

    public static final class FlowPublisherFromReactive<T> implements Flow.Publisher<T> {
        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveProcessor<T, U> implements Flow.Processor<T, U> {
        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            throw null;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public final void subscribe(Flow.Subscriber subscriber) {
            throw null;
        }
    }

    public static final class FlowToReactiveSubscriber<T> implements Flow.Subscriber<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Subscriber f26873a;

        public FlowToReactiveSubscriber(Subscriber subscriber) {
            this.f26873a = subscriber;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onComplete() {
            this.f26873a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onError(Throwable th) {
            this.f26873a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onNext(Object obj) {
            this.f26873a.onNext(obj);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public final void onSubscribe(Flow.Subscription subscription) {
            this.f26873a.m(subscription == null ? null : new ReactiveToFlowSubscription(subscription));
        }
    }

    public static final class FlowToReactiveSubscription implements Flow.Subscription {

        /* renamed from: a, reason: collision with root package name */
        public final Subscription f26874a;

        public FlowToReactiveSubscription(Subscription subscription) {
            this.f26874a = subscription;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void cancel() {
            this.f26874a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public final void request(long j) {
            this.f26874a.request(j);
        }
    }

    public static final class ReactivePublisherFromFlow<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        public final void e(Subscriber subscriber) {
            a.c(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
            throw null;
        }
    }

    public static final class ReactiveToFlowProcessor<T, U> implements Processor<T, U> {
        @Override // org.reactivestreams.Publisher
        public final void e(Subscriber subscriber) {
            a.c(subscriber == null ? null : new FlowToReactiveSubscriber(subscriber));
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (subscription != null) {
                new FlowToReactiveSubscription(subscription);
            }
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

    public static final class ReactiveToFlowSubscriber<T> implements Subscriber<T> {
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

    public static final class ReactiveToFlowSubscription implements Subscription {
        public final Flow.Subscription d;

        public ReactiveToFlowSubscription(Flow.Subscription subscription) {
            this.d = subscription;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.d.cancel();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.d.request(j);
        }
    }
}
