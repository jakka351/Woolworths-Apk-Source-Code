package com.google.zxing.datamatrix.encoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SymbolShapeHint {
    public static final SymbolShapeHint d;
    public static final SymbolShapeHint e;
    public static final SymbolShapeHint f;
    public static final /* synthetic */ SymbolShapeHint[] g;

    static {
        SymbolShapeHint symbolShapeHint = new SymbolShapeHint("FORCE_NONE", 0);
        d = symbolShapeHint;
        SymbolShapeHint symbolShapeHint2 = new SymbolShapeHint("FORCE_SQUARE", 1);
        e = symbolShapeHint2;
        SymbolShapeHint symbolShapeHint3 = new SymbolShapeHint("FORCE_RECTANGLE", 2);
        f = symbolShapeHint3;
        g = new SymbolShapeHint[]{symbolShapeHint, symbolShapeHint2, symbolShapeHint3};
    }

    public static SymbolShapeHint valueOf(String str) {
        return (SymbolShapeHint) Enum.valueOf(SymbolShapeHint.class, str);
    }

    public static SymbolShapeHint[] values() {
        return (SymbolShapeHint[]) g.clone();
    }
}
