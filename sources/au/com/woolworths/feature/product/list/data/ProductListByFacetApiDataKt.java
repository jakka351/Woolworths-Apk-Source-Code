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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListByFacetApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByFacetApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListByFacetApiData productListByFacetApiData) {
        Intrinsics.h(productListByFacetApiData, "<this>");
        List<Object> analytics = productListByFacetApiData.getAnalytics();
        Integer totalCount = productListByFacetApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListByFacetApiData.getNextPageKey();
        List<FilterOptionApiData> filterList = productListByFacetApiData.getFilterList();
        List<SortOption> sortList = productListByFacetApiData.getSortList();
        List<ProductCard> products = productListByFacetApiData.getProducts();
        InfoSection infoSection = productListByFacetApiData.getInfoSection();
        BottomSheetContent.Marketplace bottomSheet = productListByFacetApiData.getBottomSheet();
        InsetBannerApiData sortOptionsBanner = productListByFacetApiData.getSortOptionsBanner();
        return new ProductListData(products, null, analytics, iIntValue, nextPageKey, filterList, sortList, sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null, null, null, infoSection, bottomSheet, null, null, null, null, null, 127744, null);
    }
}
