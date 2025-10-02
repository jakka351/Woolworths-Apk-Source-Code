package au.com.woolworths.product.details;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemProductDetailsMarketplaceBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemProductDetailsMarketplaceBindingModelBuilder {
    public ProductDetailsMarketplace n;
    public ProductDetailsClickHandler o;

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
        if (!viewDataBinding.G(168, this.n)) {
            throw new IllegalStateException("The attribute marketplace was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.o)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemProductDetailsMarketplaceBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemProductDetailsMarketplaceBindingModel_ itemProductDetailsMarketplaceBindingModel_ = (ItemProductDetailsMarketplaceBindingModel_) epoxyModel;
        ProductDetailsMarketplace productDetailsMarketplace = this.n;
        if (productDetailsMarketplace == null ? itemProductDetailsMarketplaceBindingModel_.n != null : !productDetailsMarketplace.equals(itemProductDetailsMarketplaceBindingModel_.n)) {
            viewDataBinding.G(168, this.n);
        }
        ProductDetailsClickHandler productDetailsClickHandler = this.o;
        if ((productDetailsClickHandler == null) != (itemProductDetailsMarketplaceBindingModel_.o == null)) {
            viewDataBinding.G(35, productDetailsClickHandler);
        }
    }

    public final ItemProductDetailsMarketplaceBindingModel_ M() {
        super.p("product_details_marketplace");
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
        if (!(obj instanceof ItemProductDetailsMarketplaceBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemProductDetailsMarketplaceBindingModel_ itemProductDetailsMarketplaceBindingModel_ = (ItemProductDetailsMarketplaceBindingModel_) obj;
        ProductDetailsMarketplace productDetailsMarketplace = this.n;
        if (productDetailsMarketplace == null ? itemProductDetailsMarketplaceBindingModel_.n == null : productDetailsMarketplace.equals(itemProductDetailsMarketplaceBindingModel_.n)) {
            return (this.o == null) == (itemProductDetailsMarketplaceBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        ProductDetailsMarketplace productDetailsMarketplace = this.n;
        return ((iHashCode + (productDetailsMarketplace != null ? productDetailsMarketplace.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_product_details_marketplace;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemProductDetailsMarketplaceBindingModel_{marketplace=" + this.n + ", clickHandler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
