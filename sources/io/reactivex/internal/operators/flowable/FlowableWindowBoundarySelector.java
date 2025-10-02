package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {
        public boolean e;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            throw null;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            dispose();
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {
        public final WindowBoundaryMainSubscriber e;

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber windowBoundaryMainSubscriber) {
            this.e = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            windowBoundaryMainSubscriber.l.cancel();
            windowBoundaryMainSubscriber.k.dispose();
            DisposableHelper.a(windowBoundaryMainSubscriber.m);
            windowBoundaryMainSubscriber.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = this.e;
            windowBoundaryMainSubscriber.g.offer(new WindowOperation(null, obj));
            if (windowBoundaryMainSubscriber.c()) {
                windowBoundaryMainSubscriber.i();
            }
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {
        public final CompositeDisposable k;
        public Subscription l;
        public final AtomicReference m;
        public final ArrayList n;
        public final AtomicLong o;
        public final AtomicBoolean p;

        public WindowBoundaryMainSubscriber(SerializedSubscriber serializedSubscriber) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.m = new AtomicReference();
            AtomicLong atomicLong = new AtomicLong();
            this.o = atomicLong;
            this.p = new AtomicBoolean();
            this.k = new CompositeDisposable();
            this.n = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.p.compareAndSet(false, true)) {
                DisposableHelper.a(this.m);
                if (this.o.decrementAndGet() == 0) {
                    this.l.cancel();
                }
            }
        }

        public final void i() {
            MpscLinkedQueue mpscLinkedQueue = this.g;
            SerializedSubscriber serializedSubscriber = this.f;
            ArrayList arrayList = this.n;
            int iF = 1;
            while (true) {
                boolean z = this.i;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    this.k.dispose();
                    DisposableHelper.a(this.m);
                    Throwable th = this.j;
                    if (th != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((UnicastProcessor) it.next()).onError(th);
                        }
                    } else {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastProcessor) it2.next()).onComplete();
                        }
                    }
                    arrayList.clear();
                    return;
                }
                if (z2) {
                    iF = f(-iF);
                    if (iF == 0) {
                        return;
                    }
                } else if (objPoll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) objPoll;
                    UnicastProcessor unicastProcessor = windowOperation.f24230a;
                    if (unicastProcessor != null) {
                        if (arrayList.remove(unicastProcessor)) {
                            windowOperation.f24230a.onComplete();
                            if (this.o.decrementAndGet() == 0) {
                                this.k.dispose();
                                DisposableHelper.a(this.m);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.p.get()) {
                        UnicastProcessor unicastProcessor2 = new UnicastProcessor(0, null);
                        long jH = h();
                        if (jH != 0) {
                            arrayList.add(unicastProcessor2);
                            serializedSubscriber.onNext(unicastProcessor2);
                            if (jH != Long.MAX_VALUE) {
                                g();
                            }
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                cancel();
                                serializedSubscriber.onError(th2);
                            }
                        } else {
                            cancel();
                            serializedSubscriber.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastProcessor) it3.next()).onNext(objPoll);
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            AtomicReference atomicReference;
            if (SubscriptionHelper.l(this.l, subscription)) {
                this.l = subscription;
                this.f.m(this);
                if (this.p.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                do {
                    atomicReference = this.m;
                    if (atomicReference.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                        subscription.request(Long.MAX_VALUE);
                        throw null;
                    }
                } while (atomicReference.get() == null);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            if (c()) {
                i();
            }
            if (this.o.decrementAndGet() == 0) {
                this.k.dispose();
            }
            this.f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.b(th);
                return;
            }
            this.j = th;
            this.i = true;
            if (c()) {
                i();
            }
            if (this.o.decrementAndGet() == 0) {
                this.k.dispose();
            }
            this.f.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.i) {
                return;
            }
            if (d()) {
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    ((UnicastProcessor) it.next()).onNext(obj);
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
            i();
        }
    }

    public static final class WindowOperation<T, B> {

        /* renamed from: a, reason: collision with root package name */
        public final UnicastProcessor f24230a;
        public final Object b;

        public WindowOperation(UnicastProcessor unicastProcessor, Object obj) {
            this.f24230a = unicastProcessor;
            this.b = obj;
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        this.e.a(new WindowBoundaryMainSubscriber(new SerializedSubscriber(flowableSubscriber)));
    }
}
