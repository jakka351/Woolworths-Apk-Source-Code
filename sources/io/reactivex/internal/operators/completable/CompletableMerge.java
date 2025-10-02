package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class CompletableMerge extends Completable {

    public static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        public final CompletableObserver d;
        public Subscription g;
        public final CompositeDisposable f = new CompositeDisposable();
        public final AtomicThrowable e = new AtomicThrowable();

        public final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public MergeInnerObserver() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return DisposableHelper.c(get());
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                CompletableObserver completableObserver = completableMergeSubscriber.d;
                completableMergeSubscriber.f.c(this);
                if (completableMergeSubscriber.decrementAndGet() != 0) {
                    completableMergeSubscriber.g.request(1L);
                    return;
                }
                Throwable th = completableMergeSubscriber.e.get();
                if (th != null) {
                    completableObserver.onError(th);
                } else {
                    completableObserver.onComplete();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                CompletableObserver completableObserver = completableMergeSubscriber.d;
                AtomicThrowable atomicThrowable = completableMergeSubscriber.e;
                CompositeDisposable compositeDisposable = completableMergeSubscriber.f;
                compositeDisposable.c(this);
                completableMergeSubscriber.g.cancel();
                compositeDisposable.dispose();
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                } else if (completableMergeSubscriber.getAndSet(0) > 0) {
                    completableObserver.onError(ExceptionHelper.b(atomicThrowable));
                }
            }
        }

        public CompletableMergeSubscriber(CompletableObserver completableObserver) {
            this.d = completableObserver;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.e;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g.cancel();
            this.f.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.g, subscription)) {
                this.g = subscription;
                this.d.d(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.e;
                Throwable th = atomicThrowable.get();
                CompletableObserver completableObserver = this.d;
                if (th == null) {
                    completableObserver.onComplete();
                } else {
                    atomicThrowable.getClass();
                    completableObserver.onError(ExceptionHelper.b(atomicThrowable));
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f.dispose();
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else if (getAndSet(0) > 0) {
                this.d.onError(ExceptionHelper.b(atomicThrowable));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.f.d(mergeInnerObserver);
            ((CompletableSource) obj).a(mergeInnerObserver);
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new CompletableMergeSubscriber(completableObserver);
        throw null;
    }
}
