package au.com.woolworths.foundation.barcode.reader.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/models/BarcodeSymbology;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeSymbology {
    public static final BarcodeSymbology A;
    public static final BarcodeSymbology B;
    public static final BarcodeSymbology C;
    public static final BarcodeSymbology D;
    public static final BarcodeSymbology E;
    public static final BarcodeSymbology F;
    public static final BarcodeSymbology G;
    public static final BarcodeSymbology H;
    public static final BarcodeSymbology I;
    public static final BarcodeSymbology J;
    public static final BarcodeSymbology K;
    public static final /* synthetic */ BarcodeSymbology[] L;
    public static final /* synthetic */ EnumEntries M;
    public static final BarcodeSymbology d;
    public static final BarcodeSymbology e;
    public static final BarcodeSymbology f;
    public static final BarcodeSymbology g;
    public static final BarcodeSymbology h;
    public static final BarcodeSymbology i;
    public static final BarcodeSymbology j;
    public static final BarcodeSymbology k;
    public static final BarcodeSymbology l;
    public static final BarcodeSymbology m;
    public static final BarcodeSymbology n;
    public static final BarcodeSymbology o;
    public static final BarcodeSymbology p;
    public static final BarcodeSymbology q;
    public static final BarcodeSymbology r;
    public static final BarcodeSymbology s;
    public static final BarcodeSymbology t;
    public static final BarcodeSymbology u;
    public static final BarcodeSymbology v;
    public static final BarcodeSymbology w;
    public static final BarcodeSymbology x;
    public static final BarcodeSymbology y;
    public static final BarcodeSymbology z;

    static {
        BarcodeSymbology barcodeSymbology = new BarcodeSymbology("EAN13_UPCA", 0);
        d = barcodeSymbology;
        BarcodeSymbology barcodeSymbology2 = new BarcodeSymbology("UPCE", 1);
        e = barcodeSymbology2;
        BarcodeSymbology barcodeSymbology3 = new BarcodeSymbology("EAN8", 2);
        f = barcodeSymbology3;
        BarcodeSymbology barcodeSymbology4 = new BarcodeSymbology("CODE39", 3);
        g = barcodeSymbology4;
        BarcodeSymbology barcodeSymbology5 = new BarcodeSymbology("CODE93", 4);
        h = barcodeSymbology5;
        BarcodeSymbology barcodeSymbology6 = new BarcodeSymbology("CODE128", 5);
        i = barcodeSymbology6;
        BarcodeSymbology barcodeSymbology7 = new BarcodeSymbology("CODE11", 6);
        j = barcodeSymbology7;
        BarcodeSymbology barcodeSymbology8 = new BarcodeSymbology("CODE25", 7);
        k = barcodeSymbology8;
        BarcodeSymbology barcodeSymbology9 = new BarcodeSymbology("CODABAR", 8);
        l = barcodeSymbology9;
        BarcodeSymbology barcodeSymbology10 = new BarcodeSymbology("INTERLEAVED_TWO_OF_FIVE", 9);
        m = barcodeSymbology10;
        BarcodeSymbology barcodeSymbology11 = new BarcodeSymbology("MSI_PLESSEY", 10);
        n = barcodeSymbology11;
        BarcodeSymbology barcodeSymbology12 = new BarcodeSymbology("QR", 11);
        o = barcodeSymbology12;
        BarcodeSymbology barcodeSymbology13 = new BarcodeSymbology("DATA_MATRIX", 12);
        p = barcodeSymbology13;
        BarcodeSymbology barcodeSymbology14 = new BarcodeSymbology("AZTEC", 13);
        q = barcodeSymbology14;
        BarcodeSymbology barcodeSymbology15 = new BarcodeSymbology("MAXI_CODE", 14);
        r = barcodeSymbology15;
        BarcodeSymbology barcodeSymbology16 = new BarcodeSymbology("DOT_CODE", 15);
        s = barcodeSymbology16;
        BarcodeSymbology barcodeSymbology17 = new BarcodeSymbology("KIX", 16);
        t = barcodeSymbology17;
        BarcodeSymbology barcodeSymbology18 = new BarcodeSymbology("RM4SCC", 17);
        u = barcodeSymbology18;
        BarcodeSymbology barcodeSymbology19 = new BarcodeSymbology("GS1_DATABAR", 18);
        v = barcodeSymbology19;
        BarcodeSymbology barcodeSymbology20 = new BarcodeSymbology("GS1_DATABAR_EXPANDED", 19);
        w = barcodeSymbology20;
        BarcodeSymbology barcodeSymbology21 = new BarcodeSymbology("GS1_DATABAR_LIMITED", 20);
        x = barcodeSymbology21;
        BarcodeSymbology barcodeSymbology22 = new BarcodeSymbology("PDF417", 21);
        y = barcodeSymbology22;
        BarcodeSymbology barcodeSymbology23 = new BarcodeSymbology("MICRO_PDF417", 22);
        z = barcodeSymbology23;
        BarcodeSymbology barcodeSymbology24 = new BarcodeSymbology("MICRO_QR", 23);
        A = barcodeSymbology24;
        BarcodeSymbology barcodeSymbology25 = new BarcodeSymbology("CODE32", 24);
        B = barcodeSymbology25;
        BarcodeSymbology barcodeSymbology26 = new BarcodeSymbology("LAPA4SC", 25);
        C = barcodeSymbology26;
        BarcodeSymbology barcodeSymbology27 = new BarcodeSymbology("IATA_TWO_OF_FIVE", 26);
        D = barcodeSymbology27;
        BarcodeSymbology barcodeSymbology28 = new BarcodeSymbology("MATRIX_TWO_OF_FIVE", 27);
        E = barcodeSymbology28;
        BarcodeSymbology barcodeSymbology29 = new BarcodeSymbology("USPS_INTELLIGENT_MAIL", 28);
        F = barcodeSymbology29;
        BarcodeSymbology barcodeSymbology30 = new BarcodeSymbology("ARUCO", 29);
        G = barcodeSymbology30;
        BarcodeSymbology barcodeSymbology31 = new BarcodeSymbology("UPU4STATE", 30);
        H = barcodeSymbology31;
        BarcodeSymbology barcodeSymbology32 = new BarcodeSymbology("AUSTRALIANPOST", 31);
        I = barcodeSymbology32;
        BarcodeSymbology barcodeSymbology33 = new BarcodeSymbology("FRENCHPOST", 32);
        J = barcodeSymbology33;
        BarcodeSymbology barcodeSymbology34 = new BarcodeSymbology("SYNTHETIC_DATABAR", 33);
        K = barcodeSymbology34;
        BarcodeSymbology[] barcodeSymbologyArr = {barcodeSymbology, barcodeSymbology2, barcodeSymbology3, barcodeSymbology4, barcodeSymbology5, barcodeSymbology6, barcodeSymbology7, barcodeSymbology8, barcodeSymbology9, barcodeSymbology10, barcodeSymbology11, barcodeSymbology12, barcodeSymbology13, barcodeSymbology14, barcodeSymbology15, barcodeSymbology16, barcodeSymbology17, barcodeSymbology18, barcodeSymbology19, barcodeSymbology20, barcodeSymbology21, barcodeSymbology22, barcodeSymbology23, barcodeSymbology24, barcodeSymbology25, barcodeSymbology26, barcodeSymbology27, barcodeSymbology28, barcodeSymbology29, barcodeSymbology30, barcodeSymbology31, barcodeSymbology32, barcodeSymbology33, barcodeSymbology34};
        L = barcodeSymbologyArr;
        M = EnumEntriesKt.a(barcodeSymbologyArr);
    }

    public static BarcodeSymbology valueOf(String str) {
        return (BarcodeSymbology) Enum.valueOf(BarcodeSymbology.class, str);
    }

    public static BarcodeSymbology[] values() {
        return (BarcodeSymbology[]) L.clone();
    }
}
