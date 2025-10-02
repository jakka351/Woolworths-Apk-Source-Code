package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Subscription f;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable j;
        public final AtomicLong g = new AtomicLong();
        public final SpscLinkedArrayQueue e = new SpscLinkedArrayQueue(0);

        public TakeLastTimedSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final boolean a(boolean z, Subscriber subscriber) {
            if (this.h) {
                this.e.clear();
                return true;
            }
            Throwable th = this.j;
            if (th != null) {
                this.e.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber subscriber = this.d;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            int iAddAndGet = 1;
            do {
                if (this.i) {
                    if (a(spscLinkedArrayQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    long j = this.g.get();
                    long j2 = 0;
                    while (true) {
                        if (a(spscLinkedArrayQueue.b() == null, subscriber)) {
                            return;
                        }
                        if (j != j2) {
                            spscLinkedArrayQueue.poll();
                            subscriber.onNext(spscLinkedArrayQueue.poll());
                            j2++;
                        } else if (j2 != 0) {
                            BackpressureHelper.e(this.g, j2);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f.cancel();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.f, subscription)) {
                this.f = subscription;
                this.d.m(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.j = th;
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.g, j);
                b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new TakeLastTimedSubscriber(flowableSubscriber));
    }
}
