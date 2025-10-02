package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableWindowBoundary<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {
        public final WindowBoundaryMainObserver e;
        public boolean f;

        public WindowBoundaryInnerObserver(WindowBoundaryMainObserver windowBoundaryMainObserver) {
            this.e = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            DisposableHelper.a(windowBoundaryMainObserver.f);
            windowBoundaryMainObserver.k = true;
            windowBoundaryMainObserver.a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            DisposableHelper.a(windowBoundaryMainObserver.f);
            AtomicThrowable atomicThrowable = windowBoundaryMainObserver.i;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                windowBoundaryMainObserver.k = true;
                windowBoundaryMainObserver.a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            windowBoundaryMainObserver.h.offer(WindowBoundaryMainObserver.m);
            windowBoundaryMainObserver.a();
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final Object m = new Object();
        public final Observer d;
        public final WindowBoundaryInnerObserver e = new WindowBoundaryInnerObserver(this);
        public final AtomicReference f = new AtomicReference();
        public final AtomicInteger g = new AtomicInteger(1);
        public final MpscLinkedQueue h = new MpscLinkedQueue();
        public final AtomicThrowable i = new AtomicThrowable();
        public final AtomicBoolean j = new AtomicBoolean();
        public volatile boolean k;
        public UnicastSubject l;

        public WindowBoundaryMainObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.d;
            MpscLinkedQueue mpscLinkedQueue = this.h;
            AtomicThrowable atomicThrowable = this.i;
            int iAddAndGet = 1;
            while (this.g.get() != 0) {
                UnicastSubject unicastSubject = this.l;
                boolean z = this.k;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (unicastSubject != null) {
                        this.l = null;
                        unicastSubject.onError(thB);
                    }
                    observer.onError(thB);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    atomicThrowable.getClass();
                    Throwable thB2 = ExceptionHelper.b(atomicThrowable);
                    if (thB2 == null) {
                        if (unicastSubject != null) {
                            this.l = null;
                            unicastSubject.onComplete();
                        }
                        observer.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.l = null;
                        unicastSubject.onError(thB2);
                    }
                    observer.onError(thB2);
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != m) {
                    unicastSubject.onNext(objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.l = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.j.get()) {
                        UnicastSubject unicastSubject2 = new UnicastSubject(this);
                        this.l = unicastSubject2;
                        this.g.getAndIncrement();
                        observer.onNext(unicastSubject2);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.l = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.j.get();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this.f, disposable)) {
                this.h.offer(m);
                a();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.j.compareAndSet(false, true)) {
                this.e.dispose();
                if (this.g.decrementAndGet() == 0) {
                    DisposableHelper.a(this.f);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.e.dispose();
            this.k = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.e.dispose();
            AtomicThrowable atomicThrowable = this.i;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.k = true;
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.h.offer(obj);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g.decrementAndGet() == 0) {
                DisposableHelper.a(this.f);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        observer.d(new WindowBoundaryMainObserver(observer));
        throw null;
    }
}
