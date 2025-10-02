package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferActionListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRewardsProductOfferTileBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRewardsProductOfferTileBindingModelBuilder {
    public androidx.camera.camera2.interop.e n;
    public a o;
    public OfferViewItem p;
    public String q;
    public RewardsOfferActionListener r;

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
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(this, dataBindingHolder, i);
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(175, this.p)) {
            throw new IllegalStateException("The attribute offerViewItem was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(91, this.q)) {
            throw new IllegalStateException("The attribute groupTitle was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.r)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRewardsProductOfferTileBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRewardsProductOfferTileBindingModel_ itemRewardsProductOfferTileBindingModel_ = (ItemRewardsProductOfferTileBindingModel_) epoxyModel;
        OfferViewItem offerViewItem = this.p;
        if (offerViewItem == null ? itemRewardsProductOfferTileBindingModel_.p != null : !offerViewItem.equals(itemRewardsProductOfferTileBindingModel_.p)) {
            viewDataBinding.G(175, this.p);
        }
        String str = this.q;
        if (str == null ? itemRewardsProductOfferTileBindingModel_.q != null : !str.equals(itemRewardsProductOfferTileBindingModel_.q)) {
            viewDataBinding.G(91, this.q);
        }
        RewardsOfferActionListener rewardsOfferActionListener = this.r;
        if ((rewardsOfferActionListener == null) != (itemRewardsProductOfferTileBindingModel_.r == null)) {
            viewDataBinding.G(157, rewardsOfferActionListener);
        }
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        androidx.camera.camera2.interop.e eVar = this.n;
        if (eVar != null) {
            eVar.g(i, this, dataBindingHolder);
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
        OfferViewItem offerViewItem;
        String str;
        if (obj != this) {
            if ((obj instanceof ItemRewardsProductOfferTileBindingModel_) && super.equals(obj)) {
                ItemRewardsProductOfferTileBindingModel_ itemRewardsProductOfferTileBindingModel_ = (ItemRewardsProductOfferTileBindingModel_) obj;
                if ((this.n == null) == (itemRewardsProductOfferTileBindingModel_.n == null)) {
                    if ((this.o == null) == (itemRewardsProductOfferTileBindingModel_.o == null) && ((offerViewItem = this.p) == null ? itemRewardsProductOfferTileBindingModel_.p == null : offerViewItem.equals(itemRewardsProductOfferTileBindingModel_.p)) && ((str = this.q) == null ? itemRewardsProductOfferTileBindingModel_.q == null : str.equals(itemRewardsProductOfferTileBindingModel_.q))) {
                        if ((this.r == null) != (itemRewardsProductOfferTileBindingModel_.r == null)) {
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
        OfferViewItem offerViewItem = this.p;
        int iHashCode2 = (iHashCode + (offerViewItem != null ? offerViewItem.hashCode() : 0)) * 31;
        String str = this.q;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.r == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_rewards_product_offer_tile;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRewardsProductOfferTileBindingModel_{offerViewItem=" + this.p + ", groupTitle=" + this.q + ", listener=" + this.r + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(this, dataBindingHolder, i);
        }
    }
}
