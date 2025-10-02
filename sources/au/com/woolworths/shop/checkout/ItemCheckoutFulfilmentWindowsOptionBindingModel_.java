package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutFulfilmentWindowsOptionBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutFulfilmentWindowsOptionBindingModelBuilder {
    public FulfilmentWindows n;
    public FulfilmentWindowsOption o;
    public String p;
    public FulfilmentWindowsListener q;

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
        if (!viewDataBinding.G(88, this.n)) {
            throw new IllegalStateException("The attribute fulfilmentWindows was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(89, this.o)) {
            throw new IllegalStateException("The attribute fulfilmentWindowsOption was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(263, this.p)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.q)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutFulfilmentWindowsOptionBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutFulfilmentWindowsOptionBindingModel_ itemCheckoutFulfilmentWindowsOptionBindingModel_ = (ItemCheckoutFulfilmentWindowsOptionBindingModel_) epoxyModel;
        FulfilmentWindows fulfilmentWindows = this.n;
        if (fulfilmentWindows == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.n != null : !fulfilmentWindows.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.n)) {
            viewDataBinding.G(88, this.n);
        }
        FulfilmentWindowsOption fulfilmentWindowsOption = this.o;
        if (fulfilmentWindowsOption == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.o != null : !fulfilmentWindowsOption.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.o)) {
            viewDataBinding.G(89, this.o);
        }
        String str = this.p;
        if (str == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.p != null : !str.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.p)) {
            viewDataBinding.G(263, this.p);
        }
        FulfilmentWindowsListener fulfilmentWindowsListener = this.q;
        if ((fulfilmentWindowsListener == null) != (itemCheckoutFulfilmentWindowsOptionBindingModel_.q == null)) {
            viewDataBinding.G(157, fulfilmentWindowsListener);
        }
    }

    public final ItemCheckoutFulfilmentWindowsOptionBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemCheckoutFulfilmentWindowsOptionBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemCheckoutFulfilmentWindowsOptionBindingModel_ itemCheckoutFulfilmentWindowsOptionBindingModel_ = (ItemCheckoutFulfilmentWindowsOptionBindingModel_) obj;
        FulfilmentWindows fulfilmentWindows = this.n;
        if (fulfilmentWindows == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.n != null : !fulfilmentWindows.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.n)) {
            return false;
        }
        FulfilmentWindowsOption fulfilmentWindowsOption = this.o;
        if (fulfilmentWindowsOption == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.o != null : !fulfilmentWindowsOption.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.o)) {
            return false;
        }
        String str = this.p;
        if (str == null ? itemCheckoutFulfilmentWindowsOptionBindingModel_.p == null : str.equals(itemCheckoutFulfilmentWindowsOptionBindingModel_.p)) {
            return (this.q == null) == (itemCheckoutFulfilmentWindowsOptionBindingModel_.q == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        FulfilmentWindows fulfilmentWindows = this.n;
        int iHashCode2 = (iHashCode + (fulfilmentWindows != null ? fulfilmentWindows.hashCode() : 0)) * 31;
        FulfilmentWindowsOption fulfilmentWindowsOption = this.o;
        int iHashCode3 = (iHashCode2 + (fulfilmentWindowsOption != null ? fulfilmentWindowsOption.hashCode() : 0)) * 31;
        String str = this.p;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + (this.q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_fulfilment_windows_option;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutFulfilmentWindowsOptionBindingModel_{fulfilmentWindows=" + this.n + ", fulfilmentWindowsOption=" + this.o + ", title=" + this.p + ", listener=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
