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
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {

    public static final class LatestSubscriberIterator<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {
        public final Semaphore e = new Semaphore(0);
        public final AtomicReference f = new AtomicReference();
        public Notification g;

        @Override // java.util.Iterator
        public final boolean hasNext() throws InterruptedException {
            Notification notification = this.g;
            if (notification != null && NotificationLite.m(notification.f24218a)) {
                throw ExceptionHelper.d(this.g.b());
            }
            Notification notification2 = this.g;
            if ((notification2 == null || notification2.d()) && this.g == null) {
                try {
                    this.e.acquire();
                    Notification notification3 = (Notification) this.f.getAndSet(null);
                    this.g = notification3;
                    if (NotificationLite.m(notification3.f24218a)) {
                        throw ExceptionHelper.d(notification3.b());
                    }
                } catch (InterruptedException e) {
                    dispose();
                    this.g = Notification.a(e);
                    throw ExceptionHelper.d(e);
                }
            }
            return this.g.d();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext() || !this.g.d()) {
                throw new NoSuchElementException();
            }
            Object objC = this.g.c();
            this.g = null;
            return objC;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            RxJavaPlugins.b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            if (this.f.getAndSet((Notification) obj) == null) {
                this.e.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new LatestSubscriberIterator();
        int i = Flowable.d;
        ObjectHelper.b(null, "source is null");
        throw null;
    }
}
