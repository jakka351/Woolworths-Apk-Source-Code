package au.com.woolworths.feature.shared.receipt.details;

import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcodeType;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"receipt-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EReceiptBarcodeTypeExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6547a;

        static {
            int[] iArr = new int[EReceiptBarcodeType.values().length];
            try {
                iArr[EReceiptBarcodeType.Code128.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EReceiptBarcodeType.EAN13.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EReceiptBarcodeType.ITF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EReceiptBarcodeType.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6547a = iArr;
        }
    }

    public static final BarcodeType a(EReceiptBarcodeType eReceiptBarcodeType) {
        int i = eReceiptBarcodeType == null ? -1 : WhenMappings.f6547a[eReceiptBarcodeType.ordinal()];
        if (i == 1) {
            return BarcodeType.d;
        }
        if (i == 2) {
            return BarcodeType.e;
        }
        if (i != 3) {
            return null;
        }
        return BarcodeType.f;
    }
}
