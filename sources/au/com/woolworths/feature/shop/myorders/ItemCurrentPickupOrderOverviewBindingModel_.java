package au.com.woolworths.feature.shop.myorders;

import androidx.camera.camera2.interop.e;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.handlers.LinkHandler;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.feature.shop.myorders.details.h;
import au.com.woolworths.feature.shop.myorders.details.models.CurrentPickupOrderOverview;
import au.com.woolworths.feature.shop.myorders.details.models.ui.PickUpInstructionsClickHandler;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemCurrentPickupOrderOverviewBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemCurrentPickupOrderOverviewBindingModelBuilder {
    public e n;
    public CurrentPickupOrderOverview o;
    public LinkHandler p;
    public ButtonClickHandler q;
    public PickUpInstructionsClickHandler r;
    public h s;
    public Boolean t;

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
        if (!viewDataBinding.G(153, this.p)) {
            throw new IllegalStateException("The attribute linkHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.q)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(198, this.r)) {
            throw new IllegalStateException("The attribute pickUpInstructionsClickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(113, this.s)) {
            throw new IllegalStateException("The attribute infoIconClickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(243, this.t)) {
            throw new IllegalStateException("The attribute showPickOrderCollectedState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemCurrentPickupOrderOverviewBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemCurrentPickupOrderOverviewBindingModel_ itemCurrentPickupOrderOverviewBindingModel_ = (ItemCurrentPickupOrderOverviewBindingModel_) epoxyModel;
        CurrentPickupOrderOverview currentPickupOrderOverview = this.o;
        if (currentPickupOrderOverview == null ? itemCurrentPickupOrderOverviewBindingModel_.o != null : !currentPickupOrderOverview.equals(itemCurrentPickupOrderOverviewBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        LinkHandler linkHandler = this.p;
        if ((linkHandler == null) != (itemCurrentPickupOrderOverviewBindingModel_.p == null)) {
            viewDataBinding.G(153, linkHandler);
        }
        ButtonClickHandler buttonClickHandler = this.q;
        if ((buttonClickHandler == null) != (itemCurrentPickupOrderOverviewBindingModel_.q == null)) {
            viewDataBinding.G(92, buttonClickHandler);
        }
        PickUpInstructionsClickHandler pickUpInstructionsClickHandler = this.r;
        if ((pickUpInstructionsClickHandler == null) != (itemCurrentPickupOrderOverviewBindingModel_.r == null)) {
            viewDataBinding.G(198, pickUpInstructionsClickHandler);
        }
        h hVar = this.s;
        if ((hVar == null) != (itemCurrentPickupOrderOverviewBindingModel_.s == null)) {
            viewDataBinding.G(113, hVar);
        }
        Boolean bool = this.t;
        Boolean bool2 = itemCurrentPickupOrderOverviewBindingModel_.t;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        viewDataBinding.G(243, this.t);
    }

    public final ItemCurrentPickupOrderOverviewBindingModel_ M() {
        super.p("current_pickup_order_overview");
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
        CurrentPickupOrderOverview currentPickupOrderOverview;
        if (obj != this) {
            if ((obj instanceof ItemCurrentPickupOrderOverviewBindingModel_) && super.equals(obj)) {
                ItemCurrentPickupOrderOverviewBindingModel_ itemCurrentPickupOrderOverviewBindingModel_ = (ItemCurrentPickupOrderOverviewBindingModel_) obj;
                if ((this.n == null) == (itemCurrentPickupOrderOverviewBindingModel_.n == null) && ((currentPickupOrderOverview = this.o) == null ? itemCurrentPickupOrderOverviewBindingModel_.o == null : currentPickupOrderOverview.equals(itemCurrentPickupOrderOverviewBindingModel_.o))) {
                    if ((this.p == null) == (itemCurrentPickupOrderOverviewBindingModel_.p == null)) {
                        if ((this.q == null) == (itemCurrentPickupOrderOverviewBindingModel_.q == null)) {
                            if ((this.r == null) == (itemCurrentPickupOrderOverviewBindingModel_.r == null)) {
                                if ((this.s == null) == (itemCurrentPickupOrderOverviewBindingModel_.s == null)) {
                                    Boolean bool = this.t;
                                    Boolean bool2 = itemCurrentPickupOrderOverviewBindingModel_.t;
                                    if (bool == null ? bool2 == null : bool.equals(bool2)) {
                                    }
                                }
                            }
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
        CurrentPickupOrderOverview currentPickupOrderOverview = this.o;
        int iHashCode2 = (((((((((iHashCode + (currentPickupOrderOverview != null ? currentPickupOrderOverview.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q != null ? 1 : 0)) * 31) + (this.r != null ? 1 : 0)) * 31) + (this.s == null ? 0 : 1)) * 31;
        Boolean bool = this.t;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_current_pickup_order_overview;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemCurrentPickupOrderOverviewBindingModel_{data=" + this.o + ", linkHandler=" + this.p + ", handler=" + this.q + ", pickUpInstructionsClickHandler=" + this.r + ", showPickOrderCollectedState=" + this.t + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
