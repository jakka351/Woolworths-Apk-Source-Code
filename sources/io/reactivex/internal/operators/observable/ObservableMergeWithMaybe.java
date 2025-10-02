package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableMergeWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicReference e = new AtomicReference();
        public final OtherObserver f = new OtherObserver(this);
        public final AtomicThrowable g = new AtomicThrowable();
        public volatile SpscLinkedArrayQueue h;
        public Object i;
        public volatile boolean j;
        public volatile boolean k;
        public volatile int l;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            public final MergeWithObserver d;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.d = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.d;
                mergeWithObserver.l = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.d;
                AtomicThrowable atomicThrowable = mergeWithObserver.g;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                DisposableHelper.a(mergeWithObserver.e);
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                MergeWithObserver mergeWithObserver = this.d;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.d.onNext(obj);
                    mergeWithObserver.l = 2;
                } else {
                    mergeWithObserver.i = obj;
                    mergeWithObserver.l = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.a();
            }
        }

        public MergeWithObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            Observer observer = this.d;
            int iAddAndGet = 1;
            while (!this.j) {
                if (this.g.get() != null) {
                    this.i = null;
                    this.h = null;
                    AtomicThrowable atomicThrowable = this.g;
                    atomicThrowable.getClass();
                    observer.onError(ExceptionHelper.b(atomicThrowable));
                    return;
                }
                int i = this.l;
                if (i == 1) {
                    Object obj = this.i;
                    this.i = null;
                    this.l = 2;
                    observer.onNext(obj);
                    i = 2;
                }
                boolean z = this.k;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.h;
                Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2 && i == 2) {
                    this.h = null;
                    observer.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(objPoll);
                }
            }
            this.i = null;
            this.h = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.e.get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.e, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.j = true;
            DisposableHelper.a(this.e);
            DisposableHelper.a(this.f);
            if (getAndIncrement() == 0) {
                this.h = null;
                this.i = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.k = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.g;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            DisposableHelper.a(this.f);
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (compareAndSet(0, 1)) {
                this.d.onNext(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.h;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(Flowable.d);
                    this.h = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.d(mergeWithObserver);
        this.d.a(mergeWithObserver);
        throw null;
    }
}
