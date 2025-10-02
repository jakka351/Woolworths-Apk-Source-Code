package au.com.woolworths.feature.shop.recipes;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.home.data.FreshMagSummaryData;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageLoaderListener;
import au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagImageViewState;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemFreshMagHomeBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemFreshMagHomeBindingModelBuilder {
    public FreshMagHomeListener n;
    public FreshMagSummaryData o;
    public FreshMagImageLoaderListener p;
    public FreshMagImageViewState q;

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
        if (!viewDataBinding.G(85, this.n)) {
            throw new IllegalStateException("The attribute freshMagHomeListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(106, this.p)) {
            throw new IllegalStateException("The attribute imageLoaderListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(251, this.q)) {
            throw new IllegalStateException("The attribute state was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemFreshMagHomeBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemFreshMagHomeBindingModel_ itemFreshMagHomeBindingModel_ = (ItemFreshMagHomeBindingModel_) epoxyModel;
        FreshMagHomeListener freshMagHomeListener = this.n;
        if ((freshMagHomeListener == null) != (itemFreshMagHomeBindingModel_.n == null)) {
            viewDataBinding.G(85, freshMagHomeListener);
        }
        FreshMagSummaryData freshMagSummaryData = this.o;
        if (freshMagSummaryData == null ? itemFreshMagHomeBindingModel_.o != null : !freshMagSummaryData.equals(itemFreshMagHomeBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        FreshMagImageLoaderListener freshMagImageLoaderListener = this.p;
        if ((freshMagImageLoaderListener == null) != (itemFreshMagHomeBindingModel_.p == null)) {
            viewDataBinding.G(106, freshMagImageLoaderListener);
        }
        FreshMagImageViewState freshMagImageViewState = this.q;
        FreshMagImageViewState freshMagImageViewState2 = itemFreshMagHomeBindingModel_.q;
        if (freshMagImageViewState != null) {
            if (freshMagImageViewState.equals(freshMagImageViewState2)) {
                return;
            }
        } else if (freshMagImageViewState2 == null) {
            return;
        }
        viewDataBinding.G(251, this.q);
    }

    public final ItemFreshMagHomeBindingModel_ M() {
        super.p("fresh_mag_home");
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
        FreshMagSummaryData freshMagSummaryData;
        if (obj != this) {
            if ((obj instanceof ItemFreshMagHomeBindingModel_) && super.equals(obj)) {
                ItemFreshMagHomeBindingModel_ itemFreshMagHomeBindingModel_ = (ItemFreshMagHomeBindingModel_) obj;
                if ((this.n == null) == (itemFreshMagHomeBindingModel_.n == null) && ((freshMagSummaryData = this.o) == null ? itemFreshMagHomeBindingModel_.o == null : freshMagSummaryData.equals(itemFreshMagHomeBindingModel_.o))) {
                    if ((this.p == null) == (itemFreshMagHomeBindingModel_.p == null)) {
                        FreshMagImageViewState freshMagImageViewState = this.q;
                        FreshMagImageViewState freshMagImageViewState2 = itemFreshMagHomeBindingModel_.q;
                        if (freshMagImageViewState == null ? freshMagImageViewState2 == null : freshMagImageViewState.equals(freshMagImageViewState2)) {
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
        int iHashCode = ((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31;
        FreshMagSummaryData freshMagSummaryData = this.o;
        int iHashCode2 = (((iHashCode + (freshMagSummaryData != null ? freshMagSummaryData.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        FreshMagImageViewState freshMagImageViewState = this.q;
        return iHashCode2 + (freshMagImageViewState != null ? freshMagImageViewState.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_fresh_mag_home;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemFreshMagHomeBindingModel_{freshMagHomeListener=" + this.n + ", data=" + this.o + ", imageLoaderListener=" + this.p + ", state=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
