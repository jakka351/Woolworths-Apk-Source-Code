package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class StateObservable<T> implements Observable<T> {
    public final AtomicReference b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f501a = new Object();
    public int c = 0;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();

    @AutoValue
    public static abstract class ErrorWrapper {
        public abstract Throwable a();
    }

    public static final class ObserverWrapper<T> implements Runnable {
        public static final Object k = new Object();
        public final Executor d;
        public final Observable.Observer e;
        public final AtomicReference g;
        public final AtomicBoolean f = new AtomicBoolean(true);
        public Object h = k;
        public int i = -1;
        public boolean j = false;

        public ObserverWrapper(AtomicReference atomicReference, Executor executor, Observable.Observer observer) {
            this.g = atomicReference;
            this.d = executor;
            this.e = observer;
        }

        public final void a(int i) {
            synchronized (this) {
                try {
                    if (this.f.get()) {
                        if (i <= this.i) {
                            return;
                        }
                        this.i = i;
                        if (this.j) {
                            return;
                        }
                        this.j = true;
                        try {
                            this.d.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.j = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    if (!this.f.get()) {
                        this.j = false;
                        return;
                    }
                    Object obj = this.g.get();
                    int i = this.i;
                    while (true) {
                        if (!Objects.equals(this.h, obj)) {
                            this.h = obj;
                            if (obj instanceof ErrorWrapper) {
                                this.e.onError(((ErrorWrapper) obj).a());
                            } else {
                                this.e.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.i || !this.f.get()) {
                                    break;
                                }
                                obj = this.g.get();
                                i = this.i;
                            } finally {
                            }
                        }
                    }
                    this.j = false;
                } finally {
                }
            }
        }
    }

    public StateObservable(Object obj) {
        this.b = new AtomicReference(obj);
    }

    public final void a(Observable.Observer observer) {
        ObserverWrapper observerWrapper = (ObserverWrapper) this.e.remove(observer);
        if (observerWrapper != null) {
            observerWrapper.f.set(false);
            this.f.remove(observerWrapper);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture b() {
        Object obj = this.b.get();
        return obj instanceof ErrorWrapper ? Futures.e(((ErrorWrapper) obj).a()) : Futures.g(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void c(Executor executor, Observable.Observer observer) {
        ObserverWrapper observerWrapper;
        synchronized (this.f501a) {
            a(observer);
            observerWrapper = new ObserverWrapper(this.b, executor, observer);
            this.e.put(observer, observerWrapper);
            this.f.add(observerWrapper);
        }
        observerWrapper.a(0);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void d(Observable.Observer observer) {
        synchronized (this.f501a) {
            a(observer);
        }
    }

    public final void e(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f501a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.c + 1;
                this.c = i2;
                if (this.d) {
                    return;
                }
                this.d = true;
                Iterator it2 = this.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((ObserverWrapper) it2.next()).a(i2);
                    } else {
                        synchronized (this.f501a) {
                            try {
                                if (this.c == i2) {
                                    this.d = false;
                                    return;
                                } else {
                                    it = this.f.iterator();
                                    i = this.c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }
}
