package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes7.dex */
public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        public final Observer d;
        public Disposable e;
        public QueueDisposable f;
        public boolean g;

        public DoFinallyObserver(Observer observer) {
            this.d = observer;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.b(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f.clear();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.e, disposable)) {
                this.e = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f = (QueueDisposable) disposable;
                }
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e.dispose();
            a();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int l(int i) {
            QueueDisposable queueDisposable = this.f;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int iL = queueDisposable.l(i);
            if (iL != 0) {
                this.g = iL == 1;
            }
            return iL;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.d.onComplete();
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.d.onError(th);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.d.onNext(obj);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll == null && this.g) {
                a();
            }
            return objPoll;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new DoFinallyObserver(observer));
    }
}
