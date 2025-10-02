package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableCache<T> extends AbstractFlowableWithUpstream<T, T> implements FlowableSubscriber<T> {
    public volatile long f;
    public Node g;
    public int h;

    public static final class CacheSubscription<T> extends AtomicInteger implements Subscription {
        public final Subscriber d;
        public final FlowableCache e;
        public int h;
        public long i;
        public Node g = null;
        public final AtomicLong f = new AtomicLong();

        public CacheSubscription(Subscriber subscriber, FlowableCache flowableCache) {
            this.d = subscriber;
            this.e = flowableCache;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f.getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.e.getClass();
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.f(j)) {
                return;
            }
            BackpressureHelper.b(this.f, j);
            FlowableCache flowableCache = this.e;
            flowableCache.getClass();
            if (getAndIncrement() != 0) {
                return;
            }
            long j2 = this.i;
            int i = this.h;
            Node node = this.g;
            AtomicLong atomicLong = this.f;
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            while (true) {
                boolean z = flowableCache.f == j2;
                if (z) {
                    this.g = null;
                    subscriber.onComplete();
                    return;
                }
                if (!z) {
                    long j3 = atomicLong.get();
                    if (j3 == Long.MIN_VALUE) {
                        this.g = null;
                        return;
                    } else if (j3 != j2) {
                        if (i == 0) {
                            node = node.b;
                            i = 0;
                        }
                        subscriber.onNext(node.f24226a[i]);
                        i++;
                        j2++;
                    }
                }
                this.i = j2;
                this.h = i;
                this.g = node;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public static final class Node<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f24226a;
        public volatile Node b;

        public Node(int i) {
            this.f24226a = new Object[i];
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new CacheSubscription(flowableSubscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        RxJavaPlugins.b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        int i = this.h;
        if (i == 0) {
            Node node = new Node(i);
            node.f24226a[0] = obj;
            this.h = 1;
            this.g.b = node;
            this.g = node;
        } else {
            this.g.f24226a[i] = obj;
            this.h = i + 1;
        }
        this.f++;
        throw null;
    }
}
