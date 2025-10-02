package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.woolworths.product.list.ProductListQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListApiData;", "toUiModel", "Lau/com/woolworths/shop/aem/components/model/button/ButtonData;", "Lcom/woolworths/product/list/ProductListQuery$MerchCardButton;", "Lcom/woolworths/product/list/ProductListQuery$MerchCardFullImageButton;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListApiData productListApiData) {
        Intrinsics.h(productListApiData, "<this>");
        List<Object> productsFeed = productListApiData.getProductsFeed();
        List<Object> analytics = productListApiData.getAnalytics();
        Integer totalCount = productListApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListApiData.getNextPageKey();
        List<FilterOptionApiData> filterList = productListApiData.getFilterList();
        List<SortOption> sortList = productListApiData.getSortList();
        ProductFilterSwitch marketplaceProductsSwitch = productListApiData.getMarketplaceProductsSwitch();
        List<ProductCard> products = productListApiData.getProducts();
        InfoSection infoSection = productListApiData.getInfoSection();
        BottomSheetContent.Marketplace bottomSheet = productListApiData.getBottomSheet();
        List<ProductListChip> chips = productListApiData.getChips();
        List<ProductListChip> facetChips = productListApiData.getFacetChips();
        String pageTitle = productListApiData.getPageTitle();
        InsetBannerApiData sortOptionsBanner = productListApiData.getSortOptionsBanner();
        return new ProductListData(products, productsFeed, analytics, iIntValue, nextPageKey, filterList, sortList, sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null, marketplaceProductsSwitch, null, infoSection, bottomSheet, productListApiData.getZeroResultContent(), chips, facetChips, pageTitle, productListApiData.getZeroResult(), 512, null);
    }

    @NotNull
    public static final ButtonData toUiModel(@NotNull ProductListQuery.MerchCardButton merchCardButton) {
        Intrinsics.h(merchCardButton, "<this>");
        String buttonId = merchCardButton.getButtonId();
        String label = merchCardButton.getLabel();
        ButtonStyle style = merchCardButton.getStyle();
        au.com.woolworths.shop.aem.components.model.button.ButtonStyle uiModel = style != null ? ButtonStyleExtKt.toUiModel(style) : null;
        boolean enabled = merchCardButton.getEnabled();
        ProductListQuery.ButtonAction1 buttonAction = merchCardButton.getButtonAction();
        return new ButtonData(buttonId, label, uiModel, enabled, buttonAction != null ? ProductListQueryButtonAction1ExtKt.toUiModel(buttonAction) : null, merchCardButton.getIconUrl(), merchCardButton.getAltText(), null);
    }

    @NotNull
    public static final ButtonData toUiModel(@NotNull ProductListQuery.MerchCardFullImageButton merchCardFullImageButton) {
        Intrinsics.h(merchCardFullImageButton, "<this>");
        String buttonId = merchCardFullImageButton.getButtonId();
        String label = merchCardFullImageButton.getLabel();
        ButtonStyle style = merchCardFullImageButton.getStyle();
        au.com.woolworths.shop.aem.components.model.button.ButtonStyle uiModel = style != null ? ButtonStyleExtKt.toUiModel(style) : null;
        boolean enabled = merchCardFullImageButton.getEnabled();
        ProductListQuery.ButtonAction buttonAction = merchCardFullImageButton.getButtonAction();
        return new ButtonData(buttonId, label, uiModel, enabled, buttonAction != null ? ProductListQueryButtonActionExtKt.toUiModel(buttonAction) : null, merchCardFullImageButton.getIconUrl(), merchCardFullImageButton.getAltText(), null);
    }
}
