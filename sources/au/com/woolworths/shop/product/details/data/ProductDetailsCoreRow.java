package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsCoreRow;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsCoreRow implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12605a;
    public final Object b;

    public ProductDetailsCoreRow(Object obj, boolean z) {
        this.f12605a = z;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsCoreRow)) {
            return false;
        }
        ProductDetailsCoreRow productDetailsCoreRow = (ProductDetailsCoreRow) obj;
        return this.f12605a == productDetailsCoreRow.f12605a && Intrinsics.c(this.b, productDetailsCoreRow.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f12605a) * 31);
    }

    public final String toString() {
        return "ProductDetailsCoreRow(hasTopSeparator=" + this.f12605a + ", rowDetails=" + this.b + ")";
    }
}
