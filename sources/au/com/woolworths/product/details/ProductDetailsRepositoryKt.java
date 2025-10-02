package au.com.woolworths.product.details;

import au.com.woolworths.foundation.barcode.reader.models.BarcodeSymbology;
import au.com.woolworths.shop.graphql.type.BarcodeType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/BarcodeType;", "BarcodeTypeApiData", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsRepositoryKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BarcodeSymbology.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BarcodeSymbology barcodeSymbology = BarcodeSymbology.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BarcodeSymbology barcodeSymbology2 = BarcodeSymbology.d;
                iArr[12] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BarcodeSymbology barcodeSymbology3 = BarcodeSymbology.d;
                iArr[19] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BarcodeSymbology barcodeSymbology4 = BarcodeSymbology.d;
                iArr[18] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                BarcodeSymbology barcodeSymbology5 = BarcodeSymbology.d;
                iArr[20] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BarcodeSymbology barcodeSymbology6 = BarcodeSymbology.d;
                iArr[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                BarcodeSymbology barcodeSymbology7 = BarcodeSymbology.d;
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                BarcodeSymbology barcodeSymbology8 = BarcodeSymbology.d;
                iArr[1] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                BarcodeSymbology barcodeSymbology9 = BarcodeSymbology.d;
                iArr[11] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final BarcodeType a(BarcodeSymbology barcodeSymbology) {
        int iOrdinal = barcodeSymbology.ordinal();
        if (iOrdinal == 0) {
            return BarcodeType.f;
        }
        if (iOrdinal == 1) {
            return BarcodeType.l;
        }
        if (iOrdinal == 2) {
            return BarcodeType.g;
        }
        if (iOrdinal == 3) {
            return BarcodeType.k;
        }
        if (iOrdinal == 5) {
            return BarcodeType.j;
        }
        if (iOrdinal == 11) {
            return BarcodeType.i;
        }
        if (iOrdinal == 12) {
            return BarcodeType.h;
        }
        switch (iOrdinal) {
            case 18:
                return BarcodeType.n;
            case 19:
                return BarcodeType.m;
            case 20:
                return BarcodeType.o;
            default:
                return BarcodeType.f;
        }
    }
}
