package au.com.woolworths.shop.lists.ui.magicmatch.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/magicmatch/models/MatchProductByQuantityData;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchProductByQuantityData {

    /* renamed from: a, reason: collision with root package name */
    public final ProductCard f12362a;
    public final double b;

    static {
        int i = ProductCard.$stable;
    }

    public MatchProductByQuantityData(ProductCard productCard, double d) {
        this.f12362a = productCard;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchProductByQuantityData)) {
            return false;
        }
        MatchProductByQuantityData matchProductByQuantityData = (MatchProductByQuantityData) obj;
        return Intrinsics.c(this.f12362a, matchProductByQuantityData.f12362a) && Double.compare(this.b, matchProductByQuantityData.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.f12362a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchProductByQuantityData(product=" + this.f12362a + ", quantity=" + this.b + ")";
    }
}
