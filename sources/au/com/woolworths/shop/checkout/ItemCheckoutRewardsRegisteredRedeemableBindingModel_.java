package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.rewards.CheckoutSummaryRewardsSegment;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutRewardsRegisteredRedeemableBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutRewardsRegisteredRedeemableBindingModelBuilder {
    public CheckoutSummaryRewardsSegment.RegisteredRedeemable n;
    public CheckoutSummaryListener o;

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
        if (!viewDataBinding.G(219, this.n)) {
            throw new IllegalStateException("The attribute rewardsRegisteredRedeemable was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutRewardsRegisteredRedeemableBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutRewardsRegisteredRedeemableBindingModel_ itemCheckoutRewardsRegisteredRedeemableBindingModel_ = (ItemCheckoutRewardsRegisteredRedeemableBindingModel_) epoxyModel;
        CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable = this.n;
        if (registeredRedeemable == null ? itemCheckoutRewardsRegisteredRedeemableBindingModel_.n != null : !registeredRedeemable.equals(itemCheckoutRewardsRegisteredRedeemableBindingModel_.n)) {
            viewDataBinding.G(219, this.n);
        }
        CheckoutSummaryListener checkoutSummaryListener = this.o;
        if ((checkoutSummaryListener == null) != (itemCheckoutRewardsRegisteredRedeemableBindingModel_.o == null)) {
            viewDataBinding.G(157, checkoutSummaryListener);
        }
    }

    public final ItemCheckoutRewardsRegisteredRedeemableBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemCheckoutRewardsRegisteredRedeemableBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutRewardsRegisteredRedeemableBindingModel_ itemCheckoutRewardsRegisteredRedeemableBindingModel_ = (ItemCheckoutRewardsRegisteredRedeemableBindingModel_) obj;
        CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable = this.n;
        if (registeredRedeemable == null ? itemCheckoutRewardsRegisteredRedeemableBindingModel_.n == null : registeredRedeemable.equals(itemCheckoutRewardsRegisteredRedeemableBindingModel_.n)) {
            return (this.o == null) == (itemCheckoutRewardsRegisteredRedeemableBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        CheckoutSummaryRewardsSegment.RegisteredRedeemable registeredRedeemable = this.n;
        return ((iHashCode + (registeredRedeemable != null ? registeredRedeemable.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_rewards_registered_redeemable;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutRewardsRegisteredRedeemableBindingModel_{rewardsRegisteredRedeemable=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
