package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public volatile boolean h;
        public volatile boolean j;
        public final SpscLinkedArrayQueue i = new SpscLinkedArrayQueue(Flowable.d);
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicReference f = new AtomicReference();
        public LinkedHashMap k = new LinkedHashMap();
        public final AtomicThrowable g = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<Disposable> implements Observer<Open>, Disposable {
            public final BufferBoundaryObserver d;

            public BufferOpenObserver(BufferBoundaryObserver bufferBoundaryObserver) {
                this.d = bufferBoundaryObserver;
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return get() == DisposableHelper.d;
            }

            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                lazySet(DisposableHelper.d);
                BufferBoundaryObserver bufferBoundaryObserver = this.d;
                bufferBoundaryObserver.e.c(this);
                if (bufferBoundaryObserver.e.g() == 0) {
                    DisposableHelper.a(bufferBoundaryObserver.f);
                    bufferBoundaryObserver.h = true;
                    bufferBoundaryObserver.c();
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                lazySet(DisposableHelper.d);
                BufferBoundaryObserver bufferBoundaryObserver = this.d;
                DisposableHelper.a(bufferBoundaryObserver.f);
                bufferBoundaryObserver.e.c(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                BufferBoundaryObserver bufferBoundaryObserver = this.d;
                bufferBoundaryObserver.getClass();
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    DisposableHelper.a(bufferBoundaryObserver.f);
                    bufferBoundaryObserver.onError(th);
                }
            }
        }

        public BufferBoundaryObserver(Observer observer) {
            this.d = observer;
        }

        public final void a(BufferCloseObserver bufferCloseObserver, long j) {
            boolean z;
            this.e.c(bufferCloseObserver);
            if (this.e.g() == 0) {
                DisposableHelper.a(this.f);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.k;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.i.offer(linkedHashMap.remove(Long.valueOf(j)));
                    if (z) {
                        this.h = true;
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.f.get());
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.d;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.i;
            int iAddAndGet = 1;
            while (!this.j) {
                boolean z = this.h;
                if (z && this.g.get() != null) {
                    spscLinkedArrayQueue.clear();
                    AtomicThrowable atomicThrowable = this.g;
                    atomicThrowable.getClass();
                    observer.onError(ExceptionHelper.b(atomicThrowable));
                    return;
                }
                Collection collection = (Collection) spscLinkedArrayQueue.poll();
                boolean z2 = collection == null;
                if (z && z2) {
                    observer.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(collection);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this.f, disposable)) {
                this.e.d(new BufferOpenObserver(this));
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (DisposableHelper.a(this.f)) {
                this.j = true;
                this.e.dispose();
                synchronized (this) {
                    this.k = null;
                }
                if (getAndIncrement() != 0) {
                    this.i.clear();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.e.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.k;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.i.offer((Collection) it.next());
                    }
                    this.k = null;
                    this.h = true;
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e.dispose();
            synchronized (this) {
                this.k = null;
            }
            this.h = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.k;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == DisposableHelper.d;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(disposableHelper);
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper) {
                return;
            }
            lazySet(disposableHelper);
            disposable.dispose();
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(observer);
        observer.d(bufferBoundaryObserver);
        this.d.a(bufferBoundaryObserver);
    }
}
