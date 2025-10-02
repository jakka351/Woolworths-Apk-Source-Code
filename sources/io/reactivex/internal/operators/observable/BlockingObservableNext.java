package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    public static final class NextIterator<T> implements Iterator<T> {
        public final NextObserver d;
        public Object e;
        public boolean f = true;
        public boolean g = true;
        public Throwable h;
        public boolean i;

        public NextIterator(NextObserver nextObserver) {
            this.d = nextObserver;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th = this.h;
            if (th != null) {
                throw ExceptionHelper.d(th);
            }
            if (!this.f) {
                return false;
            }
            if (!this.g) {
                return true;
            }
            NextObserver nextObserver = this.d;
            AtomicInteger atomicInteger = nextObserver.f;
            if (!this.i) {
                this.i = true;
                atomicInteger.set(1);
                new ObservableMaterialize(null).a(nextObserver);
            }
            try {
                atomicInteger.set(1);
                Notification notification = (Notification) nextObserver.e.take();
                if (notification.d()) {
                    this.g = false;
                    this.e = notification.c();
                    return true;
                }
                this.f = false;
                if (notification.f24218a == null) {
                    return false;
                }
                Throwable thB = notification.b();
                this.h = thB;
                throw ExceptionHelper.d(thB);
            } catch (InterruptedException e) {
                nextObserver.dispose();
                this.h = e;
                throw ExceptionHelper.d(e);
            }
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

    public static final class NextObserver<T> extends DisposableObserver<Notification<T>> {
        public final ArrayBlockingQueue e = new ArrayBlockingQueue(1);
        public final AtomicInteger f = new AtomicInteger();

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.Observer
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
        return new NextIterator(new NextObserver());
    }
}
