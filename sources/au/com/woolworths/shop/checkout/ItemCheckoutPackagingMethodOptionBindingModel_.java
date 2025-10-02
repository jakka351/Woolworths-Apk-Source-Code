package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutPackagingMethodOptionBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutPackagingMethodOptionBindingModelBuilder {
    public PackagingMethodOption n;
    public CheckoutDetailsListener o;

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
        if (!viewDataBinding.G(191, this.n)) {
            throw new IllegalStateException("The attribute packagingMethodOption was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutPackagingMethodOptionBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutPackagingMethodOptionBindingModel_ itemCheckoutPackagingMethodOptionBindingModel_ = (ItemCheckoutPackagingMethodOptionBindingModel_) epoxyModel;
        PackagingMethodOption packagingMethodOption = this.n;
        if (packagingMethodOption == null ? itemCheckoutPackagingMethodOptionBindingModel_.n != null : !packagingMethodOption.equals(itemCheckoutPackagingMethodOptionBindingModel_.n)) {
            viewDataBinding.G(191, this.n);
        }
        CheckoutDetailsListener checkoutDetailsListener = this.o;
        if ((checkoutDetailsListener == null) != (itemCheckoutPackagingMethodOptionBindingModel_.o == null)) {
            viewDataBinding.G(157, checkoutDetailsListener);
        }
    }

    public final ItemCheckoutPackagingMethodOptionBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemCheckoutPackagingMethodOptionBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutPackagingMethodOptionBindingModel_ itemCheckoutPackagingMethodOptionBindingModel_ = (ItemCheckoutPackagingMethodOptionBindingModel_) obj;
        PackagingMethodOption packagingMethodOption = this.n;
        if (packagingMethodOption == null ? itemCheckoutPackagingMethodOptionBindingModel_.n == null : packagingMethodOption.equals(itemCheckoutPackagingMethodOptionBindingModel_.n)) {
            return (this.o == null) == (itemCheckoutPackagingMethodOptionBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        PackagingMethodOption packagingMethodOption = this.n;
        return ((iHashCode + (packagingMethodOption != null ? packagingMethodOption.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_packaging_method_option;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutPackagingMethodOptionBindingModel_{packagingMethodOption=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
