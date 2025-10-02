package au.com.woolworths.feature.product.list.legacy.data;

import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderApiData;
import au.com.woolworths.base.shopapp.modules.listsectionheader.ListSectionHeaderTypeApiData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListByRecipeApiDataKt {
    public static final ProductListData a(ProductListByRecipeApiData productListByRecipeApiData) {
        Integer num = productListByRecipeApiData.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = productListByRecipeApiData.c;
        ArrayList arrayList = productListByRecipeApiData.f5361a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ListSectionHeaderApiData listSectionHeaderApiData = obj instanceof ListSectionHeaderApiData ? (ListSectionHeaderApiData) obj : null;
            if ((listSectionHeaderApiData != null ? listSectionHeaderApiData.getType() : null) != ListSectionHeaderTypeApiData.SECONDARY) {
                arrayList2.add(obj);
            }
        }
        EmptyList emptyList = EmptyList.d;
        return new ProductListData(null, arrayList2, null, iIntValue, num2, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, 130944);
    }
}
