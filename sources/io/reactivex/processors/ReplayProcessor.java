package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    public interface ReplayBuffer<T> {
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {
        public final Subscriber d;
        public final ReplayProcessor e;
        public final AtomicLong f = new AtomicLong();
        public volatile boolean g;

        public ReplaySubscription(Subscriber subscriber, ReplayProcessor replayProcessor) {
            this.d = subscriber;
            this.e = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.e.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.f, j);
                this.e.getClass();
                throw null;
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new ReplaySubscription(flowableSubscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        RxJavaPlugins.b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }
}
