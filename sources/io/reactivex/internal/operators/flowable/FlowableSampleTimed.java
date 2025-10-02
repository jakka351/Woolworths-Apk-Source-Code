package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public final void a() {
            b();
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber, java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public final void a() {
            this.d.onComplete();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription, Runnable {
        public final SerializedSubscriber d;
        public final AtomicLong e = new AtomicLong();
        public final SequentialDisposable f = new SequentialDisposable();
        public Subscription g;

        public SampleTimedSubscriber(SerializedSubscriber serializedSubscriber) {
            this.d = serializedSubscriber;
        }

        public abstract void a();

        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.e;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.d;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.a(this.f);
            this.g.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.a(this.f);
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
            }
        }

        public void run() {
            b();
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SampleTimedNoLast(new SerializedSubscriber(flowableSubscriber)));
    }
}
