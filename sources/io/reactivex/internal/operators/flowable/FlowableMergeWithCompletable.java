package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicReference e = new AtomicReference();
        public final OtherObserver f = new OtherObserver(this);
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicLong h = new AtomicLong();
        public volatile boolean i;
        public volatile boolean j;

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final MergeWithSubscriber d;

            public OtherObserver(MergeWithSubscriber mergeWithSubscriber) {
                this.d = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                MergeWithSubscriber mergeWithSubscriber = this.d;
                mergeWithSubscriber.j = true;
                if (mergeWithSubscriber.i) {
                    HalfSerializer.b(mergeWithSubscriber.d, mergeWithSubscriber, mergeWithSubscriber.g);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithSubscriber mergeWithSubscriber = this.d;
                SubscriptionHelper.a(mergeWithSubscriber.e);
                HalfSerializer.d(mergeWithSubscriber.d, th, mergeWithSubscriber, mergeWithSubscriber.g);
            }
        }

        public MergeWithSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SubscriptionHelper.a(this.e);
            DisposableHelper.a(this.f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.c(this.e, this.h, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            if (this.j) {
                HalfSerializer.b(this.d, this, this.g);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            HalfSerializer.d(this.d, th, this, this.g);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            HalfSerializer.f(this.d, obj, this, this.g);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            SubscriptionHelper.b(this.e, this.h, j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(flowableSubscriber);
        flowableSubscriber.m(mergeWithSubscriber);
        this.e.a(mergeWithSubscriber);
        throw null;
    }
}
