package au.com.woolworths.feature.product.list.legacy;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemProductListOptionsMarketplaceLegacyBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductListOptionsMarketplaceLegacyBindingModelBuilder {
    public v n;
    public ProductFilterSwitch o;

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
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductListOptionsMarketplaceLegacyBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ProductFilterSwitch productFilterSwitch = this.o;
        ProductFilterSwitch productFilterSwitch2 = ((ItemProductListOptionsMarketplaceLegacyBindingModel_) epoxyModel).o;
        if (productFilterSwitch != null) {
            if (productFilterSwitch.equals(productFilterSwitch2)) {
                return;
            }
        } else if (productFilterSwitch2 == null) {
            return;
        }
        viewDataBinding.G(53, this.o);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        v vVar = this.n;
        if (vVar != null) {
            vVar.g(i, this, dataBindingHolder);
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
        if (obj != this) {
            if ((obj instanceof ItemProductListOptionsMarketplaceLegacyBindingModel_) && super.equals(obj)) {
                ItemProductListOptionsMarketplaceLegacyBindingModel_ itemProductListOptionsMarketplaceLegacyBindingModel_ = (ItemProductListOptionsMarketplaceLegacyBindingModel_) obj;
                if ((this.n == null) == (itemProductListOptionsMarketplaceLegacyBindingModel_.n == null)) {
                    ProductFilterSwitch productFilterSwitch = this.o;
                    ProductFilterSwitch productFilterSwitch2 = itemProductListOptionsMarketplaceLegacyBindingModel_.o;
                    if (productFilterSwitch == null ? productFilterSwitch2 == null : productFilterSwitch.equals(productFilterSwitch2)) {
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
        ProductFilterSwitch productFilterSwitch = this.o;
        return iHashCode + (productFilterSwitch != null ? productFilterSwitch.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_list_options_marketplace_legacy;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductListOptionsMarketplaceLegacyBindingModel_{data=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
