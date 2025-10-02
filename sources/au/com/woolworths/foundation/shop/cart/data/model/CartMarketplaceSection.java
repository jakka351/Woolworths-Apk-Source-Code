package au.com.woolworths.foundation.shop.cart.data.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartMarketplaceSection;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartSection;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartMarketplaceSection implements CartSection {

    /* renamed from: a, reason: collision with root package name */
    public final SectionHeader f8678a;
    public final MarketplaceCartTracker b;
    public final CartShippingMessageBanner c;
    public final ArrayList d;

    public CartMarketplaceSection(SectionHeader sectionHeader, MarketplaceCartTracker marketplaceCartTracker, CartShippingPromotionBanner cartShippingPromotionBanner, ArrayList arrayList) {
        this.f8678a = sectionHeader;
        this.b = marketplaceCartTracker;
        this.c = cartShippingPromotionBanner;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartMarketplaceSection)) {
            return false;
        }
        CartMarketplaceSection cartMarketplaceSection = (CartMarketplaceSection) obj;
        return Intrinsics.c(this.f8678a, cartMarketplaceSection.f8678a) && Intrinsics.c(this.b, cartMarketplaceSection.b) && Intrinsics.c(this.c, cartMarketplaceSection.c) && this.d.equals(cartMarketplaceSection.d);
    }

    public final int hashCode() {
        SectionHeader sectionHeader = this.f8678a;
        int iHashCode = (sectionHeader == null ? 0 : sectionHeader.hashCode()) * 31;
        MarketplaceCartTracker marketplaceCartTracker = this.b;
        int iHashCode2 = (iHashCode + (marketplaceCartTracker == null ? 0 : marketplaceCartTracker.hashCode())) * 31;
        CartShippingMessageBanner cartShippingMessageBanner = this.c;
        return this.d.hashCode() + ((iHashCode2 + (cartShippingMessageBanner != null ? cartShippingMessageBanner.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CartMarketplaceSection(sectionHeader=" + this.f8678a + ", cartTracker=" + this.b + ", shippingMessageBanner=" + this.c + ", sellerGroups=" + this.d + ")";
    }
}
