package org.commonmark.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class IncludeSourceSpans {
    public static final IncludeSourceSpans d;
    public static final IncludeSourceSpans e;
    public static final /* synthetic */ IncludeSourceSpans[] f;

    static {
        IncludeSourceSpans includeSourceSpans = new IncludeSourceSpans("NONE", 0);
        d = includeSourceSpans;
        IncludeSourceSpans includeSourceSpans2 = new IncludeSourceSpans("BLOCKS", 1);
        IncludeSourceSpans includeSourceSpans3 = new IncludeSourceSpans("BLOCKS_AND_INLINES", 2);
        e = includeSourceSpans3;
        f = new IncludeSourceSpans[]{includeSourceSpans, includeSourceSpans2, includeSourceSpans3};
    }

    public static IncludeSourceSpans valueOf(String str) {
        return (IncludeSourceSpans) Enum.valueOf(IncludeSourceSpans.class, str);
    }

    public static IncludeSourceSpans[] values() {
        return (IncludeSourceSpans[]) f.clone();
    }
}
