package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public final void a() {
            T andSet = getAndSet(null);
            if (andSet == null) {
                throw null;
            }
            this.d.onNext(andSet);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public final void a() {
            this.d.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.d.onNext(andSet);
            }
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        public final SerializedObserver d;
        public final AtomicReference e = new AtomicReference();
        public Disposable f;

        public SampleTimedObserver(SerializedObserver serializedObserver) {
            this.d = serializedObserver;
        }

        public abstract void a();

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f.b();
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.e);
            this.f.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.a(this.e);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.e);
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            lazySet(obj);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new SampleTimedNoLast(new SerializedObserver(observer)));
    }
}
