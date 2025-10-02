package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapSingleObserver j = new SwitchMapSingleObserver(null);
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicReference f = new AtomicReference();
        public Disposable g;
        public volatile boolean h;
        public volatile boolean i;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final SwitchMapSingleMainObserver d;
            public volatile Object e;

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver switchMapSingleMainObserver) {
                this.d = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleMainObserver switchMapSingleMainObserver = this.d;
                AtomicReference atomicReference = switchMapSingleMainObserver.f;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapSingleMainObserver.e;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.a(atomicThrowable, th)) {
                            switchMapSingleMainObserver.g.dispose();
                            switchMapSingleMainObserver.a();
                            switchMapSingleMainObserver.c();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.b(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.e = obj;
                this.d.c();
            }
        }

        public SwitchMapSingleMainObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            AtomicReference atomicReference = this.f;
            SwitchMapSingleObserver switchMapSingleObserver = j;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.a(switchMapSingleObserver2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.i;
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.d;
            AtomicThrowable atomicThrowable = this.e;
            AtomicReference atomicReference = this.f;
            int iAddAndGet = 1;
            while (!this.i) {
                if (atomicThrowable.get() != null) {
                    observer.onError(ExceptionHelper.b(atomicThrowable));
                    return;
                }
                boolean z = this.h;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (thB != null) {
                        observer.onError(thB);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2 || switchMapSingleObserver.e == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    observer.onNext(switchMapSingleObserver.e);
                }
            }
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
            this.i = true;
            this.g.dispose();
            a();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.h = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.e;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            a();
            this.h = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            AtomicReference atomicReference = this.f;
            SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver != null) {
                DisposableHelper.a(switchMapSingleObserver);
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                this.g.dispose();
                atomicReference.getAndSet(j);
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        new SwitchMapSingleMainObserver(observer);
        throw null;
    }
}
