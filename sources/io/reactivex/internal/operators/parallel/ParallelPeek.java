package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        public Subscription d;
        public boolean e;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
                this.d.cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    subscription.cancel();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
                this.d.request(j);
            }
        }
    }
}
