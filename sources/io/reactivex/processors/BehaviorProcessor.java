package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {

    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        public final Subscriber d;
        public final BehaviorProcessor e;
        public volatile boolean f;

        public BehaviorSubscription(Subscriber subscriber, BehaviorProcessor behaviorProcessor) {
            this.d = subscriber;
            this.e = behaviorProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this, j);
            }
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            if (this.f) {
                return true;
            }
            if (NotificationLite.l(obj)) {
                this.d.onComplete();
                return true;
            }
            if (NotificationLite.m(obj)) {
                this.d.onError(NotificationLite.f(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.d.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.d.onNext(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new BehaviorSubscription(flowableSubscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Throwable th = ExceptionHelper.f24240a;
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
