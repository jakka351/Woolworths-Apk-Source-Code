package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {
        public final Subscriber d;
        public final AtomicLong e = new AtomicLong();
        public Disposable f;
        public volatile Iterator g;
        public volatile boolean h;
        public boolean i;

        public FlatMapIterableObserver(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
            this.f.dispose();
            this.f = DisposableHelper.d;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.g = null;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.m(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.g == null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.i = true;
            return 2;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.f = DisposableHelper.d;
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Iterator it = this.g;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            ObjectHelper.b(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.g = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.f(j)) {
                return;
            }
            BackpressureHelper.a(this.e, j);
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            Iterator it = this.g;
            if (this.i && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j2 = this.e.get();
                    if (j2 == Long.MAX_VALUE) {
                        while (!this.h) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.h) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
                                        subscriber.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.b(th);
                                    subscriber.onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                Exceptions.b(th2);
                                subscriber.onError(th2);
                                return;
                            }
                        }
                        return;
                    }
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.h) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            ObjectHelper.b(next, "The iterator returned a null value");
                            subscriber.onNext(next);
                            if (this.h) {
                                return;
                            }
                            j3++;
                            try {
                                if (!it.hasNext()) {
                                    subscriber.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                Exceptions.b(th3);
                                subscriber.onError(th3);
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.b(th4);
                            subscriber.onError(th4);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        BackpressureHelper.e(this.e, j3);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.g;
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new FlatMapIterableObserver(flowableSubscriber);
        throw null;
    }
}
