package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements OnModelBoundListener {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ ProductCard e;
    public final /* synthetic */ ProductCardConfig f;
    public final /* synthetic */ ProductListController g;

    public /* synthetic */ l(ProductCard productCard, ProductListController productListController, ProductCardConfig productCardConfig) {
        this.e = productCard;
        this.g = productListController;
        this.f = productCardConfig;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public final void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 0:
                ProductListController.buildProductCardGridTile$lambda$5(this.e, this.g, this.f, (ItemProductCardTileGridLegacyBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                ProductListController.buildProductCardListTile$lambda$11(this.e, this.f, this.g, (ItemProductCardTileListLegacyBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }

    public /* synthetic */ l(ProductCard productCard, ProductCardConfig productCardConfig, ProductListController productListController) {
        this.e = productCard;
        this.f = productCardConfig;
        this.g = productListController;
    }
}
