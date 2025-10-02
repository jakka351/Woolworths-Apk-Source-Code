package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    public final SpscLinkedArrayQueue e;
    public final AtomicReference f;
    public final boolean g;
    public volatile boolean h;
    public Throwable i;
    public final AtomicReference j;
    public volatile boolean k;
    public final AtomicBoolean l;
    public final BasicIntQueueSubscription m;
    public final AtomicLong n;
    public boolean o;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        public UnicastQueueSubscription() {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (UnicastProcessor.this.k) {
                return;
            }
            UnicastProcessor.this.k = true;
            Runnable runnable = (Runnable) UnicastProcessor.this.f.getAndSet(null);
            if (runnable != null) {
                runnable.run();
            }
            UnicastProcessor.this.j.lazySet(null);
            if (UnicastProcessor.this.m.getAndIncrement() == 0) {
                UnicastProcessor.this.j.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.o) {
                    return;
                }
                unicastProcessor.e.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastProcessor.this.e.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastProcessor.this.e.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            UnicastProcessor.this.o = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return UnicastProcessor.this.e.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                BackpressureHelper.a(unicastProcessor.n, j);
                unicastProcessor.f();
            }
        }
    }

    public UnicastProcessor(int i, Runnable runnable) {
        ObjectHelper.c(i, "capacityHint");
        this.e = new SpscLinkedArrayQueue(i);
        this.f = new AtomicReference(runnable);
        this.g = true;
        this.j = new AtomicReference();
        this.l = new AtomicBoolean();
        this.m = new UnicastQueueSubscription();
        this.n = new AtomicLong();
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (this.l.get() || !this.l.compareAndSet(false, true)) {
            EmptySubscription.b(new IllegalStateException("This processor allows only a single Subscriber"), flowableSubscriber);
            return;
        }
        flowableSubscriber.m(this.m);
        this.j.set(flowableSubscriber);
        if (this.k) {
            this.j.lazySet(null);
        } else {
            f();
        }
    }

    public final boolean d(boolean z, boolean z2, boolean z3, Subscriber subscriber, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        if (this.k) {
            spscLinkedArrayQueue.clear();
            this.j.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.i != null) {
            spscLinkedArrayQueue.clear();
            this.j.lazySet(null);
            subscriber.onError(this.i);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.i;
        this.j.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
            return true;
        }
        subscriber.onComplete();
        return true;
    }

    public final void f() {
        boolean z;
        if (this.m.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        Subscriber subscriber = (Subscriber) this.j.get();
        int iAddAndGet2 = 1;
        while (subscriber == null) {
            iAddAndGet2 = this.m.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                subscriber = (Subscriber) this.j.get();
            }
        }
        if (this.o) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            boolean z2 = this.g;
            while (!this.k) {
                boolean z3 = this.h;
                if (!z2 && z3 && this.i != null) {
                    spscLinkedArrayQueue.clear();
                    this.j.lazySet(null);
                    subscriber.onError(this.i);
                    return;
                }
                subscriber.onNext(null);
                if (z3) {
                    this.j.lazySet(null);
                    Throwable th = this.i;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.m.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.j.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.e;
        boolean z4 = !this.g;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.n.get();
            long j2 = 0;
            while (j != j2) {
                boolean z5 = this.h;
                Object objPoll = spscLinkedArrayQueue2.poll();
                boolean z6 = objPoll == null;
                if (d(z4, z5, z6, subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
                if (z6) {
                    break;
                }
                subscriber.onNext(objPoll);
                j2++;
            }
            if (j == j2) {
                z = z4;
                if (d(z4, this.h, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                    return;
                }
            } else {
                z = z4;
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.n.addAndGet(-j2);
            }
            iAddAndGet3 = this.m.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z4 = z;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (this.h || this.k) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.h || this.k) {
            return;
        }
        this.h = true;
        Runnable runnable = (Runnable) this.f.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h || this.k) {
            RxJavaPlugins.b(th);
            return;
        }
        this.i = th;
        this.h = true;
        Runnable runnable = (Runnable) this.f.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        f();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h || this.k) {
            return;
        }
        this.e.offer(obj);
        f();
    }
}
