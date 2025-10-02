package au.com.woolworths.product;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.delivery.address.a;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemProductCardTileBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductCardTileBindingModelBuilder {
    public a n;
    public String o;
    public ProductClickListener p;
    public ProductCard q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public boolean u;

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
        if (!viewDataBinding.G(46, this.o)) {
            throw new IllegalStateException("The attribute containerTitle was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(53, this.q)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(236, this.r)) {
            throw new IllegalStateException("The attribute showAddToListButton was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(28, this.s)) {
            throw new IllegalStateException("The attribute canShowWatchlist was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(144, this.t)) {
            throw new IllegalStateException("The attribute isWatchlisted was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(132, Boolean.valueOf(this.u))) {
            throw new IllegalStateException("The attribute isLowerPriceYellow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductCardTileBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductCardTileBindingModel_ itemProductCardTileBindingModel_ = (ItemProductCardTileBindingModel_) epoxyModel;
        String str = this.o;
        if (str == null ? itemProductCardTileBindingModel_.o != null : !str.equals(itemProductCardTileBindingModel_.o)) {
            viewDataBinding.G(46, this.o);
        }
        ProductClickListener productClickListener = this.p;
        if ((productClickListener == null) != (itemProductCardTileBindingModel_.p == null)) {
            viewDataBinding.G(157, productClickListener);
        }
        ProductCard productCard = this.q;
        if (productCard == null ? itemProductCardTileBindingModel_.q != null : !productCard.equals(itemProductCardTileBindingModel_.q)) {
            viewDataBinding.G(53, this.q);
        }
        Boolean bool = this.r;
        if (bool == null ? itemProductCardTileBindingModel_.r != null : !bool.equals(itemProductCardTileBindingModel_.r)) {
            viewDataBinding.G(236, this.r);
        }
        Boolean bool2 = this.s;
        if (bool2 == null ? itemProductCardTileBindingModel_.s != null : !bool2.equals(itemProductCardTileBindingModel_.s)) {
            viewDataBinding.G(28, this.s);
        }
        Boolean bool3 = this.t;
        if (bool3 == null ? itemProductCardTileBindingModel_.t != null : !bool3.equals(itemProductCardTileBindingModel_.t)) {
            viewDataBinding.G(144, this.t);
        }
        boolean z = this.u;
        if (z != itemProductCardTileBindingModel_.u) {
            viewDataBinding.G(132, Boolean.valueOf(z));
        }
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        a aVar = this.n;
        if (aVar != null) {
            aVar.g(i, this, dataBindingHolder);
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
        String str;
        ProductCard productCard;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (obj != this) {
            if ((obj instanceof ItemProductCardTileBindingModel_) && super.equals(obj)) {
                ItemProductCardTileBindingModel_ itemProductCardTileBindingModel_ = (ItemProductCardTileBindingModel_) obj;
                if ((this.n == null) == (itemProductCardTileBindingModel_.n == null) && ((str = this.o) == null ? itemProductCardTileBindingModel_.o == null : str.equals(itemProductCardTileBindingModel_.o))) {
                    if ((this.p == null) == (itemProductCardTileBindingModel_.p == null) && ((productCard = this.q) == null ? itemProductCardTileBindingModel_.q == null : productCard.equals(itemProductCardTileBindingModel_.q)) && ((bool = this.r) == null ? itemProductCardTileBindingModel_.r == null : bool.equals(itemProductCardTileBindingModel_.r)) && ((bool2 = this.s) == null ? itemProductCardTileBindingModel_.s == null : bool2.equals(itemProductCardTileBindingModel_.s)) && ((bool3 = this.t) == null ? itemProductCardTileBindingModel_.t == null : bool3.equals(itemProductCardTileBindingModel_.t)) && this.u == itemProductCardTileBindingModel_.u) {
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
        String str = this.o;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        ProductCard productCard = this.q;
        int iHashCode3 = (iHashCode2 + (productCard != null ? productCard.hashCode() : 0)) * 31;
        Boolean bool = this.r;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.s;
        int iHashCode5 = (iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.t;
        return ((iHashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + (this.u ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_card_tile;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductCardTileBindingModel_{containerTitle=" + this.o + ", listener=" + this.p + ", data=" + this.q + ", showAddToListButton=" + this.r + ", canShowWatchlist=" + this.s + ", isWatchlisted=" + this.t + ", isLowerPriceYellow=" + this.u + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
