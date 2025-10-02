package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public final Observer d;
        public long e;
        public Disposable f;
        public UnicastSubject g;
        public volatile boolean h;

        public WindowExactObserver(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.h;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.h = true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            UnicastSubject unicastSubject = this.g;
            if (unicastSubject != null) {
                this.g = null;
                unicastSubject.onComplete();
            }
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            UnicastSubject unicastSubject = this.g;
            if (unicastSubject != null) {
                this.g = null;
                unicastSubject.onError(th);
            }
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            UnicastSubject unicastSubject = this.g;
            if (unicastSubject == null && !this.h) {
                unicastSubject = new UnicastSubject(this);
                this.g = unicastSubject;
                this.d.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(obj);
                long j = this.e + 1;
                this.e = j;
                if (j >= 0) {
                    this.e = 0L;
                    this.g = null;
                    unicastSubject.onComplete();
                    if (this.h) {
                        this.f.dispose();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.h) {
                this.f.dispose();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {
        public volatile boolean d;
        public Disposable e;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d = true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (0 % 0 != 0 || !this.d) {
                throw null;
            }
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new WindowExactObserver(observer));
    }
}
