package au.com.woolworths.feature.product.list.data;

import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "Lcom/woolworths/product/list/ProductListQuery$ZeroResultContent;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryZeroResultContentExtKt {
    @NotNull
    public static final ZeroResultPageData toUiModel(@NotNull ProductListQuery.ZeroResultContent zeroResultContent) {
        Intrinsics.h(zeroResultContent, "<this>");
        String title = zeroResultContent.getTitle();
        String message = zeroResultContent.getMessage();
        List<ProductListQuery.Item2> items = zeroResultContent.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (true) {
            Object uiModel = null;
            if (!it.hasNext()) {
                return new ZeroResultPageData(title, null, message, arrayList);
            }
            ProductListQuery.Item2 item2 = (ProductListQuery.Item2) it.next();
            if (item2.getOnZeroResultProductCategories() != null) {
                uiModel = ProductListQueryOnZeroResultProductCategoriesExtKt.toUiModel(item2.getOnZeroResultProductCategories());
            } else if (item2.getOnHorizontalList() != null) {
                uiModel = ProductListQueryOnHorizontalList1ExtKt.toUiModel(item2.getOnHorizontalList());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
    }
}
