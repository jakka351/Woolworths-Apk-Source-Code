package io.reactivex.subjects;

import android.support.v4.media.session.a;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class BehaviorSubject<T> extends Subject<T> {
    public static final Object[] j = new Object[0];
    public static final BehaviorDisposable[] k = new BehaviorDisposable[0];
    public static final BehaviorDisposable[] l = new BehaviorDisposable[0];
    public final AtomicReference d;
    public final AtomicReference e;
    public final Lock f;
    public final Lock g;
    public final AtomicReference h;
    public long i;

    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        public final Observer d;
        public final BehaviorSubject e;
        public boolean f;
        public boolean g;
        public AppendOnlyLinkedArrayList h;
        public boolean i;
        public volatile boolean j;
        public long k;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.d = observer;
            this.e = behaviorSubject;
        }

        public final void a(long j, Object obj) {
            if (this.j) {
                return;
            }
            if (!this.i) {
                synchronized (this) {
                    try {
                        if (this.j) {
                            return;
                        }
                        if (this.k == j) {
                            return;
                        }
                        if (this.g) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.h;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.h = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(obj);
                            return;
                        }
                        this.f = true;
                        this.i = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.j;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.e.n(this);
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return this.j || NotificationLite.a(this.d, obj);
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.e = new AtomicReference(k);
        this.d = new AtomicReference();
        this.h = new AtomicReference();
    }

    @Override // io.reactivex.Observer
    public final void d(Disposable disposable) {
        if (this.h.get() != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorDisposable behaviorDisposable = new BehaviorDisposable(observer, this);
        observer.d(behaviorDisposable);
        AtomicReference atomicReference = this.e;
        while (true) {
            BehaviorDisposable[] behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            if (behaviorDisposableArr == l) {
                Throwable th = (Throwable) this.h.get();
                if (th == ExceptionHelper.f24240a) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            BehaviorDisposable[] behaviorDisposableArr2 = new BehaviorDisposable[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
            while (!atomicReference.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2)) {
                if (atomicReference.get() != behaviorDisposableArr) {
                    break;
                }
            }
            if (behaviorDisposable.j) {
                n(behaviorDisposable);
                return;
            }
            if (behaviorDisposable.j) {
                return;
            }
            synchronized (behaviorDisposable) {
                try {
                    if (behaviorDisposable.j) {
                        return;
                    }
                    if (behaviorDisposable.f) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = behaviorDisposable.e;
                    Lock lock = behaviorSubject.f;
                    lock.lock();
                    behaviorDisposable.k = behaviorSubject.i;
                    Object obj = behaviorSubject.d.get();
                    lock.unlock();
                    behaviorDisposable.g = obj != null;
                    behaviorDisposable.f = true;
                    if (obj == null || behaviorDisposable.test(obj)) {
                        return;
                    }
                    while (!behaviorDisposable.j) {
                        synchronized (behaviorDisposable) {
                            try {
                                appendOnlyLinkedArrayList = behaviorDisposable.h;
                                if (appendOnlyLinkedArrayList == null) {
                                    behaviorDisposable.g = false;
                                    return;
                                }
                                behaviorDisposable.h = null;
                            } finally {
                            }
                        }
                        appendOnlyLinkedArrayList.c(behaviorDisposable);
                    }
                    return;
                } finally {
                }
            }
        }
    }

    public final void n(BehaviorDisposable behaviorDisposable) {
        AtomicReference atomicReference;
        BehaviorDisposable[] behaviorDisposableArr;
        BehaviorDisposable[] behaviorDisposableArr2;
        do {
            atomicReference = this.e;
            behaviorDisposableArr = (BehaviorDisposable[]) atomicReference.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = k;
            } else {
                BehaviorDisposable[] behaviorDisposableArr3 = new BehaviorDisposable[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!a.D(atomicReference, behaviorDisposableArr, behaviorDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (com.google.android.gms.common.api.internal.a.u(this.h, ExceptionHelper.f24240a)) {
            AtomicReference atomicReference = this.e;
            BehaviorDisposable[] behaviorDisposableArr = l;
            BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.getAndSet(behaviorDisposableArr);
            NotificationLite notificationLite = NotificationLite.d;
            if (behaviorDisposableArr2 != behaviorDisposableArr) {
                Lock lock = this.g;
                lock.lock();
                this.i++;
                this.d.lazySet(notificationLite);
                lock.unlock();
            }
            for (BehaviorDisposable behaviorDisposable : behaviorDisposableArr2) {
                behaviorDisposable.a(this.i, notificationLite);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!com.google.android.gms.common.api.internal.a.v(this.h, th)) {
            RxJavaPlugins.b(th);
            return;
        }
        Object objE = NotificationLite.e(th);
        Serializable serializable = (Serializable) objE;
        AtomicReference atomicReference = this.e;
        BehaviorDisposable[] behaviorDisposableArr = l;
        BehaviorDisposable[] behaviorDisposableArr2 = (BehaviorDisposable[]) atomicReference.getAndSet(behaviorDisposableArr);
        if (behaviorDisposableArr2 != behaviorDisposableArr) {
            Lock lock = this.g;
            lock.lock();
            this.i++;
            this.d.lazySet(serializable);
            lock.unlock();
        }
        for (BehaviorDisposable behaviorDisposable : behaviorDisposableArr2) {
            behaviorDisposable.a(this.i, objE);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        Lock lock = this.g;
        lock.lock();
        this.i++;
        this.d.lazySet(obj);
        lock.unlock();
        for (BehaviorDisposable behaviorDisposable : (BehaviorDisposable[]) this.e.get()) {
            behaviorDisposable.a(this.i, obj);
        }
    }
}
