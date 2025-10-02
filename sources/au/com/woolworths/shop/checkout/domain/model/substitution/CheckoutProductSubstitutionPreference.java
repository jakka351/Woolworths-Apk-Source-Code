package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/CheckoutProductSubstitutionPreference;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProductSubstitutionPreference {

    /* renamed from: a, reason: collision with root package name */
    public final SubstitutionState f10659a;
    public final String b;
    public final String c;
    public final ButtonApiData d;

    public CheckoutProductSubstitutionPreference(SubstitutionState substitutionState, String str, String str2, ButtonApiData buttonApiData) {
        this.f10659a = substitutionState;
        this.b = str;
        this.c = str2;
        this.d = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProductSubstitutionPreference)) {
            return false;
        }
        CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = (CheckoutProductSubstitutionPreference) obj;
        return this.f10659a == checkoutProductSubstitutionPreference.f10659a && Intrinsics.c(this.b, checkoutProductSubstitutionPreference.b) && Intrinsics.c(this.c, checkoutProductSubstitutionPreference.c) && Intrinsics.c(this.d, checkoutProductSubstitutionPreference.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10659a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "CheckoutProductSubstitutionPreference(state=" + this.f10659a + ", header=" + this.b + ", title=" + this.c + ", action=" + this.d + ")";
    }
}
