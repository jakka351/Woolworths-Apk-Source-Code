package com.google.zxing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BarcodeFormat {
    public static final BarcodeFormat d;
    public static final BarcodeFormat e;
    public static final BarcodeFormat f;
    public static final BarcodeFormat g;
    public static final BarcodeFormat h;
    public static final BarcodeFormat i;
    public static final BarcodeFormat j;
    public static final BarcodeFormat k;
    public static final BarcodeFormat l;
    public static final BarcodeFormat m;
    public static final BarcodeFormat n;
    public static final BarcodeFormat o;
    public static final BarcodeFormat p;
    public static final BarcodeFormat q;
    public static final BarcodeFormat r;
    public static final BarcodeFormat s;
    public static final BarcodeFormat t;
    public static final /* synthetic */ BarcodeFormat[] u;

    static {
        BarcodeFormat barcodeFormat = new BarcodeFormat("AZTEC", 0);
        d = barcodeFormat;
        BarcodeFormat barcodeFormat2 = new BarcodeFormat("CODABAR", 1);
        e = barcodeFormat2;
        BarcodeFormat barcodeFormat3 = new BarcodeFormat("CODE_39", 2);
        f = barcodeFormat3;
        BarcodeFormat barcodeFormat4 = new BarcodeFormat("CODE_93", 3);
        g = barcodeFormat4;
        BarcodeFormat barcodeFormat5 = new BarcodeFormat("CODE_128", 4);
        h = barcodeFormat5;
        BarcodeFormat barcodeFormat6 = new BarcodeFormat("DATA_MATRIX", 5);
        i = barcodeFormat6;
        BarcodeFormat barcodeFormat7 = new BarcodeFormat("EAN_8", 6);
        j = barcodeFormat7;
        BarcodeFormat barcodeFormat8 = new BarcodeFormat("EAN_13", 7);
        k = barcodeFormat8;
        BarcodeFormat barcodeFormat9 = new BarcodeFormat("ITF", 8);
        l = barcodeFormat9;
        BarcodeFormat barcodeFormat10 = new BarcodeFormat("MAXICODE", 9);
        m = barcodeFormat10;
        BarcodeFormat barcodeFormat11 = new BarcodeFormat("PDF_417", 10);
        n = barcodeFormat11;
        BarcodeFormat barcodeFormat12 = new BarcodeFormat("QR_CODE", 11);
        o = barcodeFormat12;
        BarcodeFormat barcodeFormat13 = new BarcodeFormat("RSS_14", 12);
        p = barcodeFormat13;
        BarcodeFormat barcodeFormat14 = new BarcodeFormat("RSS_EXPANDED", 13);
        q = barcodeFormat14;
        BarcodeFormat barcodeFormat15 = new BarcodeFormat("UPC_A", 14);
        r = barcodeFormat15;
        BarcodeFormat barcodeFormat16 = new BarcodeFormat("UPC_E", 15);
        s = barcodeFormat16;
        BarcodeFormat barcodeFormat17 = new BarcodeFormat("UPC_EAN_EXTENSION", 16);
        t = barcodeFormat17;
        u = new BarcodeFormat[]{barcodeFormat, barcodeFormat2, barcodeFormat3, barcodeFormat4, barcodeFormat5, barcodeFormat6, barcodeFormat7, barcodeFormat8, barcodeFormat9, barcodeFormat10, barcodeFormat11, barcodeFormat12, barcodeFormat13, barcodeFormat14, barcodeFormat15, barcodeFormat16, barcodeFormat17};
    }

    public static BarcodeFormat valueOf(String str) {
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }

    public static BarcodeFormat[] values() {
        return (BarcodeFormat[]) u.clone();
    }
}
