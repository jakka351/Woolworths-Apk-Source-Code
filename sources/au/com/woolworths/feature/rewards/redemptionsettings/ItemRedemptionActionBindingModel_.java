package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRedemptionActionBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRedemptionActionBindingModelBuilder {
    public RewardsRedemptionAction n;
    public RedemptionItemClickListener o;

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
        if (!viewDataBinding.G(1, this.n)) {
            throw new IllegalStateException("The attribute action was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(37, this.o)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRedemptionActionBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRedemptionActionBindingModel_ itemRedemptionActionBindingModel_ = (ItemRedemptionActionBindingModel_) epoxyModel;
        RewardsRedemptionAction rewardsRedemptionAction = this.n;
        if (rewardsRedemptionAction == null ? itemRedemptionActionBindingModel_.n != null : !rewardsRedemptionAction.equals(itemRedemptionActionBindingModel_.n)) {
            viewDataBinding.G(1, this.n);
        }
        RedemptionItemClickListener redemptionItemClickListener = this.o;
        if ((redemptionItemClickListener == null) != (itemRedemptionActionBindingModel_.o == null)) {
            viewDataBinding.G(37, redemptionItemClickListener);
        }
    }

    public final ItemRedemptionActionBindingModel_ M(String str) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemRedemptionActionBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemRedemptionActionBindingModel_ itemRedemptionActionBindingModel_ = (ItemRedemptionActionBindingModel_) obj;
        RewardsRedemptionAction rewardsRedemptionAction = this.n;
        if (rewardsRedemptionAction == null ? itemRedemptionActionBindingModel_.n == null : rewardsRedemptionAction.equals(itemRedemptionActionBindingModel_.n)) {
            return (this.o == null) == (itemRedemptionActionBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        RewardsRedemptionAction rewardsRedemptionAction = this.n;
        return ((iHashCode + (rewardsRedemptionAction != null ? rewardsRedemptionAction.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_redemption_action;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRedemptionActionBindingModel_{action=" + this.n + ", clickListener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
