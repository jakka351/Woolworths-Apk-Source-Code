package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/OfferFeedInlineBannerViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfferFeedInlineBannerViewItem extends SectionViewItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final IconAsset f;
    public final IconAsset g;
    public final boolean h;
    public final boolean i;

    public OfferFeedInlineBannerViewItem(String str, String str2, String str3, String str4, IconAsset iconAsset, IconAsset iconAsset2, boolean z, boolean z2) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = iconAsset;
        this.g = iconAsset2;
        this.h = z;
        this.i = z2;
    }

    @Override // au.com.woolworths.feature.rewards.offers.SectionViewItem
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferFeedInlineBannerViewItem)) {
            return false;
        }
        OfferFeedInlineBannerViewItem offerFeedInlineBannerViewItem = (OfferFeedInlineBannerViewItem) obj;
        return Intrinsics.c(this.b, offerFeedInlineBannerViewItem.b) && Intrinsics.c(this.c, offerFeedInlineBannerViewItem.c) && Intrinsics.c(this.d, offerFeedInlineBannerViewItem.d) && Intrinsics.c(this.e, offerFeedInlineBannerViewItem.e) && Intrinsics.c(this.f, offerFeedInlineBannerViewItem.f) && Intrinsics.c(this.g, offerFeedInlineBannerViewItem.g) && this.h == offerFeedInlineBannerViewItem.h && this.i == offerFeedInlineBannerViewItem.i;
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        IconAsset iconAsset = this.f;
        int iHashCode = (iC + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31;
        IconAsset iconAsset2 = this.g;
        return Boolean.hashCode(this.i) + androidx.camera.core.impl.b.e((iHashCode + (iconAsset2 != null ? iconAsset2.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("OfferFeedInlineBannerViewItem(sectionId=", this.b, ", title=", this.c, ", description=");
        androidx.constraintlayout.core.state.a.B(sbV, this.d, ", actionUrl=", this.e, ", leadingIcon=");
        sbV.append(this.f);
        sbV.append(", trailingIcon=");
        sbV.append(this.g);
        sbV.append(", showIsNewLabel=");
        return au.com.woolworths.android.onesite.a.q(sbV, this.h, ", dismissible=", this.i, ")");
    }
}
