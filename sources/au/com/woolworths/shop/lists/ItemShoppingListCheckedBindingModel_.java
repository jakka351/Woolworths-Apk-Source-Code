package au.com.woolworths.shop.lists;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsListController;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemShoppingListCheckedBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemShoppingListCheckedBindingModelBuilder {
    public int n;
    public boolean o;
    public ShoppingListItemListener p;

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
        if (!viewDataBinding.G(49, Integer.valueOf(this.n))) {
            throw new IllegalStateException("The attribute count was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(238, Boolean.valueOf(this.o))) {
            throw new IllegalStateException("The attribute showCheckedItems was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemShoppingListCheckedBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemShoppingListCheckedBindingModel_ itemShoppingListCheckedBindingModel_ = (ItemShoppingListCheckedBindingModel_) epoxyModel;
        int i = this.n;
        if (i != itemShoppingListCheckedBindingModel_.n) {
            viewDataBinding.G(49, Integer.valueOf(i));
        }
        boolean z = this.o;
        if (z != itemShoppingListCheckedBindingModel_.o) {
            viewDataBinding.G(238, Boolean.valueOf(z));
        }
        ShoppingListItemListener shoppingListItemListener = this.p;
        if ((shoppingListItemListener == null) != (itemShoppingListCheckedBindingModel_.p == null)) {
            viewDataBinding.G(157, shoppingListItemListener);
        }
    }

    public final ItemShoppingListCheckedBindingModel_ M() {
        super.p(ShoppingListDetailsListController.CHECKED_ITEMS_HEADER_ID);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemShoppingListCheckedBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemShoppingListCheckedBindingModel_ itemShoppingListCheckedBindingModel_ = (ItemShoppingListCheckedBindingModel_) obj;
        if (this.n == itemShoppingListCheckedBindingModel_.n && this.o == itemShoppingListCheckedBindingModel_.o) {
            return (this.p == null) == (itemShoppingListCheckedBindingModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return (((((super.hashCode() * 28629151) + this.n) * 31) + (this.o ? 1 : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_shopping_list_checked;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemShoppingListCheckedBindingModel_{count=" + this.n + ", showCheckedItems=" + this.o + ", listener=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
