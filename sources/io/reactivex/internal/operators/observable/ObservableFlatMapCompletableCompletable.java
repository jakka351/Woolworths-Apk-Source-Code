package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Disposable, Observer<T> {
        public final CompletableObserver d;
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

        public FlatMapCompletableMainObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
            lazySet(1);
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
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                AtomicThrowable atomicThrowable = this.e;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                CompletableObserver completableObserver = this.d;
                if (thB != null) {
                    completableObserver.onError(thB);
                } else {
                    completableObserver.onComplete();
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
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final Observable b() {
        return new ObservableFlatMapCompletable(null);
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new FlatMapCompletableMainObserver(completableObserver);
        throw null;
    }
}
