package au.com.woolworths.feature.product.list.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.ui.FilterOptionsClickListener;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionsItem;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductListOptionsFilterLegacyBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductListOptionsFilterLegacyBindingModelBuilder {
    public ProductListOptionsItem.FilterOptionItem n;
    public FilterOptionsClickListener o;

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
        if (!viewDataBinding.G(81, this.n)) {
            throw new IllegalStateException("The attribute filterOption was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(82, this.o)) {
            throw new IllegalStateException("The attribute filterOptionClickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductListOptionsFilterLegacyBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductListOptionsFilterLegacyBindingModel_ itemProductListOptionsFilterLegacyBindingModel_ = (ItemProductListOptionsFilterLegacyBindingModel_) epoxyModel;
        ProductListOptionsItem.FilterOptionItem filterOptionItem = this.n;
        if (filterOptionItem == null ? itemProductListOptionsFilterLegacyBindingModel_.n != null : !filterOptionItem.equals(itemProductListOptionsFilterLegacyBindingModel_.n)) {
            viewDataBinding.G(81, this.n);
        }
        FilterOptionsClickListener filterOptionsClickListener = this.o;
        if ((filterOptionsClickListener == null) != (itemProductListOptionsFilterLegacyBindingModel_.o == null)) {
            viewDataBinding.G(82, filterOptionsClickListener);
        }
    }

    public final ItemProductListOptionsFilterLegacyBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemProductListOptionsFilterLegacyBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemProductListOptionsFilterLegacyBindingModel_ itemProductListOptionsFilterLegacyBindingModel_ = (ItemProductListOptionsFilterLegacyBindingModel_) obj;
        ProductListOptionsItem.FilterOptionItem filterOptionItem = this.n;
        if (filterOptionItem == null ? itemProductListOptionsFilterLegacyBindingModel_.n == null : filterOptionItem.equals(itemProductListOptionsFilterLegacyBindingModel_.n)) {
            return (this.o == null) == (itemProductListOptionsFilterLegacyBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        ProductListOptionsItem.FilterOptionItem filterOptionItem = this.n;
        return ((iHashCode + (filterOptionItem != null ? filterOptionItem.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_list_options_filter_legacy;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductListOptionsFilterLegacyBindingModel_{filterOption=" + this.n + ", filterOptionClickListener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
