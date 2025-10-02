package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {
        public volatile Object e;

        public final class Iterator implements java.util.Iterator<T> {
            public Object d;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    if (this.d == null) {
                        throw null;
                    }
                    if (NotificationLite.l(this.d)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m(this.d)) {
                        throw ExceptionHelper.d(NotificationLite.f(this.d));
                    }
                    return this.d;
                } finally {
                    this.d = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.e = NotificationLite.d;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.e = NotificationLite.e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.e = obj;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
