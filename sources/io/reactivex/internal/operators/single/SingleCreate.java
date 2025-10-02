package io.reactivex.internal.operators.single;

import androidx.constraintlayout.core.state.a;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.rx2.RxCancellable;

/* loaded from: classes7.dex */
public final class SingleCreate<T> extends Single<T> {
    public final SingleOnSubscribe d;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {
        public final SingleObserver d;

        public Emitter(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.SingleEmitter
        public final void a(RxCancellable rxCancellable) {
            DisposableHelper.e(this, new CancellableDisposable(rxCancellable));
        }

        @Override // io.reactivex.SingleEmitter, io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleEmitter
        public final boolean c(Throwable th) {
            Disposable andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.d.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.SingleEmitter
        public final void onError(Throwable th) {
            if (c(th)) {
                return;
            }
            RxJavaPlugins.b(th);
        }

        @Override // io.reactivex.SingleEmitter
        public final void onSuccess(Object obj) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.d;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            SingleObserver singleObserver = this.d;
            try {
                if (obj == null) {
                    singleObserver.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    singleObserver.onSuccess(obj);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return a.i(Emitter.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public SingleCreate(SingleOnSubscribe singleOnSubscribe) {
        this.d = singleOnSubscribe;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.d(emitter);
        try {
            this.d.d(emitter);
        } catch (Throwable th) {
            Exceptions.b(th);
            emitter.onError(th);
        }
    }
}
