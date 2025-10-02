package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {

    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, FlowableGroupJoin.JoinSupport {
        public final Subscriber d;
        public int l;
        public int m;
        public volatile boolean n;
        public final AtomicLong e = new AtomicLong();
        public final CompositeDisposable g = new CompositeDisposable();
        public final SpscLinkedArrayQueue f = new SpscLinkedArrayQueue(Flowable.d);
        public final LinkedHashMap h = new LinkedHashMap();
        public final LinkedHashMap i = new LinkedHashMap();
        public final AtomicReference j = new AtomicReference();
        public final AtomicInteger k = new AtomicInteger(2);

        public JoinSubscription(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void a(Throwable th) {
            if (!ExceptionHelper.a(this.j, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.k.decrementAndGet();
                g();
            }
        }

        public final void b() {
            this.g.dispose();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void c(Throwable th) {
            if (ExceptionHelper.a(this.j, th)) {
                g();
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.n) {
                return;
            }
            this.n = true;
            b();
            if (getAndIncrement() == 0) {
                this.f.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void d(Object obj, boolean z) {
            synchronized (this) {
                try {
                    this.f.a(z ? 1 : 2, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void e(boolean z, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                try {
                    this.f.a(z ? 3 : 4, leftRightEndSubscriber);
                } catch (Throwable th) {
                    throw th;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void f(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.g.c(leftRightSubscriber);
            this.k.decrementAndGet();
            g();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f;
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            while (!this.n) {
                if (((Throwable) this.j.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    b();
                    h(subscriber);
                    return;
                }
                boolean z = this.k.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.h.clear();
                    this.i.clear();
                    this.g.dispose();
                    subscriber.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == 1) {
                        int i = this.l;
                        this.l = i + 1;
                        this.h.put(Integer.valueOf(i), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            i(th, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i2 = this.m;
                        this.m = i2 + 1;
                        this.i.put(Integer.valueOf(i2), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            i(th2, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 3) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        LinkedHashMap linkedHashMap = this.h;
                        leftRightEndSubscriber.getClass();
                        linkedHashMap.remove(0);
                        this.g.a(leftRightEndSubscriber);
                    } else if (num == 4) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        LinkedHashMap linkedHashMap2 = this.i;
                        leftRightEndSubscriber2.getClass();
                        linkedHashMap2.remove(0);
                        this.g.a(leftRightEndSubscriber2);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void h(Subscriber subscriber) {
            Throwable thB = ExceptionHelper.b(this.j);
            this.h.clear();
            this.i.clear();
            subscriber.onError(thB);
        }

        public final void i(Throwable th, Subscriber subscriber, SimpleQueue simpleQueue) {
            Exceptions.b(th);
            ExceptionHelper.a(this.j, th);
            simpleQueue.clear();
            b();
            h(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        JoinSubscription joinSubscription = new JoinSubscription(flowableSubscriber);
        flowableSubscriber.m(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        CompositeDisposable compositeDisposable = joinSubscription.g;
        compositeDisposable.d(leftRightSubscriber);
        compositeDisposable.d(new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false));
        this.e.a(leftRightSubscriber);
        throw null;
    }
}
