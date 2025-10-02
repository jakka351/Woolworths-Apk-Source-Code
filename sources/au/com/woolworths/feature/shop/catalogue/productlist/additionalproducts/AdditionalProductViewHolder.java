package au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueAdditionalProductDetailsBinding;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductViewHolder;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseViewHolder;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalProductViewHolder extends CatalogueProductListContract.BaseViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ItemCatalogueAdditionalProductDetailsBinding f6933a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdditionalProductViewHolder(ItemCatalogueAdditionalProductDetailsBinding itemCatalogueAdditionalProductDetailsBinding, CatalogueProductListViewModel catalogueProductListViewModel) {
        Intrinsics.h(catalogueProductListViewModel, "catalogueProductListViewModel");
        View view = itemCatalogueAdditionalProductDetailsBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f6933a = itemCatalogueAdditionalProductDetailsBinding;
        itemCatalogueAdditionalProductDetailsBinding.M(catalogueProductListViewModel);
    }
}
