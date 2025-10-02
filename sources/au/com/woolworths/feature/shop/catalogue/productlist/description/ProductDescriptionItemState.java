package au.com.woolworths.feature.shop.catalogue.productlist.description;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/description/ProductDescriptionItemState;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductDescriptionItemState implements CatalogueProductListContract.BaseItemState {

    /* renamed from: a, reason: collision with root package name */
    public final String f6934a;

    public ProductDescriptionItemState(String description) {
        Intrinsics.h(description, "description");
        this.f6934a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDescriptionItemState) && Intrinsics.c(this.f6934a, ((ProductDescriptionItemState) obj).f6934a);
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.BaseItemState
    public final CatalogueProductListContract.ItemStateType getItemType() {
        return CatalogueProductListContract.ItemStateType.e;
    }

    public final int hashCode() {
        return this.f6934a.hashCode();
    }

    public final String toString() {
        return a.h("ProductDescriptionItemState(description=", this.f6934a, ")");
    }
}
