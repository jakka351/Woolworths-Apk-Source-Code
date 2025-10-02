package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.FlowableFromObservable;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableError;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableJust;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    /* renamed from: io.reactivex.Observable$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24219a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f24219a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24219a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24219a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24219a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static ObservableError b(Throwable th) {
        ObjectHelper.b(th, "exception is null");
        return new ObservableError(Functions.d(th));
    }

    public static ObservableJust e(Object obj) {
        ObjectHelper.b(obj, "item is null");
        return new ObservableJust(obj);
    }

    public static ObservableTimer k(long j, TimeUnit timeUnit) {
        Scheduler scheduler = Schedulers.b;
        ObjectHelper.b(timeUnit, "unit is null");
        ObjectHelper.b(scheduler, "scheduler is null");
        return new ObservableTimer(Math.max(j, 0L), timeUnit, scheduler);
    }

    public static ObservableZip m(ObservableSource observableSource, ObservableSource observableSource2, BiFunction biFunction) {
        ObjectHelper.b(observableSource, "source1 is null");
        ObjectHelper.b(observableSource2, "source2 is null");
        Function functionF = Functions.f(biFunction);
        int i = Flowable.d;
        ObservableSource[] observableSourceArr = {observableSource, observableSource2};
        ObjectHelper.c(i, "bufferSize");
        return new ObservableZip(observableSourceArr, functionF, i);
    }

    @Override // io.reactivex.ObservableSource
    public final void a(Observer observer) {
        ObjectHelper.b(observer, "observer is null");
        try {
            h(observer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.b(th);
            RxJavaPlugins.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable c(Function function, int i) throws Exception {
        int i2 = Flowable.d;
        ObjectHelper.c(i, "maxConcurrency");
        ObjectHelper.c(i2, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return new ObservableFlatMap(this, function, i, i2);
        }
        T tCall = ((ScalarCallable) this).call();
        return tCall == null ? ObservableEmpty.d : ObservableScalarXMap.a(tCall, function);
    }

    public final ObservableObserveOn f(Scheduler scheduler) {
        int i = Flowable.d;
        ObjectHelper.b(scheduler, "scheduler is null");
        ObjectHelper.c(i, "bufferSize");
        return new ObservableObserveOn(this, scheduler, i);
    }

    public final LambdaObserver g(Consumer consumer) {
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, Functions.e);
        a(lambdaObserver);
        return lambdaObserver;
    }

    public abstract void h(Observer observer);

    public final ObservableSubscribeOn i(Scheduler scheduler) {
        ObjectHelper.b(scheduler, "scheduler is null");
        return new ObservableSubscribeOn(this, scheduler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable j(Function function) throws Exception {
        int i = Flowable.d;
        ObjectHelper.c(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return new ObservableSwitchMap(this, function, i);
        }
        T tCall = ((ScalarCallable) this).call();
        return tCall == null ? ObservableEmpty.d : ObservableScalarXMap.a(tCall, function);
    }

    public final Flowable l(BackpressureStrategy backpressureStrategy) {
        FlowableFromObservable flowableFromObservable = new FlowableFromObservable(this);
        int iOrdinal = backpressureStrategy.ordinal();
        if (iOrdinal == 0) {
            return flowableFromObservable;
        }
        if (iOrdinal == 1) {
            return new FlowableOnBackpressureError(flowableFromObservable);
        }
        if (iOrdinal == 3) {
            return new FlowableOnBackpressureDrop(flowableFromObservable);
        }
        if (iOrdinal == 4) {
            return new FlowableOnBackpressureLatest(flowableFromObservable);
        }
        int i = Flowable.d;
        ObjectHelper.c(i, "capacity");
        return new FlowableOnBackpressureBuffer(flowableFromObservable, i);
    }
}
