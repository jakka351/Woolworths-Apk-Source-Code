package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProductSubstitutionOption;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductSubstitutionOption {

    /* renamed from: a, reason: collision with root package name */
    public final String f10572a;
    public final CheckoutProductSubstitutionOptionId b;

    public CheckoutProductSubstitutionOption(String str, CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId) {
        this.f10572a = str;
        this.b = checkoutProductSubstitutionOptionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductSubstitutionOption)) {
            return false;
        }
        CheckoutProductSubstitutionOption checkoutProductSubstitutionOption = (CheckoutProductSubstitutionOption) obj;
        return Intrinsics.c(this.f10572a, checkoutProductSubstitutionOption.f10572a) && this.b == checkoutProductSubstitutionOption.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10572a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutProductSubstitutionOption(title=" + this.f10572a + ", id=" + this.b + ")";
    }
}
