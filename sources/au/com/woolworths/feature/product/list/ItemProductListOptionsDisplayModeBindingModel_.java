package au.com.woolworths.feature.product.list;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.ui.DisplayModeClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductListOptionsDisplayModeBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductListOptionsDisplayModeBindingModelBuilder {
    public ProductsDisplayMode n;
    public boolean o;
    public DisplayModeClickListener p;

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
        if (!viewDataBinding.G(172, this.n)) {
            throw new IllegalStateException("The attribute mode was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(123, Boolean.valueOf(this.o))) {
            throw new IllegalStateException("The attribute isChecked was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(37, this.p)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductListOptionsDisplayModeBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductListOptionsDisplayModeBindingModel_ itemProductListOptionsDisplayModeBindingModel_ = (ItemProductListOptionsDisplayModeBindingModel_) epoxyModel;
        ProductsDisplayMode productsDisplayMode = this.n;
        if (productsDisplayMode == null ? itemProductListOptionsDisplayModeBindingModel_.n != null : !productsDisplayMode.equals(itemProductListOptionsDisplayModeBindingModel_.n)) {
            viewDataBinding.G(172, this.n);
        }
        boolean z = this.o;
        if (z != itemProductListOptionsDisplayModeBindingModel_.o) {
            viewDataBinding.G(123, Boolean.valueOf(z));
        }
        DisplayModeClickListener displayModeClickListener = this.p;
        if ((displayModeClickListener == null) != (itemProductListOptionsDisplayModeBindingModel_.p == null)) {
            viewDataBinding.G(37, displayModeClickListener);
        }
    }

    public final ItemProductListOptionsDisplayModeBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemProductListOptionsDisplayModeBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemProductListOptionsDisplayModeBindingModel_ itemProductListOptionsDisplayModeBindingModel_ = (ItemProductListOptionsDisplayModeBindingModel_) obj;
        ProductsDisplayMode productsDisplayMode = this.n;
        if (productsDisplayMode == null ? itemProductListOptionsDisplayModeBindingModel_.n != null : !productsDisplayMode.equals(itemProductListOptionsDisplayModeBindingModel_.n)) {
            return false;
        }
        if (this.o != itemProductListOptionsDisplayModeBindingModel_.o) {
            return false;
        }
        return (this.p == null) == (itemProductListOptionsDisplayModeBindingModel_.p == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        ProductsDisplayMode productsDisplayMode = this.n;
        return ((((iHashCode + (productsDisplayMode != null ? productsDisplayMode.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_list_options_display_mode;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductListOptionsDisplayModeBindingModel_{mode=" + this.n + ", isChecked=" + this.o + ", clickListener=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
