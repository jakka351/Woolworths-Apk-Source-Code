package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {

    public static final class BlockingFlowableIterator<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {
        public final SpscArrayQueue d = new SpscArrayQueue(0);
        public final long e = 0;
        public final long f = 0;
        public final ReentrantLock g;
        public final Condition h;
        public long i;
        public volatile boolean j;
        public volatile Throwable k;

        public BlockingFlowableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.g = reentrantLock;
            this.h = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.g;
            reentrantLock.lock();
            try {
                this.h.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            SubscriptionHelper.a(this);
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!b()) {
                boolean z = this.j;
                boolean zIsEmpty = this.d.isEmpty();
                if (z) {
                    Throwable th = this.k;
                    if (th != null) {
                        throw ExceptionHelper.d(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                this.g.lock();
                while (!this.j && this.d.isEmpty() && !b()) {
                    try {
                        try {
                            this.h.await();
                        } catch (InterruptedException e) {
                            run();
                            throw ExceptionHelper.d(e);
                        }
                    } finally {
                        this.g.unlock();
                    }
                }
            }
            Throwable th2 = this.k;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.d(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void m(Subscription subscription) {
            SubscriptionHelper.d(this, subscription, this.e);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objPoll = this.d.poll();
            long j = this.i + 1;
            if (j != this.f) {
                this.i = j;
                return objPoll;
            }
            this.i = 0L;
            get().request(j);
            return objPoll;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.j = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.k = th;
            this.j = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.d.offer(obj)) {
                a();
            } else {
                SubscriptionHelper.a(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.a(this);
            a();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingFlowableIterator();
        throw null;
    }
}
