package au.com.woolworths.feature.shop.myorders;

import androidx.camera.camera2.interop.e;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.OrderOverview;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemOrderOverviewBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemOrderOverviewBindingModelBuilder {
    public e n;
    public OrderOverview o;
    public ButtonClickHandler p;
    public OrderDetailsClickHandler q;

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
        if (!viewDataBinding.G(189, this.o)) {
            throw new IllegalStateException("The attribute orderOverview was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.p)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(153, this.q)) {
            throw new IllegalStateException("The attribute linkHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemOrderOverviewBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemOrderOverviewBindingModel_ itemOrderOverviewBindingModel_ = (ItemOrderOverviewBindingModel_) epoxyModel;
        OrderOverview orderOverview = this.o;
        if (orderOverview == null ? itemOrderOverviewBindingModel_.o != null : !orderOverview.equals(itemOrderOverviewBindingModel_.o)) {
            viewDataBinding.G(189, this.o);
        }
        ButtonClickHandler buttonClickHandler = this.p;
        if ((buttonClickHandler == null) != (itemOrderOverviewBindingModel_.p == null)) {
            viewDataBinding.G(92, buttonClickHandler);
        }
        OrderDetailsClickHandler orderDetailsClickHandler = this.q;
        if ((orderDetailsClickHandler == null) != (itemOrderOverviewBindingModel_.q == null)) {
            viewDataBinding.G(153, orderDetailsClickHandler);
        }
    }

    public final ItemOrderOverviewBindingModel_ M() {
        super.p("order_overview");
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
        OrderOverview orderOverview;
        if (obj != this) {
            if ((obj instanceof ItemOrderOverviewBindingModel_) && super.equals(obj)) {
                ItemOrderOverviewBindingModel_ itemOrderOverviewBindingModel_ = (ItemOrderOverviewBindingModel_) obj;
                if ((this.n == null) == (itemOrderOverviewBindingModel_.n == null) && ((orderOverview = this.o) == null ? itemOrderOverviewBindingModel_.o == null : orderOverview.equals(itemOrderOverviewBindingModel_.o))) {
                    if ((this.p == null) == (itemOrderOverviewBindingModel_.p == null)) {
                        if ((this.q == null) != (itemOrderOverviewBindingModel_.q == null)) {
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
        OrderOverview orderOverview = this.o;
        return ((((iHashCode + (orderOverview != null ? orderOverview.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_order_overview;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemOrderOverviewBindingModel_{orderOverview=" + this.o + ", handler=" + this.p + ", linkHandler=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
