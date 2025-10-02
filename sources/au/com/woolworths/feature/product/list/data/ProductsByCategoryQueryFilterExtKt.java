package au.com.woolworths.feature.product.list.data;

import com.woolworths.product.list.ProductsByCategoryQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/FilterOptionApiData;", "Lcom/woolworths/product/list/ProductsByCategoryQuery$Filter;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByCategoryQueryFilterExtKt {
    @NotNull
    public static final FilterOptionApiData toUiModel(@NotNull ProductsByCategoryQuery.Filter filter) {
        Intrinsics.h(filter, "<this>");
        String headerKey = filter.getHeaderKey();
        String headerTitle = filter.getHeaderTitle();
        List<ProductsByCategoryQuery.FilterItem> filterItems = filter.getFilterItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(filterItems, 10));
        Iterator<T> it = filterItems.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductsByCategoryQueryFilterItemExtKt.toUiModel((ProductsByCategoryQuery.FilterItem) it.next()));
        }
        ProductsByCategoryQuery.Banner banner = filter.getBanner();
        return new FilterOptionApiData(headerKey, headerTitle, arrayList, banner != null ? ProductsByCategoryQueryBannerExtKt.toUiModel(banner) : null);
    }
}
