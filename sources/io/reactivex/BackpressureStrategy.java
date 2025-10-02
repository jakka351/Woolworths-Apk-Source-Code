package io.reactivex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BackpressureStrategy {
    public static final BackpressureStrategy d;
    public static final BackpressureStrategy e;
    public static final /* synthetic */ BackpressureStrategy[] f;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        d = backpressureStrategy;
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy("ERROR", 1);
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        BackpressureStrategy backpressureStrategy4 = new BackpressureStrategy("DROP", 3);
        BackpressureStrategy backpressureStrategy5 = new BackpressureStrategy("LATEST", 4);
        e = backpressureStrategy5;
        f = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, backpressureStrategy4, backpressureStrategy5};
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) f.clone();
    }
}
