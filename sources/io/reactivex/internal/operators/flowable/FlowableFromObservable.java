package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    public final Observable e;

    public static final class SubscriberObserver<T> implements Observer<T>, Subscription {
        public final Subscriber d;
        public Disposable e;

        public SubscriberObserver(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            this.e = disposable;
            this.d.m(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }
    }

    public FlowableFromObservable(Observable observable) {
        this.e = observable;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SubscriberObserver(flowableSubscriber));
    }
}
