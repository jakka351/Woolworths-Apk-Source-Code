package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EncodeStrategy {
    public static final EncodeStrategy d;
    public static final EncodeStrategy e;
    public static final EncodeStrategy f;
    public static final /* synthetic */ EncodeStrategy[] g;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        d = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        e = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
        f = encodeStrategy3;
        g = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) g.clone();
    }
}
