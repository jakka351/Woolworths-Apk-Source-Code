package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.graphql.ProductsByFacetQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "Lau/com/woolworths/shop/graphql/ProductsByFacetQuery$Filter;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByFacetQueryFilterExtKt {
    @NotNull
    public static final FilterOptionApiData toUiModel(@NotNull ProductsByFacetQuery.Filter filter) {
        Intrinsics.h(filter, "<this>");
        String str = filter.f10929a;
        String str2 = filter.b;
        ArrayList arrayList = filter.c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductsByFacetQueryFilterItemExtKt.toUiModel((ProductsByFacetQuery.FilterItem) it.next()));
        }
        ProductsByFacetQuery.Banner banner = filter.d;
        return new FilterOptionApiData(str, str2, arrayList2, banner != null ? ProductsByFacetQueryBannerExtKt.toUiModel(banner) : null);
    }
}
