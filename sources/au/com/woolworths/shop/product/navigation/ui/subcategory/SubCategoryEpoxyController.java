package au.com.woolworths.shop.product.navigation.ui.subcategory;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.product.navigation.ItemSubCategoryBindingModel_;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.ProductCategoryList;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceProductCategoryList;
import com.airbnb.epoxy.TypedEpoxyController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryEpoxyController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/shop/product/navigation/data/ProductCategoryList;", "clickHandler", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/ProductSubCategoryClickHandler;", "<init>", "(Lau/com/woolworths/shop/product/navigation/ui/subcategory/ProductSubCategoryClickHandler;)V", "buildModels", "", "data", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubCategoryEpoxyController extends TypedEpoxyController<ProductCategoryList> {
    public static final int $stable = 8;

    @NotNull
    private final ProductSubCategoryClickHandler clickHandler;

    public SubCategoryEpoxyController(@NotNull ProductSubCategoryClickHandler clickHandler) {
        Intrinsics.h(clickHandler, "clickHandler");
        this.clickHandler = clickHandler;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull ProductCategoryList data) {
        Intrinsics.h(data, "data");
        MarketplaceProductCategoryList marketplaceProductCategoryList = data instanceof MarketplaceProductCategoryList ? (MarketplaceProductCategoryList) data : null;
        MarketplaceCategoriesInfo marketplace = marketplaceProductCategoryList != null ? marketplaceProductCategoryList.getMarketplace() : null;
        for (ProductCategory productCategory : data.getCategories()) {
            ItemSubCategoryBindingModel_ itemSubCategoryBindingModel_ = new ItemSubCategoryBindingModel_();
            itemSubCategoryBindingModel_.M("product_category_" + productCategory.hashCode());
            itemSubCategoryBindingModel_.t();
            itemSubCategoryBindingModel_.n = productCategory;
            itemSubCategoryBindingModel_.t();
            itemSubCategoryBindingModel_.o = marketplace;
            ProductSubCategoryClickHandler productSubCategoryClickHandler = this.clickHandler;
            itemSubCategoryBindingModel_.t();
            itemSubCategoryBindingModel_.p = productSubCategoryClickHandler;
            add(itemSubCategoryBindingModel_);
        }
    }
}
