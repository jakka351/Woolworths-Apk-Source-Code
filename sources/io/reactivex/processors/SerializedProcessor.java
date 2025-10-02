package io.reactivex.processors;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {
    public boolean e;
    public AppendOnlyLinkedArrayList f;
    public volatile boolean g;

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public final void m(Subscription subscription) {
        boolean z = true;
        if (!this.g) {
            synchronized (this) {
                try {
                    if (!this.g) {
                        if (this.e) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.f = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(NotificationLite.n(subscription));
                            return;
                        }
                        this.e = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (!z) {
            throw null;
        }
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                if (!this.e) {
                    this.e = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.b(NotificationLite.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.g) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.g) {
                    this.g = true;
                    if (this.e) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.f = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f24239a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.e = true;
                    z = false;
                }
                if (!z) {
                    throw null;
                }
                RxJavaPlugins.b(th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.g) {
            return;
        }
        synchronized (this) {
            try {
                if (this.g) {
                    return;
                }
                if (!this.e) {
                    this.e = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.f = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
