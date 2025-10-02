package au.com.woolworths.feature.shop.marketplace;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemMarketplaceErrorBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemMarketplaceErrorBindingModelBuilder {
    public FullPageErrorCause n;
    public FullPageErrorStateClickHandler o;

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
        if (!viewDataBinding.G(76, this.n)) {
            throw new IllegalStateException("The attribute errorState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemMarketplaceErrorBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemMarketplaceErrorBindingModel_ itemMarketplaceErrorBindingModel_ = (ItemMarketplaceErrorBindingModel_) epoxyModel;
        FullPageErrorCause fullPageErrorCause = this.n;
        if ((fullPageErrorCause == null) != (itemMarketplaceErrorBindingModel_.n == null)) {
            viewDataBinding.G(76, fullPageErrorCause);
        }
        FullPageErrorStateClickHandler fullPageErrorStateClickHandler = this.o;
        if ((fullPageErrorStateClickHandler == null) != (itemMarketplaceErrorBindingModel_.o == null)) {
            viewDataBinding.G(157, fullPageErrorStateClickHandler);
        }
    }

    public final ItemMarketplaceErrorBindingModel_ M() {
        super.p("error_state");
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
        if (!(obj instanceof ItemMarketplaceErrorBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemMarketplaceErrorBindingModel_ itemMarketplaceErrorBindingModel_ = (ItemMarketplaceErrorBindingModel_) obj;
        if ((this.n == null) != (itemMarketplaceErrorBindingModel_.n == null)) {
            return false;
        }
        return (this.o == null) == (itemMarketplaceErrorBindingModel_.o == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return (((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_marketplace_error;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemMarketplaceErrorBindingModel_{errorState=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
