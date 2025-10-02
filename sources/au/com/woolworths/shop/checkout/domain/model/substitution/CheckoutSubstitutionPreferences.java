package au.com.woolworths.shop.checkout.domain.model.substitution;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/CheckoutSubstitutionPreferences;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutSubstitutionPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final String f10660a;
    public final String b;
    public final SubstitutionState c;

    public CheckoutSubstitutionPreferences(String str, String str2, SubstitutionState substitutionState) {
        this.f10660a = str;
        this.b = str2;
        this.c = substitutionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSubstitutionPreferences)) {
            return false;
        }
        CheckoutSubstitutionPreferences checkoutSubstitutionPreferences = (CheckoutSubstitutionPreferences) obj;
        return Intrinsics.c(this.f10660a, checkoutSubstitutionPreferences.f10660a) && Intrinsics.c(this.b, checkoutSubstitutionPreferences.b) && this.c == checkoutSubstitutionPreferences.c;
    }

    public final int hashCode() {
        int iHashCode = this.f10660a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CheckoutSubstitutionPreferences(title=", this.f10660a, ", body=", this.b, ", state=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
