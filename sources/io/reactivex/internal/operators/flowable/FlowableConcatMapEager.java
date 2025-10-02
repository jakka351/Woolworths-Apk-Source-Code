package io.reactivex.internal.operators.flowable;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, InnerQueuedSubscriberSupport<R> {
        public final Subscriber d;
        public Subscription h;
        public volatile boolean i;
        public volatile boolean j;
        public volatile InnerQueuedSubscriber k;
        public final SpscLinkedArrayQueue g = new SpscLinkedArrayQueue(Math.min(0, 0));
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicLong f = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void a(InnerQueuedSubscriber innerQueuedSubscriber) {
            innerQueuedSubscriber.e = true;
            c();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void b(InnerQueuedSubscriber innerQueuedSubscriber, Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            innerQueuedSubscriber.e = true;
            this.h.cancel();
            c();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void c() {
            InnerQueuedSubscriber innerQueuedSubscriber;
            boolean z;
            long j;
            SimpleQueue simpleQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber innerQueuedSubscriber2 = this.k;
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else {
                    if (this.e.get() != null) {
                        e();
                        AtomicThrowable atomicThrowable = this.e;
                        a.o(atomicThrowable, atomicThrowable, subscriber);
                        return;
                    }
                    boolean z2 = this.j;
                    innerQueuedSubscriber = (InnerQueuedSubscriber) this.g.poll();
                    if (z2 && innerQueuedSubscriber == null) {
                        AtomicThrowable atomicThrowable2 = this.e;
                        atomicThrowable2.getClass();
                        Throwable thB = ExceptionHelper.b(atomicThrowable2);
                        if (thB != null) {
                            subscriber.onError(thB);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriber != null) {
                        this.k = innerQueuedSubscriber;
                    }
                }
                if (innerQueuedSubscriber == null || (simpleQueue = innerQueuedSubscriber.d) == null) {
                    z = false;
                    j = 0;
                } else {
                    j = 0;
                    while (j != j2) {
                        if (this.i) {
                            e();
                            return;
                        }
                        boolean z3 = innerQueuedSubscriber.e;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z4 = objPoll == null;
                            if (z3 && z4) {
                                this.k = null;
                                this.h.request(1L);
                                z = true;
                                innerQueuedSubscriber = null;
                                break;
                            }
                            if (z4) {
                                break;
                            }
                            subscriber.onNext(objPoll);
                            j++;
                            if (innerQueuedSubscriber.g != 1) {
                                long j3 = innerQueuedSubscriber.f + 1;
                                if (j3 == 0) {
                                    innerQueuedSubscriber.f = 0L;
                                    innerQueuedSubscriber.get().request(j3);
                                } else {
                                    innerQueuedSubscriber.f = j3;
                                }
                            }
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            this.k = null;
                            SubscriptionHelper.a(innerQueuedSubscriber);
                            e();
                            subscriber.onError(th);
                            return;
                        }
                    }
                    z = false;
                    if (j == j2) {
                        if (this.i) {
                            e();
                            return;
                        }
                        boolean z5 = innerQueuedSubscriber.e;
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (z5 && zIsEmpty) {
                            this.k = null;
                            this.h.request(1L);
                            z = true;
                            innerQueuedSubscriber = null;
                        }
                    }
                }
                if (j != 0 && j2 != Long.MAX_VALUE) {
                    this.f.addAndGet(-j);
                }
                if (!z && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.h.cancel();
            if (getAndIncrement() == 0) {
                do {
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void d(InnerQueuedSubscriber innerQueuedSubscriber, Object obj) {
            if (innerQueuedSubscriber.d.offer(obj)) {
                c();
            } else {
                SubscriptionHelper.a(innerQueuedSubscriber);
                b(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        public final void e() {
            InnerQueuedSubscriber innerQueuedSubscriber = this.k;
            this.k = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.a(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.g.poll();
                if (innerQueuedSubscriber2 == null) {
                    return;
                } else {
                    SubscriptionHelper.a(innerQueuedSubscriber2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                this.d.m(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.j = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.j = true;
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.h.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.f, j);
                c();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new ConcatMapEagerDelayErrorSubscriber(flowableSubscriber));
    }
}
