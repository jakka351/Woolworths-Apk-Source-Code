package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
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
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {
        public volatile boolean d;
        public volatile SimpleQueue e;
        public long f;
        public int g;

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
            if (SubscriptionHelper.e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iL = queueSubscription.l(7);
                    if (iL == 1) {
                        this.g = iL;
                        this.e = queueSubscription;
                        this.d = true;
                        throw null;
                    }
                    if (iL == 2) {
                        this.g = iL;
                        this.e = queueSubscription;
                    }
                }
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.d = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            lazySet(SubscriptionHelper.d);
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g == 2) {
                throw null;
            }
            throw null;
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final InnerSubscriber[] m = new InnerSubscriber[0];
        public static final InnerSubscriber[] n = new InnerSubscriber[0];
        public final Subscriber d;
        public volatile boolean e;
        public final AtomicThrowable f = new AtomicThrowable();
        public volatile boolean g;
        public final AtomicReference h;
        public final AtomicLong i;
        public Subscription j;
        public long k;
        public int l;

        public MergeSubscriber(Subscriber subscriber) {
            AtomicReference atomicReference = new AtomicReference();
            this.h = atomicReference;
            this.i = new AtomicLong();
            this.d = subscriber;
            Math.max(1, 0);
            atomicReference.lazySet(m);
        }

        public final boolean a() {
            if (!this.g) {
                if (this.f.get() == null) {
                    return false;
                }
                AtomicThrowable atomicThrowable = this.f;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != ExceptionHelper.f24240a) {
                    this.d.onError(thB);
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
        
            if (r13 == 0) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
        
            if (r10 != false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00ff, code lost:
        
            r9 = r7;
            r5 = r27.i.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0108, code lost:
        
            r9 = r7;
            r5 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
        
            if (r8.g == 1) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
        
            r15 = r5;
            r5 = r8.f + r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x011b, code lost:
        
            if (r5 < 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
        
            r8.f = 0;
            r8.get().request(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
        
            r8.f = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x012e, code lost:
        
            r15 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x012f, code lost:
        
            r5 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0131, code lost:
        
            r9 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
        
            if (r5 == 0) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
        
            if (r20 != null) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
        
            r7 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                Method dump skipped, instructions count: 409
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.b():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(InnerSubscriber innerSubscriber) {
            InnerSubscriber[] innerSubscriberArr;
            while (true) {
                AtomicReference atomicReference = this.h;
                InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr2[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = m;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i);
                    System.arraycopy(innerSubscriberArr2, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            InnerSubscriber[] innerSubscriberArr;
            if (this.g) {
                return;
            }
            this.g = true;
            this.j.cancel();
            AtomicReference atomicReference = this.h;
            InnerSubscriber[] innerSubscriberArr2 = (InnerSubscriber[]) atomicReference.get();
            InnerSubscriber[] innerSubscriberArr3 = n;
            if (innerSubscriberArr2 != innerSubscriberArr3 && (innerSubscriberArr = (InnerSubscriber[]) atomicReference.getAndSet(innerSubscriberArr3)) != innerSubscriberArr3) {
                for (InnerSubscriber innerSubscriber : innerSubscriberArr) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.a(innerSubscriber);
                }
                AtomicThrowable atomicThrowable = this.f;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null && thB != ExceptionHelper.f24240a) {
                    RxJavaPlugins.b(thB);
                }
            }
            getAndIncrement();
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.l(this.j, subscription)) {
                this.j = subscription;
                this.d.m(this);
                if (this.g) {
                    return;
                }
                subscription.request(0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.f;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            for (InnerSubscriber innerSubscriber : (InnerSubscriber[]) this.h.getAndSet(n)) {
                innerSubscriber.getClass();
                SubscriptionHelper.a(innerSubscriber);
            }
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
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
                BackpressureHelper.a(this.i, j);
                b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        Flowable flowable = this.e;
        if (FlowableScalarXMap.a(flowable, flowableSubscriber)) {
            return;
        }
        flowable.a(new MergeSubscriber(flowableSubscriber));
    }
}
