package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListByCategoryData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListOnSpecialByCategoryApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListOnSpecialByCategoryApiDataKt {
    @NotNull
    public static final ProductListData toProductListByCategoryData(@NotNull ProductListOnSpecialByCategoryApiData productListOnSpecialByCategoryApiData) {
        Intrinsics.h(productListOnSpecialByCategoryApiData, "<this>");
        List<Object> analytics = productListOnSpecialByCategoryApiData.getAnalytics();
        List<Object> productsFeed = productListOnSpecialByCategoryApiData.getProductsFeed();
        Integer totalCount = productListOnSpecialByCategoryApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListOnSpecialByCategoryApiData.getNextPageKey();
        List<FilterOptionApiData> filterList = productListOnSpecialByCategoryApiData.getFilterList();
        List<SortOption> sortList = productListOnSpecialByCategoryApiData.getSortList();
        ProductFilterSwitch marketplaceProductsSwitch = productListOnSpecialByCategoryApiData.getMarketplaceProductsSwitch();
        InfoSection infoSection = productListOnSpecialByCategoryApiData.getInfoSection();
        BottomSheetContent.Marketplace bottomSheet = productListOnSpecialByCategoryApiData.getBottomSheet();
        List<ProductListChip> chips = productListOnSpecialByCategoryApiData.getChips();
        InsetBannerApiData sortOptionsBanner = productListOnSpecialByCategoryApiData.getSortOptionsBanner();
        return new ProductListData(null, productsFeed, analytics, iIntValue, nextPageKey, filterList, sortList, sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null, marketplaceProductsSwitch, null, infoSection, bottomSheet, null, chips, null, null, null, 119296, null);
    }
}
