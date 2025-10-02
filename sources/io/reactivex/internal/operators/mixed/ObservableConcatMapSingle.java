package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {

    public static final class ConcatMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final ConcatMapSingleObserver f = new ConcatMapSingleObserver(this);
        public final SpscLinkedArrayQueue g = new SpscLinkedArrayQueue(0);
        public Disposable h;
        public volatile boolean i;
        public volatile boolean j;
        public Object k;
        public volatile int l;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final ConcatMapSingleMainObserver d;

            public ConcatMapSingleObserver(ConcatMapSingleMainObserver concatMapSingleMainObserver) {
                this.d = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.d;
                AtomicThrowable atomicThrowable = concatMapSingleMainObserver.e;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    RxJavaPlugins.b(th);
                    return;
                }
                concatMapSingleMainObserver.h.dispose();
                concatMapSingleMainObserver.l = 0;
                concatMapSingleMainObserver.a();
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleMainObserver concatMapSingleMainObserver = this.d;
                concatMapSingleMainObserver.k = obj;
                concatMapSingleMainObserver.l = 2;
                concatMapSingleMainObserver.a();
            }
        }

        public ConcatMapSingleMainObserver(Observer observer) {
            this.d = observer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                int r0 = r9.getAndIncrement()
                if (r0 == 0) goto L7
                goto L6c
            L7:
                io.reactivex.Observer r0 = r9.d
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = r9.g
                io.reactivex.internal.util.AtomicThrowable r2 = r9.e
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r9.j
                r6 = 0
                if (r5 == 0) goto L1a
                r1.clear()
                r9.k = r6
                goto L65
            L1a:
                int r5 = r9.l
                r2.get()
                r7 = 0
                if (r5 != 0) goto L58
                boolean r5 = r9.i
                java.lang.Object r8 = r1.poll()
                if (r8 != 0) goto L2b
                r7 = r3
            L2b:
                if (r5 == 0) goto L3d
                if (r7 == 0) goto L3d
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.b(r2)
                if (r1 != 0) goto L39
                r0.onComplete()
                return
            L39:
                r0.onError(r1)
                return
            L3d:
                if (r7 == 0) goto L40
                goto L65
            L40:
                throw r6     // Catch: java.lang.Throwable -> L41
            L41:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.b(r3)
                io.reactivex.disposables.Disposable r4 = r9.h
                r4.dispose()
                r1.clear()
                io.reactivex.internal.util.ExceptionHelper.a(r2, r3)
                java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.b(r2)
                r0.onError(r1)
                return
            L58:
                r8 = 2
                if (r5 != r8) goto L65
                java.lang.Object r5 = r9.k
                r9.k = r6
                r0.onNext(r5)
                r9.l = r7
                goto Lf
            L65:
                int r4 = -r4
                int r4 = r9.addAndGet(r4)
                if (r4 != 0) goto Lf
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.a():void");
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.j;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.h, disposable)) {
                this.h = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.j = true;
            this.h.dispose();
            ConcatMapSingleObserver concatMapSingleObserver = this.f;
            concatMapSingleObserver.getClass();
            DisposableHelper.a(concatMapSingleObserver);
            if (getAndIncrement() == 0) {
                this.g.clear();
                this.k = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.i = true;
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.i = true;
                a();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.g.offer(obj);
            a();
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        new ConcatMapSingleMainObserver(observer);
        throw null;
    }
}
