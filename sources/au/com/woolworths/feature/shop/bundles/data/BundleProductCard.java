package au.com.woolworths.feature.shop.bundles.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/data/BundleProductCard;", "Lau/com/woolworths/feature/shop/bundles/data/BundleItem;", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BundleProductCard implements BundleItem {

    /* renamed from: a, reason: collision with root package name */
    public final ProductCard f6758a;
    public final String b;

    static {
        int i = ProductCard.$stable;
    }

    public BundleProductCard(ProductCard productCard, String str) {
        Intrinsics.h(productCard, "productCard");
        this.f6758a = productCard;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleProductCard)) {
            return false;
        }
        BundleProductCard bundleProductCard = (BundleProductCard) obj;
        return Intrinsics.c(this.f6758a, bundleProductCard.f6758a) && Intrinsics.c(this.b, bundleProductCard.b);
    }

    public final int hashCode() {
        int iHashCode = this.f6758a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BundleProductCard(productCard=" + this.f6758a + ", quantity=" + this.b + ")";
    }
}
