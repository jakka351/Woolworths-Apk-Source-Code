package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler e;
    public final int f;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        public final Observer d;
        public final Scheduler.Worker e;
        public final int f;
        public SimpleQueue g;
        public Disposable h;
        public Throwable i;
        public volatile boolean j;
        public volatile boolean k;
        public int l;
        public boolean m;

        public ObserveOnObserver(Observer observer, Scheduler.Worker worker, int i) {
            this.d = observer;
            this.e = worker;
            this.f = i;
        }

        public final boolean a(boolean z, boolean z2, Observer observer) {
            if (this.k) {
                this.g.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.i;
            if (th != null) {
                this.k = true;
                this.g.clear();
                observer.onError(th);
                this.e.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.k = true;
            observer.onComplete();
            this.e.dispose();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.g.clear();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.h, disposable)) {
                this.h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(7);
                    if (iL == 1) {
                        this.l = iL;
                        this.g = queueDisposable;
                        this.j = true;
                        this.d.d(this);
                        if (getAndIncrement() == 0) {
                            this.e.c(this);
                            return;
                        }
                        return;
                    }
                    if (iL == 2) {
                        this.l = iL;
                        this.g = queueDisposable;
                        this.d.d(this);
                        return;
                    }
                }
                this.g = new SpscLinkedArrayQueue(this.f);
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
            this.e.dispose();
            if (this.m || getAndIncrement() != 0) {
                return;
            }
            this.g.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.g.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            this.m = true;
            return 2;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.j) {
                return;
            }
            this.j = true;
            if (getAndIncrement() == 0) {
                this.e.c(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.j) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = th;
            this.j = true;
            if (getAndIncrement() == 0) {
                this.e.c(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.j) {
                return;
            }
            if (this.l != 2) {
                this.g.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.e.c(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return this.g.poll();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
        
            if (r3 != 0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r7 = this;
                boolean r0 = r7.m
                r1 = 1
                if (r0 == 0) goto L4a
                r0 = r1
            L6:
                boolean r2 = r7.k
                if (r2 == 0) goto Lc
                goto L77
            Lc:
                boolean r2 = r7.j
                java.lang.Throwable r3 = r7.i
                if (r2 == 0) goto L23
                if (r3 == 0) goto L23
                r7.k = r1
                io.reactivex.Observer r0 = r7.d
                java.lang.Throwable r1 = r7.i
                r0.onError(r1)
                io.reactivex.Scheduler$Worker r0 = r7.e
                r0.dispose()
                return
            L23:
                io.reactivex.Observer r3 = r7.d
                r4 = 0
                r3.onNext(r4)
                if (r2 == 0) goto L42
                r7.k = r1
                java.lang.Throwable r0 = r7.i
                if (r0 == 0) goto L37
                io.reactivex.Observer r1 = r7.d
                r1.onError(r0)
                goto L3c
            L37:
                io.reactivex.Observer r0 = r7.d
                r0.onComplete()
            L3c:
                io.reactivex.Scheduler$Worker r0 = r7.e
                r0.dispose()
                return
            L42:
                int r0 = -r0
                int r0 = r7.addAndGet(r0)
                if (r0 != 0) goto L6
                goto L77
            L4a:
                io.reactivex.internal.fuseable.SimpleQueue r0 = r7.g
                io.reactivex.Observer r2 = r7.d
                r3 = r1
            L4f:
                boolean r4 = r7.j
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.a(r4, r5, r2)
                if (r4 == 0) goto L5c
                goto L77
            L5c:
                boolean r4 = r7.j
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L7c
                if (r5 != 0) goto L66
                r6 = r1
                goto L67
            L66:
                r6 = 0
            L67:
                boolean r4 = r7.a(r4, r6, r2)
                if (r4 == 0) goto L6e
                goto L77
            L6e:
                if (r6 == 0) goto L78
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L4f
            L77:
                return
            L78:
                r2.onNext(r5)
                goto L5c
            L7c:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.b(r3)
                r7.k = r1
                io.reactivex.disposables.Disposable r1 = r7.h
                r1.dispose()
                r0.clear()
                r2.onError(r3)
                io.reactivex.Scheduler$Worker r0 = r7.e
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableObserveOn.ObserveOnObserver.run():void");
        }
    }

    public ObservableObserveOn(Observable observable, Scheduler scheduler, int i) {
        super(observable);
        this.e = scheduler;
        this.f = i;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        Scheduler scheduler = this.e;
        boolean z = scheduler instanceof TrampolineScheduler;
        ObservableSource observableSource = this.d;
        if (z) {
            observableSource.a(observer);
        } else {
            observableSource.a(new ObserveOnObserver(observer, scheduler.c(), this.f));
        }
    }
}
