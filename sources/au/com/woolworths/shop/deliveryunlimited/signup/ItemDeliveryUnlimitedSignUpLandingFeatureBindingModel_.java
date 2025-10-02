package au.com.woolworths.shop.deliveryunlimited.signup;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.b;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpLandingFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSummaryClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDeliveryUnlimitedSignUpLandingFeatureBindingModelBuilder {
    public b n;
    public DeliveryUnlimitedSignUpLandingFeature o;
    public DeliveryUnlimitedSummaryClickListener p;

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
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(37, this.p)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ = (ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_) epoxyModel;
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature = this.o;
        if (deliveryUnlimitedSignUpLandingFeature == null ? itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.o != null : !deliveryUnlimitedSignUpLandingFeature.equals(itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        DeliveryUnlimitedSummaryClickListener deliveryUnlimitedSummaryClickListener = this.p;
        if ((deliveryUnlimitedSummaryClickListener == null) != (itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.p == null)) {
            viewDataBinding.G(37, deliveryUnlimitedSummaryClickListener);
        }
    }

    public final ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        b bVar = this.n;
        if (bVar != null) {
            bVar.g(i, this, dataBindingHolder);
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
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature;
        if (obj != this) {
            if ((obj instanceof ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_) && super.equals(obj)) {
                ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_ = (ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_) obj;
                if ((this.n == null) == (itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.n == null) && ((deliveryUnlimitedSignUpLandingFeature = this.o) == null ? itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.o == null : deliveryUnlimitedSignUpLandingFeature.equals(itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.o))) {
                    if ((this.p == null) != (itemDeliveryUnlimitedSignUpLandingFeatureBindingModel_.p == null)) {
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
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature = this.o;
        return ((iHashCode + (deliveryUnlimitedSignUpLandingFeature != null ? deliveryUnlimitedSignUpLandingFeature.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_landing_feature;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_{data=" + this.o + ", clickListener=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
