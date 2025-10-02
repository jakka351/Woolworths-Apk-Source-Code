package au.com.woolworths.shop.product.navigation;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.ui.subcategory.ProductSubCategoryClickHandler;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemSubCategoryBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemSubCategoryBindingModelBuilder {
    public ProductCategory n;
    public MarketplaceCategoriesInfo o;
    public ProductSubCategoryClickHandler p;

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
        if (!viewDataBinding.G(169, this.o)) {
            throw new IllegalStateException("The attribute marketplaceInfo was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(35, this.p)) {
            throw new IllegalStateException("The attribute clickHandler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemSubCategoryBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemSubCategoryBindingModel_ itemSubCategoryBindingModel_ = (ItemSubCategoryBindingModel_) epoxyModel;
        ProductCategory productCategory = this.n;
        if (productCategory == null ? itemSubCategoryBindingModel_.n != null : !productCategory.equals(itemSubCategoryBindingModel_.n)) {
            viewDataBinding.G(53, this.n);
        }
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = this.o;
        if (marketplaceCategoriesInfo == null ? itemSubCategoryBindingModel_.o != null : !marketplaceCategoriesInfo.equals(itemSubCategoryBindingModel_.o)) {
            viewDataBinding.G(169, this.o);
        }
        ProductSubCategoryClickHandler productSubCategoryClickHandler = this.p;
        if ((productSubCategoryClickHandler == null) != (itemSubCategoryBindingModel_.p == null)) {
            viewDataBinding.G(35, productSubCategoryClickHandler);
        }
    }

    public final ItemSubCategoryBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemSubCategoryBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemSubCategoryBindingModel_ itemSubCategoryBindingModel_ = (ItemSubCategoryBindingModel_) obj;
        ProductCategory productCategory = this.n;
        if (productCategory == null ? itemSubCategoryBindingModel_.n != null : !productCategory.equals(itemSubCategoryBindingModel_.n)) {
            return false;
        }
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = this.o;
        if (marketplaceCategoriesInfo == null ? itemSubCategoryBindingModel_.o == null : marketplaceCategoriesInfo.equals(itemSubCategoryBindingModel_.o)) {
            return (this.p == null) == (itemSubCategoryBindingModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        ProductCategory productCategory = this.n;
        int iHashCode2 = (iHashCode + (productCategory != null ? productCategory.hashCode() : 0)) * 31;
        MarketplaceCategoriesInfo marketplaceCategoriesInfo = this.o;
        return ((iHashCode2 + (marketplaceCategoriesInfo != null ? marketplaceCategoriesInfo.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_sub_category;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemSubCategoryBindingModel_{data=" + this.n + ", marketplaceInfo=" + this.o + ", clickHandler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
