package au.com.woolworths.feature.shop.homepage.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/OrderAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final int f7203a;
    public final int b;

    public OrderAnalytics(int i, int i2) {
        this.f7203a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderAnalytics)) {
            return false;
        }
        OrderAnalytics orderAnalytics = (OrderAnalytics) obj;
        return this.f7203a == orderAnalytics.f7203a && this.b == orderAnalytics.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7203a) * 31);
    }

    public final String toString() {
        return b.j(this.f7203a, this.b, "OrderAnalytics(woolworthsOrderCount=", ", marketplaceOrderCount=", ")");
    }
}
