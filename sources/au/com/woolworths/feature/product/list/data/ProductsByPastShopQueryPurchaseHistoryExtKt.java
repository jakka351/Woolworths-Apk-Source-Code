package au.com.woolworths.feature.product.list.data;

import android.os.Parcelable;
import com.woolworths.product.list.ProductsByPastShopQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByPastShopApiData;", "Lcom/woolworths/product/list/ProductsByPastShopQuery$PurchaseHistory;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByPastShopQueryPurchaseHistoryExtKt {
    @NotNull
    public static final ProductListByPastShopApiData toUiModel(@NotNull ProductsByPastShopQuery.PurchaseHistory purchaseHistory) {
        Intrinsics.h(purchaseHistory, "<this>");
        Integer totalNumberOfProducts = purchaseHistory.getTotalNumberOfProducts();
        Integer nextPage = purchaseHistory.getNextPage();
        List<ProductsByPastShopQuery.ProductsFeed> productsFeed = purchaseHistory.getProductsFeed();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = productsFeed.iterator();
        while (true) {
            Parcelable uiModel = null;
            if (!it.hasNext()) {
                break;
            }
            ProductsByPastShopQuery.ProductsFeed productsFeed2 = (ProductsByPastShopQuery.ProductsFeed) it.next();
            if (productsFeed2.getOnActionableCard() != null) {
                uiModel = ProductsByPastShopQueryOnActionableCardExtKt.toUiModel(productsFeed2.getOnActionableCard());
            } else if (productsFeed2.getOnProductCard() != null) {
                uiModel = ProductsByPastShopQueryOnProductCardExtKt.toUiModel(productsFeed2.getOnProductCard());
            } else if (productsFeed2.getOnImageTextBanner() != null) {
                uiModel = ProductsByPastShopQueryOnImageTextBannerExtKt.toUiModel(productsFeed2.getOnImageTextBanner());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        List<ProductsByPastShopQuery.Filter> filters = purchaseHistory.getFilters();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(filters, 10));
        Iterator<T> it2 = filters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ProductsByPastShopQueryFilterExtKt.toUiModel((ProductsByPastShopQuery.Filter) it2.next()));
        }
        List<ProductsByPastShopQuery.SortOption> sortOptions = purchaseHistory.getSortOptions();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(sortOptions, 10));
        Iterator<T> it3 = sortOptions.iterator();
        while (it3.hasNext()) {
            arrayList3.add(ProductsByPastShopQuerySortOptionExtKt.toUiModel((ProductsByPastShopQuery.SortOption) it3.next()));
        }
        ProductsByPastShopQuery.SortOptionsBanner sortOptionsBanner = purchaseHistory.getSortOptionsBanner();
        return new ProductListByPastShopApiData(totalNumberOfProducts, nextPage, arrayList, arrayList2, arrayList3, sortOptionsBanner != null ? ProductsByPastShopQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null);
    }
}
