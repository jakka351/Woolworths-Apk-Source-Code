package com.woolworths.scanlibrary.ui.scanner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ApiSupportBarcodeSymbology;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApiSupportBarcodeSymbology {
    public static final ApiSupportBarcodeSymbology e;
    public static final ApiSupportBarcodeSymbology f;
    public static final ApiSupportBarcodeSymbology g;
    public static final ApiSupportBarcodeSymbology h;
    public static final ApiSupportBarcodeSymbology i;
    public static final ApiSupportBarcodeSymbology j;
    public static final ApiSupportBarcodeSymbology k;
    public static final ApiSupportBarcodeSymbology l;
    public static final ApiSupportBarcodeSymbology m;
    public static final ApiSupportBarcodeSymbology n;
    public static final ApiSupportBarcodeSymbology o;
    public static final ApiSupportBarcodeSymbology p;
    public static final /* synthetic */ ApiSupportBarcodeSymbology[] q;
    public static final /* synthetic */ EnumEntries r;
    public final String d;

    static {
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology = new ApiSupportBarcodeSymbology("QR", 0, "QR");
        e = apiSupportBarcodeSymbology;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology2 = new ApiSupportBarcodeSymbology("EAN8", 1, "EAN8");
        f = apiSupportBarcodeSymbology2;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology3 = new ApiSupportBarcodeSymbology("EAN13", 2, "EAN13");
        g = apiSupportBarcodeSymbology3;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology4 = new ApiSupportBarcodeSymbology("DATABAR", 3, "DataBar");
        h = apiSupportBarcodeSymbology4;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology5 = new ApiSupportBarcodeSymbology("DATAMATRIX", 4, "DataMatrix");
        i = apiSupportBarcodeSymbology5;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology6 = new ApiSupportBarcodeSymbology("GS1DATAMATRIX", 5, "GS1DataMatrix");
        j = apiSupportBarcodeSymbology6;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology7 = new ApiSupportBarcodeSymbology("CODE128", 6, "Code128");
        k = apiSupportBarcodeSymbology7;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology8 = new ApiSupportBarcodeSymbology("CODE39", 7, "Code39");
        l = apiSupportBarcodeSymbology8;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology9 = new ApiSupportBarcodeSymbology("UPCA", 8, "UPCA");
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology10 = new ApiSupportBarcodeSymbology("UPCE", 9, "UPCE");
        m = apiSupportBarcodeSymbology10;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology11 = new ApiSupportBarcodeSymbology("DATABAR_EXTENDED", 10, "DataBarExpanded");
        n = apiSupportBarcodeSymbology11;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology12 = new ApiSupportBarcodeSymbology("MANUAL", 11, "Manual");
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology13 = new ApiSupportBarcodeSymbology("UNKNOWN", 12, "Unknown");
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology14 = new ApiSupportBarcodeSymbology("OTHER_TYPES", 13, "OtherTypes");
        o = apiSupportBarcodeSymbology14;
        ApiSupportBarcodeSymbology apiSupportBarcodeSymbology15 = new ApiSupportBarcodeSymbology("SYNTHETIC_DATABAR", 14, "SyntheticDataBar");
        p = apiSupportBarcodeSymbology15;
        ApiSupportBarcodeSymbology[] apiSupportBarcodeSymbologyArr = {apiSupportBarcodeSymbology, apiSupportBarcodeSymbology2, apiSupportBarcodeSymbology3, apiSupportBarcodeSymbology4, apiSupportBarcodeSymbology5, apiSupportBarcodeSymbology6, apiSupportBarcodeSymbology7, apiSupportBarcodeSymbology8, apiSupportBarcodeSymbology9, apiSupportBarcodeSymbology10, apiSupportBarcodeSymbology11, apiSupportBarcodeSymbology12, apiSupportBarcodeSymbology13, apiSupportBarcodeSymbology14, apiSupportBarcodeSymbology15};
        q = apiSupportBarcodeSymbologyArr;
        r = EnumEntriesKt.a(apiSupportBarcodeSymbologyArr);
    }

    public ApiSupportBarcodeSymbology(String str, int i2, String str2) {
        this.d = str2;
    }

    public static ApiSupportBarcodeSymbology valueOf(String str) {
        return (ApiSupportBarcodeSymbology) Enum.valueOf(ApiSupportBarcodeSymbology.class, str);
    }

    public static ApiSupportBarcodeSymbology[] values() {
        return (ApiSupportBarcodeSymbology[]) q.clone();
    }
}
