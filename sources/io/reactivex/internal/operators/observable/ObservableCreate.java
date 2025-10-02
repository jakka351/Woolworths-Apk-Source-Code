package io.reactivex.internal.operators.observable;

import androidx.constraintlayout.core.state.a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.rx2.RxCancellable;
import kotlinx.coroutines.rx2.e;

/* loaded from: classes7.dex */
public final class ObservableCreate<T> extends Observable<T> {
    public final e d;

    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        public final Observer d;

        public CreateEmitter(Observer observer) {
            this.d = observer;
        }

        @Override // io.reactivex.ObservableEmitter
        public final void a(RxCancellable rxCancellable) {
            DisposableHelper.e(this, new CancellableDisposable(rxCancellable));
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (b()) {
                return;
            }
            try {
                this.d.onComplete();
            } finally {
                DisposableHelper.a(this);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
            if (b()) {
                RxJavaPlugins.b(th);
                return;
            }
            try {
                this.d.onError(nullPointerException);
            } finally {
                DisposableHelper.a(this);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (b()) {
                    return;
                }
                this.d.onNext(obj);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return a.i(CreateEmitter.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements ObservableEmitter<T> {
        @Override // io.reactivex.ObservableEmitter
        public final void a(RxCancellable rxCancellable) {
            throw null;
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean b() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th) {
            throw null;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    public ObservableCreate(e eVar) {
        this.d = eVar;
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.d(createEmitter);
        try {
            this.d.a(createEmitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            createEmitter.onError(th);
        }
    }
}
