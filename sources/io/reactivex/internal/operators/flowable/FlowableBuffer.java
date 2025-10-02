package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {

    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Collection e;
        public Subscription f;
        public boolean g;
        public int h;

        public PublisherBufferExactSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f.cancel();
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
            if (this.g) {
                return;
            }
            this.g = true;
            Collection collection = this.e;
            Subscriber subscriber = this.d;
            if (collection != null && !collection.isEmpty()) {
                subscriber.onNext(collection);
            }
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            Collection collection = this.e;
            if (collection == null) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            collection.add(obj);
            int i = this.h + 1;
            if (i != 0) {
                this.h = i;
                return;
            }
            this.h = 0;
            this.e = null;
            this.d.onNext(collection);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                this.f.request(BackpressureHelper.d(j, 0));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, Subscription, BooleanSupplier {
        public Subscription d;
        public boolean e;
        public volatile boolean f;

        @Override // io.reactivex.functions.BooleanSupplier
        public final boolean a() {
            return this.f;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f = true;
            this.d.cancel();
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
            if (this.e) {
                return;
            }
            this.e = true;
            if (0 != 0) {
                BackpressureHelper.e(this, 0L);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            if (!SubscriptionHelper.f(j)) {
                return;
            }
            do {
                j2 = get();
            } while (!compareAndSet(j2, BackpressureHelper.c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
            ArrayDeque arrayDeque = null;
            if (j2 != Long.MIN_VALUE) {
                throw null;
            }
            long j3 = j | Long.MIN_VALUE;
            long j4 = j3 & Long.MIN_VALUE;
            while (true) {
                boolean zA = true;
                if (j4 != j3) {
                    try {
                        zA = a();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                    }
                    if (zA) {
                        return;
                    }
                    arrayDeque.poll().getClass();
                    throw null;
                }
                try {
                    zA = a();
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                }
                if (zA) {
                    return;
                }
                if (arrayDeque.isEmpty()) {
                    throw null;
                }
                j3 = get();
                if (j3 == j4) {
                    long jAddAndGet = addAndGet(-(j4 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return;
                    }
                    j4 = jAddAndGet & Long.MIN_VALUE;
                    j3 = jAddAndGet;
                }
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public Collection d;
        public Subscription e;
        public boolean f;
        public int g;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
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
            if (this.f) {
                return;
            }
            this.f = true;
            Collection collection = this.d;
            this.d = null;
            collection.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
            } else {
                this.f = true;
                this.d = null;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            Collection collection = this.d;
            int i = this.g;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (collection != null) {
                collection.add(obj);
                if (collection.size() == 0) {
                    this.d = null;
                    throw null;
                }
            }
            if (i2 == 0) {
                i2 = 0;
            }
            this.g = i2;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.e.request(BackpressureHelper.d(0, j));
                    return;
                }
                this.e.request(BackpressureHelper.c(BackpressureHelper.d(j, 0), BackpressureHelper.d(0, j - 1)));
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new PublisherBufferExactSubscriber(flowableSubscriber));
    }
}
