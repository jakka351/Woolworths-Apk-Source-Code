package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* loaded from: classes7.dex */
public final class SingleToFlowable<T> extends Flowable<T> {
    public final SingleSource e;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {
        public Disposable f;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f.dispose();
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.m(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }
    }

    public SingleToFlowable(SingleSource singleSource) {
        this.e = singleSource;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new SingleToFlowableObserver(flowableSubscriber));
    }
}
