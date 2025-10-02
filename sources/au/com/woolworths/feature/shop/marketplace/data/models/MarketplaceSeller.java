package au.com.woolworths.feature.shop.marketplace.data.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceSeller;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceFacet;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarketplaceSeller implements MarketplaceFacet {

    /* renamed from: a, reason: collision with root package name */
    public final String f7474a;
    public final String b;

    public MarketplaceSeller(String str, String str2) {
        this.f7474a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceSeller)) {
            return false;
        }
        MarketplaceSeller marketplaceSeller = (MarketplaceSeller) obj;
        return Intrinsics.c(this.f7474a, marketplaceSeller.f7474a) && Intrinsics.c(this.b, marketplaceSeller.b);
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet
    /* renamed from: getImageUrl, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceFacet
    /* renamed from: getTitle, reason: from getter */
    public final String getF7474a() {
        return this.f7474a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7474a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("MarketplaceSeller(title=", this.f7474a, ", imageUrl=", this.b, ")");
    }
}
