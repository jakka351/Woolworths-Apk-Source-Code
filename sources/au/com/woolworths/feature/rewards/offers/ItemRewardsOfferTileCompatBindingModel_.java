package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRewardsOfferTileCompatBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRewardsOfferTileCompatBindingModelBuilder {
    public androidx.camera.core.processing.f n;
    public androidx.camera.camera2.interop.e o;
    public OfferViewItem p;

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
        if (!viewDataBinding.G(145, this.p)) {
            throw new IllegalStateException("The attribute item was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRewardsOfferTileCompatBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        OfferViewItem offerViewItem = this.p;
        OfferViewItem offerViewItem2 = ((ItemRewardsOfferTileCompatBindingModel_) epoxyModel).p;
        if (offerViewItem != null) {
            if (offerViewItem.equals(offerViewItem2)) {
                return;
            }
        } else if (offerViewItem2 == null) {
            return;
        }
        viewDataBinding.G(145, this.p);
    }

    public final ItemRewardsOfferTileCompatBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        androidx.camera.core.processing.f fVar = this.n;
        if (fVar != null) {
            fVar.g(i, this, dataBindingHolder);
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
        if (obj != this) {
            if ((obj instanceof ItemRewardsOfferTileCompatBindingModel_) && super.equals(obj)) {
                ItemRewardsOfferTileCompatBindingModel_ itemRewardsOfferTileCompatBindingModel_ = (ItemRewardsOfferTileCompatBindingModel_) obj;
                if ((this.n == null) == (itemRewardsOfferTileCompatBindingModel_.n == null)) {
                    if ((this.o == null) == (itemRewardsOfferTileCompatBindingModel_.o == null)) {
                        OfferViewItem offerViewItem = this.p;
                        OfferViewItem offerViewItem2 = itemRewardsOfferTileCompatBindingModel_.p;
                        if (offerViewItem == null ? offerViewItem2 == null : offerViewItem.equals(offerViewItem2)) {
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
        int iHashCode = ((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 961) + (this.o == null ? 0 : 1)) * 961;
        OfferViewItem offerViewItem = this.p;
        return iHashCode + (offerViewItem != null ? offerViewItem.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_rewards_offer_tile_compat;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRewardsOfferTileCompatBindingModel_{item=" + this.p + "}" + super.toString();
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
