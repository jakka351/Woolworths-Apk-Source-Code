package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class CompletableConcat extends Completable {

    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        public final CompletableObserver d;
        public int h;
        public int i;
        public SimpleQueue j;
        public Subscription k;
        public volatile boolean l;
        public volatile boolean m;
        public final ConcatInnerObserver f = new ConcatInnerObserver(this);
        public final AtomicBoolean g = new AtomicBoolean();
        public final int e = 0;

        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final CompletableConcatSubscriber d;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.d = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                CompletableConcatSubscriber completableConcatSubscriber = this.d;
                completableConcatSubscriber.m = false;
                completableConcatSubscriber.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                CompletableConcatSubscriber completableConcatSubscriber = this.d;
                if (!completableConcatSubscriber.g.compareAndSet(false, true)) {
                    RxJavaPlugins.b(th);
                } else {
                    completableConcatSubscriber.k.cancel();
                    completableConcatSubscriber.d.onError(th);
                }
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!b()) {
                if (!this.m) {
                    boolean z = this.l;
                    try {
                        CompletableSource completableSource = (CompletableSource) this.j.poll();
                        boolean z2 = completableSource == null;
                        if (z && z2) {
                            if (this.g.compareAndSet(false, true)) {
                                this.d.onComplete();
                                return;
                            }
                            return;
                        } else if (!z2) {
                            this.m = true;
                            completableSource.a(this.f);
                            if (this.h != 1) {
                                int i = this.i + 1;
                                if (i == this.e) {
                                    this.i = 0;
                                    this.k.request(i);
                                } else {
                                    this.i = i;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        if (!this.g.compareAndSet(false, true)) {
                            RxJavaPlugins.b(th);
                            return;
                        } else {
                            this.k.cancel();
                            this.d.onError(th);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(this.f.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.k.cancel();
            DisposableHelper.a(this.f);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                long j = 0;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(3);
                    if (iL == 1) {
                        this.h = iL;
                        this.j = queueSubscription;
                        this.l = true;
                        this.d.d(this);
                        a();
                        return;
                    }
                    if (iL == 2) {
                        this.h = iL;
                        this.j = queueSubscription;
                        this.d.d(this);
                        subscription.request(j);
                        return;
                    }
                }
                this.j = new SpscArrayQueue(0);
                this.d.d(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.l = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (!this.g.compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                DisposableHelper.a(this.f);
                this.d.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.h != 0 || this.j.offer(completableSource)) {
                a();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new CompletableConcatSubscriber(completableObserver);
        throw null;
    }
}
