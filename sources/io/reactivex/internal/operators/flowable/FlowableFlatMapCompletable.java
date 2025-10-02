package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final Subscriber d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final CompositeDisposable f = new CompositeDisposable();
        public Subscription g;

        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return DisposableHelper.c(get());
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainSubscriber(Subscriber subscriber) {
            this.d = subscriber;
            lazySet(1);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.g.cancel();
            this.f.dispose();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() != 0) {
                this.g.request(1L);
                return;
            }
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            Subscriber subscriber = this.d;
            if (thB != null) {
                subscriber.onError(thB);
            } else {
                subscriber.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            cancel();
            if (getAndSet(0) > 0) {
                this.d.onError(ExceptionHelper.b(atomicThrowable));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.g.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new FlatMapCompletableMainSubscriber(flowableSubscriber));
    }
}
