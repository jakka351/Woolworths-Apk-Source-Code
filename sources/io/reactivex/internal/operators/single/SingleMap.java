package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes7.dex */
public final class SingleMap<T, R> extends Single<R> {
    public final Single d;
    public final Function e;

    public static final class MapSingleObserver<T, R> implements SingleObserver<T> {
        public final SingleObserver d;
        public final Function e;

        public MapSingleObserver(SingleObserver singleObserver, Function function) {
            this.d = singleObserver;
            this.e = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void d(Disposable disposable) {
            this.d.d(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th) {
            this.d.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            try {
                Object objMo0apply = this.e.mo0apply(obj);
                ObjectHelper.b(objMo0apply, "The mapper function returned a null value.");
                this.d.onSuccess(objMo0apply);
            } catch (Throwable th) {
                Exceptions.b(th);
                onError(th);
            }
        }
    }

    public SingleMap(Single single, Function function) {
        this.d = single;
        this.e = function;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new MapSingleObserver(singleObserver, this.e));
    }
}
