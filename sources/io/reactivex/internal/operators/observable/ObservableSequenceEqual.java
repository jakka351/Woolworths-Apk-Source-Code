package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {
        public final Observer d;
        public volatile boolean g;
        public Object h;
        public Object i;
        public final EqualObserver[] f = {new EqualObserver(this, 0), new EqualObserver(this, 1)};
        public final ArrayCompositeDisposable e = new ArrayCompositeDisposable(2);

        public EqualCoordinator(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver[] equalObserverArr = this.f;
            EqualObserver equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue = equalObserver.e;
            EqualObserver equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = equalObserver2.e;
            int iAddAndGet = 1;
            while (!this.g) {
                boolean z = equalObserver.g;
                if (z && (th2 = equalObserver.h) != null) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.d.onError(th2);
                    return;
                }
                boolean z2 = equalObserver2.g;
                if (z2 && (th = equalObserver2.h) != null) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.d.onError(th);
                    return;
                }
                if (this.h == null) {
                    this.h = spscLinkedArrayQueue.poll();
                }
                boolean z3 = this.h == null;
                if (this.i == null) {
                    this.i = spscLinkedArrayQueue2.poll();
                }
                boolean z4 = this.i == null;
                if (z && z2 && z3 && z4) {
                    this.d.onNext(Boolean.TRUE);
                    this.d.onComplete();
                    return;
                }
                if (z && z2 && z3 != z4) {
                    this.g = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.d.onNext(Boolean.FALSE);
                    this.d.onComplete();
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        Exceptions.b(th3);
                        this.g = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.d.onError(th3);
                        return;
                    }
                }
                if (z3 || z4) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.e.dispose();
            if (getAndIncrement() == 0) {
                EqualObserver[] equalObserverArr = this.f;
                equalObserverArr[0].e.clear();
                equalObserverArr[1].e.clear();
            }
        }
    }

    public static final class EqualObserver<T> implements Observer<T> {
        public final EqualCoordinator d;
        public final SpscLinkedArrayQueue e = new SpscLinkedArrayQueue(0);
        public final int f;
        public volatile boolean g;
        public Throwable h;

        public EqualObserver(EqualCoordinator equalCoordinator, int i) {
            this.d = equalCoordinator;
            this.f = i;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            this.d.e.a(this.f, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.g = true;
            this.d.a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.h = th;
            this.g = true;
            this.d.a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.e.offer(obj);
            this.d.a();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer);
        observer.d(equalCoordinator);
        EqualObserver equalObserver = equalCoordinator.f[0];
        throw null;
    }
}
