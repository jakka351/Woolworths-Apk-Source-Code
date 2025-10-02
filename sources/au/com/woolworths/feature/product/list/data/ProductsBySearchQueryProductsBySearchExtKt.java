package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.ProductsBySearchQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListBySearchApiData;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ProductsBySearch;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryProductsBySearchExtKt {
    @NotNull
    public static final ProductListBySearchApiData toUiModel(@NotNull ProductsBySearchQuery.ProductsBySearch productsBySearch) {
        List arrayList;
        List arrayList2;
        List arrayList3;
        Intrinsics.h(productsBySearch, "<this>");
        List<ProductsBySearchQuery.ProductsFeed> productsFeed = productsBySearch.getProductsFeed();
        ArrayList arrayList4 = new ArrayList();
        for (ProductsBySearchQuery.ProductsFeed productsFeed2 : productsFeed) {
            Object uiModel = productsFeed2.getOnActionableCard() != null ? ProductsBySearchQueryOnActionableCardExtKt.toUiModel(productsFeed2.getOnActionableCard()) : productsFeed2.getOnGoogleAdBannerCard() != null ? ProductsBySearchQueryOnGoogleAdBannerCardExtKt.toUiModel(productsFeed2.getOnGoogleAdBannerCard()) : productsFeed2.getOnUniversalInventoryContainer() != null ? ProductsBySearchQueryOnUniversalInventoryContainerExtKt.toUiModel(productsFeed2.getOnUniversalInventoryContainer()) : productsFeed2.getOnInsetBanner() != null ? ProductsBySearchQueryOnInsetBannerExtKt.toUiModel(productsFeed2.getOnInsetBanner()) : productsFeed2.getOnProductCard() != null ? ProductsBySearchQueryOnProductCardExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel != null) {
                arrayList4.add(uiModel);
            }
        }
        List<ProductsBySearchQuery.Analytic> analytics = productsBySearch.getAnalytics();
        if (analytics != null) {
            arrayList = new ArrayList();
            for (ProductsBySearchQuery.Analytic analytic : analytics) {
                AdobeTargetAnalytics uiModel2 = analytic.getOnAdobeTargetAnalytics() != null ? ProductsBySearchQueryOnAdobeTargetAnalyticsExtKt.toUiModel(analytic.getOnAdobeTargetAnalytics()) : null;
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
        Integer totalNumberOfProducts = productsBySearch.getTotalNumberOfProducts();
        Integer nextPage = productsBySearch.getNextPage();
        List<ProductsBySearchQuery.Filter> filters = productsBySearch.getFilters();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList5.add(ProductsBySearchQueryFilterExtKt.toUiModel((ProductsBySearchQuery.Filter) it.next()));
        }
        List<ProductsBySearchQuery.SortOption> sortOptions = productsBySearch.getSortOptions();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(sortOptions, 10));
        Iterator<T> it2 = sortOptions.iterator();
        while (it2.hasNext()) {
            arrayList6.add(ProductsBySearchQuerySortOptionExtKt.toUiModel((ProductsBySearchQuery.SortOption) it2.next()));
        }
        ProductsBySearchQuery.SortOptionsBanner sortOptionsBanner = productsBySearch.getSortOptionsBanner();
        InsetBannerApiData uiModel3 = sortOptionsBanner != null ? ProductsBySearchQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null;
        ProductsBySearchQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = productsBySearch.getMarketplaceFilterSwitch();
        ProductFilterSwitch uiModel4 = marketplaceFilterSwitch != null ? ProductsBySearchQueryMarketplaceFilterSwitchExtKt.toUiModel(marketplaceFilterSwitch) : null;
        ProductsBySearchQuery.MarketplaceInfo marketplaceInfo = productsBySearch.getMarketplaceInfo();
        InfoSection uiModel5 = marketplaceInfo != null ? ProductsBySearchQueryMarketplaceInfoExtKt.toUiModel(marketplaceInfo) : null;
        ProductsBySearchQuery.MarketplaceBottomSheet marketplaceBottomSheet = productsBySearch.getMarketplaceBottomSheet();
        BottomSheetContent.Marketplace uiModel6 = marketplaceBottomSheet != null ? ProductsBySearchQueryMarketplaceBottomSheetExtKt.toUiModel(marketplaceBottomSheet) : null;
        List<ProductsBySearchQuery.Chip> chips = productsBySearch.getChips();
        if (chips != null) {
            List<ProductsBySearchQuery.Chip> list2 = chips;
            arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ProductsBySearchQueryChipExtKt.toUiModel((ProductsBySearchQuery.Chip) it3.next()));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = list;
        }
        ProductsBySearchQuery.ZeroResultContent zeroResultContent = productsBySearch.getZeroResultContent();
        ZeroResultPageData uiModel7 = zeroResultContent != null ? ProductsBySearchQueryZeroResultContentExtKt.toUiModel(zeroResultContent) : null;
        List<ProductsBySearchQuery.FacetChip> facetChips = productsBySearch.getFacetChips();
        if (facetChips != null) {
            List<ProductsBySearchQuery.FacetChip> list3 = facetChips;
            arrayList3 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(ProductsBySearchQueryFacetChipExtKt.toUiModel((ProductsBySearchQuery.FacetChip) it4.next()));
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            list = arrayList3;
        }
        return new ProductListBySearchApiData(null, arrayList4, arrayList, totalNumberOfProducts, nextPage, arrayList5, arrayList6, uiModel3, uiModel4, uiModel5, uiModel6, arrayList2, uiModel7, list);
    }
}
