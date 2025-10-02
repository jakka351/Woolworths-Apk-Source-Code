package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {
        public final SpscLinkedArrayQueue d = new SpscLinkedArrayQueue(0);
        public final ReentrantLock e;
        public final Condition f;
        public volatile boolean g;
        public volatile Throwable h;

        public BlockingObservableIterator() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.e = reentrantLock;
            this.f = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            try {
                this.f.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!b()) {
                boolean z = this.g;
                boolean zIsEmpty = this.d.isEmpty();
                if (z) {
                    Throwable th = this.h;
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
                try {
                    this.e.lock();
                    while (!this.g && this.d.isEmpty() && !b()) {
                        try {
                            this.f.await();
                        } catch (Throwable th2) {
                            this.e.unlock();
                            throw th2;
                        }
                    }
                    this.e.unlock();
                } catch (InterruptedException e) {
                    DisposableHelper.a(this);
                    a();
                    throw ExceptionHelper.d(e);
                }
            }
            Throwable th3 = this.h;
            if (th3 == null) {
                return false;
            }
            throw ExceptionHelper.d(th3);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                return this.d.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.g = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.h = th;
            this.g = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.offer(obj);
            a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        new BlockingObservableIterator();
        throw null;
    }
}
