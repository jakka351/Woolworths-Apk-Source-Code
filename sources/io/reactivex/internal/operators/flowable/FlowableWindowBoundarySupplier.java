package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
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
public final class FlowableWindowBoundarySupplier<T, B> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

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
            windowBoundaryMainSubscriber.k.cancel();
            windowBoundaryMainSubscriber.l = true;
            windowBoundaryMainSubscriber.b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f = true;
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            windowBoundaryMainSubscriber.k.cancel();
            AtomicThrowable atomicThrowable = windowBoundaryMainSubscriber.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                windowBoundaryMainSubscriber.l = true;
                windowBoundaryMainSubscriber.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            this.f = true;
            dispose();
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            AtomicReference atomicReference = windowBoundaryMainSubscriber.e;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            windowBoundaryMainSubscriber.g.offer(WindowBoundaryMainSubscriber.p);
            windowBoundaryMainSubscriber.b();
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final WindowBoundaryInnerSubscriber o = new WindowBoundaryInnerSubscriber(null);
        public static final Object p = new Object();
        public final Subscriber d;
        public final AtomicReference e = new AtomicReference();
        public final AtomicInteger f = new AtomicInteger(1);
        public final MpscLinkedQueue g = new MpscLinkedQueue();
        public final AtomicThrowable h = new AtomicThrowable();
        public final AtomicBoolean i = new AtomicBoolean();
        public final AtomicLong j = new AtomicLong();
        public Subscription k;
        public volatile boolean l;
        public UnicastProcessor m;
        public long n;

        public WindowBoundaryMainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            AtomicReference atomicReference = this.e;
            WindowBoundaryInnerSubscriber windowBoundaryInnerSubscriber = o;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerSubscriber);
            if (disposable == null || disposable == windowBoundaryInnerSubscriber) {
                return;
            }
            disposable.dispose();
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            MpscLinkedQueue mpscLinkedQueue = this.g;
            AtomicThrowable atomicThrowable = this.h;
            long j = this.n;
            int iAddAndGet = 1;
            while (this.f.get() != 0) {
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
                } else if (objPoll != p) {
                    unicastProcessor.onNext(objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.m = null;
                        unicastProcessor.onComplete();
                    }
                    if (this.i.get()) {
                        continue;
                    } else if (j == this.j.get()) {
                        this.k.cancel();
                        a();
                        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Could not deliver a window due to lack of requests");
                        atomicThrowable.getClass();
                        ExceptionHelper.a(atomicThrowable, missingBackpressureException);
                        this.l = true;
                    } else {
                        this.m = new UnicastProcessor(0, this);
                        this.f.getAndIncrement();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            atomicThrowable.getClass();
                            ExceptionHelper.a(atomicThrowable, th);
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
            if (this.i.compareAndSet(false, true)) {
                a();
                if (this.f.decrementAndGet() == 0) {
                    this.k.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                this.d.m(this);
                this.g.offer(p);
                b();
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            a();
            this.l = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            a();
            AtomicThrowable atomicThrowable = this.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.l = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.g.offer(obj);
            b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.j, j);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f.decrementAndGet() == 0) {
                this.k.cancel();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new WindowBoundaryMainSubscriber(flowableSubscriber));
    }
}
