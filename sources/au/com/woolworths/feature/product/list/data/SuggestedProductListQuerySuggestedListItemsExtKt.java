package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.shop.lists.data.remote.SuggestedProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListBySuggestedListApiData;", "Lau/com/woolworths/shop/lists/data/remote/SuggestedProductListQuery$SuggestedListItems;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SuggestedProductListQuerySuggestedListItemsExtKt {
    @NotNull
    public static final ProductListBySuggestedListApiData toUiModel(@NotNull SuggestedProductListQuery.SuggestedListItems suggestedListItems) {
        Intrinsics.h(suggestedListItems, "<this>");
        Integer totalNumberOfProducts = suggestedListItems.getTotalNumberOfProducts();
        Integer nextPage = suggestedListItems.getNextPage();
        List<SuggestedProductListQuery.Product> products = suggestedListItems.getProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(SuggestedProductListQueryProductExtKt.toUiModel((SuggestedProductListQuery.Product) it.next()));
        }
        return new ProductListBySuggestedListApiData(totalNumberOfProducts, nextPage, arrayList);
    }
}
