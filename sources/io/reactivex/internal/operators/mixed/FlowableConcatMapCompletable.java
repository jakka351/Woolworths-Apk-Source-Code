package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final ConcatMapInnerObserver f = new ConcatMapInnerObserver(this);
        public final SpscArrayQueue g = new SpscArrayQueue(0);
        public Subscription h;
        public volatile boolean i;
        public volatile boolean j;
        public volatile boolean k;
        public int l;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final ConcatMapCompletableObserver d;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.d = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.d;
                concatMapCompletableObserver.i = false;
                concatMapCompletableObserver.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.d;
                AtomicThrowable atomicThrowable = concatMapCompletableObserver.e;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                } else {
                    concatMapCompletableObserver.i = false;
                    concatMapCompletableObserver.a();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.k) {
                if (!this.i) {
                    boolean z = this.j;
                    boolean z2 = this.g.poll() == null;
                    if (z && z2) {
                        AtomicThrowable atomicThrowable = this.e;
                        atomicThrowable.getClass();
                        Throwable thB = ExceptionHelper.b(atomicThrowable);
                        if (thB != null) {
                            this.d.onError(thB);
                            return;
                        } else {
                            this.d.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        int i = this.l + 1;
                        if (i == 0) {
                            this.l = 0;
                            this.h.request(0);
                        } else {
                            this.l = i;
                        }
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            this.g.clear();
                            this.h.cancel();
                            AtomicThrowable atomicThrowable2 = this.e;
                            atomicThrowable2.getClass();
                            ExceptionHelper.a(atomicThrowable2, th);
                            AtomicThrowable atomicThrowable3 = this.e;
                            atomicThrowable3.getClass();
                            this.d.onError(ExceptionHelper.b(atomicThrowable3));
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.g.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.k = true;
            this.h.cancel();
            ConcatMapInnerObserver concatMapInnerObserver = this.f;
            concatMapInnerObserver.getClass();
            DisposableHelper.a(concatMapInnerObserver);
            if (getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.h, subscription)) {
                this.h = subscription;
                this.d.d(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.j = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.j = true;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g.offer(obj)) {
                a();
            } else {
                this.h.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
