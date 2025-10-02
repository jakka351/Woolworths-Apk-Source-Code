package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRefCount<T> extends Flowable<T> {
    public RefConnection e;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        public final FlowableRefCount d;
        public long e;
        public boolean f;

        public RefConnection(FlowableRefCount flowableRefCount) {
            this.d = flowableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.d(this, (Disposable) obj);
            synchronized (this.d) {
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.f(this);
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final FlowableRefCount e;
        public final RefConnection f;
        public Subscription g;

        public RefCountSubscriber(Subscriber subscriber, FlowableRefCount flowableRefCount, RefConnection refConnection) {
            this.d = subscriber;
            this.e = flowableRefCount;
            this.f = refConnection;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.g.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.e;
                RefConnection refConnection = this.f;
                synchronized (flowableRefCount) {
                    try {
                        RefConnection refConnection2 = flowableRefCount.e;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.e - 1;
                            refConnection.e = j;
                            if (j == 0 && refConnection.f) {
                                flowableRefCount.f(refConnection);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.m(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.e.d(this.f);
                this.d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                this.e.d(this.f);
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.g.request(j);
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.e;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.e = refConnection;
                }
                long j = refConnection.e + 1;
                refConnection.e = j;
                if (!refConnection.f && j == 0) {
                    refConnection.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountSubscriber(flowableSubscriber, this, refConnection);
        throw null;
    }

    public final void d(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.e;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    refConnection.getClass();
                    long j = refConnection.e - 1;
                    refConnection.e = j;
                    if (j == 0) {
                        this.e = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.e == 0 && refConnection == this.e) {
                    this.e = null;
                    refConnection.get();
                    DisposableHelper.a(refConnection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
