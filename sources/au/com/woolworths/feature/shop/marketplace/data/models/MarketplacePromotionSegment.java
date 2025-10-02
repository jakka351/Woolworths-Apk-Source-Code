package au.com.woolworths.feature.shop.marketplace.data.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePromotionSegment;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplacePersonalisedSegment;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplacePromotionSegment implements MarketplacePersonalisedSegment {
    public final PromotionBanner d;

    public MarketplacePromotionSegment(PromotionBanner promotionBanner) {
        this.d = promotionBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketplacePromotionSegment) && Intrinsics.c(this.d, ((MarketplacePromotionSegment) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "MarketplacePromotionSegment(banner=" + this.d + ")";
    }
}
