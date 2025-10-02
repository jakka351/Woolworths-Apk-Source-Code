package au.com.woolworths.foundation.barcode.encoder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/encoder/BarcodeType;", "", "barcode-encoder_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeType {
    public static final BarcodeType d;
    public static final BarcodeType e;
    public static final BarcodeType f;
    public static final BarcodeType g;
    public static final /* synthetic */ BarcodeType[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        BarcodeType barcodeType = new BarcodeType("CODE_128", 0);
        d = barcodeType;
        BarcodeType barcodeType2 = new BarcodeType("EAN_13", 1);
        e = barcodeType2;
        BarcodeType barcodeType3 = new BarcodeType("ITF", 2);
        f = barcodeType3;
        BarcodeType barcodeType4 = new BarcodeType("QR_CODE", 3);
        g = barcodeType4;
        BarcodeType[] barcodeTypeArr = {barcodeType, barcodeType2, barcodeType3, barcodeType4};
        h = barcodeTypeArr;
        i = EnumEntriesKt.a(barcodeTypeArr);
    }

    public static BarcodeType valueOf(String str) {
        return (BarcodeType) Enum.valueOf(BarcodeType.class, str);
    }

    public static BarcodeType[] values() {
        return (BarcodeType[]) h.clone();
    }
}
