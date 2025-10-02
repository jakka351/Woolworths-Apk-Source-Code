package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class ObservableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class BufferedTimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MapToInt implements Function<Object, Object> {
        public static final /* synthetic */ MapToInt[] d = {new MapToInt("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        MapToInt EF5;

        public static MapToInt valueOf(String str) {
            return (MapToInt) Enum.valueOf(MapToInt.class, str);
        }

        public static MapToInt[] values() {
            return (MapToInt[]) d.clone();
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            return 0;
        }
    }

    public static final class ObserverOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
            throw null;
        }
    }

    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class ObserverOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Observable<T>, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            throw null;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            throw null;
        }
    }

    public static final class TimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            int i = Flowable.d;
            ObjectHelper.b(null, "zipper is null");
            throw null;
        }
    }
}
