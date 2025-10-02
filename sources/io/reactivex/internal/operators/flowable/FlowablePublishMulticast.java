package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {
        public static final MulticastSubscription[] n = new MulticastSubscription[0];
        public static final MulticastSubscription[] o = new MulticastSubscription[0];
        public volatile SimpleQueue i;
        public int j;
        public volatile boolean k;
        public Throwable l;
        public int m;
        public final int g = 0;
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicReference h = new AtomicReference();
        public final AtomicReference f = new AtomicReference(n);

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h.get() == SubscriptionHelper.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Flowable
        public final void c(FlowableSubscriber flowableSubscriber) {
            MulticastSubscription multicastSubscription = new MulticastSubscription(flowableSubscriber, this);
            flowableSubscriber.m(multicastSubscription);
            while (true) {
                AtomicReference atomicReference = this.f;
                MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                if (multicastSubscriptionArr == o) {
                    Throwable th = this.l;
                    if (th != null) {
                        flowableSubscriber.onError(th);
                        return;
                    } else {
                        flowableSubscriber.onComplete();
                        return;
                    }
                }
                int length = multicastSubscriptionArr.length;
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
                while (!atomicReference.compareAndSet(multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    if (atomicReference.get() != multicastSubscriptionArr) {
                        break;
                    }
                }
                if (multicastSubscription.get() == Long.MIN_VALUE) {
                    h(multicastSubscription);
                    return;
                } else {
                    f();
                    return;
                }
            }
        }

        public final void d() {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f.getAndSet(o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.d.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SimpleQueue simpleQueue;
            SubscriptionHelper.a(this.h);
            if (this.e.getAndIncrement() != 0 || (simpleQueue = this.i) == null) {
                return;
            }
            simpleQueue.clear();
        }

        public final void f() {
            AtomicReference atomicReference;
            Throwable th;
            Throwable th2;
            if (this.e.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.i;
            int i = this.m;
            int i2 = this.g;
            boolean z = this.j != 1;
            AtomicReference atomicReference2 = this.f;
            MulticastSubscription[] multicastSubscriptionArr = (MulticastSubscription[]) atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i3 = 0;
                    while (i3 < length2) {
                        MulticastSubscription multicastSubscription = multicastSubscriptionArr[i3];
                        AtomicReference atomicReference3 = atomicReference2;
                        long j3 = multicastSubscription.get() - multicastSubscription.f;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i3++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (j2 != j4) {
                        if (b()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z2 = this.k;
                        if (z2 && (th2 = this.l) != null) {
                            g(th2);
                            return;
                        }
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z3 = objPoll == null;
                            if (z2 && z3) {
                                Throwable th3 = this.l;
                                if (th3 != null) {
                                    g(th3);
                                    return;
                                } else {
                                    d();
                                    return;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            int length3 = multicastSubscriptionArr.length;
                            int i4 = 0;
                            boolean z4 = false;
                            while (i4 < length3) {
                                MulticastSubscription multicastSubscription2 = multicastSubscriptionArr[i4];
                                long j5 = multicastSubscription2.get();
                                if (j5 != Long.MIN_VALUE) {
                                    if (j5 != j) {
                                        multicastSubscription2.f++;
                                    }
                                    multicastSubscription2.d.onNext(objPoll);
                                } else {
                                    z4 = true;
                                }
                                i4++;
                                j = Long.MAX_VALUE;
                            }
                            j2--;
                            if (z && (i = i + 1) == i2) {
                                ((Subscription) this.h.get()).request(i2);
                                i = 0;
                            }
                            MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                            if (z4 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                multicastSubscriptionArr = multicastSubscriptionArr2;
                                break;
                            } else {
                                j4 = 0;
                                j = Long.MAX_VALUE;
                            }
                        } catch (Throwable th4) {
                            Exceptions.b(th4);
                            SubscriptionHelper.a(this.h);
                            g(th4);
                            return;
                        }
                    }
                    if (j2 == j4) {
                        if (b()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z5 = this.k;
                        if (z5 && (th = this.l) != null) {
                            g(th);
                            return;
                        }
                        if (z5 && simpleQueue.isEmpty()) {
                            Throwable th5 = this.l;
                            if (th5 != null) {
                                g(th5);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                }
                this.m = i;
                iAddAndGet = this.e.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.i;
                }
                multicastSubscriptionArr = (MulticastSubscription[]) atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        public final void g(Throwable th) {
            for (MulticastSubscription multicastSubscription : (MulticastSubscription[]) this.f.getAndSet(o)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.d.onError(th);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(MulticastSubscription multicastSubscription) {
            MulticastSubscription[] multicastSubscriptionArr;
            while (true) {
                AtomicReference atomicReference = this.f;
                MulticastSubscription[] multicastSubscriptionArr2 = (MulticastSubscription[]) atomicReference.get();
                int length = multicastSubscriptionArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (multicastSubscriptionArr2[i] == multicastSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr = n;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr2, 0, multicastSubscriptionArr3, 0, i);
                    System.arraycopy(multicastSubscriptionArr2, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr = multicastSubscriptionArr3;
                }
                while (!atomicReference.compareAndSet(multicastSubscriptionArr2, multicastSubscriptionArr)) {
                    if (atomicReference.get() != multicastSubscriptionArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this.h, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(3);
                    if (iL == 1) {
                        this.j = iL;
                        this.i = queueSubscription;
                        this.k = true;
                        f();
                        return;
                    }
                    if (iL == 2) {
                        this.j = iL;
                        this.i = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.i = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.k) {
                return;
            }
            this.k = true;
            f();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.k) {
                RxJavaPlugins.b(th);
                return;
            }
            this.l = th;
            this.k = true;
            f();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.k) {
                return;
            }
            if (this.j != 0 || this.i.offer(obj)) {
                f();
            } else {
                ((Subscription) this.h.get()).cancel();
                onError(new MissingBackpressureException());
            }
        }
    }

    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {
        public final Subscriber d;
        public final MulticastProcessor e;
        public long f;

        public MulticastSubscription(Subscriber subscriber, MulticastProcessor multicastProcessor) {
            this.d = subscriber;
            this.e = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                MulticastProcessor multicastProcessor = this.e;
                multicastProcessor.h(this);
                multicastProcessor.f();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.b(this, j);
                this.e.f();
            }
        }
    }

    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, Subscription {
        public Subscription d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.d.cancel();
            throw null;
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
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.d.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new MulticastProcessor();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.b(th, flowableSubscriber);
        }
    }
}
