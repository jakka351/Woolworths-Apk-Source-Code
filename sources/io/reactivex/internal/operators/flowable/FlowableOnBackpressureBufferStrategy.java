package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24229a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f24229a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24229a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicLong e = new AtomicLong();
        public final ArrayDeque f = new ArrayDeque();
        public Subscription g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable j;

        public OnBackpressureBufferStrategySubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public static void a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        public final void b() {
            boolean zIsEmpty;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            Subscriber subscriber = this.d;
            int iAddAndGet = 1;
            do {
                long j = this.e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.h) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z = this.i;
                    synchronized (arrayDeque) {
                        objPoll = arrayDeque.poll();
                    }
                    boolean z2 = objPoll == null;
                    if (z) {
                        Throwable th = this.j;
                        if (th != null) {
                            a(arrayDeque);
                            subscriber.onError(th);
                            return;
                        } else if (z2) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(objPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.h) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z3 = this.i;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.j;
                        if (th2 != null) {
                            a(arrayDeque);
                            subscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.e(this.e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
            this.g.cancel();
            if (getAndIncrement() == 0) {
                a(this.f);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
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
            if (this.i) {
                RxJavaPlugins.b(th);
                return;
            }
            this.j = th;
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.i) {
                return;
            }
            ArrayDeque arrayDeque = this.f;
            synchronized (arrayDeque) {
                if (arrayDeque.size() == 0) {
                    throw null;
                }
                arrayDeque.offer(obj);
            }
            b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
                b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new OnBackpressureBufferStrategySubscriber(flowableSubscriber));
    }
}
