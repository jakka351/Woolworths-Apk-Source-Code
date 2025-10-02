package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddress;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutSummaryBillingAddressBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutSummaryBillingAddressBindingModelBuilder {
    public CheckoutSummaryBillingAddress n;

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
        if (!viewDataBinding.G(16, this.n)) {
            throw new IllegalStateException("The attribute billingAddress was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutSummaryBillingAddressBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress = this.n;
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress2 = ((ItemCheckoutSummaryBillingAddressBindingModel_) epoxyModel).n;
        if (checkoutSummaryBillingAddress != null) {
            if (checkoutSummaryBillingAddress.equals(checkoutSummaryBillingAddress2)) {
                return;
            }
        } else if (checkoutSummaryBillingAddress2 == null) {
            return;
        }
        viewDataBinding.G(16, this.n);
    }

    public final ItemCheckoutSummaryBillingAddressBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemCheckoutSummaryBillingAddressBindingModel_) || !super.equals(obj)) {
            return false;
        }
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress = this.n;
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress2 = ((ItemCheckoutSummaryBillingAddressBindingModel_) obj).n;
        return checkoutSummaryBillingAddress == null ? checkoutSummaryBillingAddress2 == null : checkoutSummaryBillingAddress.equals(checkoutSummaryBillingAddress2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        CheckoutSummaryBillingAddress checkoutSummaryBillingAddress = this.n;
        return iHashCode + (checkoutSummaryBillingAddress != null ? checkoutSummaryBillingAddress.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_summary_billing_address;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutSummaryBillingAddressBindingModel_{billingAddress=" + this.n + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
