package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {

    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Subscription, JoinSupport {
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

        public GroupJoinSubscription(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void a(Throwable th) {
            if (!ExceptionHelper.a(this.j, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.k.decrementAndGet();
                b();
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f;
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            while (!this.n) {
                if (((Throwable) this.j.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    this.g.dispose();
                    g(subscriber);
                    return;
                }
                boolean z = this.k.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator it = this.h.values().iterator();
                    while (it.hasNext()) {
                        ((UnicastProcessor) it.next()).onComplete();
                    }
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
                        UnicastProcessor unicastProcessor = new UnicastProcessor(Flowable.d, null);
                        int i = this.l;
                        this.l = i + 1;
                        this.h.put(Integer.valueOf(i), unicastProcessor);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            h(th, subscriber, spscLinkedArrayQueue);
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
                            h(th2, subscriber, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 3) {
                        LeftRightEndSubscriber leftRightEndSubscriber = (LeftRightEndSubscriber) objPoll;
                        LinkedHashMap linkedHashMap = this.h;
                        leftRightEndSubscriber.getClass();
                        UnicastProcessor unicastProcessor2 = (UnicastProcessor) linkedHashMap.remove(0);
                        this.g.a(leftRightEndSubscriber);
                        if (unicastProcessor2 != null) {
                            unicastProcessor2.onComplete();
                        }
                    } else if (num == 4) {
                        LeftRightEndSubscriber leftRightEndSubscriber2 = (LeftRightEndSubscriber) objPoll;
                        LinkedHashMap linkedHashMap2 = this.i;
                        leftRightEndSubscriber2.getClass();
                        linkedHashMap2.remove(0);
                        this.g.a(leftRightEndSubscriber2);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void c(Throwable th) {
            if (ExceptionHelper.a(this.j, th)) {
                b();
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
            this.g.dispose();
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
            b();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void e(boolean z, LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                try {
                    this.f.a(z ? 3 : 4, leftRightEndSubscriber);
                } catch (Throwable th) {
                    throw th;
                }
            }
            b();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void f(LeftRightSubscriber leftRightSubscriber) {
            this.g.c(leftRightSubscriber);
            this.k.decrementAndGet();
            b();
        }

        public final void g(Subscriber subscriber) {
            Throwable thB = ExceptionHelper.b(this.j);
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((UnicastProcessor) it.next()).onError(thB);
            }
            linkedHashMap.clear();
            this.i.clear();
            subscriber.onError(thB);
        }

        public final void h(Throwable th, Subscriber subscriber, SimpleQueue simpleQueue) {
            Exceptions.b(th);
            ExceptionHelper.a(this.j, th);
            simpleQueue.clear();
            this.g.dispose();
            g(subscriber);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
            }
        }
    }

    public interface JoinSupport {
        void a(Throwable th);

        void c(Throwable th);

        void d(Object obj, boolean z);

        void e(boolean z, LeftRightEndSubscriber leftRightEndSubscriber);

        void f(LeftRightSubscriber leftRightSubscriber);
    }

    public static final class LeftRightEndSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
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
            if (SubscriptionHelper.a(this)) {
                throw null;
            }
        }
    }

    public static final class LeftRightSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {
        public final AtomicInteger d;
        public final boolean e;

        /* JADX WARN: Multi-variable type inference failed */
        public LeftRightSubscriber(JoinSupport joinSupport, boolean z) {
            this.d = (AtomicInteger) joinSupport;
            this.e = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.f(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.a(th);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.internal.operators.flowable.FlowableGroupJoin$JoinSupport, java.util.concurrent.atomic.AtomicInteger] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.d(obj, this.e);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(flowableSubscriber);
        flowableSubscriber.m(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        CompositeDisposable compositeDisposable = groupJoinSubscription.g;
        compositeDisposable.d(leftRightSubscriber);
        compositeDisposable.d(new LeftRightSubscriber(groupJoinSubscription, false));
        this.e.a(leftRightSubscriber);
        throw null;
    }
}
