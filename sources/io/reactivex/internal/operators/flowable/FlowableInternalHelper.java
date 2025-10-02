package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, Publisher<U>> {
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

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, Publisher<R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, Publisher<T>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, Publisher<R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestMax implements Consumer<Subscription> {
        public static final /* synthetic */ RequestMax[] d = {new RequestMax("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        RequestMax EF5;

        public static RequestMax valueOf(String str) {
            return (RequestMax) Enum.valueOf(RequestMax.class, str);
        }

        public static RequestMax[] values() {
            return (RequestMax[]) d.clone();
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            ((Subscription) obj).request(Long.MAX_VALUE);
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

    public static final class SubscriberOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public final void run() {
            throw null;
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            throw null;
        }
    }

    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            throw null;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<Publisher<? extends T>>, Publisher<? extends R>> {
        @Override // io.reactivex.functions.Function
        /* renamed from: apply */
        public final Object mo0apply(Object obj) {
            int i = Flowable.d;
            ObjectHelper.b(null, "zipper is null");
            throw null;
        }
    }
}
