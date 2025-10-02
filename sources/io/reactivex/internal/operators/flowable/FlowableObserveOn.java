package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final ExecutorScheduler f;
    public final int g;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        public final Scheduler.Worker d;
        public final int e;
        public final int f;
        public final AtomicLong g = new AtomicLong();
        public Subscription h;
        public SimpleQueue i;
        public volatile boolean j;
        public volatile boolean k;
        public Throwable l;
        public int m;
        public long n;
        public boolean o;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, int i) {
            this.d = worker;
            this.e = i;
            this.f = i - (i >> 2);
        }

        public final boolean b(boolean z, boolean z2, Subscriber subscriber) {
            if (this.j) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.l;
            if (th != null) {
                this.j = true;
                clear();
                subscriber.onError(th);
                this.d.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.j = true;
            subscriber.onComplete();
            this.d.dispose();
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.h.cancel();
            this.d.dispose();
            if (this.o || getAndIncrement() != 0) {
                return;
            }
            this.i.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.i.clear();
        }

        public abstract void f();

        public abstract void g();

        public abstract void h();

        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.d.c(this);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.i.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.o = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.k) {
                return;
            }
            this.k = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.k) {
                RxJavaPlugins.b(th);
                return;
            }
            this.l = th;
            this.k = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.k) {
                return;
            }
            if (this.m == 2) {
                i();
                return;
            }
            if (!this.i.offer(obj)) {
                this.h.cancel();
                this.l = new MissingBackpressureException("Queue is full?!");
                this.k = true;
            }
            i();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.g, j);
                i();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.o) {
                g();
            } else if (this.m == 1) {
                h();
            } else {
                f();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        public final ConditionalSubscriber p;
        public long q;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.p = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void f() {
            ConditionalSubscriber conditionalSubscriber = this.p;
            SimpleQueue simpleQueue = this.i;
            long j = this.n;
            long j2 = this.q;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.g.get();
                while (j != j3) {
                    boolean z = this.k;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.q(objPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.f) {
                            this.h.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.j = true;
                        this.h.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.d.dispose();
                        return;
                    }
                }
                if (j == j3 && b(this.k, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.n = j;
                    this.q = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void g() {
            int iAddAndGet = 1;
            while (!this.j) {
                boolean z = this.k;
                this.p.onNext(null);
                if (z) {
                    this.j = true;
                    Throwable th = this.l;
                    if (th != null) {
                        this.p.onError(th);
                    } else {
                        this.p.onComplete();
                    }
                    this.d.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void h() {
            ConditionalSubscriber conditionalSubscriber = this.p;
            SimpleQueue simpleQueue = this.i;
            long j = this.n;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.g.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.j) {
                            return;
                        }
                        if (objPoll == null) {
                            this.j = true;
                            conditionalSubscriber.onComplete();
                            this.d.dispose();
                            return;
                        } else if (conditionalSubscriber.q(objPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.j = true;
                        this.h.cancel();
                        conditionalSubscriber.onError(th);
                        this.d.dispose();
                        return;
                    }
                }
                if (this.j) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.j = true;
                    conditionalSubscriber.onComplete();
                    this.d.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.n = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.m = 1;
                        this.i = queueSubscription;
                        this.k = true;
                        this.p.m(this);
                        return;
                    }
                    if (iL == 2) {
                        this.m = 2;
                        this.i = queueSubscription;
                        this.p.m(this);
                        subscription.request(this.e);
                        return;
                    }
                }
                this.i = new SpscArrayQueue(this.e);
                this.p.m(this);
                subscription.request(this.e);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.i.poll();
            if (objPoll != null && this.m != 1) {
                long j = this.q + 1;
                if (j == this.f) {
                    this.q = 0L;
                    this.h.request(j);
                    return objPoll;
                }
                this.q = j;
            }
            return objPoll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        public final Subscriber p;

        public ObserveOnSubscriber(Subscriber subscriber, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.p = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void f() {
            Subscriber subscriber = this.p;
            SimpleQueue simpleQueue = this.i;
            long j = this.n;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.g.get();
                while (j != jAddAndGet) {
                    boolean z = this.k;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(objPoll);
                        j++;
                        if (j == this.f) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.g.addAndGet(-j);
                            }
                            this.h.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.j = true;
                        this.h.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.d.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && b(this.k, simpleQueue.isEmpty(), subscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.n = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void g() {
            int iAddAndGet = 1;
            while (!this.j) {
                boolean z = this.k;
                this.p.onNext(null);
                if (z) {
                    this.j = true;
                    Throwable th = this.l;
                    if (th != null) {
                        this.p.onError(th);
                    } else {
                        this.p.onComplete();
                    }
                    this.d.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void h() {
            Subscriber subscriber = this.p;
            SimpleQueue simpleQueue = this.i;
            long j = this.n;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.g.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.j) {
                            return;
                        }
                        if (objPoll == null) {
                            this.j = true;
                            subscriber.onComplete();
                            this.d.dispose();
                            return;
                        }
                        subscriber.onNext(objPoll);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.j = true;
                        this.h.cancel();
                        subscriber.onError(th);
                        this.d.dispose();
                        return;
                    }
                }
                if (this.j) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.j = true;
                    subscriber.onComplete();
                    this.d.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.n = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.m = 1;
                        this.i = queueSubscription;
                        this.k = true;
                        this.p.m(this);
                        return;
                    }
                    if (iL == 2) {
                        this.m = 2;
                        this.i = queueSubscription;
                        this.p.m(this);
                        subscription.request(this.e);
                        return;
                    }
                }
                this.i = new SpscArrayQueue(this.e);
                this.p.m(this);
                subscription.request(this.e);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.i.poll();
            if (objPoll != null && this.m != 1) {
                long j = this.n + 1;
                if (j == this.f) {
                    this.n = 0L;
                    this.h.request(j);
                    return objPoll;
                }
                this.n = j;
            }
            return objPoll;
        }
    }

    public FlowableObserveOn(Flowable flowable, ExecutorScheduler executorScheduler, int i) {
        super(flowable);
        this.f = executorScheduler;
        this.g = i;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Scheduler.Worker workerC = this.f.c();
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        int i = this.g;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new ObserveOnConditionalSubscriber((ConditionalSubscriber) flowableSubscriber, workerC, i));
        } else {
            flowable.a(new ObserveOnSubscriber(flowableSubscriber, workerC, i));
        }
    }
}
