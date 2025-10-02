package au.com.woolworths.feature.shop.catalogue.productlist.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/model/ProductList;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductList {

    /* renamed from: a, reason: collision with root package name */
    public final CatalogueProductDetailsListInfo f6948a;
    public final ProductListByProductIdsApiData b;

    public ProductList(CatalogueProductDetailsListInfo catalogueProductDetailsListInfo, ProductListByProductIdsApiData productsInList) {
        Intrinsics.h(catalogueProductDetailsListInfo, "catalogueProductDetailsListInfo");
        Intrinsics.h(productsInList, "productsInList");
        this.f6948a = catalogueProductDetailsListInfo;
        this.b = productsInList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductList)) {
            return false;
        }
        ProductList productList = (ProductList) obj;
        return Intrinsics.c(this.f6948a, productList.f6948a) && Intrinsics.c(this.b, productList.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6948a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductList(catalogueProductDetailsListInfo=" + this.f6948a + ", productsInList=" + this.b + ")";
    }
}
