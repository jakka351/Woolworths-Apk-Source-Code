package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class UnicastSubject<T> extends Subject<T> {
    public final SpscLinkedArrayQueue d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public Throwable j;
    public final AtomicBoolean k;
    public final BasicIntQueueDisposable l;
    public boolean m;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return UnicastSubject.this.h;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            UnicastSubject.this.d.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (UnicastSubject.this.h) {
                return;
            }
            UnicastSubject.this.h = true;
            UnicastSubject.this.o();
            UnicastSubject.this.e.lazySet(null);
            if (UnicastSubject.this.l.getAndIncrement() == 0) {
                UnicastSubject.this.e.lazySet(null);
                UnicastSubject unicastSubject = UnicastSubject.this;
                if (unicastSubject.m) {
                    return;
                }
                unicastSubject.d.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return UnicastSubject.this.d.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            UnicastSubject.this.m = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return UnicastSubject.this.d.poll();
        }
    }

    public UnicastSubject(int i) {
        ObjectHelper.c(i, "capacityHint");
        this.d = new SpscLinkedArrayQueue(i);
        this.f = new AtomicReference();
        this.g = true;
        this.e = new AtomicReference();
        this.k = new AtomicBoolean();
        this.l = new UnicastQueueDisposable();
    }

    public static UnicastSubject n() {
        return new UnicastSubject(0);
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (this.i || this.h) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        if (this.k.get() || !this.k.compareAndSet(false, true)) {
            EmptyDisposable.e(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.d(this.l);
        this.e.lazySet(observer);
        if (this.h) {
            this.e.lazySet(null);
        } else {
            p();
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.i || this.h) {
            return;
        }
        this.i = true;
        o();
        p();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i || this.h) {
            RxJavaPlugins.b(th);
            return;
        }
        this.j = th;
        this.i = true;
        o();
        p();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i || this.h) {
            return;
        }
        this.d.offer(obj);
        p();
    }

    public final void p() {
        Throwable th;
        if (this.l.getAndIncrement() != 0) {
            return;
        }
        Observer observer = (Observer) this.e.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (observer == null) {
            iAddAndGet2 = this.l.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                observer = (Observer) this.e.get();
            }
        }
        if (this.m) {
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.d;
            boolean z = this.g;
            while (!this.h) {
                boolean z2 = this.i;
                if (!z && z2 && (th = this.j) != null) {
                    this.e.lazySet(null);
                    spscLinkedArrayQueue.clear();
                    observer.onError(th);
                    return;
                }
                observer.onNext(null);
                if (z2) {
                    this.e.lazySet(null);
                    Throwable th2 = this.j;
                    if (th2 != null) {
                        observer.onError(th2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.l.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.e.lazySet(null);
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue2 = this.d;
        boolean z3 = this.g;
        boolean z4 = true;
        int iAddAndGet3 = 1;
        while (!this.h) {
            boolean z5 = this.i;
            Object objPoll = this.d.poll();
            boolean z6 = objPoll == null;
            if (z5) {
                if (!z3 && z4) {
                    Throwable th3 = this.j;
                    if (th3 != null) {
                        this.e.lazySet(null);
                        spscLinkedArrayQueue2.clear();
                        observer.onError(th3);
                        return;
                    }
                    z4 = false;
                }
                if (z6) {
                    this.e.lazySet(null);
                    Throwable th4 = this.j;
                    if (th4 != null) {
                        observer.onError(th4);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
            }
            if (z6) {
                iAddAndGet3 = this.l.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                observer.onNext(objPoll);
            }
        }
        this.e.lazySet(null);
        spscLinkedArrayQueue2.clear();
    }

    public UnicastSubject(Runnable runnable) {
        ObjectHelper.c(0, "capacityHint");
        this.d = new SpscLinkedArrayQueue(0);
        this.f = new AtomicReference(runnable);
        this.g = true;
        this.e = new AtomicReference();
        this.k = new AtomicBoolean();
        this.l = new UnicastQueueDisposable();
    }
}
