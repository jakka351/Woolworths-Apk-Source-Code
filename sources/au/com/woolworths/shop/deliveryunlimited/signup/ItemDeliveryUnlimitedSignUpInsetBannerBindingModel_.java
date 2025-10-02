package au.com.woolworths.shop.deliveryunlimited.signup;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.product.details.b;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDeliveryUnlimitedSignUpInsetBannerBindingModelBuilder {
    public b n;
    public InsetBanner o;
    public InsetBannerClickListener p;

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
        if (!viewDataBinding.G(14, this.o)) {
            throw new IllegalStateException("The attribute bannerState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ itemDeliveryUnlimitedSignUpInsetBannerBindingModel_ = (ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_) epoxyModel;
        InsetBanner insetBanner = this.o;
        if ((insetBanner == null) != (itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.o == null)) {
            viewDataBinding.G(14, insetBanner);
        }
        InsetBannerClickListener insetBannerClickListener = this.p;
        if ((insetBannerClickListener == null) != (itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.p == null)) {
            viewDataBinding.G(35, insetBannerClickListener);
        }
    }

    public final ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ M(String str) {
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
        if (obj != this) {
            if ((obj instanceof ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_) && super.equals(obj)) {
                ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_ itemDeliveryUnlimitedSignUpInsetBannerBindingModel_ = (ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_) obj;
                if ((this.n == null) == (itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.n == null)) {
                    if ((this.o == null) == (itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.o == null)) {
                        if ((this.p == null) != (itemDeliveryUnlimitedSignUpInsetBannerBindingModel_.p == null)) {
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
        return (((((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521) + (this.o != null ? 1 : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_delivery_unlimited_sign_up_inset_banner;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_{bannerState=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
