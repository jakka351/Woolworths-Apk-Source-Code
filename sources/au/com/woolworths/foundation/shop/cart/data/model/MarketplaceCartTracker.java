package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/MarketplaceCartTracker;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MarketplaceCartTracker {

    /* renamed from: a, reason: collision with root package name */
    public final String f8694a;
    public final double b;
    public final String c;

    public MarketplaceCartTracker(double d, String str, String str2) {
        this.f8694a = str;
        this.b = d;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCartTracker)) {
            return false;
        }
        MarketplaceCartTracker marketplaceCartTracker = (MarketplaceCartTracker) obj;
        return Intrinsics.c(this.f8694a, marketplaceCartTracker.f8694a) && Double.compare(this.b, marketplaceCartTracker.b) == 0 && Intrinsics.c(this.c, marketplaceCartTracker.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.a(this.b, this.f8694a.hashCode() * 31, 31);
    }

    public final String toString() {
        return YU.a.p(au.com.woolworths.android.onesite.a.r(this.b, "MarketplaceCartTracker(title=", this.f8694a, ", freeShippingPercentage="), ", description=", this.c, ")");
    }
}
