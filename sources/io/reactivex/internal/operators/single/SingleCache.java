package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {
    public static final CacheDisposable[] i = new CacheDisposable[0];
    public static final CacheDisposable[] j = new CacheDisposable[0];
    public final Single d;
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicReference f = new AtomicReference(i);
    public Object g;
    public Throwable h;

    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {
        public final SingleObserver d;
        public final SingleCache e;

        public CacheDisposable(SingleObserver singleObserver, SingleCache singleCache) {
            this.d = singleObserver;
            this.e = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.e.k(this);
            }
        }
    }

    public SingleCache(Single single) {
        this.d = single;
    }

    @Override // io.reactivex.SingleObserver
    public final void d(Disposable disposable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.d(cacheDisposable);
        while (true) {
            AtomicReference atomicReference = this.f;
            CacheDisposable[] cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            if (cacheDisposableArr == j) {
                Throwable th = this.h;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.g);
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            CacheDisposable[] cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
            while (!atomicReference.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                if (atomicReference.get() != cacheDisposableArr) {
                    break;
                }
            }
            if (cacheDisposable.get()) {
                k(cacheDisposable);
            }
            if (this.e.getAndIncrement() == 0) {
                this.d.a(this);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f;
            CacheDisposable[] cacheDisposableArr2 = (CacheDisposable[]) atomicReference.get();
            int length = cacheDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (cacheDisposableArr2[i2] == cacheDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr = i;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr2, 0, cacheDisposableArr3, 0, i2);
                System.arraycopy(cacheDisposableArr2, i2 + 1, cacheDisposableArr3, i2, (length - i2) - 1);
                cacheDisposableArr = cacheDisposableArr3;
            }
            while (!atomicReference.compareAndSet(cacheDisposableArr2, cacheDisposableArr)) {
                if (atomicReference.get() != cacheDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(Throwable th) {
        this.h = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f.getAndSet(j)) {
            if (!cacheDisposable.get()) {
                cacheDisposable.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(Object obj) {
        this.g = obj;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f.getAndSet(j)) {
            if (!cacheDisposable.get()) {
                cacheDisposable.d.onSuccess(obj);
            }
        }
    }
}
