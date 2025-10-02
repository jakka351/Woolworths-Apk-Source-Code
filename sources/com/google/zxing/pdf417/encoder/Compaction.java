package com.google.zxing.pdf417.encoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Compaction {
    public static final Compaction d;
    public static final /* synthetic */ Compaction[] e;

    static {
        Compaction compaction = new Compaction("AUTO", 0);
        d = compaction;
        e = new Compaction[]{compaction, new Compaction("TEXT", 1), new Compaction("BYTE", 2), new Compaction("NUMERIC", 3)};
    }

    public static Compaction valueOf(String str) {
        return (Compaction) Enum.valueOf(Compaction.class, str);
    }

    public static Compaction[] values() {
        return (Compaction[]) e.clone();
    }
}
