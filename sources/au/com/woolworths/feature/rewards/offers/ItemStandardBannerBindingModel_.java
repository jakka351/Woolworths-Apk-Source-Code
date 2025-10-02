package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemStandardBannerBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemStandardBannerBindingModelBuilder {
    public a n;
    public androidx.camera.camera2.interop.e o;
    public StandardBannerViewItem p;
    public c q;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final void x(int i, EpoxyHolder epoxyHolder) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) epoxyHolder;
        androidx.camera.camera2.interop.e eVar = this.o;
        if (eVar != null) {
            eVar.e(this, dataBindingHolder, i);
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(11, this.p)) {
            throw new IllegalStateException("The attribute banner was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(177, this.q)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemStandardBannerBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemStandardBannerBindingModel_ itemStandardBannerBindingModel_ = (ItemStandardBannerBindingModel_) epoxyModel;
        StandardBannerViewItem standardBannerViewItem = this.p;
        if (standardBannerViewItem == null ? itemStandardBannerBindingModel_.p != null : !standardBannerViewItem.equals(itemStandardBannerBindingModel_.p)) {
            viewDataBinding.G(11, this.p);
        }
        c cVar = this.q;
        if ((cVar == null) != (itemStandardBannerBindingModel_.q == null)) {
            viewDataBinding.G(177, cVar);
        }
    }

    public final ItemStandardBannerBindingModel_ M(String str) {
        super.p(str);
        return this;
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
        StandardBannerViewItem standardBannerViewItem;
        if (obj != this) {
            if ((obj instanceof ItemStandardBannerBindingModel_) && super.equals(obj)) {
                ItemStandardBannerBindingModel_ itemStandardBannerBindingModel_ = (ItemStandardBannerBindingModel_) obj;
                if ((this.n == null) == (itemStandardBannerBindingModel_.n == null)) {
                    if ((this.o == null) == (itemStandardBannerBindingModel_.o == null) && ((standardBannerViewItem = this.p) == null ? itemStandardBannerBindingModel_.p == null : standardBannerViewItem.equals(itemStandardBannerBindingModel_.p))) {
                        if ((this.q == null) != (itemStandardBannerBindingModel_.q == null)) {
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
        int iHashCode = ((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 961) + (this.o != null ? 1 : 0)) * 961;
        StandardBannerViewItem standardBannerViewItem = this.p;
        return ((iHashCode + (standardBannerViewItem != null ? standardBannerViewItem.hashCode() : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_standard_banner;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemStandardBannerBindingModel_{banner=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        androidx.camera.camera2.interop.e eVar = this.o;
        if (eVar != null) {
            eVar.e(this, dataBindingHolder, i);
        }
    }
}
