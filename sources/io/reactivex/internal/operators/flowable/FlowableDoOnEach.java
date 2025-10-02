package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class FlowableDoOnEach<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoOnEachConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {
        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.g) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = true;
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.h != 0) {
                this.d.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.internal.fuseable.SimpleQueue
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object poll() {
            /*
                r4 = this;
                r0 = 0
                io.reactivex.internal.fuseable.QueueSubscription r1 = r4.f     // Catch: java.lang.Throwable -> L22
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L22
                if (r1 != 0) goto L10
                int r2 = r4.h
                r3 = 1
                if (r2 == r3) goto Lf
                return r1
            Lf:
                throw r0
            L10:
                throw r0     // Catch: java.lang.Throwable -> L11
            L11:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.b(r1)     // Catch: java.lang.Throwable -> L21
                throw r0     // Catch: java.lang.Throwable -> L16
            L16:
                r2 = move-exception
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L21
                java.lang.Throwable[] r1 = new java.lang.Throwable[]{r1, r2}     // Catch: java.lang.Throwable -> L21
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L21
                throw r3     // Catch: java.lang.Throwable -> L21
            L21:
                throw r0
            L22:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.b(r1)
                throw r0     // Catch: java.lang.Throwable -> L27
            L27:
                r0 = move-exception
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r0 = new java.lang.Throwable[]{r1, r0}
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachConditionalSubscriber.poll():java.lang.Object");
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean q(Object obj) {
            if (this.g) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
                return false;
            }
        }
    }

    public static final class DoOnEachSubscriber<T> extends BasicFuseableSubscriber<T, T> {
        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.g) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = true;
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    Exceptions.b(th2);
                    RxJavaPlugins.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.h != 0) {
                this.d.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                a(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.internal.fuseable.SimpleQueue
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object poll() {
            /*
                r4 = this;
                r0 = 0
                io.reactivex.internal.fuseable.QueueSubscription r1 = r4.f     // Catch: java.lang.Throwable -> L22
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L22
                if (r1 != 0) goto L10
                int r2 = r4.h
                r3 = 1
                if (r2 == r3) goto Lf
                return r1
            Lf:
                throw r0
            L10:
                throw r0     // Catch: java.lang.Throwable -> L11
            L11:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.b(r1)     // Catch: java.lang.Throwable -> L21
                throw r0     // Catch: java.lang.Throwable -> L16
            L16:
                r2 = move-exception
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L21
                java.lang.Throwable[] r1 = new java.lang.Throwable[]{r1, r2}     // Catch: java.lang.Throwable -> L21
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L21
                throw r3     // Catch: java.lang.Throwable -> L21
            L21:
                throw r0
            L22:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.b(r1)
                throw r0     // Catch: java.lang.Throwable -> L27
            L27:
                r0 = move-exception
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r0 = new java.lang.Throwable[]{r1, r0}
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachSubscriber.poll():java.lang.Object");
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        boolean z = flowableSubscriber instanceof ConditionalSubscriber;
        Flowable flowable = this.e;
        if (z) {
            flowable.a(new DoOnEachConditionalSubscriber((ConditionalSubscriber) flowableSubscriber));
        } else {
            flowable.a(new DoOnEachSubscriber(flowableSubscriber));
        }
    }
}
