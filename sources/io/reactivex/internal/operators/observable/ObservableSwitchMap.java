package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function e;
    public final int f;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        public final SwitchMapObserver d;
        public final long e;
        public final int f;
        public volatile SimpleQueue g;
        public volatile boolean h;

        public SwitchMapInnerObserver(SwitchMapObserver switchMapObserver, long j, int i) {
            this.d = switchMapObserver;
            this.e = j;
            this.f = i;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iL = queueDisposable.l(7);
                    if (iL == 1) {
                        this.g = queueDisposable;
                        this.h = true;
                        this.d.c();
                        return;
                    } else if (iL == 2) {
                        this.g = queueDisposable;
                        return;
                    }
                }
                this.g = new SpscLinkedArrayQueue(this.f);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.e == this.d.l) {
                this.h = true;
                this.d.c();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            SwitchMapObserver switchMapObserver = this.d;
            switchMapObserver.getClass();
            if (this.e == switchMapObserver.l) {
                AtomicThrowable atomicThrowable = switchMapObserver.g;
                atomicThrowable.getClass();
                if (ExceptionHelper.a(atomicThrowable, th)) {
                    switchMapObserver.j.dispose();
                    switchMapObserver.h = true;
                    this.h = true;
                    switchMapObserver.c();
                    return;
                }
            }
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.e == this.d.l) {
                if (obj != null) {
                    this.g.offer(obj);
                }
                this.d.c();
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final SwitchMapInnerObserver m;
        public final Observer d;
        public final Function e;
        public final int f;
        public volatile boolean h;
        public volatile boolean i;
        public Disposable j;
        public volatile long l;
        public final AtomicReference k = new AtomicReference();
        public final AtomicThrowable g = new AtomicThrowable();

        static {
            SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(null, -1L, 1);
            m = switchMapInnerObserver;
            DisposableHelper.a(switchMapInnerObserver);
        }

        public SwitchMapObserver(Observer observer, Function function, int i) {
            this.d = observer;
            this.e = function;
            this.f = i;
        }

        public final void a() {
            SwitchMapInnerObserver switchMapInnerObserver;
            AtomicReference atomicReference = this.k;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.get();
            SwitchMapInnerObserver switchMapInnerObserver3 = m;
            if (switchMapInnerObserver2 == switchMapInnerObserver3 || (switchMapInnerObserver = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver3)) == switchMapInnerObserver3 || switchMapInnerObserver == null) {
                return;
            }
            DisposableHelper.a(switchMapInnerObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.i;
        }

        /* JADX WARN: Removed duplicated region for block: B:92:0x00ee A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x000e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver.c():void");
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.j.dispose();
            a();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (!this.h) {
                AtomicThrowable atomicThrowable = this.g;
                atomicThrowable.getClass();
                if (ExceptionHelper.a(atomicThrowable, th)) {
                    a();
                    this.h = true;
                    c();
                    return;
                }
            }
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            long j = this.l + 1;
            this.l = j;
            SwitchMapInnerObserver switchMapInnerObserver = (SwitchMapInnerObserver) this.k.get();
            if (switchMapInnerObserver != null) {
                DisposableHelper.a(switchMapInnerObserver);
            }
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The ObservableSource returned is null");
                ObservableSource observableSource = (ObservableSource) objMo0apply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this, j, this.f);
                while (true) {
                    SwitchMapInnerObserver switchMapInnerObserver3 = (SwitchMapInnerObserver) this.k.get();
                    if (switchMapInnerObserver3 == m) {
                        return;
                    }
                    AtomicReference atomicReference = this.k;
                    while (!atomicReference.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                        if (atomicReference.get() != switchMapInnerObserver3) {
                            break;
                        }
                    }
                    observableSource.a(switchMapInnerObserver2);
                    return;
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.j.dispose();
                onError(th);
            }
        }
    }

    public ObservableSwitchMap(Observable observable, Function function, int i) {
        super(observable);
        this.e = function;
        this.f = i;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        ObservableSource observableSource = this.d;
        Function function = this.e;
        if (ObservableScalarXMap.b(observableSource, observer, function)) {
            return;
        }
        observableSource.a(new SwitchMapObserver(observer, function, this.f));
    }
}
