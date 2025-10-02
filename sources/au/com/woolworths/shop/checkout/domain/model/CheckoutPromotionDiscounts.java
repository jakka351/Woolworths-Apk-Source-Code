package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromotionDiscounts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutPromotionDiscounts {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10579a;
    public final String b;

    public CheckoutPromotionDiscounts(String str, ArrayList arrayList) {
        this.f10579a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPromotionDiscounts)) {
            return false;
        }
        CheckoutPromotionDiscounts checkoutPromotionDiscounts = (CheckoutPromotionDiscounts) obj;
        return this.f10579a.equals(checkoutPromotionDiscounts.f10579a) && this.b.equals(checkoutPromotionDiscounts.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10579a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutPromotionDiscounts(discountItems=" + this.f10579a + ", buttonTitle=" + this.b + ")";
    }
}
