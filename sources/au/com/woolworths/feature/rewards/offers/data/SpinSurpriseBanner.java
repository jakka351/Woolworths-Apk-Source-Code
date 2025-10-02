package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/SpinSurpriseBanner;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpinSurpriseBanner implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6297a;
    public final DownloadableAsset b;
    public final String c;

    public SpinSurpriseBanner(String str, DownloadableAsset downloadableAsset, String str2) {
        this.f6297a = str;
        this.b = downloadableAsset;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpinSurpriseBanner)) {
            return false;
        }
        SpinSurpriseBanner spinSurpriseBanner = (SpinSurpriseBanner) obj;
        return Intrinsics.c(this.f6297a, spinSurpriseBanner.f6297a) && Intrinsics.c(this.b, spinSurpriseBanner.b) && Intrinsics.c(this.c, spinSurpriseBanner.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f6297a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpinSurpriseBanner(bannerId=");
        sb.append(this.f6297a);
        sb.append(", bannerAsset=");
        sb.append(this.b);
        sb.append(", bannerActionUrl=");
        return a.o(sb, this.c, ")");
    }
}
