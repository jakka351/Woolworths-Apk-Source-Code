package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final CompletableObserver d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final ConcatMapInnerObserver f = new ConcatMapInnerObserver(this);
        public SimpleQueue g;
        public Disposable h;
        public volatile boolean i;
        public volatile boolean j;
        public volatile boolean k;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final ConcatMapCompletableObserver d;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.d = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.d;
                concatMapCompletableObserver.i = false;
                concatMapCompletableObserver.a();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.d;
                AtomicThrowable atomicThrowable = concatMapCompletableObserver.e;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                } else {
                    concatMapCompletableObserver.i = false;
                    concatMapCompletableObserver.a();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.d = completableObserver;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.e;
            while (!this.k) {
                if (!this.i) {
                    boolean z = this.j;
                    try {
                        if (this.g.poll() != null) {
                            throw null;
                        }
                        if (z) {
                            this.k = true;
                            atomicThrowable.getClass();
                            Throwable thB = ExceptionHelper.b(atomicThrowable);
                            if (thB != null) {
                                this.d.onError(thB);
                                return;
                            } else {
                                this.d.onComplete();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        this.k = true;
                        this.g.clear();
                        this.h.dispose();
                        atomicThrowable.getClass();
                        ExceptionHelper.a(atomicThrowable, th);
                        this.d.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.g.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.k;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.h, disposable)) {
                this.h = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(3);
                    if (iL == 1) {
                        this.g = queueDisposable;
                        this.j = true;
                        this.d.d(this);
                        a();
                        return;
                    }
                    if (iL == 2) {
                        this.g = queueDisposable;
                        this.d.d(this);
                        return;
                    }
                }
                this.g = new SpscLinkedArrayQueue(0);
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.k = true;
            this.h.dispose();
            ConcatMapInnerObserver concatMapInnerObserver = this.f;
            concatMapInnerObserver.getClass();
            DisposableHelper.a(concatMapInnerObserver);
            if (getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.j = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.j = true;
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (obj != null) {
                this.g.offer(obj);
            }
            a();
        }
    }

    @Override // io.reactivex.Completable
    public final void c(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
