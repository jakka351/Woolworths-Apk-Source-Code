package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscountItem;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscounts;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutContentSummaryOnCheckoutPromotionCodeExtKt {
    public static final CheckoutPromotionCode a(CheckoutContentSummary.OnCheckoutPromotionCode onCheckoutPromotionCode) {
        CheckoutPromotionDiscounts checkoutPromotionDiscounts;
        Intrinsics.h(onCheckoutPromotionCode, "<this>");
        String str = onCheckoutPromotionCode.f22257a;
        String str2 = onCheckoutPromotionCode.b;
        String str3 = onCheckoutPromotionCode.c;
        CheckoutContentSummary.Discounts discounts = onCheckoutPromotionCode.d;
        if (discounts != null) {
            ArrayList<CheckoutContentSummary.DiscountItem> arrayList = discounts.f22233a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            for (CheckoutContentSummary.DiscountItem discountItem : arrayList) {
                Intrinsics.h(discountItem, "<this>");
                arrayList2.add(new CheckoutPromotionDiscountItem(discountItem.f22232a, discountItem.b));
            }
            checkoutPromotionDiscounts = new CheckoutPromotionDiscounts(discounts.b, arrayList2);
        } else {
            checkoutPromotionDiscounts = null;
        }
        return new CheckoutPromotionCode(str, str2, str3, checkoutPromotionDiscounts);
    }
}
