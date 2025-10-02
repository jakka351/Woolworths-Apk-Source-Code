package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import com.woolworths.product.list.ProductsOnSpecialByCategoryQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListOnSpecialByCategoryApiData;", "Lcom/woolworths/product/list/ProductsOnSpecialByCategoryQuery$ProductsOnSpecialByCategory;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsOnSpecialByCategoryQueryProductsOnSpecialByCategoryExtKt {
    @NotNull
    public static final ProductListOnSpecialByCategoryApiData toUiModel(@NotNull ProductsOnSpecialByCategoryQuery.ProductsOnSpecialByCategory productsOnSpecialByCategory) {
        List arrayList;
        Intrinsics.h(productsOnSpecialByCategory, "<this>");
        List<ProductsOnSpecialByCategoryQuery.Analytic> analytics = productsOnSpecialByCategory.getAnalytics();
        List arrayList2 = null;
        if (analytics != null) {
            arrayList = new ArrayList();
            for (ProductsOnSpecialByCategoryQuery.Analytic analytic : analytics) {
                AdobeTargetAnalytics uiModel = analytic.getOnAdobeTargetAnalytics() != null ? ProductsOnSpecialByCategoryQueryOnAdobeTargetAnalyticsExtKt.toUiModel(analytic.getOnAdobeTargetAnalytics()) : null;
                if (uiModel != null) {
                    arrayList.add(uiModel);
                }
            }
        } else {
            arrayList = null;
        }
        List list = EmptyList.d;
        List list2 = arrayList == null ? list : arrayList;
        Integer totalNumberOfProducts = productsOnSpecialByCategory.getTotalNumberOfProducts();
        Integer nextPage = productsOnSpecialByCategory.getNextPage();
        List<ProductsOnSpecialByCategoryQuery.ProductsFeed> productsFeed = productsOnSpecialByCategory.getProductsFeed();
        ArrayList arrayList3 = new ArrayList();
        for (ProductsOnSpecialByCategoryQuery.ProductsFeed productsFeed2 : productsFeed) {
            Object uiModel2 = productsFeed2.getOnActionableCard() != null ? ProductsOnSpecialByCategoryQueryOnActionableCardExtKt.toUiModel(productsFeed2.getOnActionableCard()) : productsFeed2.getOnGoogleAdBannerCard() != null ? ProductsOnSpecialByCategoryQueryOnGoogleAdBannerCardExtKt.toUiModel(productsFeed2.getOnGoogleAdBannerCard()) : productsFeed2.getOnUniversalInventoryContainer() != null ? ProductsOnSpecialByCategoryQueryOnUniversalInventoryContainerExtKt.toUiModel(productsFeed2.getOnUniversalInventoryContainer()) : productsFeed2.getOnInsetBanner() != null ? ProductsOnSpecialByCategoryQueryOnInsetBannerExtKt.toUiModel(productsFeed2.getOnInsetBanner()) : productsFeed2.getOnProductCard() != null ? ProductsOnSpecialByCategoryQueryOnProductCardExtKt.toUiModel(productsFeed2.getOnProductCard()) : null;
            if (uiModel2 != null) {
                arrayList3.add(uiModel2);
            }
        }
        List<ProductsOnSpecialByCategoryQuery.Filter> filters = productsOnSpecialByCategory.getFilters();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList4.add(ProductsOnSpecialByCategoryQueryFilterExtKt.toUiModel((ProductsOnSpecialByCategoryQuery.Filter) it.next()));
        }
        List<ProductsOnSpecialByCategoryQuery.SortOption> sortOptions = productsOnSpecialByCategory.getSortOptions();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(sortOptions, 10));
        Iterator<T> it2 = sortOptions.iterator();
        while (it2.hasNext()) {
            arrayList5.add(ProductsOnSpecialByCategoryQuerySortOptionExtKt.toUiModel((ProductsOnSpecialByCategoryQuery.SortOption) it2.next()));
        }
        ProductsOnSpecialByCategoryQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = productsOnSpecialByCategory.getMarketplaceFilterSwitch();
        ProductFilterSwitch uiModel3 = marketplaceFilterSwitch != null ? ProductsOnSpecialByCategoryQueryMarketplaceFilterSwitchExtKt.toUiModel(marketplaceFilterSwitch) : null;
        ProductsOnSpecialByCategoryQuery.MarketplaceInfo marketplaceInfo = productsOnSpecialByCategory.getMarketplaceInfo();
        InfoSection uiModel4 = marketplaceInfo != null ? ProductsOnSpecialByCategoryQueryMarketplaceInfoExtKt.toUiModel(marketplaceInfo) : null;
        ProductsOnSpecialByCategoryQuery.MarketplaceBottomSheet marketplaceBottomSheet = productsOnSpecialByCategory.getMarketplaceBottomSheet();
        BottomSheetContent.Marketplace uiModel5 = marketplaceBottomSheet != null ? ProductsOnSpecialByCategoryQueryMarketplaceBottomSheetExtKt.toUiModel(marketplaceBottomSheet) : null;
        ProductsOnSpecialByCategoryQuery.SortOptionsBanner sortOptionsBanner = productsOnSpecialByCategory.getSortOptionsBanner();
        InsetBannerApiData uiModel6 = sortOptionsBanner != null ? ProductsOnSpecialByCategoryQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null;
        List<ProductsOnSpecialByCategoryQuery.Chip> chips = productsOnSpecialByCategory.getChips();
        if (chips != null) {
            List<ProductsOnSpecialByCategoryQuery.Chip> list3 = chips;
            arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(ProductsOnSpecialByCategoryQueryChipExtKt.toUiModel((ProductsOnSpecialByCategoryQuery.Chip) it3.next()));
            }
        }
        return new ProductListOnSpecialByCategoryApiData(list2, totalNumberOfProducts, nextPage, arrayList3, arrayList4, arrayList5, uiModel3, uiModel4, uiModel5, uiModel6, arrayList2 == null ? list : arrayList2);
    }
}
