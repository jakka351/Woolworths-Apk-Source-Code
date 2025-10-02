package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.models.OrderPaymentDetailsItemData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemPaymentItemBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemPaymentItemBindingModelBuilder {
    public OrderPaymentDetailsItemData n;
    public int o;
    public int p;

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
        if (!viewDataBinding.G(53, this.n)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(6, Integer.valueOf(this.o))) {
            throw new IllegalStateException("The attribute amountColorRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(269, Integer.valueOf(this.p))) {
            throw new IllegalStateException("The attribute typefaceRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemPaymentItemBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemPaymentItemBindingModel_ itemPaymentItemBindingModel_ = (ItemPaymentItemBindingModel_) epoxyModel;
        OrderPaymentDetailsItemData orderPaymentDetailsItemData = this.n;
        if (orderPaymentDetailsItemData == null ? itemPaymentItemBindingModel_.n != null : !orderPaymentDetailsItemData.equals(itemPaymentItemBindingModel_.n)) {
            viewDataBinding.G(53, this.n);
        }
        int i = this.o;
        if (i != itemPaymentItemBindingModel_.o) {
            viewDataBinding.G(6, Integer.valueOf(i));
        }
        int i2 = this.p;
        if (i2 != itemPaymentItemBindingModel_.p) {
            viewDataBinding.G(269, Integer.valueOf(i2));
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
        if (!(obj instanceof ItemPaymentItemBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemPaymentItemBindingModel_ itemPaymentItemBindingModel_ = (ItemPaymentItemBindingModel_) obj;
        OrderPaymentDetailsItemData orderPaymentDetailsItemData = this.n;
        if (orderPaymentDetailsItemData == null ? itemPaymentItemBindingModel_.n == null : orderPaymentDetailsItemData.equals(itemPaymentItemBindingModel_.n)) {
            return this.o == itemPaymentItemBindingModel_.o && this.p == itemPaymentItemBindingModel_.p;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        OrderPaymentDetailsItemData orderPaymentDetailsItemData = this.n;
        return ((((iHashCode + (orderPaymentDetailsItemData != null ? orderPaymentDetailsItemData.hashCode() : 0)) * 31) + this.o) * 31) + this.p;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_payment_item;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemPaymentItemBindingModel_{data=" + this.n + ", amountColorRes=" + this.o + ", typefaceRes=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
