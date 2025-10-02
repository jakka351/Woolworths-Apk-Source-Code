package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void c() {
            throw null;
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void a() {
            this.d.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public final void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.d.onNext(andSet);
            }
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {
        public final SerializedObserver d;
        public final AtomicReference e = new AtomicReference();
        public Disposable f;

        public SampleMainObserver(SerializedObserver serializedObserver) {
            this.d = serializedObserver;
        }

        public abstract void a();

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.get() == DisposableHelper.d;
        }

        public abstract void c();

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.f, disposable)) {
                this.f = disposable;
                this.d.d(this);
                if (this.e.get() == null) {
                    throw null;
                }
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

    public static final class SamplerObserver<T> implements Observer<Object> {
        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            throw null;
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
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new SampleMainNoLast(new SerializedObserver(observer)));
    }
}
