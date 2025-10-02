package au.com.woolworths.feature.rewards.offers.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/NoOffersCard;", "Lau/com/woolworths/feature/rewards/offers/data/OffersSections;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NoOffersCard implements OffersSections {

    /* renamed from: a, reason: collision with root package name */
    public final IconAsset f6273a;
    public final String b;
    public final String c;

    public NoOffersCard(IconAsset.HostedIcon hostedIcon, String str, String str2) {
        this.f6273a = hostedIcon;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoOffersCard)) {
            return false;
        }
        NoOffersCard noOffersCard = (NoOffersCard) obj;
        return Intrinsics.c(this.f6273a, noOffersCard.f6273a) && Intrinsics.c(this.b, noOffersCard.b) && Intrinsics.c(this.c, noOffersCard.c);
    }

    public final int hashCode() {
        IconAsset iconAsset = this.f6273a;
        int iHashCode = (iconAsset == null ? 0 : iconAsset.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoOffersCard(emptyStateIconAsset=");
        sb.append(this.f6273a);
        sb.append(", emptyStateTitle=");
        sb.append(this.b);
        sb.append(", emptyStateMessage=");
        return a.o(sb, this.c, ")");
    }
}
