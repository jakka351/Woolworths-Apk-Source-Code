package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/tokens/TypographyKeyTokens;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TypographyKeyTokens {
    public static final TypographyKeyTokens d;
    public static final TypographyKeyTokens e;
    public static final TypographyKeyTokens f;
    public static final TypographyKeyTokens g;
    public static final TypographyKeyTokens h;
    public static final TypographyKeyTokens i;
    public static final TypographyKeyTokens j;
    public static final TypographyKeyTokens k;
    public static final /* synthetic */ TypographyKeyTokens[] l;

    static {
        TypographyKeyTokens typographyKeyTokens = new TypographyKeyTokens("BodyLarge", 0);
        d = typographyKeyTokens;
        TypographyKeyTokens typographyKeyTokens2 = new TypographyKeyTokens("BodyMedium", 1);
        e = typographyKeyTokens2;
        TypographyKeyTokens typographyKeyTokens3 = new TypographyKeyTokens("BodySmall", 2);
        TypographyKeyTokens typographyKeyTokens4 = new TypographyKeyTokens("DisplayLarge", 3);
        f = typographyKeyTokens4;
        TypographyKeyTokens typographyKeyTokens5 = new TypographyKeyTokens("DisplayMedium", 4);
        TypographyKeyTokens typographyKeyTokens6 = new TypographyKeyTokens("DisplaySmall", 5);
        TypographyKeyTokens typographyKeyTokens7 = new TypographyKeyTokens("HeadlineLarge", 6);
        TypographyKeyTokens typographyKeyTokens8 = new TypographyKeyTokens("HeadlineMedium", 7);
        TypographyKeyTokens typographyKeyTokens9 = new TypographyKeyTokens("HeadlineSmall", 8);
        g = typographyKeyTokens9;
        TypographyKeyTokens typographyKeyTokens10 = new TypographyKeyTokens("LabelLarge", 9);
        h = typographyKeyTokens10;
        TypographyKeyTokens typographyKeyTokens11 = new TypographyKeyTokens("LabelMedium", 10);
        i = typographyKeyTokens11;
        TypographyKeyTokens typographyKeyTokens12 = new TypographyKeyTokens("LabelSmall", 11);
        j = typographyKeyTokens12;
        TypographyKeyTokens typographyKeyTokens13 = new TypographyKeyTokens("TitleLarge", 12);
        TypographyKeyTokens typographyKeyTokens14 = new TypographyKeyTokens("TitleMedium", 13);
        TypographyKeyTokens typographyKeyTokens15 = new TypographyKeyTokens("TitleSmall", 14);
        k = typographyKeyTokens15;
        l = new TypographyKeyTokens[]{typographyKeyTokens, typographyKeyTokens2, typographyKeyTokens3, typographyKeyTokens4, typographyKeyTokens5, typographyKeyTokens6, typographyKeyTokens7, typographyKeyTokens8, typographyKeyTokens9, typographyKeyTokens10, typographyKeyTokens11, typographyKeyTokens12, typographyKeyTokens13, typographyKeyTokens14, typographyKeyTokens15};
    }

    public static TypographyKeyTokens valueOf(String str) {
        return (TypographyKeyTokens) Enum.valueOf(TypographyKeyTokens.class, str);
    }

    public static TypographyKeyTokens[] values() {
        return (TypographyKeyTokens[]) l.clone();
    }
}
