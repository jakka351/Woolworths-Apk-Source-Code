package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/MarketplaceShippingInfo;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceShippingInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f11566a;
    public final Optional b;

    public MarketplaceShippingInfo(Optional optional, Optional optional2) {
        this.f11566a = optional;
        this.b = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceShippingInfo)) {
            return false;
        }
        MarketplaceShippingInfo marketplaceShippingInfo = (MarketplaceShippingInfo) obj;
        return Intrinsics.c(this.f11566a, marketplaceShippingInfo.f11566a) && Intrinsics.c(this.b, marketplaceShippingInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11566a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketplaceShippingInfo(postcode=" + this.f11566a + ", suburb=" + this.b + ")";
    }
}
