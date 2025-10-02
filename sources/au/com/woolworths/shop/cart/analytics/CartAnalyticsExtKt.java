package au.com.woolworths.shop.cart.analytics;

import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductCard;
import au.com.woolworths.foundation.shop.cart.data.model.MarketplaceProductInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartAnalyticsExtKt {
    public static final TrackingMetadata a(List list) {
        Intrinsics.h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((CartProductCard) it.next(), null, null));
        }
        return ProductTrackingValueKt.a(arrayList);
    }

    public static final ProductTrackingValue b(CartProductCard cartProductCard, Float f, String str) {
        String str2;
        Intrinsics.h(cartProductCard, "<this>");
        CartProductInfo cartProductInfo = cartProductCard.p;
        long j = Long.parseLong(cartProductCard.f8679a);
        String str3 = cartProductCard.b;
        float fFloatValue = f != null ? f.floatValue() : (float) cartProductCard.d;
        String string = cartProductCard.f != null ? Float.valueOf(r3.intValue() / 100.0f).toString() : null;
        if (string == null) {
            string = "";
        }
        String str4 = string;
        if (str == null) {
            String totalPrice = cartProductInfo != null ? cartProductInfo.getTotalPrice() : null;
            if (totalPrice != null) {
                str2 = totalPrice;
            } else {
                if (cartProductCard.g != null) {
                    totalPrice = Float.valueOf(r3.intValue() / 100.0f).toString();
                    str2 = totalPrice;
                } else {
                    str2 = null;
                }
            }
        } else {
            str2 = str;
        }
        boolean z = cartProductCard.e;
        MarketplaceProductInfo marketplaceProductInfo = cartProductCard.j;
        return new ProductTrackingValue(j, str3, Boolean.valueOf(z), Float.valueOf(fFloatValue), str4, str2, null, null, marketplaceProductInfo != null ? new MarketplaceTrackingValue(marketplaceProductInfo.b, marketplaceProductInfo.f8695a, null) : null, cartProductCard.c, cartProductInfo != null ? cartProductInfo.getTotalOriginalPrice() : null, cartProductInfo != null ? cartProductInfo.getTotalDiscount() : null, 1728);
    }
}
