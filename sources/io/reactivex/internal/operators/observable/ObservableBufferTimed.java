package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes7.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferExactBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public Collection j;
        public Disposable k;
        public long l;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.k, disposable)) {
                this.k = disposable;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.dispose();
                    EmptyDisposable.e(th, this.e);
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.k.dispose();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            synchronized (this) {
                this.j = null;
            }
            this.e.onError(th);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.j;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < 0) {
                        return;
                    }
                    this.j = null;
                    this.l++;
                    h(collection, this);
                    try {
                        throw null;
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.e.onError(th);
                        dispose();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                dispose();
                this.e.onError(th);
            }
        }
    }

    public static final class BufferExactUnboundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public Disposable j;
        public Collection k;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            this.e.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    DisposableHelper.a(null);
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Collection collection;
            synchronized (this) {
                collection = this.k;
                this.k = null;
            }
            if (collection != null) {
                this.f.offer(collection);
                this.h = true;
                if (f()) {
                    QueueDrainHelper.b(this.f, this.e, null, this);
                }
            }
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            synchronized (this) {
                this.k = null;
            }
            this.e.onError(th);
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.k;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.onError(th);
                DisposableHelper.a(null);
                throw null;
            }
        }
    }

    public static final class BufferSkipBoundedObserver<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public Disposable j;

        public final class RemoveFromBuffer implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public final class RemoveFromBufferEmit implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void a(Observer observer, Object obj) {
            observer.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    disposable.dispose();
                    EmptyDisposable.e(th, this.e);
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            synchronized (this) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            synchronized (this) {
                new ArrayList((Collection) null);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.h = true;
            synchronized (this) {
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e.onError(th);
                dispose();
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }
}
