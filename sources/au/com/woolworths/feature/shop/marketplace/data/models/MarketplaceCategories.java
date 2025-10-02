package au.com.woolworths.feature.shop.marketplace.data.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceCategories;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceSectionItem;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceCategories implements MarketplaceSectionItem {

    /* renamed from: a, reason: collision with root package name */
    public final MarketplaceLandingPageName f7471a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public MarketplaceCategories(MarketplaceLandingPageName pageName, String str, String channel, String facet, ArrayList arrayList) {
        Intrinsics.h(pageName, "pageName");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        this.f7471a = pageName;
        this.b = str;
        this.c = channel;
        this.d = facet;
        this.e = arrayList;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem
    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem
    /* renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCategories)) {
            return false;
        }
        MarketplaceCategories marketplaceCategories = (MarketplaceCategories) obj;
        return this.f7471a == marketplaceCategories.f7471a && this.b.equals(marketplaceCategories.b) && Intrinsics.c(this.c, marketplaceCategories.c) && Intrinsics.c(this.d, marketplaceCategories.d) && this.e.equals(marketplaceCategories.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.c(b.c(b.c(this.f7471a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketplaceCategories(pageName=");
        sb.append(this.f7471a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", channel=");
        a.B(sb, this.c, ", facet=", this.d, ", items=");
        return android.support.v4.media.session.a.q(")", sb, this.e);
    }
}
