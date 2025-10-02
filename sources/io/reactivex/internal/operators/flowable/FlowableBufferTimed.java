package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.ArrayList;
import java.util.Collection;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        public Collection k;
        public Subscription l;
        public long m;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean a(Object obj, Subscriber subscriber) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            dispose();
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            synchronized (this) {
                this.k = null;
            }
            this.l.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.l, subscription)) {
                this.l = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.k;
                this.k = null;
            }
            if (collection != null) {
                this.g.offer(collection);
                this.i = true;
                if (!c()) {
                    throw null;
                }
                QueueDrainHelper.c(this.g, this.f, this, this);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            synchronized (this) {
                this.k = null;
            }
            this.f.onError(th);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.k;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < 0) {
                        return;
                    }
                    this.k = null;
                    this.m++;
                    e(collection, this);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        cancel();
                        this.f.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                this.f.onError(th);
            }
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {
        public Subscription k;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean a(Object obj, Subscriber subscriber) {
            this.f.onNext((Collection) obj);
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
            this.k.cancel();
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    cancel();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            synchronized (this) {
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                throw null;
            }
        }
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable {
        public Subscription k;

        public final class RemoveFromBuffer implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean a(Object obj, Subscriber subscriber) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
            this.k.cancel();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            synchronized (this) {
                new ArrayList((Collection) null);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.i = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            synchronized (this) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.h) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }
}
