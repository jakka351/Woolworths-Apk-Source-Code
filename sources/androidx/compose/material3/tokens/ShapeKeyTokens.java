package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/tokens/ShapeKeyTokens;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapeKeyTokens {
    public static final ShapeKeyTokens d;
    public static final ShapeKeyTokens e;
    public static final ShapeKeyTokens f;
    public static final ShapeKeyTokens g;
    public static final ShapeKeyTokens h;
    public static final ShapeKeyTokens i;
    public static final ShapeKeyTokens j;
    public static final ShapeKeyTokens k;
    public static final /* synthetic */ ShapeKeyTokens[] l;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraLarge", 0);
        d = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLargeTop", 1);
        e = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraSmall", 2);
        f = shapeKeyTokens3;
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraSmallTop", 3);
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerFull", 4);
        g = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerLarge", 5);
        h = shapeKeyTokens6;
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerLargeEnd", 6);
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLargeTop", 7);
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerMedium", 8);
        i = shapeKeyTokens9;
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerNone", 9);
        j = shapeKeyTokens10;
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerSmall", 10);
        k = shapeKeyTokens11;
        l = new ShapeKeyTokens[]{shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11};
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) l.clone();
    }
}
