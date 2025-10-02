package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.InnerQueuedObserver;
import io.reactivex.internal.observers.InnerQueuedObserverSupport;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, InnerQueuedObserverSupport<R> {
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final ArrayDeque f = new ArrayDeque();
        public SimpleQueue g;
        public Disposable h;
        public volatile boolean i;
        public int j;
        public volatile boolean k;
        public InnerQueuedObserver l;
        public int m;

        public ConcatMapEagerMainObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            InnerQueuedObserver innerQueuedObserver = this.l;
            if (innerQueuedObserver != null) {
                DisposableHelper.a(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver innerQueuedObserver2 = (InnerQueuedObserver) this.f.poll();
                if (innerQueuedObserver2 == null) {
                    return;
                } else {
                    DisposableHelper.a(innerQueuedObserver2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            throw null;
         */
        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableConcatMapEager.ConcatMapEagerMainObserver.c():void");
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.h, disposable)) {
                this.h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(3);
                    if (iL == 1) {
                        this.j = iL;
                        this.g = queueDisposable;
                        this.i = true;
                        this.d.d(this);
                        c();
                        return;
                    }
                    if (iL == 2) {
                        this.j = iL;
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
            if (this.k) {
                return;
            }
            this.k = true;
            this.h.dispose();
            if (getAndIncrement() == 0) {
                do {
                    this.g.clear();
                    a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void e(InnerQueuedObserver innerQueuedObserver, Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                innerQueuedObserver.e = true;
                c();
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void f(InnerQueuedObserver innerQueuedObserver) {
            innerQueuedObserver.e = true;
            c();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void g(InnerQueuedObserver innerQueuedObserver, Object obj) {
            innerQueuedObserver.d.offer(obj);
            c();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.i = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.i = true;
                c();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.j == 0) {
                this.g.offer(obj);
            }
            c();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new ConcatMapEagerMainObserver(observer));
    }
}
