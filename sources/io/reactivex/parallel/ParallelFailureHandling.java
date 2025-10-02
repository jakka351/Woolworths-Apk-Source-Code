package io.reactivex.parallel;

import io.reactivex.functions.BiFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    public static final /* synthetic */ ParallelFailureHandling[] d = {new ParallelFailureHandling("STOP", 0), new ParallelFailureHandling("ERROR", 1), new ParallelFailureHandling("SKIP", 2), new ParallelFailureHandling("RETRY", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ParallelFailureHandling EF5;

    public static ParallelFailureHandling valueOf(String str) {
        return (ParallelFailureHandling) Enum.valueOf(ParallelFailureHandling.class, str);
    }

    public static ParallelFailureHandling[] values() {
        return (ParallelFailureHandling[]) d.clone();
    }

    @Override // io.reactivex.functions.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return this;
    }
}
