package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {
        public static final SwitchMapInnerObserver i = new SwitchMapInnerObserver(null);
        public final CompletableObserver d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicReference f = new AtomicReference();
        public volatile boolean g;
        public Subscription h;

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final SwitchMapCompletableObserver d;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.d = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.d;
                AtomicReference atomicReference = switchMapCompletableObserver.f;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (switchMapCompletableObserver.g) {
                    AtomicThrowable atomicThrowable = switchMapCompletableObserver.e;
                    atomicThrowable.getClass();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (thB == null) {
                        switchMapCompletableObserver.d.onComplete();
                    } else {
                        switchMapCompletableObserver.d.onError(thB);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.d;
                AtomicReference atomicReference = switchMapCompletableObserver.f;
                AtomicThrowable atomicThrowable = switchMapCompletableObserver.e;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        atomicThrowable.getClass();
                        if (ExceptionHelper.a(atomicThrowable, th)) {
                            switchMapCompletableObserver.dispose();
                            atomicThrowable.getClass();
                            Throwable thB = ExceptionHelper.b(atomicThrowable);
                            if (thB != ExceptionHelper.f24240a) {
                                switchMapCompletableObserver.d.onError(thB);
                                return;
                            }
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.b(th);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.get() == i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.h.cancel();
            AtomicReference atomicReference = this.f;
            SwitchMapInnerObserver switchMapInnerObserver = i;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.a(switchMapInnerObserver2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                this.d.d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.g = true;
            if (this.f.get() == null) {
                AtomicThrowable atomicThrowable = this.e;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB == null) {
                    this.d.onComplete();
                } else {
                    this.d.onError(thB);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            AtomicReference atomicReference = this.f;
            SwitchMapInnerObserver switchMapInnerObserver = i;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                DisposableHelper.a(switchMapInnerObserver2);
            }
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != ExceptionHelper.f24240a) {
                this.d.onError(thB);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.h.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new SwitchMapCompletableObserver(completableObserver);
        throw null;
    }
}
