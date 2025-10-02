package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductStatus;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductStatus {

    /* renamed from: a, reason: collision with root package name */
    public final TextWithAltData f12657a;
    public final ProductStatusScheme b;

    public ProductStatus(TextWithAltData textWithAltData, ProductStatusScheme productStatusScheme) {
        this.f12657a = textWithAltData;
        this.b = productStatusScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductStatus)) {
            return false;
        }
        ProductStatus productStatus = (ProductStatus) obj;
        return Intrinsics.c(this.f12657a, productStatus.f12657a) && this.b == productStatus.b;
    }

    public final int hashCode() {
        TextWithAltData textWithAltData = this.f12657a;
        int iHashCode = (textWithAltData == null ? 0 : textWithAltData.hashCode()) * 31;
        ProductStatusScheme productStatusScheme = this.b;
        return iHashCode + (productStatusScheme != null ? productStatusScheme.hashCode() : 0);
    }

    public final String toString() {
        return "ProductStatus(text=" + this.f12657a + ", colorScheme=" + this.b + ")";
    }
}
