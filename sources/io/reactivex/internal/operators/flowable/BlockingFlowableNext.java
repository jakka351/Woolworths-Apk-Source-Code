package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Notification;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    public static final class NextIterator<T> implements Iterator<T> {
        public final NextSubscriber d;
        public Object e;
        public boolean f = true;
        public boolean g = true;
        public Throwable h;
        public boolean i;

        public NextIterator(NextSubscriber nextSubscriber) {
            this.d = nextSubscriber;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.h;
            if (th != null) {
                throw ExceptionHelper.d(th);
            }
            if (this.f) {
                boolean z = true;
                if (!this.g) {
                    return true;
                }
                NextSubscriber nextSubscriber = this.d;
                AtomicInteger atomicInteger = nextSubscriber.f;
                try {
                    if (!this.i) {
                        this.i = true;
                        atomicInteger.set(1);
                        int i = Flowable.d;
                        ObjectHelper.b(null, "source is null");
                        throw null;
                    }
                    atomicInteger.set(1);
                    Notification notification = (Notification) nextSubscriber.e.take();
                    if (notification.d()) {
                        this.g = false;
                        this.e = notification.c();
                        return true;
                    }
                    this.f = false;
                    Object obj = notification.f24218a;
                    if (obj != null) {
                        z = false;
                    }
                    if (!z) {
                        if (!NotificationLite.m(obj)) {
                            throw new IllegalStateException("Should not reach here");
                        }
                        Throwable thB = notification.b();
                        this.h = thB;
                        throw ExceptionHelper.d(thB);
                    }
                } catch (InterruptedException e) {
                    nextSubscriber.dispose();
                    this.h = e;
                    throw ExceptionHelper.d(e);
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Throwable th = this.h;
            if (th != null) {
                throw ExceptionHelper.d(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.g = true;
            return this.e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {
        public final ArrayBlockingQueue e = new ArrayBlockingQueue(1);
        public final AtomicInteger f = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f.getAndSet(0) != 1 && notification.d()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.e;
                if (arrayBlockingQueue.offer(notification)) {
                    return;
                }
                Notification notification2 = (Notification) arrayBlockingQueue.poll();
                if (notification2 != null && !notification2.d()) {
                    notification = notification2;
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new NextIterator(new NextSubscriber());
    }
}
