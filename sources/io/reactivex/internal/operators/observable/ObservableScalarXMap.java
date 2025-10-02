package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        public final Observer d;
        public final Object e;

        public ScalarDisposable(Observer observer, Object obj) {
            this.d = observer;
            this.e = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return get() == 3;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                Object obj = this.e;
                Observer observer = this.d;
                observer.onNext(obj);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }
    }

    public static final class ScalarXMapObservable<T, R> extends Observable<R> {
        public final Object d;
        public final Function e;

        public ScalarXMapObservable(Object obj, Function function) {
            this.d = obj;
            this.e = function;
        }

        @Override // io.reactivex.Observable
        public final void h(Observer observer) {
            try {
                Object objMo0apply = this.e.mo0apply(this.d);
                ObjectHelper.b(objMo0apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objMo0apply;
                if (!(observableSource instanceof Callable)) {
                    observableSource.a(observer);
                    return;
                }
                try {
                    Object objCall = ((Callable) observableSource).call();
                    if (objCall == null) {
                        EmptyDisposable.a(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall);
                    observer.d(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    EmptyDisposable.e(th, observer);
                }
            } catch (Throwable th2) {
                EmptyDisposable.e(th2, observer);
            }
        }
    }

    public static Observable a(Object obj, Function function) {
        return new ScalarXMapObservable(obj, function);
    }

    public static boolean b(ObservableSource observableSource, Observer observer, Function function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) observableSource).call();
            if (objCall == null) {
                EmptyDisposable.a(observer);
                return true;
            }
            try {
                Object objMo0apply = function.mo0apply(objCall);
                ObjectHelper.b(objMo0apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objMo0apply;
                if (!(observableSource2 instanceof Callable)) {
                    observableSource2.a(observer);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) observableSource2).call();
                    if (objCall2 == null) {
                        EmptyDisposable.a(observer);
                        return true;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall2);
                    observer.d(scalarDisposable);
                    scalarDisposable.run();
                    return true;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    EmptyDisposable.e(th, observer);
                    return true;
                }
            } catch (Throwable th2) {
                Exceptions.b(th2);
                EmptyDisposable.e(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.b(th3);
            EmptyDisposable.e(th3, observer);
            return true;
        }
    }
}
