package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }
    }

    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements FlowableSubscriber<T>, Subscription, Disposable {
        public Subscription k;
        public Collection l;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean a(Object obj, Subscriber subscriber) {
            this.f.onNext((Collection) obj);
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.h = true;
                    subscription.cancel();
                    EmptySubscription.b(th, this.f);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            synchronized (this) {
                try {
                    Collection collection = this.l;
                    if (collection == null) {
                        return;
                    }
                    this.l = null;
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
                    Collection collection = this.l;
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
        this.e.a(new BufferExactBoundarySubscriber(new SerializedSubscriber(flowableSubscriber), new MpscLinkedQueue()));
    }
}
