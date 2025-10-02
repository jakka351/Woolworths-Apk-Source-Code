package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class ObservableRepeatWhen<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {
            @Override // io.reactivex.Observer
            public final void d(Disposable disposable) {
                DisposableHelper.f(this, disposable);
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

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            DisposableHelper.f(null, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.d(null, null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            HalfSerializer.e(null, obj, this, null);
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        new PublishSubject();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.e(th, observer);
        }
    }
}
