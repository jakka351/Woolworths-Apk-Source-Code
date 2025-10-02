package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    public static final class BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        public final Observer d;
        public Collection e;
        public int f;
        public Disposable g;

        public BufferExactObserver(Observer observer) {
            this.d = observer;
        }

        public final boolean a() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.e = null;
                Disposable disposable = this.g;
                Observer observer = this.d;
                if (disposable == null) {
                    EmptyDisposable.e(th, observer);
                    return false;
                }
                disposable.dispose();
                observer.onError(th);
                return false;
            }
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
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Collection collection = this.e;
            if (collection != null) {
                this.e = null;
                boolean zIsEmpty = collection.isEmpty();
                Observer observer = this.d;
                if (!zIsEmpty) {
                    observer.onNext(collection);
                }
                observer.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.e = null;
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Collection collection = this.e;
            if (collection != null) {
                collection.add(obj);
                int i = this.f + 1;
                this.f = i;
                if (i >= 0) {
                    this.d.onNext(collection);
                    this.f = 0;
                    a();
                }
            }
        }
    }

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {
        public Disposable d;
        public long e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onNext(java.lang.Object r5) {
            /*
                r4 = this;
                long r0 = r4.e
                r2 = 1
                long r2 = r2 + r0
                r4.e = r2
                r5 = 0
                long r2 = (long) r5
                long r0 = r0 % r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r0 = 0
                if (r5 != 0) goto L13
                throw r0     // Catch: java.lang.Throwable -> L12
            L12:
                throw r0
            L13:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableBuffer.BufferSkipObserver.onNext(java.lang.Object):void");
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        new BufferExactObserver(observer).a();
    }
}
