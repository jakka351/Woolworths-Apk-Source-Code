package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        public final Subscriber d;
        public Subscription g;
        public SimpleQueue h;
        public volatile boolean i;
        public volatile boolean j;
        public Iterator l;
        public int m;
        public int n;
        public final int e = 0;
        public final AtomicReference k = new AtomicReference();
        public final AtomicLong f = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final boolean b(boolean z, boolean z2, Subscriber subscriber, SimpleQueue simpleQueue) {
            if (this.j) {
                this.l = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (((Throwable) this.k.get()) == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable thB = ExceptionHelper.b(this.k);
            this.l = null;
            simpleQueue.clear();
            subscriber.onError(thB);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        
            throw null;
         */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.c():void");
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.g.cancel();
            if (getAndIncrement() == 0) {
                this.h.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.l = null;
            this.h.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.l == null && this.h.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return this.n == 1 ? 1 : 0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(3);
                    if (iL == 1) {
                        this.n = iL;
                        this.h = queueSubscription;
                        this.i = true;
                        this.d.m(this);
                        return;
                    }
                    if (iL == 2) {
                        this.n = iL;
                        this.h = queueSubscription;
                        this.d.m(this);
                        subscription.request(0);
                        return;
                    }
                }
                this.h = new SpscArrayQueue(0);
                this.d.m(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.i || !ExceptionHelper.a(this.k, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.i = true;
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.i) {
                return;
            }
            if (this.n != 0 || this.h.offer(obj)) {
                c();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.l;
            if (it == null) {
                if (this.h.poll() == null) {
                    return null;
                }
                throw null;
            }
            Object next = it.next();
            ObjectHelper.b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.l = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.f, j);
                c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Flowable flowable = this.e;
        if (!(flowable instanceof Callable)) {
            flowable.a(new FlattenIterableSubscriber(flowableSubscriber));
            return;
        }
        try {
            if (((Callable) flowable).call() == null) {
                EmptySubscription.a(flowableSubscriber);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                EmptySubscription.b(th, flowableSubscriber);
            }
        } catch (Throwable th2) {
            Exceptions.b(th2);
            EmptySubscription.b(th2, flowableSubscriber);
        }
    }
}
