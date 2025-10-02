package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.orders.list.OrderListTryAgain;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListViewModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemOrdersPaginationTryAgainBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemOrdersPaginationTryAgainBindingModelBuilder {
    public OrderListTryAgain n;
    public OrdersListViewModel o;

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
        if (!viewDataBinding.G(251, this.n)) {
            throw new IllegalStateException("The attribute state was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(273, this.o)) {
            throw new IllegalStateException("The attribute viewModel was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemOrdersPaginationTryAgainBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemOrdersPaginationTryAgainBindingModel_ itemOrdersPaginationTryAgainBindingModel_ = (ItemOrdersPaginationTryAgainBindingModel_) epoxyModel;
        OrderListTryAgain orderListTryAgain = this.n;
        if (orderListTryAgain == null ? itemOrdersPaginationTryAgainBindingModel_.n != null : !orderListTryAgain.equals(itemOrdersPaginationTryAgainBindingModel_.n)) {
            viewDataBinding.G(251, this.n);
        }
        OrdersListViewModel ordersListViewModel = this.o;
        if ((ordersListViewModel == null) != (itemOrdersPaginationTryAgainBindingModel_.o == null)) {
            viewDataBinding.G(273, ordersListViewModel);
        }
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
        if (!(obj instanceof ItemOrdersPaginationTryAgainBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemOrdersPaginationTryAgainBindingModel_ itemOrdersPaginationTryAgainBindingModel_ = (ItemOrdersPaginationTryAgainBindingModel_) obj;
        OrderListTryAgain orderListTryAgain = this.n;
        if (orderListTryAgain == null ? itemOrdersPaginationTryAgainBindingModel_.n == null : orderListTryAgain.equals(itemOrdersPaginationTryAgainBindingModel_.n)) {
            return (this.o == null) == (itemOrdersPaginationTryAgainBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        OrderListTryAgain orderListTryAgain = this.n;
        return ((iHashCode + (orderListTryAgain != null ? Integer.hashCode(orderListTryAgain.f7875a) : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_orders_pagination_try_again;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemOrdersPaginationTryAgainBindingModel_{state=" + this.n + ", viewModel=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
