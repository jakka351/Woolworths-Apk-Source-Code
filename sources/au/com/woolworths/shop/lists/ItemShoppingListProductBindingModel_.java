package au.com.woolworths.shop.lists;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListProductItemState;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.d;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemShoppingListProductBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemShoppingListProductBindingModelBuilder {
    public d n;
    public ProductItemUiModel o;
    public ShoppingListItemListener p;
    public ShoppingListProductItemState q;
    public Boolean r;
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
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(148, this.q)) {
            throw new IllegalStateException("The attribute itemState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(143, this.r)) {
            throw new IllegalStateException("The attribute isWatchlist was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
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
        if (!(epoxyModel instanceof ItemShoppingListProductBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemShoppingListProductBindingModel_ itemShoppingListProductBindingModel_ = (ItemShoppingListProductBindingModel_) epoxyModel;
        ProductItemUiModel productItemUiModel = this.o;
        if (productItemUiModel == null ? itemShoppingListProductBindingModel_.o != null : !productItemUiModel.equals(itemShoppingListProductBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        ShoppingListItemListener shoppingListItemListener = this.p;
        if ((shoppingListItemListener == null) != (itemShoppingListProductBindingModel_.p == null)) {
            viewDataBinding.G(157, shoppingListItemListener);
        }
        ShoppingListProductItemState shoppingListProductItemState = this.q;
        if ((shoppingListProductItemState == null) != (itemShoppingListProductBindingModel_.q == null)) {
            viewDataBinding.G(148, shoppingListProductItemState);
        }
        Boolean bool = this.r;
        if (bool == null ? itemShoppingListProductBindingModel_.r != null : !bool.equals(itemShoppingListProductBindingModel_.r)) {
            viewDataBinding.G(143, this.r);
        }
        boolean z = this.s;
        if (z != itemShoppingListProductBindingModel_.s) {
            viewDataBinding.G(109, Boolean.valueOf(z));
        }
        boolean z2 = this.t;
        if (z2 != itemShoppingListProductBindingModel_.t) {
            viewDataBinding.G(132, Boolean.valueOf(z2));
        }
    }

    public final ItemShoppingListProductBindingModel_ M(String str) {
        super.p(str);
        return this;
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
        ProductItemUiModel productItemUiModel;
        Boolean bool;
        if (obj != this) {
            if ((obj instanceof ItemShoppingListProductBindingModel_) && super.equals(obj)) {
                ItemShoppingListProductBindingModel_ itemShoppingListProductBindingModel_ = (ItemShoppingListProductBindingModel_) obj;
                if ((this.n == null) == (itemShoppingListProductBindingModel_.n == null) && ((productItemUiModel = this.o) == null ? itemShoppingListProductBindingModel_.o == null : productItemUiModel.equals(itemShoppingListProductBindingModel_.o))) {
                    if ((this.p == null) == (itemShoppingListProductBindingModel_.p == null)) {
                        if ((this.q == null) == (itemShoppingListProductBindingModel_.q == null) && ((bool = this.r) == null ? itemShoppingListProductBindingModel_.r == null : bool.equals(itemShoppingListProductBindingModel_.r)) && this.s == itemShoppingListProductBindingModel_.s && this.t == itemShoppingListProductBindingModel_.t) {
                        }
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
        ProductItemUiModel productItemUiModel = this.o;
        int iHashCode2 = (((((iHashCode + (productItemUiModel != null ? productItemUiModel.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q == null ? 0 : 1)) * 31;
        Boolean bool = this.r;
        return ((((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_shopping_list_product;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemShoppingListProductBindingModel_{data=" + this.o + ", listener=" + this.p + ", itemState=" + this.q + ", isWatchlist=" + this.r + ", inMappedStore=" + this.s + ", isLowerPriceYellow=" + this.t + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
