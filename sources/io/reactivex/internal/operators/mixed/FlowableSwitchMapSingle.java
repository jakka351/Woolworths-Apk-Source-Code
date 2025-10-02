package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
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
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final SwitchMapSingleObserver l = new SwitchMapSingleObserver(null);
        public final Subscriber d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference g = new AtomicReference();
        public Subscription h;
        public volatile boolean i;
        public volatile boolean j;
        public long k;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final SwitchMapSingleSubscriber d;
            public volatile Object e;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber switchMapSingleSubscriber) {
                this.d = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber switchMapSingleSubscriber = this.d;
                AtomicReference atomicReference = switchMapSingleSubscriber.g;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapSingleSubscriber.e;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.a(atomicThrowable, th)) {
                            switchMapSingleSubscriber.h.cancel();
                            switchMapSingleSubscriber.a();
                            switchMapSingleSubscriber.b();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.b(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.e = obj;
                this.d.b();
            }
        }

        public SwitchMapSingleSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            AtomicReference atomicReference = this.g;
            SwitchMapSingleObserver switchMapSingleObserver = l;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.a(switchMapSingleObserver2);
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            AtomicThrowable atomicThrowable = this.e;
            AtomicReference atomicReference = this.g;
            AtomicLong atomicLong = this.f;
            long j = this.k;
            int iAddAndGet = 1;
            while (!this.j) {
                if (atomicThrowable.get() != null) {
                    subscriber.onError(ExceptionHelper.b(atomicThrowable));
                    return;
                }
                boolean z = this.i;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (thB != null) {
                        subscriber.onError(thB);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (z2 || switchMapSingleObserver.e == null || j == atomicLong.get()) {
                    this.k = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    subscriber.onNext(switchMapSingleObserver.e);
                    j++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.j = true;
            this.h.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            a();
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.g;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.h.cancel();
                atomicReference.getAndSet(l);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.f, j);
            b();
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new SwitchMapSingleSubscriber(flowableSubscriber);
        throw null;
    }
}
