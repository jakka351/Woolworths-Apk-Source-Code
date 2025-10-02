package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.ProductsByCategoryQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByCategoryApiData;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$ProductsByCategory;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryProductsByCategoryExtKt {
    @NotNull
    public static final ProductListByCategoryApiData toUiModel(@NotNull ProductsByCategoryQuery.ProductsByCategory productsByCategory) {
        List arrayList;
        Intrinsics.h(productsByCategory, "<this>");
        List<ProductsByCategoryQuery.Analytic> analytics = productsByCategory.getAnalytics();
        List arrayList2 = null;
        if (analytics != null) {
            arrayList = new ArrayList();
            for (ProductsByCategoryQuery.Analytic analytic : analytics) {
                AdobeTargetAnalytics uiModel = analytic.getOnAdobeTargetAnalytics() != null ? ProductsByCategoryQueryOnAdobeTargetAnalyticsExtKt.toUiModel(analytic.getOnAdobeTargetAnalytics()) : null;
                if (uiModel != null) {
                    arrayList.add(uiModel);
                }
            }
        } else {
            arrayList = null;
        }
        List list = EmptyList.d;
        List list2 = arrayList == null ? list : arrayList;
        Integer totalNumberOfProducts = productsByCategory.getTotalNumberOfProducts();
        Integer nextPage = productsByCategory.getNextPage();
        List<ProductsByCategoryQuery.ProductsFeed> productsFeed = productsByCategory.getProductsFeed();
        ArrayList arrayList3 = new ArrayList();
        for (ProductsByCategoryQuery.ProductsFeed productsFeed2 : productsFeed) {
            Object uiModel2 = productsFeed2.getOnActionableCard() != null ? ProductsByCategoryQueryOnActionableCardExtKt.toUiModel(productsFeed2.getOnActionableCard()) : productsFeed2.getOnGoogleAdBannerCard() != null ? ProductsByCategoryQueryOnGoogleAdBannerCardExtKt.toUiModel(productsFeed2.getOnGoogleAdBannerCard()) : productsFeed2.getOnUniversalInventoryContainer() != null ? ProductsByCategoryQueryOnUniversalInventoryContainerExtKt.toUiModel(productsFeed2.getOnUniversalInventoryContainer()) : productsFeed2.getOnHorizontalList() != null ? ProductsByCategoryQueryOnHorizontalListExtKt.toUiModel(productsFeed2.getOnHorizontalList()) : productsFeed2.getOnInsetBanner() != null ? ProductsByCategoryQueryOnInsetBannerExtKt.toUiModel(productsFeed2.getOnInsetBanner()) : productsFeed2.getOnProductCard() != null ? ProductsByCategoryQueryOnProductCard1ExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel2 != null) {
                arrayList3.add(uiModel2);
            }
        }
        List<ProductsByCategoryQuery.Filter> filters = productsByCategory.getFilters();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList4.add(ProductsByCategoryQueryFilterExtKt.toUiModel((ProductsByCategoryQuery.Filter) it.next()));
        }
        List<ProductsByCategoryQuery.SortOption> sortOptions = productsByCategory.getSortOptions();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(sortOptions, 10));
        Iterator<T> it2 = sortOptions.iterator();
        while (it2.hasNext()) {
            arrayList5.add(ProductsByCategoryQuerySortOptionExtKt.toUiModel((ProductsByCategoryQuery.SortOption) it2.next()));
        }
        ProductsByCategoryQuery.SortOptionsBanner sortOptionsBanner = productsByCategory.getSortOptionsBanner();
        InsetBannerApiData uiModel3 = sortOptionsBanner != null ? ProductsByCategoryQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null;
        ProductsByCategoryQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = productsByCategory.getMarketplaceFilterSwitch();
        ProductFilterSwitch uiModel4 = marketplaceFilterSwitch != null ? ProductsByCategoryQueryMarketplaceFilterSwitchExtKt.toUiModel(marketplaceFilterSwitch) : null;
        ProductsByCategoryQuery.MarketplaceInfo marketplaceInfo = productsByCategory.getMarketplaceInfo();
        InfoSection uiModel5 = marketplaceInfo != null ? ProductsByCategoryQueryMarketplaceInfoExtKt.toUiModel(marketplaceInfo) : null;
        ProductsByCategoryQuery.MarketplaceBottomSheet marketplaceBottomSheet = productsByCategory.getMarketplaceBottomSheet();
        BottomSheetContent.Marketplace uiModel6 = marketplaceBottomSheet != null ? ProductsByCategoryQueryMarketplaceBottomSheetExtKt.toUiModel(marketplaceBottomSheet) : null;
        List<ProductsByCategoryQuery.Chip> chips = productsByCategory.getChips();
        if (chips != null) {
            List<ProductsByCategoryQuery.Chip> list3 = chips;
            arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ProductsByCategoryQueryChipExtKt.toUiModel((ProductsByCategoryQuery.Chip) it3.next()));
            }
        }
        return new ProductListByCategoryApiData(list2, totalNumberOfProducts, nextPage, arrayList3, arrayList4, arrayList5, uiModel3, uiModel4, uiModel5, uiModel6, arrayList2 == null ? list : arrayList2);
    }
}
