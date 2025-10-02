package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
final class SerializedSubject<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
    public boolean d;
    public AppendOnlyLinkedArrayList e;
    public volatile boolean f;

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        boolean z = true;
        if (!this.f) {
            synchronized (this) {
                try {
                    if (!this.f) {
                        if (this.d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(NotificationLite.d(disposable));
                            return;
                        }
                        this.d = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (!z) {
            throw null;
        }
        disposable.dispose();
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                if (!this.d) {
                    this.d = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.e = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.b(NotificationLite.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f) {
            RxJavaPlugins.b(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f) {
                    this.f = true;
                    if (this.d) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                            this.e = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.f24239a[0] = NotificationLite.e(th);
                        return;
                    }
                    this.d = true;
                    z = false;
                }
                if (!z) {
                    throw null;
                }
                RxJavaPlugins.b(th);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    throw null;
                }
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                    this.e = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        throw null;
    }
}
