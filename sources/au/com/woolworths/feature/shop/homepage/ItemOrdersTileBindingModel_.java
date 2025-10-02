package au.com.woolworths.feature.shop.homepage;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemOrdersTileBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemOrdersTileBindingModelBuilder {
    public OrderCardData n;
    public OrdersClickListener o;
    public FulfilmentStatusBannerData p;
    public Integer q;

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
        if (!viewDataBinding.G(37, this.o)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(66, this.p)) {
            throw new IllegalStateException("The attribute dummyBannerData was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(67, this.q)) {
            throw new IllegalStateException("The attribute dummyBannerVisibility was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemOrdersTileBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemOrdersTileBindingModel_ itemOrdersTileBindingModel_ = (ItemOrdersTileBindingModel_) epoxyModel;
        OrderCardData orderCardData = this.n;
        if (orderCardData == null ? itemOrdersTileBindingModel_.n != null : !orderCardData.equals(itemOrdersTileBindingModel_.n)) {
            viewDataBinding.G(187, this.n);
        }
        OrdersClickListener ordersClickListener = this.o;
        if ((ordersClickListener == null) != (itemOrdersTileBindingModel_.o == null)) {
            viewDataBinding.G(37, ordersClickListener);
        }
        FulfilmentStatusBannerData fulfilmentStatusBannerData = this.p;
        if (fulfilmentStatusBannerData == null ? itemOrdersTileBindingModel_.p != null : !fulfilmentStatusBannerData.equals(itemOrdersTileBindingModel_.p)) {
            viewDataBinding.G(66, this.p);
        }
        Integer num = this.q;
        Integer num2 = itemOrdersTileBindingModel_.q;
        if (num != null) {
            if (num.equals(num2)) {
                return;
            }
        } else if (num2 == null) {
            return;
        }
        viewDataBinding.G(67, this.q);
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
        if (!(obj instanceof ItemOrdersTileBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemOrdersTileBindingModel_ itemOrdersTileBindingModel_ = (ItemOrdersTileBindingModel_) obj;
        OrderCardData orderCardData = this.n;
        if (orderCardData == null ? itemOrdersTileBindingModel_.n != null : !orderCardData.equals(itemOrdersTileBindingModel_.n)) {
            return false;
        }
        if ((this.o == null) != (itemOrdersTileBindingModel_.o == null)) {
            return false;
        }
        FulfilmentStatusBannerData fulfilmentStatusBannerData = this.p;
        if (fulfilmentStatusBannerData == null ? itemOrdersTileBindingModel_.p != null : !fulfilmentStatusBannerData.equals(itemOrdersTileBindingModel_.p)) {
            return false;
        }
        Integer num = this.q;
        Integer num2 = itemOrdersTileBindingModel_.q;
        return num == null ? num2 == null : num.equals(num2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        OrderCardData orderCardData = this.n;
        int iHashCode2 = (((iHashCode + (orderCardData != null ? orderCardData.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0)) * 31;
        FulfilmentStatusBannerData fulfilmentStatusBannerData = this.p;
        int iHashCode3 = (iHashCode2 + (fulfilmentStatusBannerData != null ? fulfilmentStatusBannerData.hashCode() : 0)) * 31;
        Integer num = this.q;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_orders_tile;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemOrdersTileBindingModel_{order=" + this.n + ", clickListener=" + this.o + ", dummyBannerData=" + this.p + ", dummyBannerVisibility=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
