package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ApplyCheckoutPromoCode {

    /* renamed from: a, reason: collision with root package name */
    public final ApplyCheckoutPromoCodeResult f10556a;
    public final Checkout b;

    public ApplyCheckoutPromoCode(ApplyCheckoutPromoCodeResult applyCheckoutPromoCodeResult, Checkout checkout) {
        this.f10556a = applyCheckoutPromoCodeResult;
        this.b = checkout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyCheckoutPromoCode)) {
            return false;
        }
        ApplyCheckoutPromoCode applyCheckoutPromoCode = (ApplyCheckoutPromoCode) obj;
        return Intrinsics.c(this.f10556a, applyCheckoutPromoCode.f10556a) && Intrinsics.c(this.b, applyCheckoutPromoCode.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10556a.hashCode() * 31;
        Checkout checkout = this.b;
        return iHashCode + (checkout == null ? 0 : checkout.hashCode());
    }

    public final String toString() {
        return "ApplyCheckoutPromoCode(result=" + this.f10556a + ", checkoutSummary=" + this.b + ")";
    }
}
