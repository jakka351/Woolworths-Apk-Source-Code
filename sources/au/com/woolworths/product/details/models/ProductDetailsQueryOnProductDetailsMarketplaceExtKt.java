package au.com.woolworths.product.details.models;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/ProductDetailsMarketplace;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnProductDetailsMarketplaceExtKt {
    @NotNull
    public static final ProductDetailsMarketplace toUiModel(@NotNull ProductDetailsQuery.OnProductDetailsMarketplace onProductDetailsMarketplace) {
        Intrinsics.h(onProductDetailsMarketplace, "<this>");
        String imageUrl = onProductDetailsMarketplace.getImageUrl();
        String marketplaceTitle = onProductDetailsMarketplace.getMarketplaceTitle();
        String dispatchNote = onProductDetailsMarketplace.getDispatchNote();
        String sellerName = onProductDetailsMarketplace.getSellerName();
        String brandName = onProductDetailsMarketplace.getBrandName();
        ProductDetailsQuery.Info info = onProductDetailsMarketplace.getInfo();
        InfoSection uiModel = info != null ? ProductDetailsQueryInfoExtKt.toUiModel(info) : null;
        String uiModel2 = ProductDetailsDataKt.toUiModel(onProductDetailsMarketplace.getChannel());
        String uiModel3 = ProductDetailsDataKt.toUiModel(onProductDetailsMarketplace.getFacet());
        ProductDetailsQuery.BottomSheet bottomSheet = onProductDetailsMarketplace.getBottomSheet();
        return new ProductDetailsMarketplace(imageUrl, marketplaceTitle, dispatchNote, sellerName, brandName, uiModel, uiModel2, uiModel3, bottomSheet != null ? ProductDetailsQueryBottomSheetExtKt.toUiModel(bottomSheet) : null);
    }
}
