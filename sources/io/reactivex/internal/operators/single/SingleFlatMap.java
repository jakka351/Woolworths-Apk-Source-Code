package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleFlatMap<T, R> extends Single<R> {
    public final Single d;
    public final Function e;

    public static final class SingleFlatMapCallback<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver d;
        public final Function e;

        public static final class FlatMapSingleObserver<R> implements SingleObserver<R> {
            public final AtomicReference d;
            public final SingleObserver e;

            public FlatMapSingleObserver(AtomicReference atomicReference, SingleObserver singleObserver) {
                this.d = atomicReference;
                this.e = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void d(Disposable disposable) {
                DisposableHelper.d(this.d, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th) {
                this.e.onError(th);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(Object obj) {
                this.e.onSuccess(obj);
            }
        }

        public SingleFlatMapCallback(SingleObserver singleObserver, Function function) {
            this.d = singleObserver;
            this.e = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return DisposableHelper.c(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            if (DisposableHelper.f(this, disposable)) {
                this.d.d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            SingleObserver singleObserver = this.d;
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The single returned by the mapper is null");
                SingleSource singleSource = (SingleSource) objMo0apply;
                if (b()) {
                    return;
                }
                singleSource.a(new FlatMapSingleObserver(this, singleObserver));
            } catch (Throwable th) {
                Exceptions.b(th);
                singleObserver.onError(th);
            }
        }
    }

    public SingleFlatMap(Single single, Function function) {
        this.e = function;
        this.d = single;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new SingleFlatMapCallback(singleObserver, this.e));
    }
}
