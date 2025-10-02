package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ZeroResultData;", "Lcom/woolworths/product/list/ProductListQuery$OnProductListZeroResult;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryOnProductListZeroResultExtKt {
    @NotNull
    public static final ProductListZeroResults.ZeroResultData toUiModel(@NotNull ProductListQuery.OnProductListZeroResult onProductListZeroResult) {
        Intrinsics.h(onProductListZeroResult, "<this>");
        String title = onProductListZeroResult.getTitle();
        String message = onProductListZeroResult.getMessage();
        List<ProductListQuery.Item4> items = onProductListZeroResult.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (true) {
            Object uiModel = null;
            if (!it.hasNext()) {
                return new ProductListZeroResults.ZeroResultData(title, null, message, arrayList);
            }
            ProductListQuery.Item4 item4 = (ProductListQuery.Item4) it.next();
            if (item4.getOnZeroResultProductCategories() != null) {
                uiModel = ProductListQueryOnZeroResultProductCategories1ExtKt.toUiModel(item4.getOnZeroResultProductCategories());
            } else if (item4.getOnHorizontalList() != null) {
                uiModel = ProductListQueryOnHorizontalList2ExtKt.toUiModel(item4.getOnHorizontalList());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
    }
}
