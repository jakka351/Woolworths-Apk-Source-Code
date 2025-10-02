package au.com.woolworths.shop.addtolist;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.addtolist.add.ListItemClickListener;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes4.dex */
public class ItemAddToListBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemAddToListBindingModelBuilder {
    public int n;
    public ShoppingList o;
    public ListItemClickListener p;
    public Boolean q;

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
        if (!viewDataBinding.G(ModuleDescriptor.MODULE_VERSION, Integer.valueOf(this.n))) {
            throw new IllegalStateException("The attribute listIndex was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(229, this.o)) {
            throw new IllegalStateException("The attribute shoppingList was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(146, this.p)) {
            throw new IllegalStateException("The attribute itemClickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(140, this.q)) {
            throw new IllegalStateException("The attribute isShoppingListBeingSaved was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemAddToListBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemAddToListBindingModel_ itemAddToListBindingModel_ = (ItemAddToListBindingModel_) epoxyModel;
        int i = this.n;
        if (i != itemAddToListBindingModel_.n) {
            viewDataBinding.G(ModuleDescriptor.MODULE_VERSION, Integer.valueOf(i));
        }
        ShoppingList shoppingList = this.o;
        if (shoppingList == null ? itemAddToListBindingModel_.o != null : !shoppingList.equals(itemAddToListBindingModel_.o)) {
            viewDataBinding.G(229, this.o);
        }
        ListItemClickListener listItemClickListener = this.p;
        if ((listItemClickListener == null) != (itemAddToListBindingModel_.p == null)) {
            viewDataBinding.G(146, listItemClickListener);
        }
        Boolean bool = this.q;
        Boolean bool2 = itemAddToListBindingModel_.q;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        viewDataBinding.G(140, this.q);
    }

    public final ItemAddToListBindingModel_ M(String str) {
        super.p(str);
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
        if (!(obj instanceof ItemAddToListBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemAddToListBindingModel_ itemAddToListBindingModel_ = (ItemAddToListBindingModel_) obj;
        if (this.n != itemAddToListBindingModel_.n) {
            return false;
        }
        ShoppingList shoppingList = this.o;
        if (shoppingList == null ? itemAddToListBindingModel_.o != null : !shoppingList.equals(itemAddToListBindingModel_.o)) {
            return false;
        }
        if ((this.p == null) != (itemAddToListBindingModel_.p == null)) {
            return false;
        }
        Boolean bool = this.q;
        Boolean bool2 = itemAddToListBindingModel_.q;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 28629151) + this.n) * 31;
        ShoppingList shoppingList = this.o;
        int iHashCode2 = (((iHashCode + (shoppingList != null ? shoppingList.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31;
        Boolean bool = this.q;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_add_to_list;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemAddToListBindingModel_{listIndex=" + this.n + ", shoppingList=" + this.o + ", itemClickListener=" + this.p + ", isShoppingListBeingSaved=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
