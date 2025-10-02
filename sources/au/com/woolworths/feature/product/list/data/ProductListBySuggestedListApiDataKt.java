package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.ProductCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListBySuggestedListApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListBySuggestedListApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListBySuggestedListApiData productListBySuggestedListApiData) {
        Intrinsics.h(productListBySuggestedListApiData, "<this>");
        int d = productListBySuggestedListApiData.getD();
        Integer nextPageKey = productListBySuggestedListApiData.getNextPageKey();
        List<ProductCard> c = productListBySuggestedListApiData.getC();
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(c, null, null, d, nextPageKey, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, 130944, null);
    }
}
