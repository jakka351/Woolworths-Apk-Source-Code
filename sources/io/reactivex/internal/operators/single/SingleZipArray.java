package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.single.SingleMap;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleZipArray<T, R> extends Single<R> {
    public final SingleSource[] d;
    public final Function e;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            Object objMo0apply = SingleZipArray.this.e.mo0apply(new Object[]{obj});
            ObjectHelper.b(objMo0apply, "The zipper returned a null value");
            return objMo0apply;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        public final SingleObserver d;
        public final Function e;
        public final ZipSingleObserver[] f;
        public final Object[] g;

        public ZipCoordinator(SingleObserver singleObserver, int i, Function function) {
            super(i);
            this.d = singleObserver;
            this.e = function;
            ZipSingleObserver[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver(this, i2);
            }
            this.f = zipSingleObserverArr;
            this.g = new Object[i];
        }

        public final void a(int i, Throwable th) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.b(th);
                return;
            }
            ZipSingleObserver[] zipSingleObserverArr = this.f;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ZipSingleObserver zipSingleObserver = zipSingleObserverArr[i2];
                zipSingleObserver.getClass();
                DisposableHelper.a(zipSingleObserver);
            }
            while (true) {
                i++;
                if (i >= length) {
                    this.d.onError(th);
                    return;
                } else {
                    ZipSingleObserver zipSingleObserver2 = zipSingleObserverArr[i];
                    zipSingleObserver2.getClass();
                    DisposableHelper.a(zipSingleObserver2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver zipSingleObserver : this.f) {
                    zipSingleObserver.getClass();
                    DisposableHelper.a(zipSingleObserver);
                }
            }
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        public final ZipCoordinator d;
        public final int e;

        public ZipSingleObserver(ZipCoordinator zipCoordinator, int i) {
            this.d = zipCoordinator;
            this.e = i;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            DisposableHelper.f(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.a(this.e, th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            ZipCoordinator zipCoordinator = this.d;
            SingleObserver singleObserver = zipCoordinator.d;
            Object[] objArr = zipCoordinator.g;
            objArr[this.e] = obj;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object objMo0apply = zipCoordinator.e.mo0apply(objArr);
                    ObjectHelper.b(objMo0apply, "The zipper returned a null value");
                    singleObserver.onSuccess(objMo0apply);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    singleObserver.onError(th);
                }
            }
        }
    }

    public SingleZipArray(SingleSource[] singleSourceArr, Function function) {
        this.d = singleSourceArr;
        this.e = function;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        SingleSource[] singleSourceArr = this.d;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].a(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.e);
        singleObserver.d(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.b(); i++) {
            SingleSource singleSource = singleSourceArr[i];
            if (singleSource == null) {
                zipCoordinator.a(i, new NullPointerException("One of the sources is null"));
                return;
            }
            singleSource.a(zipCoordinator.f[i]);
        }
    }
}
