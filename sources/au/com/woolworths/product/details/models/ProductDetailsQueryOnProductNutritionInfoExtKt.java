package au.com.woolworths.product.details.models;

import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/ProductNutritionInfo;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnProductNutritionInfoExtKt {
    @NotNull
    public static final ProductNutritionInfo toUiModel(@NotNull ProductDetailsQuery.OnProductNutritionInfo onProductNutritionInfo) {
        Intrinsics.h(onProductNutritionInfo, "<this>");
        String productNutritionTitle = onProductNutritionInfo.getProductNutritionTitle();
        String servingsPerPack = onProductNutritionInfo.getServingsPerPack();
        String servingSize = onProductNutritionInfo.getServingSize();
        String bottomCaption = onProductNutritionInfo.getBottomCaption();
        List<String> tableHeaderRow = onProductNutritionInfo.getTableHeaderRow();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(tableHeaderRow, 10));
        Iterator<T> it = tableHeaderRow.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<List<String>> tableRows = onProductNutritionInfo.getTableRows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(tableRows, 10));
        Iterator<T> it2 = tableRows.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) it3.next());
            }
            arrayList2.add(arrayList3);
        }
        return new ProductNutritionInfo(productNutritionTitle, servingsPerPack, servingSize, bottomCaption, arrayList, arrayList2);
    }
}
