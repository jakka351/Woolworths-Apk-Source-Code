package au.com.woolworths.feature.shop.editorder.review.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/FooterCtaSection;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FooterCtaSection {

    /* renamed from: a, reason: collision with root package name */
    public final ButtonApiData f7127a;
    public final ButtonApiData b;

    public FooterCtaSection(ButtonApiData buttonApiData, ButtonApiData buttonApiData2) {
        this.f7127a = buttonApiData;
        this.b = buttonApiData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterCtaSection)) {
            return false;
        }
        FooterCtaSection footerCtaSection = (FooterCtaSection) obj;
        return Intrinsics.c(this.f7127a, footerCtaSection.f7127a) && Intrinsics.c(this.b, footerCtaSection.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7127a.hashCode() * 31);
    }

    public final String toString() {
        return "FooterCtaSection(cancelButton=" + this.f7127a + ", checkoutButton=" + this.b + ")";
    }
}
