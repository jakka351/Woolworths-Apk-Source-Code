package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class MaybeTakeUntilPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        public final MaybeObserver d;
        public final TakeUntilOtherMaybeObserver e = new TakeUntilOtherMaybeObserver(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Subscription> implements FlowableSubscriber<U> {
            public final TakeUntilMainMaybeObserver d;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver takeUntilMainMaybeObserver) {
                this.d = takeUntilMainMaybeObserver;
            }

            @Override // org.reactivestreams.Subscriber
            public final void m(Subscription subscription) {
                SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.d;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.d.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.d;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.d.onError(th);
                } else {
                    RxJavaPlugins.b(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = this.d;
                takeUntilMainMaybeObserver.getClass();
                if (DisposableHelper.a(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.d.onComplete();
                }
            }
        }

        public TakeUntilMainMaybeObserver(MaybeObserver maybeObserver) {
            this.d = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            SubscriptionHelper.a(this.e);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            SubscriptionHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onError(th);
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            SubscriptionHelper.a(this.e);
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.d.onSuccess(obj);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void c(MaybeObserver maybeObserver) {
        maybeObserver.d(new TakeUntilMainMaybeObserver(maybeObserver));
        throw null;
    }
}
