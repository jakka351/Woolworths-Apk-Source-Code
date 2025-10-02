package au.com.woolworths.feature.shop.marketplace.data.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceTab;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceTab {

    /* renamed from: a, reason: collision with root package name */
    public final MarketplaceLandingPageName f7476a;
    public final String b;

    public MarketplaceTab(MarketplaceLandingPageName pageName, String str) {
        Intrinsics.h(pageName, "pageName");
        this.f7476a = pageName;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceTab)) {
            return false;
        }
        MarketplaceTab marketplaceTab = (MarketplaceTab) obj;
        return this.f7476a == marketplaceTab.f7476a && Intrinsics.c(this.b, marketplaceTab.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7476a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketplaceTab(pageName=" + this.f7476a + ", title=" + this.b + ")";
    }
}
