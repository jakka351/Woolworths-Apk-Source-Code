package au.com.woolworths.product.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ui/ProductCardButtonsState;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductCardButtonsState {

    /* renamed from: a, reason: collision with root package name */
    public final ProductCardButtonType f9337a;
    public final ListButtonType b;

    public ProductCardButtonsState(ProductCardButtonType productCardButtonType, ListButtonType listButtonType) {
        this.f9337a = productCardButtonType;
        this.b = listButtonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCardButtonsState)) {
            return false;
        }
        ProductCardButtonsState productCardButtonsState = (ProductCardButtonsState) obj;
        return this.f9337a == productCardButtonsState.f9337a && this.b == productCardButtonsState.b;
    }

    public final int hashCode() {
        ProductCardButtonType productCardButtonType = this.f9337a;
        int iHashCode = (productCardButtonType == null ? 0 : productCardButtonType.hashCode()) * 31;
        ListButtonType listButtonType = this.b;
        return iHashCode + (listButtonType != null ? listButtonType.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCardButtonsState(productCardButtonType=" + this.f9337a + ", listButtonType=" + this.b + ")";
    }
}
