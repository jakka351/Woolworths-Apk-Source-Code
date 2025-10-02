package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListBySearchApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListBySearchApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListBySearchApiData productListBySearchApiData) {
        Intrinsics.h(productListBySearchApiData, "<this>");
        List<Object> productsFeed = productListBySearchApiData.getProductsFeed();
        List<Object> analytics = productListBySearchApiData.getAnalytics();
        Integer totalCount = productListBySearchApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListBySearchApiData.getNextPageKey();
        List<FilterOptionApiData> filterList = productListBySearchApiData.getFilterList();
        List<SortOption> sortList = productListBySearchApiData.getSortList();
        ProductFilterSwitch marketplaceProductsSwitch = productListBySearchApiData.getMarketplaceProductsSwitch();
        List<ProductCard> products = productListBySearchApiData.getProducts();
        InfoSection infoSection = productListBySearchApiData.getInfoSection();
        BottomSheetContent.Marketplace bottomSheet = productListBySearchApiData.getBottomSheet();
        List<ProductListChip> chips = productListBySearchApiData.getChips();
        List<ProductListChip> facetChips = productListBySearchApiData.getFacetChips();
        InsetBannerApiData sortOptionsBanner = productListBySearchApiData.getSortOptionsBanner();
        return new ProductListData(products, productsFeed, analytics, iIntValue, nextPageKey, filterList, sortList, sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null, marketplaceProductsSwitch, null, infoSection, bottomSheet, productListBySearchApiData.getZeroResultContent(), chips, facetChips, null, null, 98816, null);
    }
}
