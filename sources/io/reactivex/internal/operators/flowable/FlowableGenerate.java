package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableGenerate<T, S> extends Flowable<T> {

    public static final class GeneratorSubscription<T, S> extends AtomicLong implements Emitter<T>, Subscription {
        public Object d;
        public volatile boolean e;
        public boolean f;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            if (BackpressureHelper.a(this, 1L) == 0) {
                Object obj = this.d;
                this.d = null;
                d(obj);
            }
        }

        public final void d(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
            } else {
                this.f = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j) && BackpressureHelper.a(this, j) == 0) {
                Object obj = this.d;
                while (0 == j) {
                    j = get();
                    if (0 == j) {
                        this.d = obj;
                        j = addAndGet(-0L);
                        if (j == 0) {
                            return;
                        }
                    }
                }
                if (this.e) {
                    this.d = null;
                    d(obj);
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.e = true;
                    this.d = null;
                    onError(th);
                    d(obj);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.b(th, flowableSubscriber);
        }
    }
}
