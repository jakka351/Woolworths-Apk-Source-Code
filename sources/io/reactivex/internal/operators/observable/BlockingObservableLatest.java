package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {

    public static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {
        public Notification e;
        public final Semaphore f = new Semaphore(0);
        public final AtomicReference g = new AtomicReference();

        @Override // java.util.Iterator
        public final boolean hasNext() throws InterruptedException {
            Notification notification = this.e;
            if (notification != null && NotificationLite.m(notification.f24218a)) {
                throw ExceptionHelper.d(this.e.b());
            }
            if (this.e == null) {
                try {
                    this.f.acquire();
                    Notification notification2 = (Notification) this.g.getAndSet(null);
                    this.e = notification2;
                    if (NotificationLite.m(notification2.f24218a)) {
                        throw ExceptionHelper.d(notification2.b());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.e = Notification.a(e);
                    throw ExceptionHelper.d(e);
                }
            }
            return this.e.d();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objC = this.e.c();
            this.e = null;
            return objC;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g.getAndSet((Notification) obj) == null) {
                this.f.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingObservableLatestIterator();
        ObjectHelper.b(null, "source is null");
        throw null;
    }
}
