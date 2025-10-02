package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TextRangeUnits {
    public static final TextRangeUnits d;
    public static final TextRangeUnits e;
    public static final /* synthetic */ TextRangeUnits[] f;

    static {
        TextRangeUnits textRangeUnits = new TextRangeUnits("PERCENT", 0);
        d = textRangeUnits;
        TextRangeUnits textRangeUnits2 = new TextRangeUnits("INDEX", 1);
        e = textRangeUnits2;
        f = new TextRangeUnits[]{textRangeUnits, textRangeUnits2};
    }

    public static TextRangeUnits valueOf(String str) {
        return (TextRangeUnits) Enum.valueOf(TextRangeUnits.class, str);
    }

    public static TextRangeUnits[] values() {
        return (TextRangeUnits[]) f.clone();
    }
}
