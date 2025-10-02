package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.data.OfferSectionLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/ProductSectionViewItem;", "Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductSectionViewItem extends OfferSectionViewItem {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ContentCta h;
    public final List i;
    public final OfferSectionLayout j;

    public ProductSectionViewItem(String str, String str2, String str3, String str4, boolean z, ContentCta contentCta, List list, OfferSectionLayout offerSectionLayout) {
        super(str);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = contentCta;
        this.i = list;
        this.j = offerSectionLayout;
    }

    public static ProductSectionViewItem c(ProductSectionViewItem productSectionViewItem, boolean z, List list, int i) {
        String str = productSectionViewItem.c;
        String str2 = productSectionViewItem.d;
        String str3 = productSectionViewItem.e;
        String str4 = productSectionViewItem.f;
        if ((i & 16) != 0) {
            z = productSectionViewItem.g;
        }
        boolean z2 = z;
        ContentCta contentCta = productSectionViewItem.h;
        if ((i & 64) != 0) {
            list = productSectionViewItem.i;
        }
        List offers = list;
        OfferSectionLayout offerSectionLayout = productSectionViewItem.j;
        Intrinsics.h(offers, "offers");
        return new ProductSectionViewItem(str, str2, str3, str4, z2, contentCta, offers, offerSectionLayout);
    }

    @Override // au.com.woolworths.feature.rewards.offers.OfferSectionViewItem, au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.rewards.offers.OfferSectionViewItem
    /* renamed from: b, reason: from getter */
    public final ContentCta getH() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSectionViewItem)) {
            return false;
        }
        ProductSectionViewItem productSectionViewItem = (ProductSectionViewItem) obj;
        return Intrinsics.c(this.c, productSectionViewItem.c) && Intrinsics.c(this.d, productSectionViewItem.d) && Intrinsics.c(this.e, productSectionViewItem.e) && Intrinsics.c(this.f, productSectionViewItem.f) && this.g == productSectionViewItem.g && Intrinsics.c(this.h, productSectionViewItem.h) && Intrinsics.c(this.i, productSectionViewItem.i) && this.j == productSectionViewItem.j;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iE = androidx.camera.core.impl.b.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        ContentCta contentCta = this.h;
        return this.j.hashCode() + androidx.camera.core.impl.b.d((iE + (contentCta != null ? contentCta.hashCode() : 0)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductSectionViewItem(sectionId=", this.c, ", sectionTitle=", this.d, ", sectionSubtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", endedOffersSectionSubtitle=", this.f, ", isActivating=");
        sbV.append(this.g);
        sbV.append(", sectionCta=");
        sbV.append(this.h);
        sbV.append(", offers=");
        sbV.append(this.i);
        sbV.append(", layout=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
