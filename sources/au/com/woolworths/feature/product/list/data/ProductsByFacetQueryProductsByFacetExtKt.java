package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.shop.graphql.ProductsByFacetQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListByFacetApiData;", "Lau/com/woolworths/shop/graphql/ProductsByFacetQuery$ProductsByFacet;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByFacetQueryProductsByFacetExtKt {
    @NotNull
    public static final ProductListByFacetApiData toUiModel(@NotNull ProductsByFacetQuery.ProductsByFacet productsByFacet) {
        Intrinsics.h(productsByFacet, "<this>");
        ArrayList arrayList = productsByFacet.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductsByFacetQueryProductExtKt.toUiModel((ProductsByFacetQuery.Product) it.next()));
        }
        Integer num = productsByFacet.f10937a;
        Integer num2 = productsByFacet.b;
        ArrayList arrayList3 = productsByFacet.d;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(ProductsByFacetQueryFilterExtKt.toUiModel((ProductsByFacetQuery.Filter) it2.next()));
        }
        ArrayList arrayList5 = productsByFacet.e;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(ProductsByFacetQuerySortOptionExtKt.toUiModel((ProductsByFacetQuery.SortOption) it3.next()));
        }
        ProductsByFacetQuery.SortOptionsBanner sortOptionsBanner = productsByFacet.f;
        InsetBannerApiData uiModel = sortOptionsBanner != null ? ProductsByFacetQuerySortOptionsBannerExtKt.toUiModel(sortOptionsBanner) : null;
        ProductsByFacetQuery.MarketplaceInfo marketplaceInfo = productsByFacet.g;
        InfoSection uiModel2 = marketplaceInfo != null ? ProductsByFacetQueryMarketplaceInfoExtKt.toUiModel(marketplaceInfo) : null;
        ProductsByFacetQuery.MarketplaceBottomSheet marketplaceBottomSheet = productsByFacet.h;
        return new ProductListByFacetApiData(arrayList2, null, num, num2, arrayList4, arrayList6, uiModel, uiModel2, marketplaceBottomSheet != null ? ProductsByFacetQueryMarketplaceBottomSheetExtKt.toUiModel(marketplaceBottomSheet) : null);
    }
}
