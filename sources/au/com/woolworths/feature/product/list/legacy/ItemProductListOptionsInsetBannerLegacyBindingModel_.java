package au.com.woolworths.feature.product.list.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.data.FilterInsetBannerData;
import au.com.woolworths.feature.product.list.legacy.ui.FilterInsetBannerClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductListOptionsInsetBannerLegacyBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductListOptionsInsetBannerLegacyBindingModelBuilder {
    public v n;
    public FilterInsetBannerData o;
    public FilterInsetBannerClickListener p;

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
        if (!viewDataBinding.G(11, this.o)) {
            throw new IllegalStateException("The attribute banner was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductListOptionsInsetBannerLegacyBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductListOptionsInsetBannerLegacyBindingModel_ itemProductListOptionsInsetBannerLegacyBindingModel_ = (ItemProductListOptionsInsetBannerLegacyBindingModel_) epoxyModel;
        FilterInsetBannerData filterInsetBannerData = this.o;
        if (filterInsetBannerData == null ? itemProductListOptionsInsetBannerLegacyBindingModel_.o != null : !filterInsetBannerData.equals(itemProductListOptionsInsetBannerLegacyBindingModel_.o)) {
            viewDataBinding.G(11, this.o);
        }
        FilterInsetBannerClickListener filterInsetBannerClickListener = this.p;
        if ((filterInsetBannerClickListener == null) != (itemProductListOptionsInsetBannerLegacyBindingModel_.p == null)) {
            viewDataBinding.G(35, filterInsetBannerClickListener);
        }
    }

    public final ItemProductListOptionsInsetBannerLegacyBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        v vVar = this.n;
        if (vVar != null) {
            vVar.g(i, this, dataBindingHolder);
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
        FilterInsetBannerData filterInsetBannerData;
        if (obj != this) {
            if ((obj instanceof ItemProductListOptionsInsetBannerLegacyBindingModel_) && super.equals(obj)) {
                ItemProductListOptionsInsetBannerLegacyBindingModel_ itemProductListOptionsInsetBannerLegacyBindingModel_ = (ItemProductListOptionsInsetBannerLegacyBindingModel_) obj;
                if ((this.n == null) == (itemProductListOptionsInsetBannerLegacyBindingModel_.n == null) && ((filterInsetBannerData = this.o) == null ? itemProductListOptionsInsetBannerLegacyBindingModel_.o == null : filterInsetBannerData.equals(itemProductListOptionsInsetBannerLegacyBindingModel_.o))) {
                    if ((this.p == null) != (itemProductListOptionsInsetBannerLegacyBindingModel_.p == null)) {
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
        FilterInsetBannerData filterInsetBannerData = this.o;
        return ((iHashCode + (filterInsetBannerData != null ? filterInsetBannerData.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_list_options_inset_banner_legacy;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductListOptionsInsetBannerLegacyBindingModel_{banner=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
