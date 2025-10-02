package au.com.woolworths.feature.rewards.offers.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/OfferFeedInlineBanner;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OfferFeedInlineBanner implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final String f6276a;
    public final IconAsset b;
    public final IconAsset c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final Boolean h;

    public OfferFeedInlineBanner(String str, IconAsset iconAsset, IconAsset iconAsset2, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.f6276a = str;
        this.b = iconAsset;
        this.c = iconAsset2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bool;
        this.h = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferFeedInlineBanner)) {
            return false;
        }
        OfferFeedInlineBanner offerFeedInlineBanner = (OfferFeedInlineBanner) obj;
        return Intrinsics.c(this.f6276a, offerFeedInlineBanner.f6276a) && Intrinsics.c(this.b, offerFeedInlineBanner.b) && Intrinsics.c(this.c, offerFeedInlineBanner.c) && Intrinsics.c(this.d, offerFeedInlineBanner.d) && Intrinsics.c(this.e, offerFeedInlineBanner.e) && Intrinsics.c(this.f, offerFeedInlineBanner.f) && Intrinsics.c(this.g, offerFeedInlineBanner.g) && Intrinsics.c(this.h, offerFeedInlineBanner.h);
    }

    public final int hashCode() {
        int iHashCode = this.f6276a.hashCode() * 31;
        IconAsset iconAsset = this.b;
        int iHashCode2 = (iHashCode + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31;
        IconAsset iconAsset2 = this.c;
        int iHashCode3 = (iHashCode2 + (iconAsset2 == null ? 0 : iconAsset2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC = b.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Boolean bool = this.g;
        int iHashCode5 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferFeedInlineBanner(inlineBannerId=");
        sb.append(this.f6276a);
        sb.append(", inlineBannerLeadingIcon=");
        sb.append(this.b);
        sb.append(", inlineBannerTrailingIcon=");
        sb.append(this.c);
        sb.append(", inlineBannerTitle=");
        sb.append(this.d);
        sb.append(", inlineBannerDescription=");
        a.B(sb, this.e, ", inlineBannerActionUrl=", this.f, ", showIsNewLabel=");
        sb.append(this.g);
        sb.append(", dismissible=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
