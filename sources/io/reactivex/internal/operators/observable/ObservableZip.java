package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableZip<T, R> extends Observable<R> {
    public final ObservableSource[] d;
    public final Function e;
    public final int f;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        public final Observer d;
        public final Function e;
        public final ZipObserver[] f;
        public final Object[] g;
        public volatile boolean h;

        public ZipCoordinator(Observer observer, Function function, int i) {
            this.d = observer;
            this.e = function;
            this.f = new ZipObserver[i];
            this.g = new Object[i];
        }

        public final void a() {
            ZipObserver[] zipObserverArr = this.f;
            for (ZipObserver zipObserver : zipObserverArr) {
                zipObserver.e.clear();
            }
            for (ZipObserver zipObserver2 : zipObserverArr) {
                DisposableHelper.a(zipObserver2.h);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h;
        }

        public final void c() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            ZipObserver[] zipObserverArr = this.f;
            Observer observer = this.d;
            Object[] objArr = this.g;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (ZipObserver zipObserver : zipObserverArr) {
                    if (objArr[i2] == null) {
                        boolean z = zipObserver.f;
                        Object objPoll = zipObserver.e.poll();
                        boolean z2 = objPoll == null;
                        if (this.h) {
                            a();
                            return;
                        }
                        if (z) {
                            Throwable th2 = zipObserver.g;
                            if (th2 != null) {
                                this.h = true;
                                a();
                                observer.onError(th2);
                                return;
                            } else if (z2) {
                                this.h = true;
                                a();
                                observer.onComplete();
                                return;
                            }
                        }
                        if (z2) {
                            i++;
                        } else {
                            objArr[i2] = objPoll;
                        }
                    } else if (zipObserver.f && (th = zipObserver.g) != null) {
                        this.h = true;
                        a();
                        observer.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        Object objMo0apply = this.e.mo0apply(objArr.clone());
                        ObjectHelper.b(objMo0apply, "The zipper returned a null value");
                        observer.onNext(objMo0apply);
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        Exceptions.b(th3);
                        a();
                        observer.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.h) {
                return;
            }
            this.h = true;
            for (ZipObserver zipObserver : this.f) {
                DisposableHelper.a(zipObserver.h);
            }
            if (getAndIncrement() == 0) {
                for (ZipObserver zipObserver2 : this.f) {
                    zipObserver2.e.clear();
                }
            }
        }
    }

    public static final class ZipObserver<T, R> implements Observer<T> {
        public final ZipCoordinator d;
        public final SpscLinkedArrayQueue e;
        public volatile boolean f;
        public Throwable g;
        public final AtomicReference h = new AtomicReference();

        public ZipObserver(ZipCoordinator zipCoordinator, int i) {
            this.d = zipCoordinator;
            this.e = new SpscLinkedArrayQueue(i);
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.h, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f = true;
            this.d.c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.g = th;
            this.f = true;
            this.d.c();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.e.offer(obj);
            this.d.c();
        }
    }

    public ObservableZip(ObservableSource[] observableSourceArr, Function function, int i) {
        this.d = observableSourceArr;
        this.e = function;
        this.f = i;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ObservableSource[] observableSourceArr = this.d;
        observableSourceArr.getClass();
        int length = observableSourceArr.length;
        if (length == 0) {
            EmptyDisposable.a(observer);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(observer, this.e, length);
        int i = this.f;
        ZipObserver[] zipObserverArr = zipCoordinator.f;
        int length2 = zipObserverArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            zipObserverArr[i2] = new ZipObserver(zipCoordinator, i);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.d.d(zipCoordinator);
        for (int i3 = 0; i3 < length2 && !zipCoordinator.h; i3++) {
            observableSourceArr[i3].a(zipObserverArr[i3]);
        }
    }
}
