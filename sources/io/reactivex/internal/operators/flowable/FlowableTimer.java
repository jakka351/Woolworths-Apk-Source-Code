package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableTimer extends Flowable<Long> {

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements Subscription, Runnable {
        public final Subscriber d;
        public volatile boolean e;

        public TimerSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            DisposableHelper.a(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                this.e = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (get() != DisposableHelper.d) {
                if (!this.e) {
                    lazySet(emptyDisposable);
                    this.d.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.d.onNext(0L);
                    lazySet(emptyDisposable);
                    this.d.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        flowableSubscriber.m(new TimerSubscriber(flowableSubscriber));
        throw null;
    }
}
