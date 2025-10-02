package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemSpinSurpriseBannerBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemSpinSurpriseBannerBindingModelBuilder {
    public androidx.camera.camera2.interop.e n;
    public SpinSurpriseBannerViewItem o;
    public au.com.woolworths.feature.rewards.card.overlay.ui.b p;

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
        androidx.camera.camera2.interop.e eVar = this.n;
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
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(176, this.p)) {
            throw new IllegalStateException("The attribute onBannerClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemSpinSurpriseBannerBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemSpinSurpriseBannerBindingModel_ itemSpinSurpriseBannerBindingModel_ = (ItemSpinSurpriseBannerBindingModel_) epoxyModel;
        SpinSurpriseBannerViewItem spinSurpriseBannerViewItem = this.o;
        if (spinSurpriseBannerViewItem == null ? itemSpinSurpriseBannerBindingModel_.o != null : !spinSurpriseBannerViewItem.equals(itemSpinSurpriseBannerBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        au.com.woolworths.feature.rewards.card.overlay.ui.b bVar = this.p;
        if ((bVar == null) != (itemSpinSurpriseBannerBindingModel_.p == null)) {
            viewDataBinding.G(176, bVar);
        }
    }

    public final ItemSpinSurpriseBannerBindingModel_ M(String str) {
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
        SpinSurpriseBannerViewItem spinSurpriseBannerViewItem;
        if (obj != this) {
            if ((obj instanceof ItemSpinSurpriseBannerBindingModel_) && super.equals(obj)) {
                ItemSpinSurpriseBannerBindingModel_ itemSpinSurpriseBannerBindingModel_ = (ItemSpinSurpriseBannerBindingModel_) obj;
                if ((this.n == null) == (itemSpinSurpriseBannerBindingModel_.n == null) && ((spinSurpriseBannerViewItem = this.o) == null ? itemSpinSurpriseBannerBindingModel_.o == null : spinSurpriseBannerViewItem.equals(itemSpinSurpriseBannerBindingModel_.o))) {
                    if ((this.p == null) != (itemSpinSurpriseBannerBindingModel_.p == null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 29791) + (this.n != null ? 1 : 0)) * 961;
        SpinSurpriseBannerViewItem spinSurpriseBannerViewItem = this.o;
        return ((iHashCode + (spinSurpriseBannerViewItem != null ? spinSurpriseBannerViewItem.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_spin_surprise_banner;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemSpinSurpriseBannerBindingModel_{data=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        androidx.camera.camera2.interop.e eVar = this.n;
        if (eVar != null) {
            eVar.e(this, dataBindingHolder, i);
        }
    }
}
