package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class CompletableCache extends Completable implements CompletableObserver {
    public static final InnerCompletableCache[] h = new InnerCompletableCache[0];
    public static final InnerCompletableCache[] i = new InnerCompletableCache[0];
    public final Completable d;
    public final AtomicReference e = new AtomicReference(h);
    public final AtomicBoolean f = new AtomicBoolean();
    public Throwable g;

    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {
        public final CompletableObserver d;

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.e(this);
            }
        }
    }

    public CompletableCache(Completable completable) {
        this.d = completable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(completableObserver);
        completableObserver.d(innerCompletableCache);
        while (true) {
            AtomicReference atomicReference = this.e;
            InnerCompletableCache[] innerCompletableCacheArr = (InnerCompletableCache[]) atomicReference.get();
            if (innerCompletableCacheArr == i) {
                Throwable th = this.g;
                if (th != null) {
                    completableObserver.onError(th);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = innerCompletableCacheArr.length;
            InnerCompletableCache[] innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
            while (!atomicReference.compareAndSet(innerCompletableCacheArr, innerCompletableCacheArr2)) {
                if (atomicReference.get() != innerCompletableCacheArr) {
                    break;
                }
            }
            if (innerCompletableCache.get()) {
                e(innerCompletableCache);
            }
            if (this.f.compareAndSet(false, true)) {
                this.d.a(this);
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void d(Disposable disposable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        while (true) {
            AtomicReference atomicReference = this.e;
            InnerCompletableCache[] innerCompletableCacheArr2 = (InnerCompletableCache[]) atomicReference.get();
            int length = innerCompletableCacheArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (innerCompletableCacheArr2[i2] == innerCompletableCache) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr = h;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr2, 0, innerCompletableCacheArr3, 0, i2);
                System.arraycopy(innerCompletableCacheArr2, i2 + 1, innerCompletableCacheArr3, i2, (length - i2) - 1);
                innerCompletableCacheArr = innerCompletableCacheArr3;
            }
            while (!atomicReference.compareAndSet(innerCompletableCacheArr2, innerCompletableCacheArr)) {
                if (atomicReference.get() != innerCompletableCacheArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onComplete() {
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.e.getAndSet(i)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.d.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(Throwable th) {
        this.g = th;
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.e.getAndSet(i)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.d.onError(th);
            }
        }
    }
}
