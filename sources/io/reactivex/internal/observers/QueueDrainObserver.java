package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.ObservableQueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public abstract class QueueDrainObserver<T, U, V> extends QueueDrainSubscriberPad2 implements Observer<T>, ObservableQueueDrain<U, V> {
    public final SerializedObserver e;
    public final MpscLinkedQueue f;
    public volatile boolean g;
    public volatile boolean h;
    public Throwable i;

    public QueueDrainObserver(SerializedObserver serializedObserver, MpscLinkedQueue mpscLinkedQueue) {
        this.e = serializedObserver;
        this.f = mpscLinkedQueue;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public void a(Observer observer, Object obj) {
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final Throwable c() {
        return this.i;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean e() {
        return this.g;
    }

    public final boolean f() {
        return this.d.getAndIncrement() == 0;
    }

    public final boolean g() {
        AtomicInteger atomicInteger = this.d;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void h(Object obj, Disposable disposable) {
        AtomicInteger atomicInteger = this.d;
        int i = atomicInteger.get();
        SerializedObserver serializedObserver = this.e;
        MpscLinkedQueue mpscLinkedQueue = this.f;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            mpscLinkedQueue.offer(obj);
            if (!f()) {
                return;
            }
        } else if (mpscLinkedQueue.isEmpty()) {
            a(serializedObserver, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            mpscLinkedQueue.offer(obj);
        }
        QueueDrainHelper.b(mpscLinkedQueue, serializedObserver, disposable, this);
    }

    public final int i(int i) {
        return this.d.addAndGet(i);
    }
}
