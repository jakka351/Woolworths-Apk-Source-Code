package au.com.woolworths.shop.buyagain;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy;
import au.com.woolworths.shop.buyagain.ui.legacy.d;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemBuyAgainProductBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemBuyAgainProductBindingModelBuilder {
    public d n;
    public ProductCard o;
    public BuyAgainProductItemListenerLegacy p;
    public Float q;
    public boolean r;
    public boolean s;

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
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(210, this.q)) {
            throw new IllegalStateException("The attribute quantity was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(109, Boolean.valueOf(this.r))) {
            throw new IllegalStateException("The attribute inMappedStore was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(132, Boolean.valueOf(this.s))) {
            throw new IllegalStateException("The attribute isLowerPriceYellow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemBuyAgainProductBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemBuyAgainProductBindingModel_ itemBuyAgainProductBindingModel_ = (ItemBuyAgainProductBindingModel_) epoxyModel;
        ProductCard productCard = this.o;
        if (productCard == null ? itemBuyAgainProductBindingModel_.o != null : !productCard.equals(itemBuyAgainProductBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        BuyAgainProductItemListenerLegacy buyAgainProductItemListenerLegacy = this.p;
        if ((buyAgainProductItemListenerLegacy == null) != (itemBuyAgainProductBindingModel_.p == null)) {
            viewDataBinding.G(157, buyAgainProductItemListenerLegacy);
        }
        Float f = this.q;
        if (f == null ? itemBuyAgainProductBindingModel_.q != null : !f.equals(itemBuyAgainProductBindingModel_.q)) {
            viewDataBinding.G(210, this.q);
        }
        boolean z = this.r;
        if (z != itemBuyAgainProductBindingModel_.r) {
            viewDataBinding.G(109, Boolean.valueOf(z));
        }
        boolean z2 = this.s;
        if (z2 != itemBuyAgainProductBindingModel_.s) {
            viewDataBinding.G(132, Boolean.valueOf(z2));
        }
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        d dVar = this.n;
        if (dVar != null) {
            dVar.g(i, this, dataBindingHolder);
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
        Float f;
        if (obj != this) {
            if ((obj instanceof ItemBuyAgainProductBindingModel_) && super.equals(obj)) {
                ItemBuyAgainProductBindingModel_ itemBuyAgainProductBindingModel_ = (ItemBuyAgainProductBindingModel_) obj;
                if ((this.n == null) == (itemBuyAgainProductBindingModel_.n == null) && ((productCard = this.o) == null ? itemBuyAgainProductBindingModel_.o == null : productCard.equals(itemBuyAgainProductBindingModel_.o))) {
                    if ((this.p == null) == (itemBuyAgainProductBindingModel_.p == null) && ((f = this.q) == null ? itemBuyAgainProductBindingModel_.q == null : f.equals(itemBuyAgainProductBindingModel_.q)) && this.r == itemBuyAgainProductBindingModel_.r && this.s == itemBuyAgainProductBindingModel_.s) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521;
        ProductCard productCard = this.o;
        int iHashCode2 = (((iHashCode + (productCard != null ? productCard.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        Float f = this.q;
        return ((((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_buy_again_product;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemBuyAgainProductBindingModel_{data=" + this.o + ", listener=" + this.p + ", quantity=" + this.q + ", inMappedStore=" + this.r + ", isLowerPriceYellow=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
