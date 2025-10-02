package io.reactivex.internal.operators.flowable;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {

    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {
        public final EqualSubscriber f;
        public final EqualSubscriber g;
        public final AtomicThrowable h;
        public final AtomicInteger i;
        public Object j;
        public Object k;

        public EqualCoordinator(Subscriber subscriber) {
            super(subscriber);
            this.i = new AtomicInteger();
            this.f = new EqualSubscriber(this);
            this.g = new EqualSubscriber(this);
            this.h = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void a(Throwable th) {
            AtomicThrowable atomicThrowable = this.h;
            atomicThrowable.getClass();
            if (ExceptionHelper.a(atomicThrowable, th)) {
                c();
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void c() {
            if (this.i.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.f.e;
                SimpleQueue simpleQueue2 = this.g.e;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (get() == 4) {
                        this.f.a();
                        this.g.a();
                        return;
                    } else if (this.h.get() != null) {
                        f();
                        Subscriber subscriber = this.d;
                        AtomicThrowable atomicThrowable = this.h;
                        a.o(atomicThrowable, atomicThrowable, subscriber);
                        return;
                    }
                } else {
                    if (get() == 4) {
                        this.f.a();
                        this.g.a();
                        return;
                    }
                    if (this.h.get() != null) {
                        f();
                        Subscriber subscriber2 = this.d;
                        AtomicThrowable atomicThrowable2 = this.h;
                        a.o(atomicThrowable2, atomicThrowable2, subscriber2);
                        return;
                    }
                    boolean z = this.f.f;
                    Object objPoll = this.j;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.j = objPoll;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            f();
                            AtomicThrowable atomicThrowable3 = this.h;
                            atomicThrowable3.getClass();
                            ExceptionHelper.a(atomicThrowable3, th);
                            Subscriber subscriber3 = this.d;
                            AtomicThrowable atomicThrowable4 = this.h;
                            a.o(atomicThrowable4, atomicThrowable4, subscriber3);
                            return;
                        }
                    }
                    boolean z2 = objPoll == null;
                    boolean z3 = this.g.f;
                    Object objPoll2 = this.k;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.k = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            f();
                            AtomicThrowable atomicThrowable5 = this.h;
                            atomicThrowable5.getClass();
                            ExceptionHelper.a(atomicThrowable5, th2);
                            Subscriber subscriber4 = this.d;
                            AtomicThrowable atomicThrowable6 = this.h;
                            a.o(atomicThrowable6, atomicThrowable6, subscriber4);
                            return;
                        }
                    }
                    boolean z4 = objPoll2 == null;
                    if (z && z3 && z2 && z4) {
                        b(Boolean.TRUE);
                        return;
                    }
                    if (z && z3 && z2 != z4) {
                        f();
                        b(Boolean.FALSE);
                        return;
                    }
                    if (!z2 && !z4) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.b(th3);
                            f();
                            AtomicThrowable atomicThrowable7 = this.h;
                            atomicThrowable7.getClass();
                            ExceptionHelper.a(atomicThrowable7, th3);
                            Subscriber subscriber5 = this.d;
                            AtomicThrowable atomicThrowable8 = this.h;
                            a.o(atomicThrowable8, atomicThrowable8, subscriber5);
                            return;
                        }
                    }
                }
                iAddAndGet = this.i.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            EqualSubscriber equalSubscriber = this.f;
            equalSubscriber.getClass();
            SubscriptionHelper.a(equalSubscriber);
            EqualSubscriber equalSubscriber2 = this.g;
            equalSubscriber2.getClass();
            SubscriptionHelper.a(equalSubscriber2);
            if (this.i.getAndIncrement() == 0) {
                equalSubscriber.a();
                equalSubscriber2.a();
            }
        }

        public final void f() {
            EqualSubscriber equalSubscriber = this.f;
            equalSubscriber.getClass();
            SubscriptionHelper.a(equalSubscriber);
            equalSubscriber.a();
            EqualSubscriber equalSubscriber2 = this.g;
            equalSubscriber2.getClass();
            SubscriptionHelper.a(equalSubscriber2);
            equalSubscriber2.a();
        }
    }

    public interface EqualCoordinatorHelper {
        void a(Throwable th);

        void c();
    }

    public static final class EqualSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        public final AtomicInteger d;
        public volatile SimpleQueue e;
        public volatile boolean f;
        public int g;

        /* JADX WARN: Multi-variable type inference failed */
        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper) {
            this.d = (AtomicInteger) equalCoordinatorHelper;
        }

        public final void a() {
            SimpleQueue simpleQueue = this.e;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(3);
                    if (iL == 1) {
                        this.g = iL;
                        this.e = queueSubscription;
                        this.f = true;
                        this.d.c();
                        return;
                    }
                    if (iL == 2) {
                        this.g = iL;
                        this.e = queueSubscription;
                        subscription.request(0);
                        return;
                    }
                }
                this.e = new SpscArrayQueue(0);
                subscription.request(0);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f = true;
            this.d.c();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.a(th);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualCoordinatorHelper, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g != 0 || this.e.offer(obj)) {
                this.d.c();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new EqualCoordinator(flowableSubscriber));
        throw null;
    }
}
