package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {

    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.JoinSupport {
        public final Observer d;
        public int k;
        public int l;
        public volatile boolean m;
        public final CompositeDisposable f = new CompositeDisposable();
        public final SpscLinkedArrayQueue e = new SpscLinkedArrayQueue(Flowable.d);
        public final LinkedHashMap g = new LinkedHashMap();
        public final LinkedHashMap h = new LinkedHashMap();
        public final AtomicReference i = new AtomicReference();
        public final AtomicInteger j = new AtomicInteger(2);

        public JoinDisposable(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void a(Throwable th) {
            if (!ExceptionHelper.a(this.i, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.j.decrementAndGet();
                g();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.m;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void c(Throwable th) {
            if (ExceptionHelper.a(this.i, th)) {
                g();
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void d(Object obj, boolean z) {
            synchronized (this) {
                try {
                    this.e.a(z ? 1 : 2, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            g();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.m) {
                return;
            }
            this.m = true;
            this.f.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void e(boolean z, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                try {
                    this.e.a(z ? 3 : 4, leftRightEndObserver);
                } catch (Throwable th) {
                    throw th;
                }
            }
            g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void f(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.f.c(leftRightObserver);
            this.j.decrementAndGet();
            g();
        }

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            Observer observer = this.d;
            int iAddAndGet = 1;
            while (!this.m) {
                if (((Throwable) this.i.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    this.f.dispose();
                    h(observer);
                    return;
                }
                boolean z = this.j.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.g.clear();
                    this.h.clear();
                    this.f.dispose();
                    observer.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == 1) {
                        int i = this.k;
                        this.k = i + 1;
                        this.g.put(Integer.valueOf(i), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            i(th, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 2) {
                        int i2 = this.l;
                        this.l = i2 + 1;
                        this.h.put(Integer.valueOf(i2), objPoll);
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            i(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    }
                    if (num == 3) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap = this.g;
                        leftRightEndObserver.getClass();
                        linkedHashMap.remove(0);
                        this.f.a(leftRightEndObserver);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        LinkedHashMap linkedHashMap2 = this.h;
                        leftRightEndObserver2.getClass();
                        linkedHashMap2.remove(0);
                        this.f.a(leftRightEndObserver2);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void h(Observer observer) {
            Throwable thB = ExceptionHelper.b(this.i);
            this.g.clear();
            this.h.clear();
            observer.onError(thB);
        }

        public final void i(Throwable th, Observer observer, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.b(th);
            ExceptionHelper.a(this.i, th);
            spscLinkedArrayQueue.clear();
            this.f.dispose();
            h(observer);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        JoinDisposable joinDisposable = new JoinDisposable(observer);
        observer.d(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        CompositeDisposable compositeDisposable = joinDisposable.f;
        compositeDisposable.d(leftRightObserver);
        compositeDisposable.d(new ObservableGroupJoin.LeftRightObserver(joinDisposable, false));
        this.d.a(leftRightObserver);
        throw null;
    }
}
