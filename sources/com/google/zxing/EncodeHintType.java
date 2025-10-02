package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EncodeHintType {
    public static final EncodeHintType d;
    public static final EncodeHintType e;
    public static final EncodeHintType f;
    public static final EncodeHintType g;
    public static final EncodeHintType h;
    public static final EncodeHintType i;
    public static final EncodeHintType j;
    public static final EncodeHintType k;
    public static final EncodeHintType l;
    public static final EncodeHintType m;
    public static final EncodeHintType n;
    public static final EncodeHintType o;
    public static final /* synthetic */ EncodeHintType[] p;

    static {
        EncodeHintType encodeHintType = new EncodeHintType("ERROR_CORRECTION", 0);
        d = encodeHintType;
        EncodeHintType encodeHintType2 = new EncodeHintType("CHARACTER_SET", 1);
        e = encodeHintType2;
        EncodeHintType encodeHintType3 = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        f = encodeHintType3;
        EncodeHintType encodeHintType4 = new EncodeHintType("MIN_SIZE", 3);
        g = encodeHintType4;
        EncodeHintType encodeHintType5 = new EncodeHintType("MAX_SIZE", 4);
        h = encodeHintType5;
        EncodeHintType encodeHintType6 = new EncodeHintType("MARGIN", 5);
        i = encodeHintType6;
        EncodeHintType encodeHintType7 = new EncodeHintType("PDF417_COMPACT", 6);
        j = encodeHintType7;
        EncodeHintType encodeHintType8 = new EncodeHintType("PDF417_COMPACTION", 7);
        k = encodeHintType8;
        EncodeHintType encodeHintType9 = new EncodeHintType("PDF417_DIMENSIONS", 8);
        l = encodeHintType9;
        EncodeHintType encodeHintType10 = new EncodeHintType("AZTEC_LAYERS", 9);
        m = encodeHintType10;
        EncodeHintType encodeHintType11 = new EncodeHintType("QR_VERSION", 10);
        n = encodeHintType11;
        EncodeHintType encodeHintType12 = new EncodeHintType("GS1_FORMAT", 11);
        o = encodeHintType12;
        p = new EncodeHintType[]{encodeHintType, encodeHintType2, encodeHintType3, encodeHintType4, encodeHintType5, encodeHintType6, encodeHintType7, encodeHintType8, encodeHintType9, encodeHintType10, encodeHintType11, encodeHintType12};
    }

    public static EncodeHintType valueOf(String str) {
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, str);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[]) p.clone();
    }
}
