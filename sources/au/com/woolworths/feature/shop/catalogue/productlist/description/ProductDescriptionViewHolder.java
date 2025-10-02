package au.com.woolworths.feature.shop.catalogue.productlist.description;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueProductDescriptionBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/description/ProductDescriptionViewHolder;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductDescriptionViewHolder extends CatalogueProductListContract.BaseViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ItemCatalogueProductDescriptionBinding f6935a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductDescriptionViewHolder(ItemCatalogueProductDescriptionBinding itemCatalogueProductDescriptionBinding, CatalogueProductListViewModel catalogueProductListViewModel) {
        Intrinsics.h(catalogueProductListViewModel, "catalogueProductListViewModel");
        View view = itemCatalogueProductDescriptionBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f6935a = itemCatalogueProductDescriptionBinding;
        itemCatalogueProductDescriptionBinding.M(catalogueProductListViewModel);
    }
}
