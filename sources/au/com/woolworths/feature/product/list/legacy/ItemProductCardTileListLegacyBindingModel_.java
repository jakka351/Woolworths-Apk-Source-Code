package au.com.woolworths.feature.product.list.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductCardTileListLegacyBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductCardTileListLegacyBindingModelBuilder {
    public l n;
    public ProductClickListener o;
    public ProductCard p;
    public ProductCardConfig q;
    public ProductCardButtonsState r;
    public boolean s;
    public boolean t;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(53, this.p)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(206, this.q)) {
            throw new IllegalStateException("The attribute productCardConfig was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(205, this.r)) {
            throw new IllegalStateException("The attribute productCardButtonsState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(109, Boolean.valueOf(this.s))) {
            throw new IllegalStateException("The attribute inMappedStore was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(132, Boolean.valueOf(this.t))) {
            throw new IllegalStateException("The attribute isLowerPriceYellow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductCardTileListLegacyBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductCardTileListLegacyBindingModel_ itemProductCardTileListLegacyBindingModel_ = (ItemProductCardTileListLegacyBindingModel_) epoxyModel;
        ProductClickListener productClickListener = this.o;
        if ((productClickListener == null) != (itemProductCardTileListLegacyBindingModel_.o == null)) {
            viewDataBinding.G(157, productClickListener);
        }
        ProductCard productCard = this.p;
        if (productCard == null ? itemProductCardTileListLegacyBindingModel_.p != null : !productCard.equals(itemProductCardTileListLegacyBindingModel_.p)) {
            viewDataBinding.G(53, this.p);
        }
        ProductCardConfig productCardConfig = this.q;
        if (productCardConfig == null ? itemProductCardTileListLegacyBindingModel_.q != null : !productCardConfig.equals(itemProductCardTileListLegacyBindingModel_.q)) {
            viewDataBinding.G(206, this.q);
        }
        ProductCardButtonsState productCardButtonsState = this.r;
        if (productCardButtonsState == null ? itemProductCardTileListLegacyBindingModel_.r != null : !productCardButtonsState.equals(itemProductCardTileListLegacyBindingModel_.r)) {
            viewDataBinding.G(205, this.r);
        }
        boolean z = this.s;
        if (z != itemProductCardTileListLegacyBindingModel_.s) {
            viewDataBinding.G(109, Boolean.valueOf(z));
        }
        boolean z2 = this.t;
        if (z2 != itemProductCardTileListLegacyBindingModel_.t) {
            viewDataBinding.G(132, Boolean.valueOf(z2));
        }
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        l lVar = this.n;
        if (lVar != null) {
            lVar.g(i, this, dataBindingHolder);
        }
        B(i, "The model was changed during the bind call.");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        ProductCard productCard;
        ProductCardConfig productCardConfig;
        ProductCardButtonsState productCardButtonsState;
        if (obj != this) {
            if ((obj instanceof ItemProductCardTileListLegacyBindingModel_) && super.equals(obj)) {
                ItemProductCardTileListLegacyBindingModel_ itemProductCardTileListLegacyBindingModel_ = (ItemProductCardTileListLegacyBindingModel_) obj;
                if ((this.n == null) == (itemProductCardTileListLegacyBindingModel_.n == null)) {
                    if ((this.o == null) == (itemProductCardTileListLegacyBindingModel_.o == null) && ((productCard = this.p) == null ? itemProductCardTileListLegacyBindingModel_.p == null : productCard.equals(itemProductCardTileListLegacyBindingModel_.p)) && ((productCardConfig = this.q) == null ? itemProductCardTileListLegacyBindingModel_.q == null : productCardConfig.equals(itemProductCardTileListLegacyBindingModel_.q)) && ((productCardButtonsState = this.r) == null ? itemProductCardTileListLegacyBindingModel_.r == null : productCardButtonsState.equals(itemProductCardTileListLegacyBindingModel_.r)) && this.s == itemProductCardTileListLegacyBindingModel_.s && this.t == itemProductCardTileListLegacyBindingModel_.t) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521) + (this.o == null ? 0 : 1)) * 31;
        ProductCard productCard = this.p;
        int iHashCode2 = (iHashCode + (productCard != null ? productCard.hashCode() : 0)) * 31;
        ProductCardConfig productCardConfig = this.q;
        int iHashCode3 = (iHashCode2 + (productCardConfig != null ? productCardConfig.hashCode() : 0)) * 31;
        ProductCardButtonsState productCardButtonsState = this.r;
        return ((((iHashCode3 + (productCardButtonsState != null ? productCardButtonsState.hashCode() : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_card_tile_list_legacy;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductCardTileListLegacyBindingModel_{listener=" + this.o + ", data=" + this.p + ", productCardConfig=" + this.q + ", productCardButtonsState=" + this.r + ", inMappedStore=" + this.s + ", isLowerPriceYellow=" + this.t + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
