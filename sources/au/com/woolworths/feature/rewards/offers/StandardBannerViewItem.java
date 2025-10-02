package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/StandardBannerViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StandardBannerViewItem extends SectionViewItem {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardBannerViewItem(String sectionId, String bannerTitle, String str, String str2, String str3, String str4, String str5) {
        super(sectionId);
        Intrinsics.h(sectionId, "sectionId");
        Intrinsics.h(bannerTitle, "bannerTitle");
        this.b = sectionId;
        this.c = bannerTitle;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public static StandardBannerViewItem b(StandardBannerViewItem standardBannerViewItem, int i) {
        String sectionId = standardBannerViewItem.b;
        String bannerTitle = standardBannerViewItem.c;
        String str = (i & 4) != 0 ? standardBannerViewItem.d : null;
        String str2 = (i & 8) != 0 ? standardBannerViewItem.e : null;
        String str3 = standardBannerViewItem.f;
        String str4 = (i & 32) != 0 ? standardBannerViewItem.g : null;
        String str5 = standardBannerViewItem.h;
        Intrinsics.h(sectionId, "sectionId");
        Intrinsics.h(bannerTitle, "bannerTitle");
        return new StandardBannerViewItem(sectionId, bannerTitle, str, str2, str3, str4, str5);
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
        if (!(obj instanceof StandardBannerViewItem)) {
            return false;
        }
        StandardBannerViewItem standardBannerViewItem = (StandardBannerViewItem) obj;
        return Intrinsics.c(this.b, standardBannerViewItem.b) && Intrinsics.c(this.c, standardBannerViewItem.c) && Intrinsics.c(this.d, standardBannerViewItem.d) && Intrinsics.c(this.e, standardBannerViewItem.e) && Intrinsics.c(this.f, standardBannerViewItem.f) && Intrinsics.c(this.g, standardBannerViewItem.g) && Intrinsics.c(this.h, standardBannerViewItem.h);
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("StandardBannerViewItem(sectionId=", this.b, ", bannerTitle=", this.c, ", bannerImageUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.d, ", bannerDescription=", this.e, ", bannerActionUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", bannerActionLabel=", this.g, ", bannerActionAccessibilityHint=");
        return YU.a.o(sbV, this.h, ")");
    }
}
