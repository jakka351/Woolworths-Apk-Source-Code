package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.TypedEpoxyController;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements OnModelBoundListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TypedEpoxyController f;

    public /* synthetic */ v(Object obj, TypedEpoxyController typedEpoxyController, int i) {
        this.d = i;
        this.e = obj;
        this.f = typedEpoxyController;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public final void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 0:
                ProductListOptionsController.buildMarketplaceSwitch$lambda$16$lambda$15((ProductListOptionsItem.MarketplaceSwitch) this.e, (ProductListOptionsController) this.f, (ItemProductListOptionsMarketplaceLegacyBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                ProductListOptionsFilterController.buildModels$lambda$3$lambda$2$lambda$1((FilterInsetBannerData) this.e, (ProductListOptionsFilterController) this.f, (ItemProductListOptionsInsetBannerLegacyBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }
}
