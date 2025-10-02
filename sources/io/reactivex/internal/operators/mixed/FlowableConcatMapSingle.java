package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
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
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public final Subscriber d;
        public final AtomicLong e = new AtomicLong();
        public final AtomicThrowable f = new AtomicThrowable();
        public final ConcatMapSingleObserver g = new ConcatMapSingleObserver(this);
        public final SpscArrayQueue h = new SpscArrayQueue(0);
        public Subscription i;
        public volatile boolean j;
        public volatile boolean k;
        public long l;
        public int m;
        public Object n;
        public volatile int o;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final ConcatMapSingleSubscriber d;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.d = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.d;
                AtomicThrowable atomicThrowable = concatMapSingleSubscriber.f;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                concatMapSingleSubscriber.i.cancel();
                concatMapSingleSubscriber.o = 0;
                concatMapSingleSubscriber.a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.d;
                concatMapSingleSubscriber.n = obj;
                concatMapSingleSubscriber.o = 2;
                concatMapSingleSubscriber.a();
            }
        }

        public ConcatMapSingleSubscriber(Subscriber subscriber) {
            this.d = subscriber;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        
            r3 = r13.m + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        
            if (r3 != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            r13.m = 0;
            r13.i.request(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        
            r13.m = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        
            io.reactivex.exceptions.Exceptions.b(r3);
            r13.i.cancel();
            r1.clear();
            io.reactivex.internal.util.ExceptionHelper.a(r2, r3);
            r0.onError(io.reactivex.internal.util.ExceptionHelper.b(r2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L8
                goto L91
            L8:
                org.reactivestreams.Subscriber r0 = r13.d
                io.reactivex.internal.queue.SpscArrayQueue r1 = r13.h
                io.reactivex.internal.util.AtomicThrowable r2 = r13.f
                java.util.concurrent.atomic.AtomicLong r3 = r13.e
                r4 = 1
                r5 = r4
            L12:
                boolean r6 = r13.k
                r7 = 0
                if (r6 == 0) goto L1e
                r1.clear()
                r13.n = r7
                goto L8a
            L1e:
                int r6 = r13.o
                r2.get()
                r8 = 0
                if (r6 != 0) goto L6e
                boolean r6 = r13.j
                java.lang.Object r9 = r1.poll()
                if (r9 != 0) goto L30
                r9 = r4
                goto L31
            L30:
                r9 = r8
            L31:
                if (r6 == 0) goto L43
                if (r9 == 0) goto L43
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.b(r2)
                if (r1 != 0) goto L3f
                r0.onComplete()
                return
            L3f:
                r0.onError(r1)
                return
            L43:
                if (r9 == 0) goto L46
                goto L8a
            L46:
                int r3 = r13.m
                int r3 = r3 + r4
                if (r3 != 0) goto L54
                r13.m = r8
                org.reactivestreams.Subscription r3 = r13.i
                long r4 = (long) r8
                r3.request(r4)
                goto L56
            L54:
                r13.m = r3
            L56:
                throw r7     // Catch: java.lang.Throwable -> L57
            L57:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.b(r3)
                org.reactivestreams.Subscription r4 = r13.i
                r4.cancel()
                r1.clear()
                io.reactivex.internal.util.ExceptionHelper.a(r2, r3)
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.b(r2)
                r0.onError(r1)
                return
            L6e:
                r9 = 2
                if (r6 != r9) goto L8a
                long r9 = r13.l
                long r11 = r3.get()
                int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r6 == 0) goto L8a
                java.lang.Object r6 = r13.n
                r13.n = r7
                r0.onNext(r6)
                r6 = 1
                long r9 = r9 + r6
                r13.l = r9
                r13.o = r8
                goto L12
            L8a:
                int r5 = -r5
                int r5 = r13.addAndGet(r5)
                if (r5 != 0) goto L12
            L91:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.a():void");
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.k = true;
            this.i.cancel();
            ConcatMapSingleObserver concatMapSingleObserver = this.g;
            concatMapSingleObserver.getClass();
            DisposableHelper.a(concatMapSingleObserver);
            if (getAndIncrement() == 0) {
                this.h.clear();
                this.n = null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.i, subscription)) {
                this.i = subscription;
                this.d.m(this);
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
            AtomicThrowable atomicThrowable = this.f;
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
            if (this.h.offer(obj)) {
                a();
            } else {
                this.i.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            BackpressureHelper.a(this.e, j);
            a();
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        new ConcatMapSingleSubscriber(flowableSubscriber);
        throw null;
    }
}
