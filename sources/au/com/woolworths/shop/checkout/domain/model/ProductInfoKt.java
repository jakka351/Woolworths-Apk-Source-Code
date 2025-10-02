package au.com.woolworths.shop.checkout.domain.model;

import au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductInfoKt {
    public static final ProductTrackingValue a(ProductInfo productInfo) throws NumberFormatException {
        Intrinsics.h(productInfo, "<this>");
        long j = Long.parseLong(productInfo.f10632a);
        String str = productInfo.b;
        float f = (float) productInfo.d;
        String strValueOf = String.valueOf(productInfo.c);
        String strValueOf2 = String.valueOf(productInfo.e);
        boolean z = productInfo.f;
        return new ProductTrackingValue(j, str, Boolean.valueOf(z), Float.valueOf(f), strValueOf, strValueOf2, null, productInfo.j, new MarketplaceTrackingValue(productInfo.h, productInfo.g, productInfo.i), null, null, null, 15936);
    }
}
