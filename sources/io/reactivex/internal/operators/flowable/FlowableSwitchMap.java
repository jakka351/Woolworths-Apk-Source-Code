package io.reactivex.internal.operators.flowable;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {
        public final SwitchMapSubscriber d;
        public final long e;
        public final int f;
        public volatile SimpleQueue g;
        public volatile boolean h;
        public int i;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber switchMapSubscriber, long j, int i) {
            this.d = switchMapSubscriber;
            this.e = j;
            this.f = i;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.i = iL;
                        this.g = queueSubscription;
                        this.h = true;
                        this.d.b();
                        return;
                    }
                    if (iL == 2) {
                        this.i = iL;
                        this.g = queueSubscription;
                        subscription.request(this.f);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.f);
                subscription.request(this.f);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            SwitchMapSubscriber switchMapSubscriber = this.d;
            if (this.e == switchMapSubscriber.k) {
                this.h = true;
                switchMapSubscriber.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            SwitchMapSubscriber switchMapSubscriber = this.d;
            if (this.e == switchMapSubscriber.k) {
                AtomicThrowable atomicThrowable = switchMapSubscriber.f;
                atomicThrowable.getClass();
                if (ExceptionHelper.a(atomicThrowable, th)) {
                    switchMapSubscriber.h.cancel();
                    switchMapSubscriber.e = true;
                    this.h = true;
                    switchMapSubscriber.b();
                    return;
                }
            }
            RxJavaPlugins.b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            SwitchMapSubscriber switchMapSubscriber = this.d;
            if (this.e == switchMapSubscriber.k) {
                if (this.i != 0 || this.g.offer(obj)) {
                    switchMapSubscriber.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final SwitchMapInnerSubscriber l;
        public final Subscriber d;
        public volatile boolean e;
        public volatile boolean g;
        public Subscription h;
        public volatile long k;
        public final AtomicReference i = new AtomicReference();
        public final AtomicLong j = new AtomicLong();
        public final AtomicThrowable f = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber switchMapInnerSubscriber = new SwitchMapInnerSubscriber(null, -1L, 1);
            l = switchMapInnerSubscriber;
            SubscriptionHelper.a(switchMapInnerSubscriber);
        }

        public SwitchMapSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            SwitchMapInnerSubscriber switchMapInnerSubscriber;
            AtomicReference atomicReference = this.i;
            SwitchMapInnerSubscriber switchMapInnerSubscriber2 = (SwitchMapInnerSubscriber) atomicReference.get();
            SwitchMapInnerSubscriber switchMapInnerSubscriber3 = l;
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber3 || (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) atomicReference.getAndSet(switchMapInnerSubscriber3)) == switchMapInnerSubscriber3 || switchMapInnerSubscriber == null) {
                return;
            }
            SubscriptionHelper.a(switchMapInnerSubscriber);
        }

        public final void b() {
            boolean z;
            long j;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.e) {
                    if (this.f.get() != null) {
                        a();
                        AtomicThrowable atomicThrowable = this.f;
                        a.o(atomicThrowable, atomicThrowable, subscriber);
                        return;
                    } else if (this.i.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.i.get();
                SimpleQueue simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.g : null;
                if (simpleQueue != null) {
                    if (switchMapInnerSubscriber.h) {
                        if (this.f.get() != null) {
                            a();
                            AtomicThrowable atomicThrowable2 = this.f;
                            a.o(atomicThrowable2, atomicThrowable2, subscriber);
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            AtomicReference atomicReference = this.i;
                            while (!atomicReference.compareAndSet(switchMapInnerSubscriber, null) && atomicReference.get() == switchMapInnerSubscriber) {
                            }
                        }
                    }
                    long j2 = this.j.get();
                    long j3 = 0;
                    while (true) {
                        z = false;
                        if (j3 == j2) {
                            j = 0;
                            break;
                        }
                        if (!this.g) {
                            boolean z2 = switchMapInnerSubscriber.h;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                SubscriptionHelper.a(switchMapInnerSubscriber);
                                AtomicThrowable atomicThrowable3 = this.f;
                                atomicThrowable3.getClass();
                                ExceptionHelper.a(atomicThrowable3, th);
                                z2 = true;
                                objPoll = null;
                            }
                            boolean z3 = objPoll == null;
                            j = 0;
                            if (switchMapInnerSubscriber != this.i.get()) {
                                break;
                            }
                            if (z2) {
                                if (this.f.get() != null) {
                                    AtomicThrowable atomicThrowable4 = this.f;
                                    a.o(atomicThrowable4, atomicThrowable4, subscriber);
                                    return;
                                } else if (z3) {
                                    AtomicReference atomicReference2 = this.i;
                                    while (!atomicReference2.compareAndSet(switchMapInnerSubscriber, null) && atomicReference2.get() == switchMapInnerSubscriber) {
                                    }
                                }
                            }
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(objPoll);
                            j3++;
                        } else {
                            return;
                        }
                    }
                    z = true;
                    if (j3 != j && !this.g) {
                        if (j2 != Long.MAX_VALUE) {
                            this.j.addAndGet(-j3);
                        }
                        if (switchMapInnerSubscriber.i != 1) {
                            switchMapInnerSubscriber.get().request(j3);
                        }
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.h.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!this.e) {
                AtomicThrowable atomicThrowable = this.f;
                atomicThrowable.getClass();
                if (ExceptionHelper.a(atomicThrowable, th)) {
                    a();
                    this.e = true;
                    b();
                    return;
                }
            }
            RxJavaPlugins.b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            this.k++;
            SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.i.get();
            if (switchMapInnerSubscriber != null) {
                SubscriptionHelper.a(switchMapInnerSubscriber);
            }
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
                BackpressureHelper.a(this.j, j);
                if (this.k == 0) {
                    this.h.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Flowable flowable = this.e;
        if (FlowableScalarXMap.a(flowable, flowableSubscriber)) {
            return;
        }
        flowable.a(new SwitchMapSubscriber(flowableSubscriber));
    }
}
