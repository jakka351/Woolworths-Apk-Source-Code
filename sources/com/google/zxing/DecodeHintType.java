package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DecodeHintType {
    public static final DecodeHintType d;
    public static final DecodeHintType e;
    public static final DecodeHintType f;
    public static final DecodeHintType g;
    public static final DecodeHintType h;
    public static final DecodeHintType i;
    public static final DecodeHintType j;
    public static final DecodeHintType k;
    public static final DecodeHintType l;
    public static final DecodeHintType m;
    public static final /* synthetic */ DecodeHintType[] n;

    /* JADX INFO: Fake field, exist only in values array */
    DecodeHintType EF0;

    static {
        DecodeHintType decodeHintType = new DecodeHintType("OTHER", 0);
        DecodeHintType decodeHintType2 = new DecodeHintType("PURE_BARCODE", 1);
        d = decodeHintType2;
        DecodeHintType decodeHintType3 = new DecodeHintType("POSSIBLE_FORMATS", 2);
        e = decodeHintType3;
        DecodeHintType decodeHintType4 = new DecodeHintType("TRY_HARDER", 3);
        f = decodeHintType4;
        DecodeHintType decodeHintType5 = new DecodeHintType("CHARACTER_SET", 4);
        g = decodeHintType5;
        DecodeHintType decodeHintType6 = new DecodeHintType("ALLOWED_LENGTHS", 5);
        h = decodeHintType6;
        DecodeHintType decodeHintType7 = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6);
        i = decodeHintType7;
        DecodeHintType decodeHintType8 = new DecodeHintType("ASSUME_GS1", 7);
        j = decodeHintType8;
        DecodeHintType decodeHintType9 = new DecodeHintType("RETURN_CODABAR_START_END", 8);
        k = decodeHintType9;
        DecodeHintType decodeHintType10 = new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9);
        l = decodeHintType10;
        DecodeHintType decodeHintType11 = new DecodeHintType("ALLOWED_EAN_EXTENSIONS", 10);
        m = decodeHintType11;
        n = new DecodeHintType[]{decodeHintType, decodeHintType2, decodeHintType3, decodeHintType4, decodeHintType5, decodeHintType6, decodeHintType7, decodeHintType8, decodeHintType9, decodeHintType10, decodeHintType11};
    }

    public static DecodeHintType valueOf(String str) {
        return (DecodeHintType) Enum.valueOf(DecodeHintType.class, str);
    }

    public static DecodeHintType[] values() {
        return (DecodeHintType[]) n.clone();
    }
}
