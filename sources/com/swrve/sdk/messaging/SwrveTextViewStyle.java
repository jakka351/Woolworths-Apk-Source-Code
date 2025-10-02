package com.swrve.sdk.messaging;

/* loaded from: classes6.dex */
public class SwrveTextViewStyle {

    public static class Builder {
    }

    public enum FONT_NATIVE_STYLE {
        NORMAL,
        BOLD,
        ITALIC,
        BOLDITALIC
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TextAlignment {
        public static final TextAlignment d;
        public static final TextAlignment e;
        public static final TextAlignment f;
        public static final /* synthetic */ TextAlignment[] g;

        static {
            TextAlignment textAlignment = new TextAlignment("Left", 0);
            d = textAlignment;
            TextAlignment textAlignment2 = new TextAlignment("Right", 1);
            e = textAlignment2;
            TextAlignment textAlignment3 = new TextAlignment("Center", 2);
            f = textAlignment3;
            g = new TextAlignment[]{textAlignment, textAlignment2, textAlignment3};
        }

        public static TextAlignment valueOf(String str) {
            return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
        }

        public static TextAlignment[] values() {
            return (TextAlignment[]) g.clone();
        }
    }
}
