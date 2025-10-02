package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.shop.checkout.domain.model.address.OrderAddress;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutOrderAddressBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutOrderAddressBindingModelBuilder {
    public OrderAddress n;
    public InsetBannerData o;
    public String p;

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
        if (!viewDataBinding.G(4, this.n)) {
            throw new IllegalStateException("The attribute address was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(118, this.o)) {
            throw new IllegalStateException("The attribute insetBanner was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(86, this.p)) {
            throw new IllegalStateException("The attribute fulfilmentWindow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutOrderAddressBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = (ItemCheckoutOrderAddressBindingModel_) epoxyModel;
        OrderAddress orderAddress = this.n;
        if (orderAddress == null ? itemCheckoutOrderAddressBindingModel_.n != null : !orderAddress.equals(itemCheckoutOrderAddressBindingModel_.n)) {
            viewDataBinding.G(4, this.n);
        }
        InsetBannerData insetBannerData = this.o;
        if (insetBannerData == null ? itemCheckoutOrderAddressBindingModel_.o != null : !insetBannerData.equals(itemCheckoutOrderAddressBindingModel_.o)) {
            viewDataBinding.G(118, this.o);
        }
        String str = this.p;
        String str2 = itemCheckoutOrderAddressBindingModel_.p;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        viewDataBinding.G(86, this.p);
    }

    public final ItemCheckoutOrderAddressBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemCheckoutOrderAddressBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutOrderAddressBindingModel_ itemCheckoutOrderAddressBindingModel_ = (ItemCheckoutOrderAddressBindingModel_) obj;
        OrderAddress orderAddress = this.n;
        if (orderAddress == null ? itemCheckoutOrderAddressBindingModel_.n != null : !orderAddress.equals(itemCheckoutOrderAddressBindingModel_.n)) {
            return false;
        }
        InsetBannerData insetBannerData = this.o;
        if (insetBannerData == null ? itemCheckoutOrderAddressBindingModel_.o != null : !insetBannerData.equals(itemCheckoutOrderAddressBindingModel_.o)) {
            return false;
        }
        String str = this.p;
        String str2 = itemCheckoutOrderAddressBindingModel_.p;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        OrderAddress orderAddress = this.n;
        int iHashCode2 = (iHashCode + (orderAddress != null ? orderAddress.hashCode() : 0)) * 31;
        InsetBannerData insetBannerData = this.o;
        int iHashCode3 = (iHashCode2 + (insetBannerData != null ? insetBannerData.hashCode() : 0)) * 31;
        String str = this.p;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_order_address;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutOrderAddressBindingModel_{address=" + this.n + ", insetBanner=" + this.o + ", fulfilmentWindow=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
