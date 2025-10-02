package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableRefCount<T> extends Observable<T> {
    public RefConnection d;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        public final ObservableRefCount d;
        public long e;
        public boolean f;

        public RefConnection(ObservableRefCount observableRefCount) {
            this.d = observableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.d(this, (Disposable) obj);
            synchronized (this.d) {
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.o(this);
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer d;
        public final ObservableRefCount e;
        public final RefConnection f;
        public Disposable g;

        public RefCountObserver(Observer observer, ObservableRefCount observableRefCount, RefConnection refConnection) {
            this.d = observer;
            this.e = observableRefCount;
            this.f = refConnection;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.g, disposable)) {
                this.g = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount observableRefCount = this.e;
                RefConnection refConnection = this.f;
                synchronized (observableRefCount) {
                    try {
                        RefConnection refConnection2 = observableRefCount.d;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.e - 1;
                            refConnection.e = j;
                            if (j == 0 && refConnection.f) {
                                observableRefCount.o(refConnection);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.e.n(this.f);
                this.d.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                this.e.n(this.f);
                this.d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        RefConnection refConnection;
        synchronized (this) {
            try {
                refConnection = this.d;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.d = refConnection;
                }
                long j = refConnection.e + 1;
                refConnection.e = j;
                if (!refConnection.f && j == 0) {
                    refConnection.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        new RefCountObserver(observer, this, refConnection);
        throw null;
    }

    public final void n(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.d;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    refConnection.getClass();
                    long j = refConnection.e - 1;
                    refConnection.e = j;
                    if (j == 0) {
                        this.d = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.e == 0 && refConnection == this.d) {
                    this.d = null;
                    refConnection.get();
                    DisposableHelper.a(refConnection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
