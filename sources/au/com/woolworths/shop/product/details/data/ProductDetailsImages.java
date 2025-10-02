package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsImages;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsImages implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12607a;
    public final ArrayList b;

    public ProductDetailsImages(ArrayList arrayList, ArrayList arrayList2) {
        this.f12607a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsImages)) {
            return false;
        }
        ProductDetailsImages productDetailsImages = (ProductDetailsImages) obj;
        return this.f12607a.equals(productDetailsImages.f12607a) && this.b.equals(productDetailsImages.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12607a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductDetailsImages(productImages=" + this.f12607a + ", roundelImages=" + this.b + ")";
    }
}
