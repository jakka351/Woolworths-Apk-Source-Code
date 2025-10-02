package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BarcodeType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeType {
    public static final Companion e;
    public static final BarcodeType f;
    public static final BarcodeType g;
    public static final BarcodeType h;
    public static final BarcodeType i;
    public static final BarcodeType j;
    public static final BarcodeType k;
    public static final BarcodeType l;
    public static final BarcodeType m;
    public static final BarcodeType n;
    public static final BarcodeType o;
    public static final BarcodeType p;
    public static final /* synthetic */ BarcodeType[] q;
    public static final /* synthetic */ EnumEntries r;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BarcodeType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BarcodeType barcodeType = new BarcodeType("EAN_13", 0, "EAN_13");
        f = barcodeType;
        BarcodeType barcodeType2 = new BarcodeType("EAN_8", 1, "EAN_8");
        g = barcodeType2;
        BarcodeType barcodeType3 = new BarcodeType("DATAMATRIX", 2, "DATAMATRIX");
        h = barcodeType3;
        BarcodeType barcodeType4 = new BarcodeType("QR", 3, "QR");
        i = barcodeType4;
        BarcodeType barcodeType5 = new BarcodeType("CODE_128", 4, "CODE_128");
        j = barcodeType5;
        BarcodeType barcodeType6 = new BarcodeType("CODE_39", 5, "CODE_39");
        k = barcodeType6;
        BarcodeType barcodeType7 = new BarcodeType("UPCE", 6, "UPCE");
        l = barcodeType7;
        BarcodeType barcodeType8 = new BarcodeType("GS1_DATABAR_EXPANDED", 7, "GS1_DATABAR_EXPANDED");
        m = barcodeType8;
        BarcodeType barcodeType9 = new BarcodeType("GS1_DATABAR", 8, "GS1_DATABAR");
        n = barcodeType9;
        BarcodeType barcodeType10 = new BarcodeType("GS1_DATABAR_LIMITED", 9, "GS1_DATABAR_LIMITED");
        o = barcodeType10;
        BarcodeType barcodeType11 = new BarcodeType("UNKNOWN__", 10, "UNKNOWN__");
        p = barcodeType11;
        BarcodeType[] barcodeTypeArr = {barcodeType, barcodeType2, barcodeType3, barcodeType4, barcodeType5, barcodeType6, barcodeType7, barcodeType8, barcodeType9, barcodeType10, barcodeType11};
        q = barcodeTypeArr;
        r = EnumEntriesKt.a(barcodeTypeArr);
        e = new Companion();
        CollectionsKt.R("EAN_13", "EAN_8", "DATAMATRIX", "QR", "CODE_128", "CODE_39", "UPCE", "GS1_DATABAR_EXPANDED", "GS1_DATABAR", "GS1_DATABAR_LIMITED");
    }

    public BarcodeType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static BarcodeType valueOf(String str) {
        return (BarcodeType) Enum.valueOf(BarcodeType.class, str);
    }

    public static BarcodeType[] values() {
        return (BarcodeType[]) q.clone();
    }
}
