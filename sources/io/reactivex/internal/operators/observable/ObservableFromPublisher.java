package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class ObservableFromPublisher<T> extends Observable<T> {
    public final Flowable d;

    public static final class PublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final Observer d;
        public Subscription e;

        public PublisherSubscriber(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.cancel();
            this.e = SubscriptionHelper.d;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.e, subscription)) {
                this.e = subscription;
                this.d.d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    public ObservableFromPublisher(Flowable flowable) {
        this.d = flowable;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.e(new PublisherSubscriber(observer));
    }
}
