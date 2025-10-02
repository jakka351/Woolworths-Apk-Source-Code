package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.rewards.base.data.RewardsEmptyStateData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRewardsOffersFilterNoOffersBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRewardsOffersFilterNoOffersBindingModelBuilder {
    public k n;
    public RewardsEmptyStateData o;

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
        if (!viewDataBinding.G(68, this.o)) {
            throw new IllegalStateException("The attribute emptyState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRewardsOffersFilterNoOffersBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        RewardsEmptyStateData rewardsEmptyStateData = this.o;
        RewardsEmptyStateData rewardsEmptyStateData2 = ((ItemRewardsOffersFilterNoOffersBindingModel_) epoxyModel).o;
        if (rewardsEmptyStateData != null) {
            if (rewardsEmptyStateData.equals(rewardsEmptyStateData2)) {
                return;
            }
        } else if (rewardsEmptyStateData2 == null) {
            return;
        }
        viewDataBinding.G(68, this.o);
    }

    public final ItemRewardsOffersFilterNoOffersBindingModel_ M() {
        super.p("rewards_filter_no_offer");
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        if (this.n != null) {
            RewardsOffersEpoxyController.buildModels$lambda$4$lambda$3(this, dataBindingHolder, i);
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
            if ((obj instanceof ItemRewardsOffersFilterNoOffersBindingModel_) && super.equals(obj)) {
                ItemRewardsOffersFilterNoOffersBindingModel_ itemRewardsOffersFilterNoOffersBindingModel_ = (ItemRewardsOffersFilterNoOffersBindingModel_) obj;
                if ((this.n == null) == (itemRewardsOffersFilterNoOffersBindingModel_.n == null)) {
                    RewardsEmptyStateData rewardsEmptyStateData = this.o;
                    RewardsEmptyStateData rewardsEmptyStateData2 = itemRewardsOffersFilterNoOffersBindingModel_.o;
                    if (rewardsEmptyStateData == null ? rewardsEmptyStateData2 == null : rewardsEmptyStateData.equals(rewardsEmptyStateData2)) {
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
        RewardsEmptyStateData rewardsEmptyStateData = this.o;
        return iHashCode + (rewardsEmptyStateData != null ? rewardsEmptyStateData.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_rewards_offers_filter_no_offers;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRewardsOffersFilterNoOffersBindingModel_{emptyState=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
