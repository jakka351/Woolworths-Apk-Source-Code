package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public final Scheduler.Worker k;
        public long l;
        public long m;
        public Subscription n;
        public UnicastProcessor o;
        public volatile boolean p;
        public final SequentialDisposable q;

        public static final class ConsumerIndexHolder implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public WindowExactBoundedSubscriber(SerializedSubscriber serializedSubscriber) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.q = new SequentialDisposable();
            this.k = null;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
        }

        public final void i() {
            SequentialDisposable sequentialDisposable = this.q;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            Scheduler.Worker worker = this.k;
            if (worker != null) {
                worker.dispose();
            }
        }

        public final void j() {
            MpscLinkedQueue mpscLinkedQueue = this.g;
            SerializedSubscriber serializedSubscriber = this.f;
            UnicastProcessor unicastProcessor = this.o;
            int iF = 1;
            while (!this.p) {
                boolean z = this.i;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.o = null;
                    mpscLinkedQueue.clear();
                    Throwable th = this.j;
                    if (th != null) {
                        unicastProcessor.onError(th);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    i();
                    return;
                }
                if (z2) {
                    iF = f(-iF);
                    if (iF == 0) {
                        return;
                    }
                } else if (z3) {
                    unicastProcessor.onComplete();
                    this.l = 0L;
                    unicastProcessor = new UnicastProcessor(0, null);
                    this.o = unicastProcessor;
                    long jH = h();
                    if (jH == 0) {
                        this.o = null;
                        this.g.clear();
                        this.n.cancel();
                        serializedSubscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                        i();
                        return;
                    }
                    serializedSubscriber.onNext(unicastProcessor);
                    if (jH != Long.MAX_VALUE) {
                        g();
                    }
                } else {
                    unicastProcessor.onNext(objPoll);
                    long j = this.l + 1;
                    if (j >= 0) {
                        this.m++;
                        this.l = 0L;
                        unicastProcessor.onComplete();
                        long jH2 = h();
                        if (jH2 == 0) {
                            this.o = null;
                            this.n.cancel();
                            this.f.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                            i();
                            return;
                        }
                        unicastProcessor = new UnicastProcessor(0, null);
                        this.o = unicastProcessor;
                        this.f.onNext(unicastProcessor);
                        if (jH2 != Long.MAX_VALUE) {
                            g();
                        }
                    } else {
                        this.l = j;
                    }
                }
            }
            this.n.cancel();
            mpscLinkedQueue.clear();
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.n, subscription)) {
                this.n = subscription;
                SerializedSubscriber serializedSubscriber = this.f;
                serializedSubscriber.m(this);
                if (this.h) {
                    return;
                }
                UnicastProcessor unicastProcessor = new UnicastProcessor(0, null);
                this.o = unicastProcessor;
                long jH = h();
                if (jH == 0) {
                    this.h = true;
                    subscription.cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                } else {
                    serializedSubscriber.onNext(unicastProcessor);
                    if (jH == Long.MAX_VALUE) {
                        throw null;
                    }
                    g();
                    throw null;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            if (c()) {
                j();
            }
            this.f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.j = th;
            this.i = true;
            if (c()) {
                j();
            }
            this.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.p) {
                return;
            }
            if (d()) {
                UnicastProcessor unicastProcessor = this.o;
                unicastProcessor.onNext(obj);
                long j = this.l + 1;
                if (j >= 0) {
                    this.m++;
                    this.l = 0L;
                    unicastProcessor.onComplete();
                    long jH = h();
                    if (jH == 0) {
                        this.o = null;
                        this.n.cancel();
                        this.f.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        i();
                        return;
                    }
                    UnicastProcessor unicastProcessor2 = new UnicastProcessor(0, null);
                    this.o = unicastProcessor2;
                    this.f.onNext(unicastProcessor2);
                    if (jH != Long.MAX_VALUE) {
                        g();
                    }
                } else {
                    this.l = j;
                }
                if (f(-1) == 0) {
                    return;
                }
            } else {
                this.g.offer(obj);
                if (!c()) {
                    return;
                }
            }
            j();
        }
    }

    public static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final Object n = new Object();
        public Subscription k;
        public UnicastProcessor l;
        public volatile boolean m;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            r11.l = null;
            r1.clear();
            r0 = r11.j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            r3.onError(r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i() {
            /*
                r11 = this;
                java.lang.Object r0 = io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.n
                io.reactivex.internal.queue.MpscLinkedQueue r1 = r11.g
                io.reactivex.subscribers.SerializedSubscriber r2 = r11.f
                io.reactivex.processors.UnicastProcessor r3 = r11.l
                r4 = 1
            L9:
                boolean r5 = r11.m
                boolean r6 = r11.i
                java.lang.Object r7 = r1.poll()
                r8 = 0
                if (r6 == 0) goto L29
                if (r7 == 0) goto L18
                if (r7 != r0) goto L29
            L18:
                r11.l = r8
                r1.clear()
                java.lang.Throwable r0 = r11.j
                if (r0 == 0) goto L25
                r3.onError(r0)
                goto L28
            L25:
                r3.onComplete()
            L28:
                throw r8
            L29:
                if (r7 != 0) goto L33
                int r4 = -r4
                int r4 = r11.f(r4)
                if (r4 != 0) goto L9
                return
            L33:
                if (r7 != r0) goto L79
                r3.onComplete()
                if (r5 != 0) goto L73
                io.reactivex.processors.UnicastProcessor r3 = new io.reactivex.processors.UnicastProcessor
                r5 = 0
                r3.<init>(r5, r8)
                r11.l = r3
                long r5 = r11.h()
                r9 = 0
                int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r7 == 0) goto L5c
                r2.onNext(r3)
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L9
                r11.g()
                goto L9
            L5c:
                r11.l = r8
                io.reactivex.internal.queue.MpscLinkedQueue r0 = r11.g
                r0.clear()
                org.reactivestreams.Subscription r0 = r11.k
                r0.cancel()
                io.reactivex.exceptions.MissingBackpressureException r0 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r1 = "Could not deliver first window due to lack of requests."
                r0.<init>(r1)
                r2.onError(r0)
                throw r8
            L73:
                org.reactivestreams.Subscription r5 = r11.k
                r5.cancel()
                goto L9
            L79:
                r3.onNext(r7)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber.i():void");
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                this.l = new UnicastProcessor(0, null);
                SerializedSubscriber serializedSubscriber = this.f;
                serializedSubscriber.m(this);
                long jH = h();
                if (jH == 0) {
                    this.h = true;
                    subscription.cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                } else {
                    serializedSubscriber.onNext(this.l);
                    if (jH != Long.MAX_VALUE) {
                        g();
                    }
                    if (!this.h) {
                        throw null;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            if (c()) {
                i();
            }
            this.f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.j = th;
            this.i = true;
            if (c()) {
                i();
            }
            this.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.m) {
                return;
            }
            if (d()) {
                this.l.onNext(obj);
                if (f(-1) == 0) {
                    return;
                }
            } else {
                this.g.offer(obj);
                if (!c()) {
                    return;
                }
            }
            i();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.h) {
                this.m = true;
            }
            this.g.offer(n);
            if (c()) {
                i();
            }
        }
    }

    public static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription, Runnable {
        public Subscription k;
        public volatile boolean l;

        public final class Completion implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public static final class SubjectWork<T> {

            /* renamed from: a, reason: collision with root package name */
            public final UnicastProcessor f24231a;
            public final boolean b;

            public SubjectWork(UnicastProcessor unicastProcessor, boolean z) {
                this.f24231a = unicastProcessor;
                this.b = z;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.h = true;
        }

        public final void i() {
            MpscLinkedQueue mpscLinkedQueue = this.g;
            SerializedSubscriber serializedSubscriber = this.f;
            int iF = 1;
            while (!this.l) {
                boolean z = this.i;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof SubjectWork;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    this.j.getClass();
                    throw null;
                }
                if (z2) {
                    iF = f(-iF);
                    if (iF == 0) {
                        return;
                    }
                } else {
                    if (!z3) {
                        throw null;
                    }
                    if (!((SubjectWork) objPoll).b) {
                        throw null;
                    }
                    if (this.h) {
                        continue;
                    } else {
                        if (h() != 0) {
                            new UnicastProcessor(0, null);
                            throw null;
                        }
                        serializedSubscriber.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                    }
                }
            }
            this.k.cancel();
            mpscLinkedQueue.clear();
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.k, subscription)) {
                this.k = subscription;
                this.f.m(this);
                if (this.h) {
                    return;
                }
                if (h() != 0) {
                    new UnicastProcessor(0, null);
                    throw null;
                }
                subscription.cancel();
                this.f.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.i = true;
            if (c()) {
                i();
            }
            this.f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.j = th;
            this.i = true;
            if (c()) {
                i();
            }
            this.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (d()) {
                throw null;
            }
            this.g.offer(obj);
            if (c()) {
                i();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubjectWork subjectWork = new SubjectWork(new UnicastProcessor(0, null), true);
            if (!this.h) {
                this.g.offer(subjectWork);
            }
            if (c()) {
                i();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new WindowExactBoundedSubscriber(new SerializedSubscriber(flowableSubscriber)));
    }
}
