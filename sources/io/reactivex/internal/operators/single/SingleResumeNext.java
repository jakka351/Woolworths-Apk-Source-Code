package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class SingleResumeNext<T> extends Single<T> {
    public final Single d;
    public final Function e;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver d;
        public final Function e;

        public ResumeMainSingleObserver(SingleObserver singleObserver, Function function) {
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
            SingleObserver singleObserver = this.d;
            try {
                Object objMo0apply = this.e.mo0apply(th);
                ObjectHelper.b(objMo0apply, "The nextFunction returned a null SingleSource.");
                ((SingleSource) objMo0apply).a(new ResumeSingleObserver(this, singleObserver));
            } catch (Throwable th2) {
                Exceptions.b(th2);
                singleObserver.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            this.d.onSuccess(obj);
        }
    }

    public SingleResumeNext(Single single, Function function) {
        this.d = single;
        this.e = function;
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        this.d.a(new ResumeMainSingleObserver(singleObserver, this.e));
    }
}
