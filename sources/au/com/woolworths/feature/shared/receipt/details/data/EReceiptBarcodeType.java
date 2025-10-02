package au.com.woolworths.feature.shared.receipt.details.data;

import au.com.woolworths.graphql.MappedValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcodeType;", "", "<init>", "(Ljava/lang/String;I)V", "Code128", "EAN13", "ITF", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EReceiptBarcodeType {

    @MappedValue
    @SerializedName("Code128")
    public static final EReceiptBarcodeType Code128;

    @MappedValue
    @SerializedName("EAN13")
    public static final EReceiptBarcodeType EAN13;

    @MappedValue
    @SerializedName("ITF")
    public static final EReceiptBarcodeType ITF;
    public static final EReceiptBarcodeType d;
    public static final /* synthetic */ EReceiptBarcodeType[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        EReceiptBarcodeType eReceiptBarcodeType = new EReceiptBarcodeType("Code128", 0);
        Code128 = eReceiptBarcodeType;
        EReceiptBarcodeType eReceiptBarcodeType2 = new EReceiptBarcodeType("EAN13", 1);
        EAN13 = eReceiptBarcodeType2;
        EReceiptBarcodeType eReceiptBarcodeType3 = new EReceiptBarcodeType("ITF", 2);
        ITF = eReceiptBarcodeType3;
        EReceiptBarcodeType eReceiptBarcodeType4 = new EReceiptBarcodeType("UNKNOWN", 3);
        d = eReceiptBarcodeType4;
        EReceiptBarcodeType[] eReceiptBarcodeTypeArr = {eReceiptBarcodeType, eReceiptBarcodeType2, eReceiptBarcodeType3, eReceiptBarcodeType4};
        e = eReceiptBarcodeTypeArr;
        f = EnumEntriesKt.a(eReceiptBarcodeTypeArr);
    }

    private EReceiptBarcodeType(String str, int i) {
    }

    public static EReceiptBarcodeType valueOf(String str) {
        return (EReceiptBarcodeType) Enum.valueOf(EReceiptBarcodeType.class, str);
    }

    public static EReceiptBarcodeType[] values() {
        return (EReceiptBarcodeType[]) e.clone();
    }
}
