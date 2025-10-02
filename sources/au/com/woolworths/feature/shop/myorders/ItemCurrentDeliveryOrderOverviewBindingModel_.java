package au.com.woolworths.feature.shop.myorders;

import androidx.camera.camera2.interop.e;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.h;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentDeliveryOrderOverview;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemCurrentDeliveryOrderOverviewBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCurrentDeliveryOrderOverviewBindingModelBuilder {
    public e n;
    public CurrentDeliveryOrderOverview o;
    public ButtonClickHandler p;
    public h q;

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
        if (!viewDataBinding.G(113, this.q)) {
            throw new IllegalStateException("The attribute infoIconClickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCurrentDeliveryOrderOverviewBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCurrentDeliveryOrderOverviewBindingModel_ itemCurrentDeliveryOrderOverviewBindingModel_ = (ItemCurrentDeliveryOrderOverviewBindingModel_) epoxyModel;
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview = this.o;
        if (currentDeliveryOrderOverview == null ? itemCurrentDeliveryOrderOverviewBindingModel_.o != null : !currentDeliveryOrderOverview.equals(itemCurrentDeliveryOrderOverviewBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        ButtonClickHandler buttonClickHandler = this.p;
        if ((buttonClickHandler == null) != (itemCurrentDeliveryOrderOverviewBindingModel_.p == null)) {
            viewDataBinding.G(92, buttonClickHandler);
        }
        h hVar = this.q;
        if ((hVar == null) != (itemCurrentDeliveryOrderOverviewBindingModel_.q == null)) {
            viewDataBinding.G(113, hVar);
        }
    }

    public final ItemCurrentDeliveryOrderOverviewBindingModel_ M() {
        super.p("current_delivery_order_overview");
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
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview;
        if (obj != this) {
            if ((obj instanceof ItemCurrentDeliveryOrderOverviewBindingModel_) && super.equals(obj)) {
                ItemCurrentDeliveryOrderOverviewBindingModel_ itemCurrentDeliveryOrderOverviewBindingModel_ = (ItemCurrentDeliveryOrderOverviewBindingModel_) obj;
                if ((this.n == null) == (itemCurrentDeliveryOrderOverviewBindingModel_.n == null) && ((currentDeliveryOrderOverview = this.o) == null ? itemCurrentDeliveryOrderOverviewBindingModel_.o == null : currentDeliveryOrderOverview.equals(itemCurrentDeliveryOrderOverviewBindingModel_.o))) {
                    if ((this.p == null) == (itemCurrentDeliveryOrderOverviewBindingModel_.p == null)) {
                        if ((this.q == null) != (itemCurrentDeliveryOrderOverviewBindingModel_.q == null)) {
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
        CurrentDeliveryOrderOverview currentDeliveryOrderOverview = this.o;
        return ((((iHashCode + (currentDeliveryOrderOverview != null ? currentDeliveryOrderOverview.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_current_delivery_order_overview;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCurrentDeliveryOrderOverviewBindingModel_{data=" + this.o + ", handler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
