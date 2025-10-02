package au.com.woolworths.shop.lists;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListItemListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes4.dex */
public class ItemShoppingListTextBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemShoppingListTextBindingModelBuilder {
    public OnModelBoundListener n;
    public TextItemUiModel o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public ShoppingListItemListener s;

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
        if (!viewDataBinding.G(126, this.p)) {
            throw new IllegalStateException("The attribute isEdited was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(63, this.q)) {
            throw new IllegalStateException("The attribute displayFreeTextSearchIcon was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(62, this.r)) {
            throw new IllegalStateException("The attribute displayFreeTextClearIcon was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.s)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemShoppingListTextBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_ = (ItemShoppingListTextBindingModel_) epoxyModel;
        TextItemUiModel textItemUiModel = this.o;
        if (textItemUiModel == null ? itemShoppingListTextBindingModel_.o != null : !textItemUiModel.equals(itemShoppingListTextBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        Boolean bool = this.p;
        if (bool == null ? itemShoppingListTextBindingModel_.p != null : !bool.equals(itemShoppingListTextBindingModel_.p)) {
            viewDataBinding.G(126, this.p);
        }
        Boolean bool2 = this.q;
        if (bool2 == null ? itemShoppingListTextBindingModel_.q != null : !bool2.equals(itemShoppingListTextBindingModel_.q)) {
            viewDataBinding.G(63, this.q);
        }
        Boolean bool3 = this.r;
        if (bool3 == null ? itemShoppingListTextBindingModel_.r != null : !bool3.equals(itemShoppingListTextBindingModel_.r)) {
            viewDataBinding.G(62, this.r);
        }
        ShoppingListItemListener shoppingListItemListener = this.s;
        if ((shoppingListItemListener == null) != (itemShoppingListTextBindingModel_.s == null)) {
            viewDataBinding.G(157, shoppingListItemListener);
        }
    }

    public final ItemShoppingListTextBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        OnModelBoundListener onModelBoundListener = this.n;
        if (onModelBoundListener != null) {
            onModelBoundListener.g(i, this, dataBindingHolder);
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemShoppingListTextBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemShoppingListTextBindingModel_ itemShoppingListTextBindingModel_ = (ItemShoppingListTextBindingModel_) obj;
        if ((this.n == null) != (itemShoppingListTextBindingModel_.n == null)) {
            return false;
        }
        TextItemUiModel textItemUiModel = this.o;
        if (textItemUiModel == null ? itemShoppingListTextBindingModel_.o != null : !textItemUiModel.equals(itemShoppingListTextBindingModel_.o)) {
            return false;
        }
        Boolean bool = this.p;
        if (bool == null ? itemShoppingListTextBindingModel_.p != null : !bool.equals(itemShoppingListTextBindingModel_.p)) {
            return false;
        }
        Boolean bool2 = this.q;
        if (bool2 == null ? itemShoppingListTextBindingModel_.q != null : !bool2.equals(itemShoppingListTextBindingModel_.q)) {
            return false;
        }
        Boolean bool3 = this.r;
        if (bool3 == null ? itemShoppingListTextBindingModel_.r == null : bool3.equals(itemShoppingListTextBindingModel_.r)) {
            return (this.s == null) == (itemShoppingListTextBindingModel_.s == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521;
        TextItemUiModel textItemUiModel = this.o;
        int iHashCode2 = (iHashCode + (textItemUiModel != null ? textItemUiModel.hashCode() : 0)) * 31;
        Boolean bool = this.p;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.q;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.r;
        return ((iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + (this.s == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_shopping_list_text;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemShoppingListTextBindingModel_{data=" + this.o + ", isEdited=" + this.p + ", displayFreeTextSearchIcon=" + this.q + ", displayFreeTextClearIcon=" + this.r + ", listener=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
