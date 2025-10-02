package au.com.woolworths.shop.checkout;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupEpoxyController;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemCheckoutFulfilmentSlotBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCheckoutFulfilmentSlotBindingModelBuilder {
    public k n;
    public FulfilmentWindowsSlot o;
    public FulfilmentWindowsSlotListener p;
    public Boolean q;

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
        if (!viewDataBinding.G(90, this.o)) {
            throw new IllegalStateException("The attribute fulfilmentWindowsSlot was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.p)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(139, this.q)) {
            throw new IllegalStateException("The attribute isSelected was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCheckoutFulfilmentSlotBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCheckoutFulfilmentSlotBindingModel_ itemCheckoutFulfilmentSlotBindingModel_ = (ItemCheckoutFulfilmentSlotBindingModel_) epoxyModel;
        FulfilmentWindowsSlot fulfilmentWindowsSlot = this.o;
        if (fulfilmentWindowsSlot == null ? itemCheckoutFulfilmentSlotBindingModel_.o != null : !fulfilmentWindowsSlot.equals(itemCheckoutFulfilmentSlotBindingModel_.o)) {
            viewDataBinding.G(90, this.o);
        }
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.p;
        if ((fulfilmentWindowsSlotListener == null) != (itemCheckoutFulfilmentSlotBindingModel_.p == null)) {
            viewDataBinding.G(157, fulfilmentWindowsSlotListener);
        }
        Boolean bool = this.q;
        Boolean bool2 = itemCheckoutFulfilmentSlotBindingModel_.q;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        viewDataBinding.G(139, this.q);
    }

    public final ItemCheckoutFulfilmentSlotBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        if (this.n != null) {
            FulfilmentWindowsGroupEpoxyController.buildSlots$lambda$9$lambda$8$lambda$7(this, dataBindingHolder, i);
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
        FulfilmentWindowsSlot fulfilmentWindowsSlot;
        if (obj != this) {
            if ((obj instanceof ItemCheckoutFulfilmentSlotBindingModel_) && super.equals(obj)) {
                ItemCheckoutFulfilmentSlotBindingModel_ itemCheckoutFulfilmentSlotBindingModel_ = (ItemCheckoutFulfilmentSlotBindingModel_) obj;
                if ((this.n == null) == (itemCheckoutFulfilmentSlotBindingModel_.n == null) && ((fulfilmentWindowsSlot = this.o) == null ? itemCheckoutFulfilmentSlotBindingModel_.o == null : fulfilmentWindowsSlot.equals(itemCheckoutFulfilmentSlotBindingModel_.o))) {
                    if ((this.p == null) == (itemCheckoutFulfilmentSlotBindingModel_.p == null)) {
                        Boolean bool = this.q;
                        Boolean bool2 = itemCheckoutFulfilmentSlotBindingModel_.q;
                        if (bool == null ? bool2 == null : bool.equals(bool2)) {
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
        int iHashCode = ((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521;
        FulfilmentWindowsSlot fulfilmentWindowsSlot = this.o;
        int iHashCode2 = (((iHashCode + (fulfilmentWindowsSlot != null ? fulfilmentWindowsSlot.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        Boolean bool = this.q;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_checkout_fulfilment_slot;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCheckoutFulfilmentSlotBindingModel_{fulfilmentWindowsSlot=" + this.o + ", listener=" + this.p + ", isSelected=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
