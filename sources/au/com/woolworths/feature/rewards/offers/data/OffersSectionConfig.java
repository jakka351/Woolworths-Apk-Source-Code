package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/OffersSectionConfig;", "Lau/com/woolworths/feature/rewards/offers/data/SectionConfigsFeed;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OffersSectionConfig extends SectionConfigsFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f6278a;
    public final boolean b;

    public OffersSectionConfig(String str, boolean z) {
        this.f6278a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSectionConfig)) {
            return false;
        }
        OffersSectionConfig offersSectionConfig = (OffersSectionConfig) obj;
        return Intrinsics.c(this.f6278a, offersSectionConfig.f6278a) && this.b == offersSectionConfig.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f6278a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("OffersSectionConfig(sectionId=", this.f6278a, ", showSectionTitle=", this.b, ")");
    }
}
