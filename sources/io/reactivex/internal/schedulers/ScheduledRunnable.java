package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes7.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static final Object h = new Object();
    public final Runnable d;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.d = runnable;
        lazySet(0, disposableContainer);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == h) {
                return;
            }
            if (obj == f) {
                future.cancel(false);
                return;
            } else if (obj == g) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        Object obj = get(0);
        return obj == e || obj == h;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = h;
            if (obj6 == obj || obj6 == (obj4 = f) || obj6 == (obj5 = g)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = e) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = g;
        Object obj5 = f;
        Object obj6 = e;
        Object obj7 = h;
        lazySet(2, Thread.currentThread());
        try {
            this.d.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((DisposableContainer) obj2).c(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((DisposableContainer) obj2).c(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
