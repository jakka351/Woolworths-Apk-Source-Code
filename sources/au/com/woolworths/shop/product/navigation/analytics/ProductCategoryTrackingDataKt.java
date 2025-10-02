package au.com.woolworths.shop.product.navigation.analytics;

import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCategoryTrackingDataKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductSubCategory.ProductCategoryType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType2 = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final ProductCategoryTrackingData a(Activities.ProductSubCategory.ProductCategoryType productCategoryType) {
        Intrinsics.h(productCategoryType, "<this>");
        int iOrdinal = productCategoryType.ordinal();
        if (iOrdinal == 0) {
            return ProductCategoryTrackingData.Products.h;
        }
        if (iOrdinal == 1) {
            return ProductCategoryTrackingData.Specials.h;
        }
        if (iOrdinal == 2) {
            return ProductCategoryTrackingData.Marketplace.h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
