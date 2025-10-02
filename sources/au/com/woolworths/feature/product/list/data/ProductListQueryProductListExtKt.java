package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListApiData;", "Lcom/woolworths/product/list/ProductListQuery$ProductList;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryProductListExtKt {
    @NotNull
    public static final ProductListApiData toUiModel(@NotNull ProductListQuery.ProductList productList) {
        List arrayList;
        List arrayList2;
        List arrayList3;
        Intrinsics.h(productList, "<this>");
        List<ProductListQuery.ProductsFeed> productsFeed = productList.getProductsFeed();
        ArrayList arrayList4 = new ArrayList();
        for (ProductListQuery.ProductsFeed productsFeed2 : productsFeed) {
            Object uiModel = productsFeed2.getOnActionableCard() != null ? ProductListQueryOnActionableCardExtKt.toUiModel(productsFeed2.getOnActionableCard()) : productsFeed2.getOnGoogleAdBannerCard() != null ? ProductListQueryOnGoogleAdBannerCardExtKt.toUiModel(productsFeed2.getOnGoogleAdBannerCard()) : productsFeed2.getOnUniversalInventoryContainer() != null ? ProductListQueryOnUniversalInventoryContainerExtKt.toUiModel(productsFeed2.getOnUniversalInventoryContainer()) : productsFeed2.getOnHorizontalList() != null ? ProductListQueryOnHorizontalListExtKt.toUiModel(productsFeed2.getOnHorizontalList()) : productsFeed2.getOnVideoAdUnit() != null ? ProductListQueryOnVideoAdUnitExtKt.toUiModel(productsFeed2.getOnVideoAdUnit()) : productsFeed2.getOnMerchCard() != null ? ProductListQueryOnMerchCardExtKt.toUiModel(productsFeed2.getOnMerchCard()) : productsFeed2.getOnInsetBanner() != null ? ProductListQueryOnInsetBannerExtKt.toUiModel(productsFeed2.getOnInsetBanner()) : productsFeed2.getOnProductCard() != null ? ProductListQueryOnProductCard1ExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel != null) {
                arrayList4.add(uiModel);
            }
        }
        List<ProductListQuery.Analytic> analytics = productList.getAnalytics();
        if (analytics != null) {
            arrayList = new ArrayList();
            for (ProductListQuery.Analytic analytic : analytics) {
                AdobeTargetAnalytics uiModel2 = analytic.getOnAdobeTargetAnalytics() != null ? ProductListQueryOnAdobeTargetAnalyticsExtKt.toUiModel(analytic.getOnAdobeTargetAnalytics()) : null;
                if (uiModel2 != null) {
                    arrayList.add(uiModel2);
                }
            }
        } else {
            arrayList = null;
        }
        List list = EmptyList.d;
        if (arrayList == null) {
            arrayList = list;
        }
        Integer totalNumberOfProducts = productList.getTotalNumberOfProducts();
        Integer nextPage = productList.getNextPage();
        List<ProductListQuery.Filter> filters = productList.getFilters();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList5.add(ProductListQueryFilterExtKt.toUiModel((ProductListQuery.Filter) it.next()));
        }
        List<ProductListQuery.SortOption> sortOptions = productList.getSortOptions();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(sortOptions, 10));
        Iterator<T> it2 = sortOptions.iterator();
        while (it2.hasNext()) {
            arrayList6.add(ProductListQuerySortOptionExtKt.toUiModel((ProductListQuery.SortOption) it2.next()));
        }
        ProductListQuery.SortOptionsBanner sortOptionsBanner = productList.getSortOptionsBanner();
        InsetBannerApiData uiModel3 = sortOptionsBanner != null ? ProductListQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null;
        ProductListQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = productList.getMarketplaceFilterSwitch();
        ProductFilterSwitch uiModel4 = marketplaceFilterSwitch != null ? ProductListQueryMarketplaceFilterSwitchExtKt.toUiModel(marketplaceFilterSwitch) : null;
        ProductListQuery.MarketplaceInfo marketplaceInfo = productList.getMarketplaceInfo();
        InfoSection uiModel5 = marketplaceInfo != null ? ProductListQueryMarketplaceInfoExtKt.toUiModel(marketplaceInfo) : null;
        ProductListQuery.MarketplaceBottomSheet marketplaceBottomSheet = productList.getMarketplaceBottomSheet();
        BottomSheetContent.Marketplace uiModel6 = marketplaceBottomSheet != null ? ProductListQueryMarketplaceBottomSheetExtKt.toUiModel(marketplaceBottomSheet) : null;
        List<ProductListQuery.Chip> chips = productList.getChips();
        if (chips != null) {
            List<ProductListQuery.Chip> list2 = chips;
            arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ProductListQueryChipExtKt.toUiModel((ProductListQuery.Chip) it3.next()));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = list;
        }
        List<ProductListQuery.FacetChip> facetChips = productList.getFacetChips();
        if (facetChips != null) {
            List<ProductListQuery.FacetChip> list3 = facetChips;
            arrayList3 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(ProductListQueryFacetChipExtKt.toUiModel((ProductListQuery.FacetChip) it4.next()));
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 == null) {
            arrayList3 = list;
        }
        InsetBannerApiData insetBannerApiData = uiModel3;
        ProductFilterSwitch productFilterSwitch = uiModel4;
        InfoSection infoSection = uiModel5;
        BottomSheetContent.Marketplace marketplace = uiModel6;
        List list4 = arrayList2;
        String pageTitle = productList.getPageTitle();
        ProductListQuery.ZeroResultContent zeroResultContent = productList.getZeroResultContent();
        ZeroResultPageData uiModel7 = zeroResultContent != null ? ProductListQueryZeroResultContentExtKt.toUiModel(zeroResultContent) : null;
        ProductListQuery.ZeroResult zeroResult = productList.getZeroResult();
        return new ProductListApiData(null, arrayList4, arrayList, totalNumberOfProducts, nextPage, arrayList5, arrayList6, insetBannerApiData, productFilterSwitch, infoSection, marketplace, list4, arrayList3, pageTitle, uiModel7, zeroResult != null ? zeroResult.getOnProductListZeroResult() != null ? ProductListQueryOnProductListZeroResultExtKt.toUiModel(zeroResult.getOnProductListZeroResult()) : zeroResult.getOnProductListFullScreenError() != null ? ProductListQueryOnProductListFullScreenErrorExtKt.toUiModel(zeroResult.getOnProductListFullScreenError()) : null : null);
    }
}
