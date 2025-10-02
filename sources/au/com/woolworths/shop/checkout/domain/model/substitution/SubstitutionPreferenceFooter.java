package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/SubstitutionPreferenceFooter;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubstitutionPreferenceFooter {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f10665a;

    public SubstitutionPreferenceFooter(ButtonApiData buttonApiData) {
        this.f10665a = buttonApiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubstitutionPreferenceFooter) && Intrinsics.c(this.f10665a, ((SubstitutionPreferenceFooter) obj).f10665a);
    }

    public final int hashCode() {
        return this.f10665a.hashCode();
    }

    public final String toString() {
        return "SubstitutionPreferenceFooter(button=" + this.f10665a + ")";
    }
}
