package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {
        public final OtherSubscriber d;
        public Disposable e;

        public DelayMaybeObserver(MaybeObserver maybeObserver) {
            this.d = new OtherSubscriber(maybeObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                this.d.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
            this.e = DisposableHelper.d;
            SubscriptionHelper.a(this.d);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.e = DisposableHelper.d;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            this.e = DisposableHelper.d;
            this.d.f = th;
            throw null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.e = DisposableHelper.d;
            this.d.e = obj;
            throw null;
        }
    }

    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {
        public final MaybeObserver d;
        public Object e;
        public Throwable f;

        public OtherSubscriber(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Throwable th = this.f;
            MaybeObserver maybeObserver = this.d;
            if (th != null) {
                maybeObserver.onError(th);
                return;
            }
            Object obj = this.e;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Throwable th2 = this.f;
            MaybeObserver maybeObserver = this.d;
            if (th2 == null) {
                maybeObserver.onError(th);
            } else {
                maybeObserver.onError(new CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        this.d.a(new DelayMaybeObserver(maybeObserver));
    }
}
