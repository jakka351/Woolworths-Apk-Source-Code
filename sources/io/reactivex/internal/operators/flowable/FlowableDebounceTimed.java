package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        public final Object d;
        public final long e;
        public final DebounceTimedSubscriber f;
        public final AtomicBoolean g = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedSubscriber debounceTimedSubscriber) {
            this.d = obj;
            this.e = j;
            this.f = debounceTimedSubscriber;
        }

        public final void a() {
            if (this.g.compareAndSet(false, true)) {
                DebounceTimedSubscriber debounceTimedSubscriber = this.f;
                if (this.e == debounceTimedSubscriber.f) {
                    if (debounceTimedSubscriber.get() != 0) {
                        throw null;
                    }
                    debounceTimedSubscriber.cancel();
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == DisposableHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        public Subscription d;
        public Disposable e;
        public volatile long f;
        public boolean g;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.d.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.d, subscription)) {
                this.d = subscription;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            Disposable disposable = this.e;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.a();
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = true;
            Disposable disposable = this.e;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            long j = this.f + 1;
            this.f = j;
            Disposable disposable = this.e;
            if (disposable != null) {
                DisposableHelper.a((DebounceEmitter) disposable);
            }
            this.e = new DebounceEmitter(obj, j, this);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this, j);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }
}
