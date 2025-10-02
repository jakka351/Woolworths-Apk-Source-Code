package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ResultMetadataType {
    public static final ResultMetadataType d;
    public static final ResultMetadataType e;
    public static final ResultMetadataType f;
    public static final ResultMetadataType g;
    public static final ResultMetadataType h;
    public static final ResultMetadataType i;
    public static final ResultMetadataType j;
    public static final ResultMetadataType k;
    public static final ResultMetadataType l;
    public static final ResultMetadataType m;
    public static final /* synthetic */ ResultMetadataType[] n;

    /* JADX INFO: Fake field, exist only in values array */
    ResultMetadataType EF0;

    static {
        ResultMetadataType resultMetadataType = new ResultMetadataType("OTHER", 0);
        ResultMetadataType resultMetadataType2 = new ResultMetadataType("ORIENTATION", 1);
        d = resultMetadataType2;
        ResultMetadataType resultMetadataType3 = new ResultMetadataType("BYTE_SEGMENTS", 2);
        e = resultMetadataType3;
        ResultMetadataType resultMetadataType4 = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
        f = resultMetadataType4;
        ResultMetadataType resultMetadataType5 = new ResultMetadataType("ISSUE_NUMBER", 4);
        g = resultMetadataType5;
        ResultMetadataType resultMetadataType6 = new ResultMetadataType("SUGGESTED_PRICE", 5);
        h = resultMetadataType6;
        ResultMetadataType resultMetadataType7 = new ResultMetadataType("POSSIBLE_COUNTRY", 6);
        i = resultMetadataType7;
        ResultMetadataType resultMetadataType8 = new ResultMetadataType("UPC_EAN_EXTENSION", 7);
        j = resultMetadataType8;
        ResultMetadataType resultMetadataType9 = new ResultMetadataType("PDF417_EXTRA_METADATA", 8);
        k = resultMetadataType9;
        ResultMetadataType resultMetadataType10 = new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 9);
        l = resultMetadataType10;
        ResultMetadataType resultMetadataType11 = new ResultMetadataType("STRUCTURED_APPEND_PARITY", 10);
        m = resultMetadataType11;
        n = new ResultMetadataType[]{resultMetadataType, resultMetadataType2, resultMetadataType3, resultMetadataType4, resultMetadataType5, resultMetadataType6, resultMetadataType7, resultMetadataType8, resultMetadataType9, resultMetadataType10, resultMetadataType11};
    }

    public static ResultMetadataType valueOf(String str) {
        return (ResultMetadataType) Enum.valueOf(ResultMetadataType.class, str);
    }

    public static ResultMetadataType[] values() {
        return (ResultMetadataType[]) n.clone();
    }
}
