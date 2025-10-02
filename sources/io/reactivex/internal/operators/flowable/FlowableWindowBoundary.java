package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWindowBoundary<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowBoundaryInnerSubscriber<T, B> extends DisposableSubscriber<B> {
        public final WindowBoundaryMainSubscriber e;
        public boolean f;

        public WindowBoundaryInnerSubscriber(WindowBoundaryMainSubscriber windowBoundaryMainSubscriber) {
            this.e = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            SubscriptionHelper.a(windowBoundaryMainSubscriber.f);
            windowBoundaryMainSubscriber.l = true;
            windowBoundaryMainSubscriber.a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f = true;
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            SubscriptionHelper.a(windowBoundaryMainSubscriber.f);
            AtomicThrowable atomicThrowable = windowBoundaryMainSubscriber.i;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                windowBoundaryMainSubscriber.l = true;
                windowBoundaryMainSubscriber.a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            windowBoundaryMainSubscriber.h.offer(WindowBoundaryMainSubscriber.o);
            windowBoundaryMainSubscriber.a();
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final Object o = new Object();
        public final Subscriber d;
        public final WindowBoundaryInnerSubscriber e = new WindowBoundaryInnerSubscriber(this);
        public final AtomicReference f = new AtomicReference();
        public final AtomicInteger g = new AtomicInteger(1);
        public final MpscLinkedQueue h = new MpscLinkedQueue();
        public final AtomicThrowable i = new AtomicThrowable();
        public final AtomicBoolean j = new AtomicBoolean();
        public final AtomicLong k = new AtomicLong();
        public volatile boolean l;
        public UnicastProcessor m;
        public long n;

        public WindowBoundaryMainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            MpscLinkedQueue mpscLinkedQueue = this.h;
            AtomicThrowable atomicThrowable = this.i;
            long j = this.n;
            int iAddAndGet = 1;
            while (this.g.get() != 0) {
                UnicastProcessor unicastProcessor = this.m;
                boolean z = this.l;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (unicastProcessor != null) {
                        this.m = null;
                        unicastProcessor.onError(thB);
                    }
                    subscriber.onError(thB);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    atomicThrowable.getClass();
                    Throwable thB2 = ExceptionHelper.b(atomicThrowable);
                    if (thB2 == null) {
                        if (unicastProcessor != null) {
                            this.m = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.m = null;
                        unicastProcessor.onError(thB2);
                    }
                    subscriber.onError(thB2);
                    return;
                }
                if (z2) {
                    this.n = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != o) {
                    unicastProcessor.onNext(objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.m = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.j.get()) {
                        UnicastProcessor unicastProcessor2 = new UnicastProcessor(0, this);
                        this.m = unicastProcessor2;
                        this.g.getAndIncrement();
                        if (j != this.k.get()) {
                            j++;
                            subscriber.onNext(unicastProcessor2);
                        } else {
                            SubscriptionHelper.a(this.f);
                            this.e.dispose();
                            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Could not deliver a window due to lack of requests");
                            atomicThrowable.getClass();
                            ExceptionHelper.a(atomicThrowable, missingBackpressureException);
                            this.l = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.m = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.j.compareAndSet(false, true)) {
                this.e.dispose();
                if (this.g.decrementAndGet() == 0) {
                    SubscriptionHelper.a(this.f);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this.f, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e.dispose();
            this.l = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.e.dispose();
            AtomicThrowable atomicThrowable = this.i;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.l = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.h.offer(obj);
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.k, j);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g.decrementAndGet() == 0) {
                SubscriptionHelper.a(this.f);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new WindowBoundaryMainSubscriber(flowableSubscriber);
        flowableSubscriber.m(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.h.offer(WindowBoundaryMainSubscriber.o);
        windowBoundaryMainSubscriber.a();
        throw null;
    }
}
