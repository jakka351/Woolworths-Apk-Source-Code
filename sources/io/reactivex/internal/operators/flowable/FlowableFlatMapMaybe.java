package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function f;
    public final int g;

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final int e;
        public final Function j;
        public Subscription l;
        public volatile boolean m;
        public final AtomicLong f = new AtomicLong();
        public final CompositeDisposable g = new CompositeDisposable();
        public final AtomicThrowable i = new AtomicThrowable();
        public final AtomicInteger h = new AtomicInteger(1);
        public final AtomicReference k = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            public InnerObserver() {
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
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                int i = flatMapMaybeSubscriber.e;
                Subscriber subscriber = flatMapMaybeSubscriber.d;
                AtomicInteger atomicInteger = flatMapMaybeSubscriber.h;
                flatMapMaybeSubscriber.g.c(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapMaybeSubscriber.k.get();
                        if (!z || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                            if (i != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.l.request(1L);
                            }
                            if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeSubscriber.b();
                            return;
                        }
                        AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.i;
                        atomicThrowable.getClass();
                        Throwable thB = ExceptionHelper.b(atomicThrowable);
                        if (thB != null) {
                            subscriber.onError(thB);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.l.request(1L);
                }
                if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                    flatMapMaybeSubscriber.b();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                CompositeDisposable compositeDisposable = flatMapMaybeSubscriber.g;
                compositeDisposable.c(this);
                AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.i;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                flatMapMaybeSubscriber.l.cancel();
                compositeDisposable.dispose();
                flatMapMaybeSubscriber.h.decrementAndGet();
                if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                    flatMapMaybeSubscriber.b();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
            @Override // io.reactivex.MaybeObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onSuccess(java.lang.Object r7) {
                /*
                    r6 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber r0 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.this
                    io.reactivex.disposables.CompositeDisposable r1 = r0.g
                    r1.c(r6)
                    int r1 = r0.get()
                    if (r1 != 0) goto L7f
                    r1 = 0
                    r2 = 1
                    boolean r3 = r0.compareAndSet(r1, r2)
                    if (r3 == 0) goto L7f
                    java.util.concurrent.atomic.AtomicInteger r3 = r0.h
                    int r3 = r3.decrementAndGet()
                    if (r3 != 0) goto L1e
                    r1 = r2
                L1e:
                    java.util.concurrent.atomic.AtomicLong r2 = r0.f
                    long r2 = r2.get()
                    r4 = 0
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r2 == 0) goto L6c
                    org.reactivestreams.Subscriber r2 = r0.d
                    r2.onNext(r7)
                    java.util.concurrent.atomic.AtomicReference r7 = r0.k
                    java.lang.Object r7 = r7.get()
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r7 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r7
                    if (r1 == 0) goto L58
                    if (r7 == 0) goto L41
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L58
                L41:
                    io.reactivex.internal.util.AtomicThrowable r7 = r0.i
                    r7.getClass()
                    java.lang.Throwable r7 = io.reactivex.internal.util.ExceptionHelper.b(r7)
                    if (r7 == 0) goto L52
                    org.reactivestreams.Subscriber r0 = r0.d
                    r0.onError(r7)
                    return
                L52:
                    org.reactivestreams.Subscriber r7 = r0.d
                    r7.onComplete()
                    return
                L58:
                    java.util.concurrent.atomic.AtomicLong r7 = r0.f
                    r1 = 1
                    io.reactivex.internal.util.BackpressureHelper.e(r7, r1)
                    int r7 = r0.e
                    r3 = 2147483647(0x7fffffff, float:NaN)
                    if (r7 == r3) goto L75
                    org.reactivestreams.Subscription r7 = r0.l
                    r7.request(r1)
                    goto L75
                L6c:
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r0.c()
                    monitor-enter(r1)
                    r1.offer(r7)     // Catch: java.lang.Throwable -> L7c
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L7c
                L75:
                    int r7 = r0.decrementAndGet()
                    if (r7 != 0) goto L94
                    goto L93
                L7c:
                    r7 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L7c
                    throw r7
                L7f:
                    io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r0.c()
                    monitor-enter(r1)
                    r1.offer(r7)     // Catch: java.lang.Throwable -> L98
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
                    java.util.concurrent.atomic.AtomicInteger r7 = r0.h
                    r7.decrementAndGet()
                    int r7 = r0.getAndIncrement()
                    if (r7 == 0) goto L94
                L93:
                    return
                L94:
                    r0.b()
                    return
                L98:
                    r7 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L98
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.onSuccess(java.lang.Object):void");
            }
        }

        public FlatMapMaybeSubscriber(Subscriber subscriber, Function function, int i) {
            this.d = subscriber;
            this.j = function;
            this.e = i;
        }

        public final void a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.k.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        
            if (r10 != r6) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        
            if (r17.m == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
        
            if (r17.i.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
        
            r2 = r17.i;
            r2.getClass();
            r2 = io.reactivex.internal.util.ExceptionHelper.b(r2);
            a();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        
            if (r2.get() != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        
            r7 = (io.reactivex.internal.queue.SpscLinkedArrayQueue) r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
        
            if (r7 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
        
            if (r7.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
        
            if (r6 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
        
            if (r13 == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
        
            r2 = r17.i;
            r2.getClass();
            r2 = io.reactivex.internal.util.ExceptionHelper.b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        
            if (r2 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
        
            if (r10 == 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.e(r17.f, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        
            if (r17.e == Integer.MAX_VALUE) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
        
            r17.l.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.b():void");
        }

        public final SpscLinkedArrayQueue c() {
            while (true) {
                AtomicReference atomicReference = this.k;
                SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                if (spscLinkedArrayQueue != null) {
                    return spscLinkedArrayQueue;
                }
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.d);
                while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return spscLinkedArrayQueue2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.m = true;
            this.l.cancel();
            this.g.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.l, subscription)) {
                this.l = subscription;
                this.d.m(this);
                int i = this.e;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.h.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.h.decrementAndGet();
            AtomicThrowable atomicThrowable = this.i;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g.dispose();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                Object objMo0apply = this.j.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) objMo0apply;
                this.h.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.m || !this.g.d(innerObserver)) {
                    return;
                }
                maybeSource.a(innerObserver);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.l.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.f, j);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    public FlowableFlatMapMaybe(FlowableObserveOn flowableObserveOn, Function function) {
        super(flowableObserveOn);
        this.f = function;
        this.g = Integer.MAX_VALUE;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new FlatMapMaybeSubscriber(flowableSubscriber, this.f, this.g));
    }
}
