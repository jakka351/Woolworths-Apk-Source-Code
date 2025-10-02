package au.com.woolworths.foundation.barcode.encoder;

import com.google.zxing.BarcodeFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"barcode-encoder_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeTypeKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BarcodeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BarcodeType barcodeType = BarcodeType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BarcodeType barcodeType2 = BarcodeType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BarcodeType barcodeType3 = BarcodeType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final BarcodeFormat a(BarcodeType barcodeType) {
        Intrinsics.h(barcodeType, "<this>");
        int iOrdinal = barcodeType.ordinal();
        if (iOrdinal == 0) {
            return BarcodeFormat.h;
        }
        if (iOrdinal == 1) {
            return BarcodeFormat.k;
        }
        if (iOrdinal == 2) {
            return BarcodeFormat.l;
        }
        if (iOrdinal == 3) {
            return BarcodeFormat.o;
        }
        throw new NoWhenBranchMatchedException();
    }
}
