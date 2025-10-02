package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.orders.OrdersClickListener;
import au.com.woolworths.feature.shop.myorders.orders.data.PickUpOrder;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemOrdersPickUpBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemOrdersPickUpBindingModelBuilder {
    public PickUpOrder n;
    public OrdersClickListener o;

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
        if (!viewDataBinding.G(187, this.n)) {
            throw new IllegalStateException("The attribute order was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.o)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemOrdersPickUpBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemOrdersPickUpBindingModel_ itemOrdersPickUpBindingModel_ = (ItemOrdersPickUpBindingModel_) epoxyModel;
        PickUpOrder pickUpOrder = this.n;
        if (pickUpOrder == null ? itemOrdersPickUpBindingModel_.n != null : !pickUpOrder.equals(itemOrdersPickUpBindingModel_.n)) {
            viewDataBinding.G(187, this.n);
        }
        OrdersClickListener ordersClickListener = this.o;
        if ((ordersClickListener == null) != (itemOrdersPickUpBindingModel_.o == null)) {
            viewDataBinding.G(92, ordersClickListener);
        }
    }

    public final ItemOrdersPickUpBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemOrdersPickUpBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemOrdersPickUpBindingModel_ itemOrdersPickUpBindingModel_ = (ItemOrdersPickUpBindingModel_) obj;
        PickUpOrder pickUpOrder = this.n;
        if (pickUpOrder == null ? itemOrdersPickUpBindingModel_.n == null : pickUpOrder.equals(itemOrdersPickUpBindingModel_.n)) {
            return (this.o == null) == (itemOrdersPickUpBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        PickUpOrder pickUpOrder = this.n;
        return ((iHashCode + (pickUpOrder != null ? pickUpOrder.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_orders_pick_up;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemOrdersPickUpBindingModel_{order=" + this.n + ", handler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
