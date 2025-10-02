package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableConcatMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final DelayErrorInnerObserver f;
        public SimpleQueue g;
        public Disposable h;
        public volatile boolean i;
        public volatile boolean j;
        public volatile boolean k;
        public int l;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            public final Observer d;
            public final ConcatMapDelayErrorObserver e;

            public DelayErrorInnerObserver(Observer observer, ConcatMapDelayErrorObserver concatMapDelayErrorObserver) {
                this.d = observer;
                this.e = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.e;
                concatMapDelayErrorObserver.i = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.e;
                AtomicThrowable atomicThrowable = concatMapDelayErrorObserver.e;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                concatMapDelayErrorObserver.h.dispose();
                concatMapDelayErrorObserver.i = false;
                concatMapDelayErrorObserver.a();
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                this.d.onNext(obj);
            }
        }

        public ConcatMapDelayErrorObserver(Observer observer) {
            this.d = observer;
            this.f = new DelayErrorInnerObserver(observer, this);
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.d;
            SimpleQueue simpleQueue = this.g;
            AtomicThrowable atomicThrowable = this.e;
            do {
                if (!this.i) {
                    if (this.k) {
                        simpleQueue.clear();
                        return;
                    }
                    if (atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.k = true;
                        observer.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                    boolean z = this.j;
                    try {
                        boolean z2 = simpleQueue.poll() == null;
                        if (z && z2) {
                            this.k = true;
                            atomicThrowable.getClass();
                            Throwable thB = ExceptionHelper.b(atomicThrowable);
                            if (thB != null) {
                                observer.onError(thB);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                this.k = true;
                                this.h.dispose();
                                simpleQueue.clear();
                                atomicThrowable.getClass();
                                ExceptionHelper.a(atomicThrowable, th);
                                observer.onError(ExceptionHelper.b(atomicThrowable));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        this.k = true;
                        this.h.dispose();
                        atomicThrowable.getClass();
                        ExceptionHelper.a(atomicThrowable, th2);
                        observer.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.h, disposable)) {
                this.h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(3);
                    if (iL == 1) {
                        this.l = iL;
                        this.g = queueDisposable;
                        this.j = true;
                        this.d.d(this);
                        a();
                        return;
                    }
                    if (iL == 2) {
                        this.l = iL;
                        this.g = queueDisposable;
                        this.d.d(this);
                        return;
                    }
                }
                this.g = new SpscLinkedArrayQueue(0);
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.k = true;
            this.h.dispose();
            DelayErrorInnerObserver delayErrorInnerObserver = this.f;
            delayErrorInnerObserver.getClass();
            DisposableHelper.a(delayErrorInnerObserver);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.j = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.j = true;
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.l == 0) {
                this.g.offer(obj);
            }
            a();
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        public SimpleQueue d;
        public Disposable e;
        public volatile boolean f;
        public volatile boolean g;
        public int h;

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                throw null;
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f) {
                boolean z = this.g;
                try {
                    boolean z2 = this.d.poll() == null;
                    if (z && z2) {
                        this.f = true;
                        throw null;
                    }
                    if (!z2) {
                        try {
                            throw null;
                        } finally {
                        }
                    } else if (decrementAndGet() == 0) {
                        return;
                    }
                } finally {
                }
            }
            this.d.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(3);
                    if (iL == 1) {
                        this.h = iL;
                        this.d = queueDisposable;
                        this.g = true;
                        throw null;
                    }
                    if (iL == 2) {
                        this.h = iL;
                        this.d = queueDisposable;
                        throw null;
                    }
                }
                this.d = new SpscLinkedArrayQueue(0);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.f = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            if (this.h == 0) {
                this.d.offer(obj);
            }
            a();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ObservableSource observableSource = this.d;
        if (ObservableScalarXMap.b(observableSource, observer, null)) {
            return;
        }
        observableSource.a(new ConcatMapDelayErrorObserver(observer));
    }
}
