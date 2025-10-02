package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int f;
    public final boolean g;
    public final Action h;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final SimplePlainQueue e;
        public final Action f;
        public Subscription g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable j;
        public final AtomicLong k = new AtomicLong();
        public boolean l;

        public BackpressureBufferSubscriber(Subscriber subscriber, int i, boolean z, Action action) {
            this.d = subscriber;
            this.f = action;
            this.e = z ? new SpscLinkedArrayQueue(i) : new SpscArrayQueue(i);
        }

        public final boolean b(boolean z, boolean z2, Subscriber subscriber) {
            if (this.h) {
                this.e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.j;
            if (th != null) {
                this.e.clear();
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
            if (getAndIncrement() == 0) {
                SimplePlainQueue simplePlainQueue = this.e;
                Subscriber subscriber = this.d;
                int iAddAndGet = 1;
                while (!b(this.i, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.k.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.i;
                        Object objPoll = simplePlainQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(objPoll);
                        j2++;
                    }
                    if (j2 == j && b(this.i, simplePlainQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.k.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.g.cancel();
            if (this.l || getAndIncrement() != 0) {
                return;
            }
            this.e.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.e.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.l = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            if (this.l) {
                this.d.onComplete();
            } else {
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.j = th;
            this.i = true;
            if (this.l) {
                this.d.onError(th);
            } else {
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e.offer(obj)) {
                if (this.l) {
                    this.d.onNext(null);
                    return;
                } else {
                    c();
                    return;
                }
            }
            this.g.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.e.poll();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.l || !SubscriptionHelper.f(j)) {
                return;
            }
            BackpressureHelper.a(this.k, j);
            c();
        }
    }

    public FlowableOnBackpressureBuffer(FlowableFromObservable flowableFromObservable, int i) {
        super(flowableFromObservable);
        this.f = i;
        this.g = true;
        this.h = Functions.c;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new BackpressureBufferSubscriber(flowableSubscriber, this.f, this.g, this.h));
    }
}
