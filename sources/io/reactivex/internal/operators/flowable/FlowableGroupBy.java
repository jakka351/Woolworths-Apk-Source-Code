package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {

    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        public static final Object o = new Object();
        public final Subscriber d;
        public final ConcurrentHashMap e;
        public Subscription g;
        public Throwable k;
        public volatile boolean l;
        public boolean m;
        public boolean n;
        public final AtomicBoolean h = new AtomicBoolean();
        public final AtomicLong i = new AtomicLong();
        public final AtomicInteger j = new AtomicInteger(1);
        public final SpscLinkedArrayQueue f = new SpscLinkedArrayQueue(0);

        public GroupBySubscriber(Subscriber subscriber, ConcurrentHashMap concurrentHashMap) {
            this.d = subscriber;
            this.e = concurrentHashMap;
        }

        public final boolean b(boolean z, boolean z2, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            if (this.h.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.k;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void c() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.n) {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f;
                Subscriber subscriber = this.d;
                while (!this.h.get()) {
                    boolean z = this.l;
                    if (z && (th = this.k) != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    subscriber.onNext(null);
                    if (z) {
                        Throwable th2 = this.k;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.f;
            Subscriber subscriber2 = this.d;
            int iAddAndGet2 = 1;
            do {
                long j = this.i.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.l;
                    GroupedFlowable groupedFlowable = (GroupedFlowable) spscLinkedArrayQueue2.poll();
                    boolean z3 = groupedFlowable == null;
                    if (b(z2, z3, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    subscriber2.onNext(groupedFlowable);
                    j2++;
                }
                if (j2 == j && b(this.l, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.i.addAndGet(-j2);
                    }
                    this.g.request(j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h.compareAndSet(false, true) && this.j.decrementAndGet() == 0) {
                this.g.cancel();
            }
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
            this.n = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.m) {
                return;
            }
            Iterator<V> it = this.e.values().iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.e.clear();
            this.m = true;
            this.l = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.m) {
                RxJavaPlugins.b(th);
                return;
            }
            this.m = true;
            Iterator<V> it = this.e.values().iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.e.clear();
            this.k = th;
            this.l = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.m) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.g.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return (GroupedFlowable) this.f.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.i, j);
                c();
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        @Override // io.reactivex.Flowable
        public final void c(FlowableSubscriber flowableSubscriber) {
            throw null;
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements Publisher<T> {
        public volatile boolean d;
        public Throwable e;
        public boolean f;
        public int g;

        public final boolean b(boolean z, boolean z2, Subscriber subscriber, long j) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            throw null;
        }

        @Override // org.reactivestreams.Publisher
        public final void e(Subscriber subscriber) {
            throw null;
        }

        public final void f() {
            if (this.g == 0) {
                return;
            }
            this.g = 0;
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.f = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(null, j);
                if (getAndIncrement() != 0) {
                    return;
                }
                if (!this.f) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        try {
            this.e.a(new GroupBySubscriber(flowableSubscriber, new ConcurrentHashMap()));
        } catch (Exception e) {
            Exceptions.b(e);
            flowableSubscriber.m(EmptyComponent.d);
            flowableSubscriber.onError(e);
        }
    }
}
