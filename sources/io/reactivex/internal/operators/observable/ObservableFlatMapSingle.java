package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableFlatMapSingle<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class FlatMapSingleObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public Disposable i;
        public volatile boolean j;
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicInteger f = new AtomicInteger(1);
        public final AtomicReference h = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            @Override // io.reactivex.disposables.Disposable
            public final boolean b() {
                return DisposableHelper.c(get());
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                throw null;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                throw null;
            }
        }

        public FlatMapSingleObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            Observer observer = this.d;
            AtomicInteger atomicInteger = this.f;
            AtomicReference atomicReference = this.h;
            int iAddAndGet = 1;
            while (!this.j) {
                if (this.g.get() != null) {
                    AtomicThrowable atomicThrowable = this.g;
                    atomicThrowable.getClass();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.h.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    observer.onError(thB);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                Object objPoll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2) {
                    AtomicThrowable atomicThrowable2 = this.g;
                    atomicThrowable2.getClass();
                    Throwable thB2 = ExceptionHelper.b(atomicThrowable2);
                    if (thB2 != null) {
                        observer.onError(thB2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue3 = (SpscLinkedArrayQueue) this.h.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.j;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.i, disposable)) {
                this.i = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.j = true;
            this.i.dispose();
            this.e.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f.decrementAndGet();
            AtomicThrowable atomicThrowable = this.g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e.dispose();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.i.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new FlatMapSingleObserver(observer));
    }
}
