package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        public final SerializedSubscriber d;
        public Subscription e;
        public final AtomicReference f = new AtomicReference();
        public volatile long g;
        public boolean h;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            public boolean e;

            public final void a() {
                throw null;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (this.e) {
                    return;
                }
                this.e = true;
                a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                if (this.e) {
                    RxJavaPlugins.b(th);
                } else {
                    this.e = true;
                    throw null;
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                if (this.e) {
                    return;
                }
                this.e = true;
                dispose();
                a();
            }
        }

        public DebounceSubscriber(SerializedSubscriber serializedSubscriber) {
            this.d = serializedSubscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.cancel();
            DisposableHelper.a(this.f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            AtomicReference atomicReference = this.f;
            Disposable disposable = (Disposable) atomicReference.get();
            if (DisposableHelper.c(disposable)) {
                return;
            }
            DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
            if (debounceInnerSubscriber != null) {
                debounceInnerSubscriber.a();
            }
            DisposableHelper.a(atomicReference);
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            this.g++;
            Disposable disposable = (Disposable) this.f.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                this.d.onError(th);
            }
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
        this.e.a(new DebounceSubscriber(new SerializedSubscriber(flowableSubscriber)));
    }
}
