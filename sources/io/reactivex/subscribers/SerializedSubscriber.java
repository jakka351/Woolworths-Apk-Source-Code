package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {
    public final Subscriber d;
    public Subscription e;
    public boolean f;
    public AppendOnlyLinkedArrayList g;
    public volatile boolean h;

    public SerializedSubscriber(Subscriber subscriber) {
        this.d = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.e.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        if (SubscriptionHelper.l(this.e, subscription)) {
            this.e = subscription;
            this.d.m(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.h) {
            return;
        }
        synchronized (this) {
            try {
                if (this.h) {
                    return;
                }
                if (!this.f) {
                    this.h = true;
                    this.f = true;
                    this.d.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.g;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.g = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(NotificationLite.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.h) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.h) {
                    if (this.f) {
                        this.h = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.g;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.g = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f24239a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.h = true;
                    this.f = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.b(th);
                } else {
                    this.d.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        if (this.h) {
            return;
        }
        if (obj == null) {
            this.e.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.h) {
                    return;
                }
                if (this.f) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.g;
                    if (appendOnlyLinkedArrayList2 == null) {
                        appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList();
                        this.g = appendOnlyLinkedArrayList2;
                    }
                    appendOnlyLinkedArrayList2.b(obj);
                    return;
                }
                this.f = true;
                this.d.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            appendOnlyLinkedArrayList = this.g;
                            if (appendOnlyLinkedArrayList == null) {
                                this.f = false;
                                return;
                            }
                            this.g = null;
                        } finally {
                        }
                    }
                } while (!appendOnlyLinkedArrayList.a(this.d));
            } finally {
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.e.request(j);
    }
}
