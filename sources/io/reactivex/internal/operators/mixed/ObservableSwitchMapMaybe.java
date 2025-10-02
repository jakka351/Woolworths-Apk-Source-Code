package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapMaybeObserver j = new SwitchMapMaybeObserver(null);
        public final Observer d;
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicReference f = new AtomicReference();
        public Disposable g;
        public volatile boolean h;
        public volatile boolean i;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            public final SwitchMapMaybeMainObserver d;
            public volatile Object e;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver switchMapMaybeMainObserver) {
                this.d = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.d;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                switchMapMaybeMainObserver.c();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th) {
                SwitchMapMaybeMainObserver switchMapMaybeMainObserver = this.d;
                AtomicReference atomicReference = switchMapMaybeMainObserver.f;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapMaybeMainObserver.e;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.a(atomicThrowable, th)) {
                            switchMapMaybeMainObserver.g.dispose();
                            switchMapMaybeMainObserver.a();
                            switchMapMaybeMainObserver.c();
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.b(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(Object obj) {
                this.e = obj;
                this.d.c();
            }
        }

        public SwitchMapMaybeMainObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            AtomicReference atomicReference = this.f;
            SwitchMapMaybeObserver switchMapMaybeObserver = j;
            SwitchMapMaybeObserver switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.a(switchMapMaybeObserver2);
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
                SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
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
                if (z2 || switchMapMaybeObserver.e == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    observer.onNext(switchMapMaybeObserver.e);
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
            SwitchMapMaybeObserver switchMapMaybeObserver = (SwitchMapMaybeObserver) atomicReference.get();
            if (switchMapMaybeObserver != null) {
                DisposableHelper.a(switchMapMaybeObserver);
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
        new SwitchMapMaybeMainObserver(observer);
        throw null;
    }
}
