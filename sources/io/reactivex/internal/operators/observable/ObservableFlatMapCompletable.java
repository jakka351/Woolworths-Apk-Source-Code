package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final CompositeDisposable f = new CompositeDisposable();
        public Disposable g;

        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return DisposableHelper.c(get());
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                throw null;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                throw null;
            }
        }

        public FlatMapCompletableMainObserver(Observer observer) {
            this.d = observer;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g.b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
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
            this.f.dispose();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            return 2;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.e;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                Observer observer = this.d;
                if (thB != null) {
                    observer.onError(thB);
                } else {
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            dispose();
            if (getAndSet(0) > 0) {
                this.d.onError(ExceptionHelper.b(atomicThrowable));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            return null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new FlatMapCompletableMainObserver(observer));
    }
}
