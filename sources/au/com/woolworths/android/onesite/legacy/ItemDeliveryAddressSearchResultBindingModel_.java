package au.com.woolworths.android.onesite.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchResultClickListener;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemDeliveryAddressSearchResultBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemDeliveryAddressSearchResultBindingModelBuilder {
    public AddressResult.Address n;
    public DeliveryAddressSearchResultClickListener o;

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
        if (!viewDataBinding.G(4, this.n)) {
            throw new IllegalStateException("The attribute address was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.o)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemDeliveryAddressSearchResultBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemDeliveryAddressSearchResultBindingModel_ itemDeliveryAddressSearchResultBindingModel_ = (ItemDeliveryAddressSearchResultBindingModel_) epoxyModel;
        AddressResult.Address address = this.n;
        if ((address == null) != (itemDeliveryAddressSearchResultBindingModel_.n == null)) {
            viewDataBinding.G(4, address);
        }
        DeliveryAddressSearchResultClickListener deliveryAddressSearchResultClickListener = this.o;
        if ((deliveryAddressSearchResultClickListener == null) != (itemDeliveryAddressSearchResultBindingModel_.o == null)) {
            viewDataBinding.G(92, deliveryAddressSearchResultClickListener);
        }
    }

    public final ItemDeliveryAddressSearchResultBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemDeliveryAddressSearchResultBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemDeliveryAddressSearchResultBindingModel_ itemDeliveryAddressSearchResultBindingModel_ = (ItemDeliveryAddressSearchResultBindingModel_) obj;
        if ((this.n == null) != (itemDeliveryAddressSearchResultBindingModel_.n == null)) {
            return false;
        }
        return (this.o == null) == (itemDeliveryAddressSearchResultBindingModel_.o == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        return (((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_delivery_address_search_result;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemDeliveryAddressSearchResultBindingModel_{address=" + this.n + ", handler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
