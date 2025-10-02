package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function e;
    public final int f;
    public final int g;

    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        public final long d;
        public final MergeObserver e;
        public volatile boolean f;
        public volatile SimpleQueue g;
        public int h;

        public InnerObserver(MergeObserver mergeObserver, long j) {
            this.d = j;
            this.e = mergeObserver;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iL = queueDisposable.l(7);
                if (iL == 1) {
                    this.h = iL;
                    this.g = queueDisposable;
                    this.f = true;
                    this.e.e();
                    return;
                }
                if (iL == 2) {
                    this.h = iL;
                    this.g = queueDisposable;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f = true;
            this.e.e();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e.j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            MergeObserver mergeObserver = this.e;
            mergeObserver.getClass();
            mergeObserver.c();
            this.f = true;
            this.e.e();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.h != 0) {
                this.e.e();
                return;
            }
            MergeObserver mergeObserver = this.e;
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.d.onNext(obj);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = this.g;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(mergeObserver.g);
                    this.g = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.f();
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final InnerObserver[] s = new InnerObserver[0];
        public static final InnerObserver[] t = new InnerObserver[0];
        public final Observer d;
        public final Function e;
        public final int f;
        public final int g;
        public volatile SimplePlainQueue h;
        public volatile boolean i;
        public final AtomicThrowable j = new AtomicThrowable();
        public volatile boolean k;
        public final AtomicReference l;
        public Disposable m;
        public long n;
        public long o;
        public int p;
        public final ArrayDeque q;
        public int r;

        public MergeObserver(Observer observer, Function function, int i, int i2) {
            this.d = observer;
            this.e = function;
            this.f = i;
            this.g = i2;
            if (i != Integer.MAX_VALUE) {
                this.q = new ArrayDeque(i);
            }
            this.l = new AtomicReference(s);
        }

        public final boolean a() {
            if (!this.k) {
                if (this.j.get() == null) {
                    return false;
                }
                c();
                AtomicThrowable atomicThrowable = this.j;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != ExceptionHelper.f24240a) {
                    this.d.onError(thB);
                }
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        public final boolean c() {
            InnerObserver[] innerObserverArr;
            this.m.dispose();
            AtomicReference atomicReference = this.l;
            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
            InnerObserver[] innerObserverArr3 = t;
            if (innerObserverArr2 == innerObserverArr3 || (innerObserverArr = (InnerObserver[]) atomicReference.getAndSet(innerObserverArr3)) == innerObserverArr3) {
                return false;
            }
            for (InnerObserver innerObserver : innerObserverArr) {
                innerObserver.getClass();
                DisposableHelper.a(innerObserver);
            }
            return true;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.m, disposable)) {
                this.m = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.k) {
                return;
            }
            this.k = true;
            if (c()) {
                AtomicThrowable atomicThrowable = this.j;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB == null || thB == ExceptionHelper.f24240a) {
                    return;
                }
                RxJavaPlugins.b(thB);
            }
        }

        public final void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:112:0x0125 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0108 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0107 A[PHI: r4
  0x0107: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e6, B:88:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f() {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.f():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(InnerObserver innerObserver) {
            InnerObserver[] innerObserverArr;
            while (true) {
                AtomicReference atomicReference = this.l;
                InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
                int length = innerObserverArr2.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr2[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr = s;
                } else {
                    InnerObserver[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr2, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr = innerObserverArr3;
                }
                while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                    if (atomicReference.get() != innerObserverArr2) {
                        break;
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(ObservableSource observableSource) {
            boolean z;
            do {
                z = false;
                if (!(observableSource instanceof Callable)) {
                    long j = this.n;
                    this.n = 1 + j;
                    InnerObserver innerObserver = new InnerObserver(this, j);
                    AtomicReference atomicReference = this.l;
                    while (true) {
                        InnerObserver[] innerObserverArr = (InnerObserver[]) atomicReference.get();
                        if (innerObserverArr == t) {
                            DisposableHelper.a(innerObserver);
                            return;
                        }
                        int length = innerObserverArr.length;
                        InnerObserver[] innerObserverArr2 = new InnerObserver[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = innerObserver;
                        while (!atomicReference.compareAndSet(innerObserverArr, innerObserverArr2)) {
                            if (atomicReference.get() != innerObserverArr) {
                                break;
                            }
                        }
                        observableSource.a(innerObserver);
                        return;
                    }
                }
                try {
                    Object objCall = ((Callable) observableSource).call();
                    if (objCall != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.d.onNext(objCall);
                            if (decrementAndGet() != 0) {
                                f();
                            }
                        } else {
                            SimplePlainQueue spscLinkedArrayQueue = this.h;
                            if (spscLinkedArrayQueue == null) {
                                spscLinkedArrayQueue = this.f == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.g) : new SpscArrayQueue(this.f);
                                this.h = spscLinkedArrayQueue;
                            }
                            if (spscLinkedArrayQueue.offer(objCall)) {
                                if (getAndIncrement() != 0) {
                                    return;
                                }
                                f();
                            } else {
                                onError(new IllegalStateException("Scalar queue full?!"));
                            }
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.b(th);
                    AtomicThrowable atomicThrowable = this.j;
                    atomicThrowable.getClass();
                    ExceptionHelper.a(atomicThrowable, th);
                    e();
                }
                if (this.f == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        observableSource = (ObservableSource) this.q.poll();
                        if (observableSource == null) {
                            this.r--;
                            z = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (!z);
            e();
        }

        public final void i(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.q.poll();
                        if (observableSource == null) {
                            this.r--;
                        } else {
                            h(observableSource);
                        }
                    } finally {
                    }
                }
                i = i2;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            e();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.b(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.i = true;
                e();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.i) {
                return;
            }
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objMo0apply;
                if (this.f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.r;
                            if (i == this.f) {
                                this.q.offer(observableSource);
                                return;
                            }
                            this.r = i + 1;
                        } finally {
                        }
                    }
                }
                h(observableSource);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.m.dispose();
                onError(th);
            }
        }
    }

    public ObservableFlatMap(Observable observable, Function function, int i, int i2) {
        super(observable);
        this.e = function;
        this.f = i;
        this.g = i2;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ObservableSource observableSource = this.d;
        Function function = this.e;
        if (ObservableScalarXMap.b(observableSource, observer, function)) {
            return;
        }
        observableSource.a(new MergeObserver(observer, function, this.f, this.g));
    }
}
