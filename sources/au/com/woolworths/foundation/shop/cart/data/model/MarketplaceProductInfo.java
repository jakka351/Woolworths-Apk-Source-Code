package au.com.woolworths.foundation.shop.cart.data.model;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/MarketplaceProductInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceProductInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8695a;
    public final String b;

    public MarketplaceProductInfo(String str, String str2) {
        this.f8695a = str;
        this.b = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getF8695a() {
        return this.f8695a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceProductInfo)) {
            return false;
        }
        MarketplaceProductInfo marketplaceProductInfo = (MarketplaceProductInfo) obj;
        return Intrinsics.c(this.f8695a, marketplaceProductInfo.f8695a) && Intrinsics.c(this.b, marketplaceProductInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8695a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("MarketplaceProductInfo(sellerName=", this.f8695a, ", brandName=", this.b, ")");
    }
}
