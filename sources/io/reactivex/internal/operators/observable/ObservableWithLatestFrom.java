package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {
        public final SerializedObserver d;
        public final AtomicReference e = new AtomicReference();
        public final AtomicReference f = new AtomicReference();

        public WithLatestFromObserver(SerializedObserver serializedObserver) {
            this.d = serializedObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c((Disposable) this.e.get());
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(this.e, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this.e);
            DisposableHelper.a(this.f);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.a(this.f);
            this.d.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            this.d.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (get() == null) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                dispose();
                this.d.onError(th);
            }
        }
    }

    public final class WithLatestFromOtherObserver implements Observer<U> {
        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
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
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        serializedObserver.d(new WithLatestFromObserver(serializedObserver));
        throw null;
    }
}
