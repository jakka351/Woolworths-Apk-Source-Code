package au.com.woolworths.feature.product.list.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductListInsetBannerLegacyBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductListInsetBannerLegacyBindingModelBuilder {
    public InsetBannerData n;
    public Integer o;
    public InsetBannerClickListener p;

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
        if (!viewDataBinding.G(11, this.n)) {
            throw new IllegalStateException("The attribute banner was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(267, this.o)) {
            throw new IllegalStateException("The attribute topMarginRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductListInsetBannerLegacyBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductListInsetBannerLegacyBindingModel_ itemProductListInsetBannerLegacyBindingModel_ = (ItemProductListInsetBannerLegacyBindingModel_) epoxyModel;
        InsetBannerData insetBannerData = this.n;
        if (insetBannerData == null ? itemProductListInsetBannerLegacyBindingModel_.n != null : !insetBannerData.equals(itemProductListInsetBannerLegacyBindingModel_.n)) {
            viewDataBinding.G(11, this.n);
        }
        Integer num = this.o;
        if (num == null ? itemProductListInsetBannerLegacyBindingModel_.o != null : !num.equals(itemProductListInsetBannerLegacyBindingModel_.o)) {
            viewDataBinding.G(267, this.o);
        }
        InsetBannerClickListener insetBannerClickListener = this.p;
        if ((insetBannerClickListener == null) != (itemProductListInsetBannerLegacyBindingModel_.p == null)) {
            viewDataBinding.G(157, insetBannerClickListener);
        }
    }

    public final void M(String str) {
        super.p(str);
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
        if (!(obj instanceof ItemProductListInsetBannerLegacyBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemProductListInsetBannerLegacyBindingModel_ itemProductListInsetBannerLegacyBindingModel_ = (ItemProductListInsetBannerLegacyBindingModel_) obj;
        InsetBannerData insetBannerData = this.n;
        if (insetBannerData == null ? itemProductListInsetBannerLegacyBindingModel_.n != null : !insetBannerData.equals(itemProductListInsetBannerLegacyBindingModel_.n)) {
            return false;
        }
        Integer num = this.o;
        if (num == null ? itemProductListInsetBannerLegacyBindingModel_.o == null : num.equals(itemProductListInsetBannerLegacyBindingModel_.o)) {
            return (this.p == null) == (itemProductListInsetBannerLegacyBindingModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        InsetBannerData insetBannerData = this.n;
        int iHashCode2 = (iHashCode + (insetBannerData != null ? insetBannerData.hashCode() : 0)) * 31;
        Integer num = this.o;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_list_inset_banner_legacy;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductListInsetBannerLegacyBindingModel_{banner=" + this.n + ", topMarginRes=" + this.o + ", listener=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
