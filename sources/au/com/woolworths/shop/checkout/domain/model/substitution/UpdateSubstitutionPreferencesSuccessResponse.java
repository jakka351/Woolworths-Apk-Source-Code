package au.com.woolworths.shop.checkout.domain.model.substitution;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/substitution/UpdateSubstitutionPreferencesSuccessResponse;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateSubstitutionPreferencesSuccessResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10668a;

    public UpdateSubstitutionPreferencesSuccessResponse(boolean z) {
        this.f10668a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateSubstitutionPreferencesSuccessResponse) && this.f10668a == ((UpdateSubstitutionPreferencesSuccessResponse) obj).f10668a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10668a);
    }

    public final String toString() {
        return a.n("UpdateSubstitutionPreferencesSuccessResponse(isSuccess=", ")", this.f10668a);
    }
}
