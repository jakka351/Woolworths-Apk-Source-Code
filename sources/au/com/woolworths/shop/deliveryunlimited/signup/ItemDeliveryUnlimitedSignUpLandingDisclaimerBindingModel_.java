package au.com.woolworths.shop.deliveryunlimited.signup;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeTermsMarkdown;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModelBuilder {
    public DeliveryUnlimitedSubscribeTermsMarkdown n;

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
        if (!viewDataBinding.G(260, this.n)) {
            throw new IllegalStateException("The attribute terms was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown = this.n;
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown2 = ((ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_) epoxyModel).n;
        if (deliveryUnlimitedSubscribeTermsMarkdown != null) {
            if (deliveryUnlimitedSubscribeTermsMarkdown.equals(deliveryUnlimitedSubscribeTermsMarkdown2)) {
                return;
            }
        } else if (deliveryUnlimitedSubscribeTermsMarkdown2 == null) {
            return;
        }
        viewDataBinding.G(260, this.n);
    }

    public final ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_ M() {
        super.p("du_disclaimer_t&c");
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
        if (!(obj instanceof ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_) || !super.equals(obj)) {
            return false;
        }
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown = this.n;
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown2 = ((ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_) obj).n;
        return deliveryUnlimitedSubscribeTermsMarkdown == null ? deliveryUnlimitedSubscribeTermsMarkdown2 == null : deliveryUnlimitedSubscribeTermsMarkdown.equals(deliveryUnlimitedSubscribeTermsMarkdown2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown = this.n;
        return iHashCode + (deliveryUnlimitedSubscribeTermsMarkdown != null ? deliveryUnlimitedSubscribeTermsMarkdown.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_disclaimer;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDeliveryUnlimitedSignUpLandingDisclaimerBindingModel_{terms=" + this.n + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
