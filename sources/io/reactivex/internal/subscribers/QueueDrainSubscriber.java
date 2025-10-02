package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    public final SerializedSubscriber f;
    public final MpscLinkedQueue g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;

    public QueueDrainSubscriber(SerializedSubscriber serializedSubscriber, MpscLinkedQueue mpscLinkedQueue) {
        this.f = serializedSubscriber;
        this.g = mpscLinkedQueue;
    }

    public boolean a(Object obj, Subscriber subscriber) {
        return false;
    }

    public final boolean c() {
        return this.d.getAndIncrement() == 0;
    }

    public final boolean d() {
        AtomicInteger atomicInteger = this.d;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void e(Object obj, Disposable disposable) {
        SerializedSubscriber serializedSubscriber = this.f;
        MpscLinkedQueue mpscLinkedQueue = this.g;
        if (d()) {
            long j = this.e.get();
            if (j == 0) {
                this.h = true;
                disposable.dispose();
                throw null;
            }
            if (mpscLinkedQueue.isEmpty()) {
                if (a(obj, serializedSubscriber) && j != Long.MAX_VALUE) {
                    g();
                }
                if (this.d.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                mpscLinkedQueue.offer(obj);
            }
        } else {
            mpscLinkedQueue.offer(obj);
            if (!c()) {
                return;
            }
        }
        QueueDrainHelper.c(mpscLinkedQueue, serializedSubscriber, disposable, this);
    }

    public final int f(int i) {
        return this.d.addAndGet(i);
    }

    public final long g() {
        return this.e.addAndGet(-1L);
    }

    public final long h() {
        return this.e.get();
    }

    public void request(long j) {
        if (SubscriptionHelper.f(j)) {
            BackpressureHelper.a(this.e, j);
        }
    }
}
