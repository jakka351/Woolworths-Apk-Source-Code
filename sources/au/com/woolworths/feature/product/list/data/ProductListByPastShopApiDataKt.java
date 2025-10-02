package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListByPastShopApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListByPastShopApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListByPastShopApiData productListByPastShopApiData) {
        Intrinsics.h(productListByPastShopApiData, "<this>");
        List<Object> productsFeed = productListByPastShopApiData.getProductsFeed();
        Integer totalCount = productListByPastShopApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListByPastShopApiData.getNextPageKey();
        InsetBannerApiData sortOptionsBanner = productListByPastShopApiData.getSortOptionsBanner();
        InsetBannerData uiModel = sortOptionsBanner != null ? InsetBannerApiDataExtKt.toUiModel(sortOptionsBanner) : null;
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(null, productsFeed, null, iIntValue, nextPageKey, emptyList, emptyList, uiModel, null, null, null, null, null, null, null, null, null, 130816, null);
    }
}
