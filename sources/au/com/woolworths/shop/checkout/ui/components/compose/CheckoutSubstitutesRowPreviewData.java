package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/compose/CheckoutSubstitutesRowPreviewData;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutSubstitutesRowPreviewData {

    /* renamed from: a, reason: collision with root package name */
    public final CheckoutSubstitutionPreferences f10692a;

    public CheckoutSubstitutesRowPreviewData(CheckoutSubstitutionPreferences checkoutSubstitutionPreferences) {
        this.f10692a = checkoutSubstitutionPreferences;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSubstitutesRowPreviewData) && Intrinsics.c(this.f10692a, ((CheckoutSubstitutesRowPreviewData) obj).f10692a);
    }

    public final int hashCode() {
        return this.f10692a.hashCode();
    }

    public final String toString() {
        return "CheckoutSubstitutesRowPreviewData(preferences=" + this.f10692a + ")";
    }
}
