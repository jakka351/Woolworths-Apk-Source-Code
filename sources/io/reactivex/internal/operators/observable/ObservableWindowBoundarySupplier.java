package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
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
public final class ObservableWindowBoundarySupplier<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {

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
            windowBoundaryMainObserver.j.dispose();
            windowBoundaryMainObserver.k = true;
            windowBoundaryMainObserver.c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
                return;
            }
            this.f = true;
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            windowBoundaryMainObserver.j.dispose();
            AtomicThrowable atomicThrowable = windowBoundaryMainObserver.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                windowBoundaryMainObserver.k = true;
                windowBoundaryMainObserver.c();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            this.f = true;
            dispose();
            WindowBoundaryMainObserver windowBoundaryMainObserver = this.e;
            AtomicReference atomicReference = windowBoundaryMainObserver.e;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            windowBoundaryMainObserver.g.offer(WindowBoundaryMainObserver.n);
            windowBoundaryMainObserver.c();
        }
    }

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final WindowBoundaryInnerObserver m = new WindowBoundaryInnerObserver(null);
        public static final Object n = new Object();
        public final Observer d;
        public final AtomicReference e = new AtomicReference();
        public final AtomicInteger f = new AtomicInteger(1);
        public final MpscLinkedQueue g = new MpscLinkedQueue();
        public final AtomicThrowable h = new AtomicThrowable();
        public final AtomicBoolean i = new AtomicBoolean();
        public Disposable j;
        public volatile boolean k;
        public UnicastSubject l;

        public WindowBoundaryMainObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            AtomicReference atomicReference = this.e;
            WindowBoundaryInnerObserver windowBoundaryInnerObserver = m;
            Disposable disposable = (Disposable) atomicReference.getAndSet(windowBoundaryInnerObserver);
            if (disposable == null || disposable == windowBoundaryInnerObserver) {
                return;
            }
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.i.get();
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.d;
            MpscLinkedQueue mpscLinkedQueue = this.g;
            AtomicThrowable atomicThrowable = this.h;
            int iAddAndGet = 1;
            while (this.f.get() != 0) {
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
                } else if (objPoll != n) {
                    unicastSubject.onNext(objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.l = null;
                        unicastSubject.onComplete();
                    }
                    if (this.i.get()) {
                        continue;
                    } else {
                        this.l = new UnicastSubject(this);
                        this.f.getAndIncrement();
                        try {
                            throw null;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            atomicThrowable.getClass();
                            ExceptionHelper.a(atomicThrowable, th);
                            this.k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.l = null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                this.d.d(this);
                this.g.offer(n);
                c();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.i.compareAndSet(false, true)) {
                a();
                if (this.f.decrementAndGet() == 0) {
                    this.j.dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            a();
            this.k = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            a();
            AtomicThrowable atomicThrowable = this.h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.k = true;
                c();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.g.offer(obj);
            c();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f.decrementAndGet() == 0) {
                this.j.dispose();
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new WindowBoundaryMainObserver(observer));
    }
}
