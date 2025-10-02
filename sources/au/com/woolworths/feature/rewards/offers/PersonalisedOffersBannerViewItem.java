package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.data.PersonalisedOffersStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/PersonalisedOffersBannerViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PersonalisedOffersBannerViewItem extends SectionViewItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final PersonalisedOffersStatus f;
    public final String g;

    public PersonalisedOffersBannerViewItem(String str, String str2, String str3, String str4, PersonalisedOffersStatus personalisedOffersStatus, String str5) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = personalisedOffersStatus;
        this.g = str5;
    }

    @Override // au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalisedOffersBannerViewItem)) {
            return false;
        }
        PersonalisedOffersBannerViewItem personalisedOffersBannerViewItem = (PersonalisedOffersBannerViewItem) obj;
        return Intrinsics.c(this.b, personalisedOffersBannerViewItem.b) && Intrinsics.c(this.c, personalisedOffersBannerViewItem.c) && Intrinsics.c(this.d, personalisedOffersBannerViewItem.d) && Intrinsics.c(this.e, personalisedOffersBannerViewItem.e) && this.f == personalisedOffersBannerViewItem.f && Intrinsics.c(this.g, personalisedOffersBannerViewItem.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("PersonalisedOffersBannerViewItem(sectionId=", this.b, ", imageUrl=", this.c, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.d, ", description=", this.e, ", status=");
        sbV.append(this.f);
        sbV.append(", actionUrl=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
