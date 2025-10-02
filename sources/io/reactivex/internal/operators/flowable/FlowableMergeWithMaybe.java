package io.reactivex.internal.operators.flowable;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
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
public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicReference e = new AtomicReference();
        public final OtherObserver f = new OtherObserver(this);
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicLong h = new AtomicLong();
        public final int i;
        public final int j;
        public volatile SpscArrayQueue k;
        public Object l;
        public volatile boolean m;
        public volatile boolean n;
        public volatile int o;
        public long p;
        public int q;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            public final MergeWithObserver d;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.d = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.d;
                mergeWithObserver.o = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.d;
                AtomicThrowable atomicThrowable = mergeWithObserver.g;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                SubscriptionHelper.a(mergeWithObserver.e);
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.d;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j = mergeWithObserver.p;
                    if (mergeWithObserver.h.get() != j) {
                        mergeWithObserver.p = j + 1;
                        mergeWithObserver.d.onNext(obj);
                        mergeWithObserver.o = 2;
                    } else {
                        mergeWithObserver.l = obj;
                        mergeWithObserver.o = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.l = obj;
                    mergeWithObserver.o = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.a();
            }
        }

        public MergeWithObserver(Subscriber subscriber) {
            this.d = subscriber;
            int i = Flowable.d;
            this.i = i;
            this.j = i - (i >> 2);
        }

        public final void a() {
            Subscriber subscriber = this.d;
            long j = this.p;
            int i = this.q;
            int i2 = this.j;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.h.get();
                while (j != j2) {
                    if (this.m) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    if (this.g.get() != null) {
                        this.l = null;
                        this.k = null;
                        AtomicThrowable atomicThrowable = this.g;
                        a.o(atomicThrowable, atomicThrowable, subscriber);
                        return;
                    }
                    int i4 = this.o;
                    if (i4 == i3) {
                        Object obj = this.l;
                        this.l = null;
                        this.o = 2;
                        subscriber.onNext(obj);
                        j++;
                    } else {
                        boolean z = this.n;
                        SpscArrayQueue spscArrayQueue = this.k;
                        Object objPoll = spscArrayQueue != null ? spscArrayQueue.poll() : null;
                        boolean z2 = objPoll == null;
                        if (z && z2 && i4 == 2) {
                            this.k = null;
                            subscriber.onComplete();
                            return;
                        } else {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(objPoll);
                            j++;
                            i++;
                            if (i == i2) {
                                ((Subscription) this.e.get()).request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.m) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    if (this.g.get() != null) {
                        this.l = null;
                        this.k = null;
                        AtomicThrowable atomicThrowable2 = this.g;
                        a.o(atomicThrowable2, atomicThrowable2, subscriber);
                        return;
                    }
                    boolean z3 = this.n;
                    SpscArrayQueue spscArrayQueue2 = this.k;
                    boolean z4 = spscArrayQueue2 == null || spscArrayQueue2.isEmpty();
                    if (z3 && z4 && this.o == 2) {
                        this.k = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.p = j;
                this.q = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.m = true;
            SubscriptionHelper.a(this.e);
            DisposableHelper.a(this.f);
            if (getAndIncrement() == 0) {
                this.k = null;
                this.l = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this.e, subscription, this.i);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.n = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            DisposableHelper.a(this.f);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                long j = this.p;
                if (this.h.get() != j) {
                    SpscArrayQueue spscArrayQueue = this.k;
                    if (spscArrayQueue == null || spscArrayQueue.isEmpty()) {
                        this.p = j + 1;
                        this.d.onNext(obj);
                        int i = this.q + 1;
                        if (i == this.j) {
                            this.q = 0;
                            ((Subscription) this.e.get()).request(i);
                        } else {
                            this.q = i;
                        }
                    } else {
                        spscArrayQueue.offer(obj);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue2 = this.k;
                    if (spscArrayQueue2 == null) {
                        spscArrayQueue2 = new SpscArrayQueue(Flowable.d);
                        this.k = spscArrayQueue2;
                    }
                    spscArrayQueue2.offer(obj);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue3 = this.k;
                if (spscArrayQueue3 == null) {
                    spscArrayQueue3 = new SpscArrayQueue(Flowable.d);
                    this.k = spscArrayQueue3;
                }
                spscArrayQueue3.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.h, j);
            if (getAndIncrement() == 0) {
                a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(flowableSubscriber);
        flowableSubscriber.m(mergeWithObserver);
        this.e.a(mergeWithObserver);
        throw null;
    }
}
