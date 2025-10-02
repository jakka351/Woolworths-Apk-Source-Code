package io.reactivex.internal.subscriptions;

import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    public final Subscriber d;
    public Object e;

    public DeferredScalarSubscription(Subscriber subscriber) {
        this.d = subscriber;
    }

    public final void b(Object obj) {
        int i = get();
        do {
            Subscriber subscriber = this.d;
            if (i == 8) {
                this.e = obj;
                lazySet(16);
                subscriber.onNext(obj);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                subscriber.onNext(obj);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.e = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.e = null;
    }

    public void cancel() {
        set(4);
        this.e = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.e = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int l(int i) {
        lazySet(8);
        return 2;
    }

    public void onSuccess(Object obj) {
        b(obj);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.f(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.e) == null) {
                        return;
                    }
                    this.e = null;
                    Subscriber subscriber = this.d;
                    subscriber.onNext(obj);
                    if (get() != 4) {
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
