package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRedemptionSettingsBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRedemptionSettingsBindingModelBuilder {
    public RewardsRedemptionSettingsItem n;
    public RedemptionItemClickListener o;
    public boolean p;
    public boolean q;

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
        if (!viewDataBinding.G(215, this.n)) {
            throw new IllegalStateException("The attribute redemptionSettings was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(37, this.o)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(123, Boolean.valueOf(this.p))) {
            throw new IllegalStateException("The attribute isChecked was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(121, Boolean.valueOf(this.q))) {
            throw new IllegalStateException("The attribute isBeingChangedTo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRedemptionSettingsBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRedemptionSettingsBindingModel_ itemRedemptionSettingsBindingModel_ = (ItemRedemptionSettingsBindingModel_) epoxyModel;
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.n;
        if (rewardsRedemptionSettingsItem == null ? itemRedemptionSettingsBindingModel_.n != null : !rewardsRedemptionSettingsItem.equals(itemRedemptionSettingsBindingModel_.n)) {
            viewDataBinding.G(215, this.n);
        }
        RedemptionItemClickListener redemptionItemClickListener = this.o;
        if ((redemptionItemClickListener == null) != (itemRedemptionSettingsBindingModel_.o == null)) {
            viewDataBinding.G(37, redemptionItemClickListener);
        }
        boolean z = this.p;
        if (z != itemRedemptionSettingsBindingModel_.p) {
            viewDataBinding.G(123, Boolean.valueOf(z));
        }
        boolean z2 = this.q;
        if (z2 != itemRedemptionSettingsBindingModel_.q) {
            viewDataBinding.G(121, Boolean.valueOf(z2));
        }
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
        if (!(obj instanceof ItemRedemptionSettingsBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemRedemptionSettingsBindingModel_ itemRedemptionSettingsBindingModel_ = (ItemRedemptionSettingsBindingModel_) obj;
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.n;
        if (rewardsRedemptionSettingsItem == null ? itemRedemptionSettingsBindingModel_.n == null : rewardsRedemptionSettingsItem.equals(itemRedemptionSettingsBindingModel_.n)) {
            return (this.o == null) == (itemRedemptionSettingsBindingModel_.o == null) && this.p == itemRedemptionSettingsBindingModel_.p && this.q == itemRedemptionSettingsBindingModel_.q;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.n;
        return ((((((iHashCode + (rewardsRedemptionSettingsItem != null ? rewardsRedemptionSettingsItem.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_redemption_settings;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRedemptionSettingsBindingModel_{redemptionSettings=" + this.n + ", clickListener=" + this.o + ", isChecked=" + this.p + ", isBeingChangedTo=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
