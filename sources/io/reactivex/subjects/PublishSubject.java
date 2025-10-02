package io.reactivex.subjects;

import android.support.v4.media.session.a;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class PublishSubject<T> extends Subject<T> {
    public static final PublishDisposable[] f = new PublishDisposable[0];
    public static final PublishDisposable[] g = new PublishDisposable[0];
    public final AtomicReference d = new AtomicReference(g);
    public Throwable e;

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {
        public final Observer d;
        public final PublishSubject e;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.d = observer;
            this.e = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.e.n(this);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (this.d.get() == f) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.d(publishDisposable);
        while (true) {
            AtomicReference atomicReference = this.d;
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == f) {
                Throwable th = this.e;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            PublishDisposable[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            while (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                if (atomicReference.get() != publishDisposableArr) {
                    break;
                }
            }
            if (publishDisposable.get()) {
                n(publishDisposable);
                return;
            }
            return;
        }
    }

    public final void n(PublishDisposable publishDisposable) {
        AtomicReference atomicReference;
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            atomicReference = this.d;
            publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == f || publishDisposableArr == (publishDisposableArr2 = g)) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr2 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr2, i, (length - i) - 1);
            }
        } while (!a.D(atomicReference, publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        Object obj2 = f;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.d.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.d;
        Object obj = atomicReference.get();
        Object obj2 = f;
        if (obj == obj2) {
            RxJavaPlugins.b(th);
            return;
        }
        this.e = th;
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (publishDisposable.get()) {
                RxJavaPlugins.b(th);
            } else {
                publishDisposable.d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.d.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.d.onNext(obj);
            }
        }
    }
}
