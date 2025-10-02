package au.com.woolworths.feature.shop.myorders;

import androidx.camera.camera2.interop.e;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemDeliveryInstructionsBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDeliveryInstructionsBindingModelBuilder {
    public e n;
    public DeliveryInstructionsData o;
    public OrderDetailsClickHandler p;

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
        if (!viewDataBinding.G(92, this.p)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDeliveryInstructionsBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDeliveryInstructionsBindingModel_ itemDeliveryInstructionsBindingModel_ = (ItemDeliveryInstructionsBindingModel_) epoxyModel;
        DeliveryInstructionsData deliveryInstructionsData = this.o;
        if (deliveryInstructionsData == null ? itemDeliveryInstructionsBindingModel_.o != null : !deliveryInstructionsData.equals(itemDeliveryInstructionsBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        OrderDetailsClickHandler orderDetailsClickHandler = this.p;
        if ((orderDetailsClickHandler == null) != (itemDeliveryInstructionsBindingModel_.p == null)) {
            viewDataBinding.G(92, orderDetailsClickHandler);
        }
    }

    public final ItemDeliveryInstructionsBindingModel_ M() {
        super.p("delivery-instructions");
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        e eVar = this.n;
        if (eVar != null) {
            eVar.g(i, this, dataBindingHolder);
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
        DeliveryInstructionsData deliveryInstructionsData;
        if (obj != this) {
            if ((obj instanceof ItemDeliveryInstructionsBindingModel_) && super.equals(obj)) {
                ItemDeliveryInstructionsBindingModel_ itemDeliveryInstructionsBindingModel_ = (ItemDeliveryInstructionsBindingModel_) obj;
                if ((this.n == null) == (itemDeliveryInstructionsBindingModel_.n == null) && ((deliveryInstructionsData = this.o) == null ? itemDeliveryInstructionsBindingModel_.o == null : deliveryInstructionsData.equals(itemDeliveryInstructionsBindingModel_.o))) {
                    if ((this.p == null) != (itemDeliveryInstructionsBindingModel_.p == null)) {
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
        DeliveryInstructionsData deliveryInstructionsData = this.o;
        return ((iHashCode + (deliveryInstructionsData != null ? deliveryInstructionsData.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_delivery_instructions;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDeliveryInstructionsBindingModel_{data=" + this.o + ", handler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
