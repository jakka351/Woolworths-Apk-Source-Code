package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
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
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public Subscription j;
        public volatile boolean k;
        public final AtomicLong e = new AtomicLong();
        public final CompositeDisposable f = new CompositeDisposable();
        public final AtomicThrowable h = new AtomicThrowable();
        public final AtomicInteger g = new AtomicInteger(1);
        public final AtomicReference i = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return DisposableHelper.c(get());
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapSingleSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        public final void a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.i.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        
            if (r10 != r6) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        
            if (r17.k == false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
        
            if (r17.h.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
        
            r2 = r17.h;
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
        
            r2 = r17.h;
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
        
            if (r10 == 0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.e(r17.e, r10);
            r17.j.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.b():void");
        }

        public final SpscLinkedArrayQueue c() {
            while (true) {
                AtomicReference atomicReference = this.i;
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
            this.k = true;
            this.j.cancel();
            this.f.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.j, subscription)) {
                this.j = subscription;
                this.d.m(this);
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.g.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.g.decrementAndGet();
            AtomicThrowable atomicThrowable = this.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f.dispose();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.j.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this.e, j);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new FlatMapSingleSubscriber(flowableSubscriber));
    }
}
