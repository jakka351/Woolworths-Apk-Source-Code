package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutProducts {

    /* renamed from: a, reason: collision with root package name */
    public final String f10573a;
    public final String b;
    public final CheckoutProductSubstitution c;
    public final CheckoutSubstitutionPreferences d;
    public final ArrayList e;
    public final Boolean f;
    public final BroadcastBannerData g;

    public CheckoutProducts(String str, String str2, CheckoutProductSubstitution checkoutProductSubstitution, CheckoutSubstitutionPreferences checkoutSubstitutionPreferences, ArrayList arrayList, Boolean bool, BroadcastBannerData broadcastBannerData) {
        this.f10573a = str;
        this.b = str2;
        this.c = checkoutProductSubstitution;
        this.d = checkoutSubstitutionPreferences;
        this.e = arrayList;
        this.f = bool;
        this.g = broadcastBannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutProducts)) {
            return false;
        }
        CheckoutProducts checkoutProducts = (CheckoutProducts) obj;
        return this.f10573a.equals(checkoutProducts.f10573a) && Intrinsics.c(this.b, checkoutProducts.b) && Intrinsics.c(this.c, checkoutProducts.c) && Intrinsics.c(this.d, checkoutProducts.d) && this.e.equals(checkoutProducts.e) && this.f.equals(checkoutProducts.f) && Intrinsics.c(this.g, checkoutProducts.g);
    }

    public final int hashCode() {
        int iHashCode = this.f10573a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CheckoutProductSubstitution checkoutProductSubstitution = this.c;
        int iHashCode3 = (iHashCode2 + (checkoutProductSubstitution == null ? 0 : checkoutProductSubstitution.hashCode())) * 31;
        CheckoutSubstitutionPreferences checkoutSubstitutionPreferences = this.d;
        int iHashCode4 = (this.f.hashCode() + a.b((iHashCode3 + (checkoutSubstitutionPreferences == null ? 0 : checkoutSubstitutionPreferences.hashCode())) * 31, 31, this.e)) * 31;
        BroadcastBannerData broadcastBannerData = this.g;
        return iHashCode4 + (broadcastBannerData != null ? broadcastBannerData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CheckoutProducts(title=", this.f10573a, ", descriptionText=", this.b, ", substitution=");
        sbV.append(this.c);
        sbV.append(", substitutionPreferences=");
        sbV.append(this.d);
        sbV.append(", products=");
        sbV.append(this.e);
        sbV.append(", useSubstitutionPreference=");
        sbV.append(this.f);
        sbV.append(", substitutionPreferenceOnboardingBanner=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
