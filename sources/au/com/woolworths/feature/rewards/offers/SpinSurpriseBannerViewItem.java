package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/SpinSurpriseBannerViewItem;", "Lau/com/woolworths/feature/rewards/offers/SectionViewItem;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpinSurpriseBannerViewItem extends SectionViewItem {
    public final String b;
    public final DownloadableAsset c;
    public final String d;

    public SpinSurpriseBannerViewItem(String str, DownloadableAsset downloadableAsset, String str2) {
        super(str);
        this.b = str;
        this.c = downloadableAsset;
        this.d = str2;
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
        if (!(obj instanceof SpinSurpriseBannerViewItem)) {
            return false;
        }
        SpinSurpriseBannerViewItem spinSurpriseBannerViewItem = (SpinSurpriseBannerViewItem) obj;
        return Intrinsics.c(this.b, spinSurpriseBannerViewItem.b) && Intrinsics.c(this.c, spinSurpriseBannerViewItem.c) && Intrinsics.c(this.d, spinSurpriseBannerViewItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinSurpriseBannerViewItem(sectionId=");
        sb.append(this.b);
        sb.append(", bannerAsset=");
        sb.append(this.c);
        sb.append(", bannerActionUrl=");
        return YU.a.o(sb, this.d, ")");
    }
}
