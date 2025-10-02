package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {
    public final Observer d;
    public Disposable e;
    public boolean f;
    public AppendOnlyLinkedArrayList g;
    public volatile boolean h;

    public SerializedObserver(Observer observer) {
        this.d = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.e.b();
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (DisposableHelper.l(this.e, disposable)) {
            this.e = disposable;
            this.d.d(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.h) {
            return;
        }
        synchronized (this) {
            try {
                if (this.h) {
                    return;
                }
                if (!this.f) {
                    this.h = true;
                    this.f = true;
                    this.d.onComplete();
                } else {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.g;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.g = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(NotificationLite.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.h) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.h) {
                    if (this.f) {
                        this.h = true;
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.g;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.g = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f24239a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.h = true;
                    this.f = true;
                    z = false;
                }
                if (z) {
                    RxJavaPlugins.b(th);
                } else {
                    this.d.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Object[] objArr;
        if (this.h) {
            return;
        }
        if (obj == null) {
            this.e.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.h) {
                    return;
                }
                if (this.f) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.g;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                        this.g = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.b(obj);
                    return;
                }
                this.f = true;
                this.d.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList2 = this.g;
                            if (appendOnlyLinkedArrayList2 == null) {
                                this.f = false;
                                return;
                            }
                            this.g = null;
                            Observer observer = this.d;
                            for (Object[] objArr2 = appendOnlyLinkedArrayList2.f24239a; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (NotificationLite.c(observer, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }
}
