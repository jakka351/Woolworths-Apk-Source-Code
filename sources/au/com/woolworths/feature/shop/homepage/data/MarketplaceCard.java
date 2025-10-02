package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/MarketplaceCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f7199a;
    public final String b;

    public MarketplaceCard(String str, String str2) {
        this.f7199a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCard)) {
            return false;
        }
        MarketplaceCard marketplaceCard = (MarketplaceCard) obj;
        return Intrinsics.c(this.f7199a, marketplaceCard.f7199a) && Intrinsics.c(this.b, marketplaceCard.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7199a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("MarketplaceCard(bannerImage=", this.f7199a, ", bannerAltText=", this.b, ")");
    }
}
