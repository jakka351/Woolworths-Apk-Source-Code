package au.com.woolworths.foundation.barcode.reader.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/barcode/reader/analytics/BarcodeScanContext;", "", "barcode-reader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeScanContext {
    public static final /* synthetic */ BarcodeScanContext[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        BarcodeScanContext[] barcodeScanContextArr = {new BarcodeScanContext("ProductSearch", 0), new BarcodeScanContext("ScanAndGo", 1)};
        d = barcodeScanContextArr;
        e = EnumEntriesKt.a(barcodeScanContextArr);
    }

    public static BarcodeScanContext valueOf(String str) {
        return (BarcodeScanContext) Enum.valueOf(BarcodeScanContext.class, str);
    }

    public static BarcodeScanContext[] values() {
        return (BarcodeScanContext[]) d.clone();
    }
}
