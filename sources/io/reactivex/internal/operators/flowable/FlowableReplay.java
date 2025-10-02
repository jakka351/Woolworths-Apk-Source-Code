package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    public static final Callable e = null;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        public Node d;
        public int e;
        public long f;

        public Object a(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void b(Object obj) {
            Object objA = a(obj);
            long j = this.f + 1;
            this.f = j;
            Node node = new Node(objA, j);
            this.d.set(node);
            this.d = node;
            this.e++;
            f();
        }

        public Node c() {
            return get();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            Object objA = a(NotificationLite.d);
            long j = this.f + 1;
            this.f = j;
            Node node = new Node(objA, j);
            this.d.set(node);
            this.d = node;
            this.e++;
            h();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void d(Throwable th) {
            Object objA = a(NotificationLite.e(th));
            long j = this.f + 1;
            this.f = j;
            Node node = new Node(objA, j);
            this.d.set(node);
            this.d = node;
            this.e++;
            h();
        }

        public Object e(Object obj) {
            return obj;
        }

        public void f() {
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void g(InnerSubscription innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.h) {
                        innerSubscription.i = true;
                        return;
                    }
                    innerSubscription.h = true;
                    while (!innerSubscription.b()) {
                        long j = innerSubscription.get();
                        boolean z = j == Long.MAX_VALUE;
                        Node nodeC = (Node) innerSubscription.f;
                        if (nodeC == null) {
                            nodeC = c();
                            innerSubscription.f = nodeC;
                            BackpressureHelper.a(innerSubscription.g, nodeC.e);
                        }
                        long j2 = 0;
                        while (j != 0 && (node = nodeC.get()) != null) {
                            Object objE = e(node.d);
                            try {
                                if (NotificationLite.b(objE, innerSubscription.e)) {
                                    innerSubscription.f = null;
                                    return;
                                }
                                j2++;
                                j--;
                                if (innerSubscription.b()) {
                                    innerSubscription.f = null;
                                    return;
                                }
                                nodeC = node;
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                innerSubscription.f = null;
                                innerSubscription.dispose();
                                if (NotificationLite.m(objE) || NotificationLite.l(objE)) {
                                    return;
                                }
                                innerSubscription.e.onError(th);
                                return;
                            }
                        }
                        if (j2 != 0) {
                            innerSubscription.f = nodeC;
                            if (!z) {
                                BackpressureHelper.f(innerSubscription, j2);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.i) {
                                    innerSubscription.h = false;
                                    return;
                                }
                                innerSubscription.i = false;
                            } finally {
                            }
                        }
                    }
                    innerSubscription.f = null;
                } finally {
                }
            }
        }

        public void h() {
            Node node = get();
            if (node.d != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    public static final class ConnectableFlowableReplay<T> extends ConnectableFlowable<T> {
        @Override // io.reactivex.Flowable
        public final void c(FlowableSubscriber flowableSubscriber) {
            throw null;
        }
    }

    public static final class DefaultUnboundedFactory implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements Subscription, Disposable {
        public final ReplaySubscriber d;
        public final Subscriber e;
        public Serializable f;
        public final AtomicLong g = new AtomicLong();
        public boolean h;
        public boolean i;

        public InnerSubscription(ReplaySubscriber replaySubscriber, Subscriber subscriber) {
            this.d = replaySubscriber;
            this.e = subscriber;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            InnerSubscription[] innerSubscriptionArr;
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                ReplaySubscriber replaySubscriber = this.d;
                AtomicReference atomicReference = replaySubscriber.f;
                loop0: while (true) {
                    InnerSubscription[] innerSubscriptionArr2 = (InnerSubscription[]) atomicReference.get();
                    int length = innerSubscriptionArr2.length;
                    if (length != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                i = -1;
                                break;
                            } else if (innerSubscriptionArr2[i].equals(this)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i < 0) {
                            break;
                        }
                        if (length == 1) {
                            innerSubscriptionArr = ReplaySubscriber.j;
                        } else {
                            InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                            System.arraycopy(innerSubscriptionArr2, 0, innerSubscriptionArr3, 0, i);
                            System.arraycopy(innerSubscriptionArr2, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                            innerSubscriptionArr = innerSubscriptionArr3;
                        }
                        while (!atomicReference.compareAndSet(innerSubscriptionArr2, innerSubscriptionArr)) {
                            if (atomicReference.get() != innerSubscriptionArr2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                replaySubscriber.a();
                this.f = null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!SubscriptionHelper.f(j) || BackpressureHelper.b(this, j) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.a(this.g, j);
            ReplaySubscriber replaySubscriber = this.d;
            replaySubscriber.a();
            replaySubscriber.d.g(this);
        }
    }

    public static final class MulticastFlowable<R, U> extends Flowable<R> {

        public final class DisposableConsumer implements Consumer<Disposable> {
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                throw null;
            }
        }

        @Override // io.reactivex.Flowable
        public final void c(FlowableSubscriber flowableSubscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                EmptySubscription.b(th, flowableSubscriber);
            }
        }
    }

    public static final class Node extends AtomicReference<Node> {
        public final Object d;
        public final long e;

        public Node(Object obj, long j) {
            this.d = obj;
            this.e = j;
        }
    }

    public interface ReplayBuffer<T> {
        void b(Object obj);

        void complete();

        void d(Throwable th);

        void g(InnerSubscription innerSubscription);
    }

    public static final class ReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class ReplayPublisher<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        public final void e(Subscriber subscriber) {
            throw null;
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {
        public static final InnerSubscription[] j = new InnerSubscription[0];
        public static final InnerSubscription[] k = new InnerSubscription[0];
        public final ReplayBuffer d;
        public boolean e;
        public long h;
        public long i;
        public final AtomicInteger g = new AtomicInteger();
        public final AtomicReference f = new AtomicReference(j);

        public ReplaySubscriber(ReplayBuffer replayBuffer) {
            this.d = replayBuffer;
            new AtomicBoolean();
        }

        public final void a() {
            AtomicInteger atomicInteger = this.g;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!b()) {
                InnerSubscription[] innerSubscriptionArr = (InnerSubscription[]) this.f.get();
                long j2 = this.h;
                long jMax = j2;
                for (InnerSubscription innerSubscription : innerSubscriptionArr) {
                    jMax = Math.max(jMax, innerSubscription.g.get());
                }
                long j3 = this.i;
                Subscription subscription = get();
                long j4 = jMax - j2;
                if (j4 != 0) {
                    this.h = jMax;
                    if (subscription == null) {
                        long j5 = j3 + j4;
                        if (j5 < 0) {
                            j5 = Long.MAX_VALUE;
                        }
                        this.i = j5;
                    } else if (j3 != 0) {
                        this.i = 0L;
                        subscription.request(j3 + j4);
                    } else {
                        subscription.request(j4);
                    }
                } else if (j3 != 0 && subscription != null) {
                    this.i = 0L;
                    subscription.request(j3);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.get() == k;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f.set(k);
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            if (SubscriptionHelper.e(this, subscription)) {
                a();
                for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f.get()) {
                    this.d.g(innerSubscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.complete();
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f.getAndSet(k)) {
                replayBuffer.g(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e = true;
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.d(th);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f.getAndSet(k)) {
                replayBuffer.g(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            ReplayBuffer replayBuffer = this.d;
            replayBuffer.b(obj);
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.f.get()) {
                replayBuffer.g(innerSubscription);
            }
        }
    }

    public static final class ScheduledReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final Object a(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final Node c() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final Object e(Object obj) {
            ((Timed) obj).getClass();
            return null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final void f() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final void h() {
            throw null;
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        public final void f() {
            if (this.e > 0) {
                Node node = get().get();
                if (node == null) {
                    throw new IllegalStateException("Empty list!");
                }
                this.e--;
                set(node);
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        public volatile int d;

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void b(Object obj) {
            add(obj);
            this.d++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            add(NotificationLite.d);
            this.d++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void d(Throwable th) {
            add(NotificationLite.e(th));
            this.d++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void g(InnerSubscription innerSubscription) {
            synchronized (innerSubscription) {
                try {
                    if (innerSubscription.h) {
                        innerSubscription.i = true;
                        return;
                    }
                    innerSubscription.h = true;
                    Subscriber subscriber = innerSubscription.e;
                    while (!innerSubscription.b()) {
                        int i = this.d;
                        Integer num = (Integer) innerSubscription.f;
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j = innerSubscription.get();
                        long j2 = j;
                        long j3 = 0;
                        while (j2 != 0 && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (NotificationLite.b(obj, subscriber) || innerSubscription.b()) {
                                    return;
                                }
                                iIntValue++;
                                j2--;
                                j3++;
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                innerSubscription.dispose();
                                if (NotificationLite.m(obj) || NotificationLite.l(obj)) {
                                    return;
                                }
                                subscriber.onError(th);
                                return;
                            }
                        }
                        if (j3 != 0) {
                            innerSubscription.f = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                BackpressureHelper.f(innerSubscription, j3);
                            }
                        }
                        synchronized (innerSubscription) {
                            try {
                                if (!innerSubscription.i) {
                                    innerSubscription.h = false;
                                    return;
                                }
                                innerSubscription.i = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void c(FlowableSubscriber flowableSubscriber) {
        throw null;
    }
}
