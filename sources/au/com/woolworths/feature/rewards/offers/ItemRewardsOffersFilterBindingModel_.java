package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRewardsOffersFilterBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRewardsOffersFilterBindingModelBuilder {
    public Boolean n;
    public RewardsOfferFilterData o;
    public RewardsOffersClickListener p;

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
        if (!viewDataBinding.G(139, this.n)) {
            throw new IllegalStateException("The attribute isSelected was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(79, this.o)) {
            throw new IllegalStateException("The attribute filter was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRewardsOffersFilterBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRewardsOffersFilterBindingModel_ itemRewardsOffersFilterBindingModel_ = (ItemRewardsOffersFilterBindingModel_) epoxyModel;
        Boolean bool = this.n;
        if (bool == null ? itemRewardsOffersFilterBindingModel_.n != null : !bool.equals(itemRewardsOffersFilterBindingModel_.n)) {
            viewDataBinding.G(139, this.n);
        }
        RewardsOfferFilterData rewardsOfferFilterData = this.o;
        if (rewardsOfferFilterData == null ? itemRewardsOffersFilterBindingModel_.o != null : !rewardsOfferFilterData.equals(itemRewardsOffersFilterBindingModel_.o)) {
            viewDataBinding.G(79, this.o);
        }
        RewardsOffersClickListener rewardsOffersClickListener = this.p;
        if ((rewardsOffersClickListener == null) != (itemRewardsOffersFilterBindingModel_.p == null)) {
            viewDataBinding.G(35, rewardsOffersClickListener);
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
        if (!(obj instanceof ItemRewardsOffersFilterBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemRewardsOffersFilterBindingModel_ itemRewardsOffersFilterBindingModel_ = (ItemRewardsOffersFilterBindingModel_) obj;
        Boolean bool = this.n;
        if (bool == null ? itemRewardsOffersFilterBindingModel_.n != null : !bool.equals(itemRewardsOffersFilterBindingModel_.n)) {
            return false;
        }
        RewardsOfferFilterData rewardsOfferFilterData = this.o;
        if (rewardsOfferFilterData == null ? itemRewardsOffersFilterBindingModel_.o == null : rewardsOfferFilterData.equals(itemRewardsOffersFilterBindingModel_.o)) {
            return (this.p == null) == (itemRewardsOffersFilterBindingModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        Boolean bool = this.n;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        RewardsOfferFilterData rewardsOfferFilterData = this.o;
        return ((iHashCode2 + (rewardsOfferFilterData != null ? rewardsOfferFilterData.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_rewards_offers_filter;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRewardsOffersFilterBindingModel_{isSelected=" + this.n + ", filter=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
