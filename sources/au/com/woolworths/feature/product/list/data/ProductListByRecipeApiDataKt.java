package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProductListData", "Lau/com/woolworths/feature/product/list/data/ProductListData;", "Lau/com/woolworths/feature/product/list/data/ProductListByRecipeApiData;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListByRecipeApiDataKt {
    @NotNull
    public static final ProductListData toProductListData(@NotNull ProductListByRecipeApiData productListByRecipeApiData) {
        ArrayList arrayList;
        Intrinsics.h(productListByRecipeApiData, "<this>");
        Integer totalCount = productListByRecipeApiData.getTotalCount();
        int iIntValue = totalCount != null ? totalCount.intValue() : 0;
        Integer nextPageKey = productListByRecipeApiData.getNextPageKey();
        List<Object> productsFeed = productListByRecipeApiData.getProductsFeed();
        if (productsFeed != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : productsFeed) {
                ListSectionHeaderApiData listSectionHeaderApiData = obj instanceof ListSectionHeaderApiData ? (ListSectionHeaderApiData) obj : null;
                if ((listSectionHeaderApiData != null ? listSectionHeaderApiData.getType() : null) != ListSectionHeaderTypeApiData.SECONDARY) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(null, arrayList, null, iIntValue, nextPageKey, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, 130944, null);
    }
}
