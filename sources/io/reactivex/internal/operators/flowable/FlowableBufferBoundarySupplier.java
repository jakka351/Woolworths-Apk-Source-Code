package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        public boolean e;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            throw null;
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
            throw null;
        }
    }

    public static final class BufferBoundarySupplierSubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, Subscription, Disposable {
        public Subscription k;
        public final AtomicReference l;
        public Collection m;

        public BufferBoundarySupplierSubscriber(SerializedSubscriber serializedSubscriber) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.l = new AtomicReference();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean a(Object obj, Subscriber subscriber) {
            this.f.onNext((Collection) obj);
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.l.get() == DisposableHelper.d;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.k.cancel();
            DisposableHelper.a(this.l);
            if (c()) {
                this.g.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.k.cancel();
            DisposableHelper.a(this.l);
        }

        public final void i() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                cancel();
                this.f.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                SerializedSubscriber serializedSubscriber = this.f;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.h = true;
                    subscription.cancel();
                    EmptySubscription.b(th, serializedSubscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.m;
                    if (collection == null) {
                        return;
                    }
                    this.m = null;
                    this.g.offer(collection);
                    this.i = true;
                    if (c()) {
                        QueueDrainHelper.c(this.g, this.f, this, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            cancel();
            this.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.m;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new BufferBoundarySupplierSubscriber(new SerializedSubscriber(flowableSubscriber)));
    }
}
