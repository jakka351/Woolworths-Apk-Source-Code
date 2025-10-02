package au.com.woolworths.feature.shop.catalogue.generated.callback;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.analytics.CatalogueProductListAction;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductItemState;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.product.models.ProductCard;

/* loaded from: classes3.dex */
public final class Function0 implements kotlin.jvm.functions.Function0 {
    public final ItemCatalogueHeroProductDetailsBindingImpl d;

    public interface Listener {
    }

    public Function0(ItemCatalogueHeroProductDetailsBindingImpl itemCatalogueHeroProductDetailsBindingImpl) {
        this.d = itemCatalogueHeroProductDetailsBindingImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProductCard productCard;
        ItemCatalogueHeroProductDetailsBindingImpl itemCatalogueHeroProductDetailsBindingImpl = this.d;
        HeroProductItemState heroProductItemState = itemCatalogueHeroProductDetailsBindingImpl.L;
        CatalogueProductListViewModel catalogueProductListViewModel = itemCatalogueHeroProductDetailsBindingImpl.M;
        if (catalogueProductListViewModel != null && heroProductItemState != null && (productCard = heroProductItemState.c) != null) {
            AnalyticsManager analyticsManager = catalogueProductListViewModel.g;
            CatalogueProductListAction.LoadSuccess loadSuccess = CatalogueProductListAction.LoadSuccess.e;
            AnalyticsManagerExtKt.a(analyticsManager, loadSuccess.d.getD(), null, loadSuccess.d.getE(), productCard);
            catalogueProductListViewModel.l.f(new CatalogueProductListContract.Action.LaunchInStoreMap(productCard));
        }
        return null;
    }
}
