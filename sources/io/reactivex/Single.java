package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.operators.single.SingleError;
import io.reactivex.internal.operators.single.SingleJust;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleToObservable;
import io.reactivex.internal.operators.single.SingleZipArray;

/* loaded from: classes.dex */
public abstract class Single<T> implements SingleSource<T> {
    public static SingleError c(Throwable th) {
        ObjectHelper.b(th, "exception is null");
        return new SingleError(Functions.d(th));
    }

    public static SingleJust e(Object obj) {
        ObjectHelper.b(obj, "item is null");
        return new SingleJust(obj);
    }

    public static SingleZipArray j(Single single, Single single2, BiFunction biFunction) {
        ObjectHelper.b(single, "source1 is null");
        return new SingleZipArray(new SingleSource[]{single, single2}, Functions.f(biFunction));
    }

    @Override // io.reactivex.SingleSource
    public final void a(SingleObserver singleObserver) {
        ObjectHelper.b(singleObserver, "observer is null");
        try {
            g(singleObserver);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final SingleObserveOn f(Scheduler scheduler) {
        ObjectHelper.b(scheduler, "scheduler is null");
        return new SingleObserveOn(this, scheduler);
    }

    public abstract void g(SingleObserver singleObserver);

    public final SingleSubscribeOn h(Scheduler scheduler) {
        ObjectHelper.b(scheduler, "scheduler is null");
        return new SingleSubscribeOn(this, scheduler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable i() {
        return this instanceof FuseToObservable ? ((FuseToObservable) this).b() : new SingleToObservable(this);
    }
}
