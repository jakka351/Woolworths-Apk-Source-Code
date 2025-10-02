package io.reactivex.internal.operators.flowable;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public volatile boolean i;
        public volatile boolean k;
        public long m;
        public final SpscLinkedArrayQueue j = new SpscLinkedArrayQueue(Flowable.d);
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicLong f = new AtomicLong();
        public final AtomicReference g = new AtomicReference();
        public LinkedHashMap l = new LinkedHashMap();
        public final AtomicThrowable h = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<Subscription> implements FlowableSubscriber<Open>, Disposable {
            public final BufferBoundarySubscriber d;

            public BufferOpenSubscriber(BufferBoundarySubscriber bufferBoundarySubscriber) {
                this.d = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return get() == SubscriptionHelper.d;
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                SubscriptionHelper.a(this);
            }

            @Override // org.reactivestreams.Subscriber
            public final void m(Subscription subscription) {
                SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                lazySet(SubscriptionHelper.d);
                BufferBoundarySubscriber bufferBoundarySubscriber = this.d;
                bufferBoundarySubscriber.e.c(this);
                if (bufferBoundarySubscriber.e.g() == 0) {
                    SubscriptionHelper.a(bufferBoundarySubscriber.g);
                    bufferBoundarySubscriber.i = true;
                    bufferBoundarySubscriber.b();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th) {
                lazySet(SubscriptionHelper.d);
                BufferBoundarySubscriber bufferBoundarySubscriber = this.d;
                SubscriptionHelper.a(bufferBoundarySubscriber.g);
                bufferBoundarySubscriber.e.c(this);
                bufferBoundarySubscriber.onError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Object obj) {
                BufferBoundarySubscriber bufferBoundarySubscriber = this.d;
                bufferBoundarySubscriber.getClass();
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    SubscriptionHelper.a(bufferBoundarySubscriber.g);
                    bufferBoundarySubscriber.onError(th);
                }
            }
        }

        public BufferBoundarySubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a(BufferCloseSubscriber bufferCloseSubscriber, long j) {
            boolean z;
            this.e.c(bufferCloseSubscriber);
            if (this.e.g() == 0) {
                SubscriptionHelper.a(this.g);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.j.offer(linkedHashMap.remove(Long.valueOf(j)));
                    if (z) {
                        this.i = true;
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j = this.m;
            Subscriber subscriber = this.d;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.j;
            int iAddAndGet = 1;
            do {
                long j2 = this.f.get();
                while (j != j2) {
                    if (this.k) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.i;
                    if (z && this.h.get() != null) {
                        spscLinkedArrayQueue.clear();
                        AtomicThrowable atomicThrowable = this.h;
                        a.o(atomicThrowable, atomicThrowable, subscriber);
                        return;
                    }
                    Collection collection = (Collection) spscLinkedArrayQueue.poll();
                    boolean z2 = collection == null;
                    if (z && z2) {
                        subscriber.onComplete();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(collection);
                        j++;
                    }
                }
                if (j == j2) {
                    if (this.k) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.i) {
                        if (this.h.get() != null) {
                            spscLinkedArrayQueue.clear();
                            AtomicThrowable atomicThrowable2 = this.h;
                            a.o(atomicThrowable2, atomicThrowable2, subscriber);
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                this.m = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (SubscriptionHelper.a(this.g)) {
                this.k = true;
                this.e.dispose();
                synchronized (this) {
                    this.l = null;
                }
                if (getAndIncrement() != 0) {
                    this.j.clear();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this.g, subscription)) {
                this.e.d(new BufferOpenSubscriber(this));
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.j.offer((Collection) it.next());
                    }
                    this.l = null;
                    this.i = true;
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e.dispose();
            synchronized (this) {
                this.l = null;
            }
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.f, j);
            b();
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(subscriptionHelper);
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.d;
            if (subscription == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            subscription.cancel();
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(flowableSubscriber);
        flowableSubscriber.m(bufferBoundarySubscriber);
        this.e.a(bufferBoundarySubscriber);
    }
}
