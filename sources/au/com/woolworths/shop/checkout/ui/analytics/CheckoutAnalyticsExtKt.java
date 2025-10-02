package au.com.woolworths.shop.checkout.ui.analytics;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.domain.model.ProductInfo;
import au.com.woolworths.shop.checkout.domain.model.ProductInfoKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutAnalyticsExtKt {
    public static final TrackingMetadata a(Checkout checkout) {
        Intrinsics.h(checkout, "<this>");
        Object obj = checkout.f;
        if (((Collection) obj).isEmpty()) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductInfoKt.a((ProductInfo) it.next()));
        }
        return ProductTrackingValueKt.a(arrayList);
    }

    public static final ProductTrackingValue b(CheckoutProduct checkoutProduct) throws NumberFormatException {
        String strQ;
        Intrinsics.h(checkoutProduct, "<this>");
        long j = Long.parseLong(checkoutProduct.c);
        String str = checkoutProduct.f10565a;
        Float fValueOf = Float.valueOf((float) checkoutProduct.b);
        String strQ2 = StringsKt.Q(checkoutProduct.d, "$", "", false);
        CartProductInfo cartProductInfo = checkoutProduct.n;
        if (cartProductInfo == null || (strQ = cartProductInfo.getTotalPrice()) == null) {
            strQ = StringsKt.Q(checkoutProduct.e, "$", "", false);
        }
        return new ProductTrackingValue(j, str, null, fValueOf, strQ2, strQ, null, null, null, checkoutProduct.g, cartProductInfo != null ? cartProductInfo.getTotalOriginalPrice() : null, cartProductInfo != null ? cartProductInfo.getTotalDiscount() : null, 1988);
    }

    public static final ProductTrackingValue c(MarketProductRow marketProductRow, String str, String str2) throws NumberFormatException {
        String strQ;
        Intrinsics.h(marketProductRow, "<this>");
        long j = Long.parseLong(marketProductRow.c);
        String str3 = marketProductRow.f10620a;
        float f = (float) marketProductRow.b;
        String strQ2 = StringsKt.Q(marketProductRow.d, "$", "", false);
        CartProductInfo cartProductInfo = marketProductRow.j;
        if (cartProductInfo == null || (strQ = cartProductInfo.getTotalPrice()) == null) {
            strQ = StringsKt.Q(marketProductRow.e, "$", "", false);
        }
        return new ProductTrackingValue(j, str3, null, Float.valueOf(f), strQ2, strQ, null, null, new MarketplaceTrackingValue(marketProductRow.h, str, str2), marketProductRow.g, cartProductInfo != null ? cartProductInfo.getTotalOriginalPrice() : null, cartProductInfo != null ? cartProductInfo.getTotalDiscount() : null, 1732);
    }
}
