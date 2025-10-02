package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleUsing<T, U> extends Single<T> {

    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {
        public Disposable d;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.d.b();
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.d, disposable)) {
                this.d = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.dispose();
            this.d = DisposableHelper.d;
            if (getAndSet(this) == this) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d = DisposableHelper.d;
            throw null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d = DisposableHelper.d;
            throw null;
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
