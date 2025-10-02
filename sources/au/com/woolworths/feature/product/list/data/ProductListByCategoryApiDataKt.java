package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.product.list.ProductsByCategoryQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toProductListByCategoryData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListByCategoryApiData;", "toUiModel", "Lau/com/woolworths/shop/aem/components/model/button/ButtonData;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$MerchCardFullImageButton;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByCategoryApiDataKt {
    @NotNull
    public static final ProductListData toProductListByCategoryData(@NotNull ProductListByCategoryApiData productListByCategoryApiData) {
        Intrinsics.h(productListByCategoryApiData, "<this>");
        List<Object> analytics = productListByCategoryApiData.getAnalytics();
        List<Object> productsFeed = productListByCategoryApiData.getProductsFeed();
        Integer totalCount = productListByCategoryApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListByCategoryApiData.getNextPageKey();
        List<FilterOptionApiData> filterList = productListByCategoryApiData.getFilterList();
        List<SortOption> sortList = productListByCategoryApiData.getSortList();
        ProductFilterSwitch marketplaceProductsSwitch = productListByCategoryApiData.getMarketplaceProductsSwitch();
        InfoSection infoSection = productListByCategoryApiData.getInfoSection();
        BottomSheetContent.Marketplace bottomSheet = productListByCategoryApiData.getBottomSheet();
        List<ProductListChip> chips = productListByCategoryApiData.getChips();
        InsetBannerApiData sortOptionsBanner = productListByCategoryApiData.getSortOptionsBanner();
        return new ProductListData(null, productsFeed, analytics, iIntValue, nextPageKey, filterList, sortList, sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null, marketplaceProductsSwitch, null, infoSection, bottomSheet, null, chips, null, null, null, 119296, null);
    }

    @NotNull
    public static final ButtonData toUiModel(@NotNull ProductsByCategoryQuery.MerchCardFullImageButton merchCardFullImageButton) {
        Intrinsics.h(merchCardFullImageButton, "<this>");
        String buttonId = merchCardFullImageButton.getButtonId();
        String label = merchCardFullImageButton.getLabel();
        ButtonStyle style = merchCardFullImageButton.getStyle();
        au.com.woolworths.shop.aem.components.model.button.ButtonStyle uiModel = style != null ? ButtonStyleExtKt.toUiModel(style) : null;
        boolean enabled = merchCardFullImageButton.getEnabled();
        ProductsByCategoryQuery.ButtonAction buttonAction = merchCardFullImageButton.getButtonAction();
        return new ButtonData(buttonId, label, uiModel, enabled, buttonAction != null ? ProductsByCategoryQueryButtonActionExtKt.toUiModel(buttonAction) : null, merchCardFullImageButton.getIconUrl(), merchCardFullImageButton.getAltText(), null);
    }
}
