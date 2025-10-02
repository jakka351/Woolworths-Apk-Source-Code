package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24227a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f24227a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24227a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, Subscription {
        public Subscription d;
        public SimpleQueue e;
        public volatile boolean f;
        public volatile boolean g;
        public volatile boolean h;
        public int i;

        public abstract void c();

        public abstract void d();

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.i = iL;
                        this.e = queueSubscription;
                        this.f = true;
                        d();
                        c();
                        return;
                    }
                    if (iL == 2) {
                        this.i = iL;
                        this.e = queueSubscription;
                        d();
                        subscription.request(0);
                        return;
                    }
                }
                this.e = new SpscArrayQueue(0);
                d();
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f = true;
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.i == 2 || this.e.offer(obj)) {
                c();
            } else {
                this.d.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void a(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void b(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void c() {
            Throwable th;
            if (getAndIncrement() == 0) {
                while (!this.g) {
                    if (!this.h) {
                        boolean z = this.f;
                        if (z) {
                            throw null;
                        }
                        try {
                            boolean z2 = this.e.poll() == null;
                            if (z && z2) {
                                throw null;
                            }
                            if (!z2) {
                                try {
                                    throw null;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void d() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void a(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void b(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                throw null;
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void c() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void d() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            throw null;
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        public long l;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.l;
            if (j != 0) {
                this.l = 0L;
                d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            long j = this.l;
            if (j != 0) {
                this.l = 0L;
                d(j);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.l++;
            throw null;
        }
    }

    public interface ConcatMapSupport<T> {
        void a(Throwable th);

        void b(Object obj);
    }

    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements Subscription {
        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (j > 0 && compareAndSet(false, true)) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        if (!FlowableScalarXMap.a(this.e, flowableSubscriber)) {
            throw null;
        }
    }
}
