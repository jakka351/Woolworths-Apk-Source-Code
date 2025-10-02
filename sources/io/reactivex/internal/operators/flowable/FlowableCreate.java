package io.reactivex.internal.operators.flowable;

import androidx.constraintlayout.core.state.a;
import androidx.room.RxRoom;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableCreate<T> extends Flowable<T> {
    public final FlowableOnSubscribe e;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24228a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f24228a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24228a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24228a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24228a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {
        public final Subscriber d;
        public final SequentialDisposable e = new SequentialDisposable();

        public BaseEmitter(Subscriber subscriber) {
            this.d = subscriber;
        }

        @Override // io.reactivex.FlowableEmitter
        public final void c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.e(sequentialDisposable, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.e;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            g();
        }

        public final void d() {
            SequentialDisposable sequentialDisposable = this.e;
            if (sequentialDisposable.b()) {
                return;
            }
            try {
                this.d.onComplete();
            } finally {
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
            }
        }

        public final boolean e(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            SequentialDisposable sequentialDisposable = this.e;
            if (sequentialDisposable.b()) {
                return false;
            }
            try {
                this.d.onError(th);
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                return true;
            } catch (Throwable th2) {
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
                throw th2;
            }
        }

        public void f() {
        }

        public void g() {
        }

        public boolean h(Throwable th) {
            return e(th);
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.e.b();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            if (h(th)) {
                return;
            }
            RxJavaPlugins.b(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.f(j)) {
                BackpressureHelper.a(this, j);
                f();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return a.i(getClass().getSimpleName(), "{", super.toString(), "}");
        }
    }

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        public Throwable f;
        public volatile boolean g;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void f() {
            i();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void g() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean h(Throwable th) {
            if (this.g || this.e.b()) {
                return false;
            }
            this.f = th;
            this.g = true;
            i();
            return true;
        }

        public final void i() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            if (!this.g && !this.e.b()) {
                throw null;
            }
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void i() {
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void i() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        public final AtomicReference f;
        public Throwable g;
        public volatile boolean h;
        public final AtomicInteger i;

        public LatestAsyncEmitter(Subscriber subscriber) {
            super(subscriber);
            this.f = new AtomicReference();
            this.i = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void f() {
            i();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void g() {
            if (this.i.getAndIncrement() == 0) {
                this.f.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean h(Throwable th) {
            if (this.h || this.e.b()) {
                return false;
            }
            this.g = th;
            this.h = true;
            i();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r9 != r5) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        
            if (r17.e.b() == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r2.lazySet(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
        
            r5 = r17.h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        
            if (r2.get() != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        
            if (r5 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        
            if (r12 == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        
            r1 = r17.g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
        
            if (r1 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
        
            e(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
        
            d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
        
            if (r9 == 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.e(r17, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
        
            r4 = r17.i.addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i() {
            /*
                r17 = this;
                r0 = r17
                java.util.concurrent.atomic.AtomicInteger r1 = r0.i
                int r1 = r1.getAndIncrement()
                if (r1 == 0) goto Lc
                goto L89
            Lc:
                org.reactivestreams.Subscriber r1 = r0.d
                java.util.concurrent.atomic.AtomicReference r2 = r0.f
                r3 = 1
                r4 = r3
            L12:
                long r5 = r0.get()
                r7 = 0
                r9 = r7
            L19:
                int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r12 = 0
                r13 = 0
                if (r11 == 0) goto L52
                io.reactivex.internal.disposables.SequentialDisposable r14 = r0.e
                boolean r14 = r14.b()
                if (r14 == 0) goto L2b
                r2.lazySet(r13)
                return
            L2b:
                boolean r14 = r0.h
                java.lang.Object r15 = r2.getAndSet(r13)
                if (r15 != 0) goto L36
                r16 = r3
                goto L38
            L36:
                r16 = r12
            L38:
                if (r14 == 0) goto L48
                if (r16 == 0) goto L48
                java.lang.Throwable r1 = r0.g
                if (r1 == 0) goto L44
                r0.e(r1)
                return
            L44:
                r0.d()
                return
            L48:
                if (r16 == 0) goto L4b
                goto L52
            L4b:
                r1.onNext(r15)
                r11 = 1
                long r9 = r9 + r11
                goto L19
            L52:
                if (r11 != 0) goto L79
                io.reactivex.internal.disposables.SequentialDisposable r5 = r0.e
                boolean r5 = r5.b()
                if (r5 == 0) goto L60
                r2.lazySet(r13)
                return
            L60:
                boolean r5 = r0.h
                java.lang.Object r6 = r2.get()
                if (r6 != 0) goto L69
                r12 = r3
            L69:
                if (r5 == 0) goto L79
                if (r12 == 0) goto L79
                java.lang.Throwable r1 = r0.g
                if (r1 == 0) goto L75
                r0.e(r1)
                return
            L75:
                r0.d()
                return
            L79:
                int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r5 == 0) goto L80
                io.reactivex.internal.util.BackpressureHelper.e(r0, r9)
            L80:
                java.util.concurrent.atomic.AtomicInteger r5 = r0.i
                int r4 = -r4
                int r4 = r5.addAndGet(r4)
                if (r4 != 0) goto L12
            L89:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter.i():void");
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            Object obj2 = RxRoom.f3723a;
            if (this.h || this.e.b()) {
                return;
            }
            this.f.set(obj2);
            i();
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            long j;
            if (this.e.b()) {
                return;
            }
            this.d.onNext(RxRoom.f3723a);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        public abstract void i();

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            if (this.e.b()) {
                return;
            }
            if (get() == 0) {
                i();
            } else {
                this.d.onNext(RxRoom.f3723a);
                BackpressureHelper.e(this, 1L);
            }
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        @Override // io.reactivex.FlowableEmitter
        public final void c(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    public FlowableCreate(FlowableOnSubscribe flowableOnSubscribe) {
        this.e = flowableOnSubscribe;
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        LatestAsyncEmitter latestAsyncEmitter = new LatestAsyncEmitter(flowableSubscriber);
        flowableSubscriber.m(latestAsyncEmitter);
        try {
            this.e.a(latestAsyncEmitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            latestAsyncEmitter.onError(th);
        }
    }
}
