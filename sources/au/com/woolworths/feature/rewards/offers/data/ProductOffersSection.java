package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ProductOffersSection;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductOffersSection implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6280a;
    public final String b;
    public final String c;
    public final String d;
    public final ContentCta e;
    public final ArrayList f;
    public final OfferSectionLayout g;

    public ProductOffersSection(String str, String str2, String str3, String str4, ContentCta contentCta, ArrayList arrayList, OfferSectionLayout offerSectionLayout) {
        this.f6280a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = contentCta;
        this.f = arrayList;
        this.g = offerSectionLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductOffersSection)) {
            return false;
        }
        ProductOffersSection productOffersSection = (ProductOffersSection) obj;
        return this.f6280a.equals(productOffersSection.f6280a) && Intrinsics.c(this.b, productOffersSection.b) && Intrinsics.c(this.c, productOffersSection.c) && Intrinsics.c(this.d, productOffersSection.d) && Intrinsics.c(this.e, productOffersSection.e) && this.f.equals(productOffersSection.f) && this.g == productOffersSection.g;
    }

    public final int hashCode() {
        int iHashCode = this.f6280a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentCta contentCta = this.e;
        return this.g.hashCode() + a.b((iHashCode4 + (contentCta != null ? contentCta.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductOffersSection(sectionId=", this.f6280a, ", sectionTitle=", this.b, ", sectionSubtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", endedOffersSectionSubtitle=", this.d, ", sectionCta=");
        sbV.append(this.e);
        sbV.append(", items=");
        sbV.append(this.f);
        sbV.append(", layout=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
