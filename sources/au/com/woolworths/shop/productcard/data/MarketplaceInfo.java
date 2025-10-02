package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/MarketplaceInfo;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12652a;
    public final TextWithAltData b;

    public MarketplaceInfo(String str, TextWithAltData textWithAltData) {
        this.f12652a = str;
        this.b = textWithAltData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceInfo)) {
            return false;
        }
        MarketplaceInfo marketplaceInfo = (MarketplaceInfo) obj;
        return Intrinsics.c(this.f12652a, marketplaceInfo.f12652a) && Intrinsics.c(this.b, marketplaceInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12652a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketplaceInfo(iconUrl=" + this.f12652a + ", description=" + this.b + ")";
    }
}
