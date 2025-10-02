package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutPromotionCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutPromotionCode {

    /* renamed from: a, reason: collision with root package name */
    public final String f10577a;
    public final String b;
    public final String c;
    public final CheckoutPromotionDiscounts d;

    public CheckoutPromotionCode(String str, String str2, String str3, CheckoutPromotionDiscounts checkoutPromotionDiscounts) {
        this.f10577a = str;
        this.b = str2;
        this.c = str3;
        this.d = checkoutPromotionDiscounts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPromotionCode)) {
            return false;
        }
        CheckoutPromotionCode checkoutPromotionCode = (CheckoutPromotionCode) obj;
        return Intrinsics.c(this.f10577a, checkoutPromotionCode.f10577a) && Intrinsics.c(this.b, checkoutPromotionCode.b) && Intrinsics.c(this.c, checkoutPromotionCode.c) && Intrinsics.c(this.d, checkoutPromotionCode.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10577a.hashCode() * 31;
        String str = this.b;
        int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        CheckoutPromotionDiscounts checkoutPromotionDiscounts = this.d;
        return iC + (checkoutPromotionDiscounts != null ? checkoutPromotionDiscounts.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CheckoutPromotionCode(title=", this.f10577a, ", placeholderText=", this.b, ", buttonTitle=");
        sbV.append(this.c);
        sbV.append(", discounts=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
