package au.com.woolworths.feature.product.list.data;

import com.woolworths.product.list.ProductsBySearchQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ZeroResultPageData;", "Lcom/woolworths/product/list/ProductsBySearchQuery$ZeroResultContent;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryZeroResultContentExtKt {
    @NotNull
    public static final ZeroResultPageData toUiModel(@NotNull ProductsBySearchQuery.ZeroResultContent zeroResultContent) {
        Intrinsics.h(zeroResultContent, "<this>");
        String title = zeroResultContent.getTitle();
        String message = zeroResultContent.getMessage();
        List<ProductsBySearchQuery.Item1> items = zeroResultContent.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (true) {
            Object uiModel = null;
            if (!it.hasNext()) {
                return new ZeroResultPageData(title, null, message, arrayList);
            }
            ProductsBySearchQuery.Item1 item1 = (ProductsBySearchQuery.Item1) it.next();
            if (item1.getOnZeroResultProductCategories() != null) {
                uiModel = ProductsBySearchQueryOnZeroResultProductCategoriesExtKt.toUiModel(item1.getOnZeroResultProductCategories());
            } else if (item1.getOnHorizontalList() != null) {
                uiModel = ProductsBySearchQueryOnHorizontalListExtKt.toUiModel(item1.getOnHorizontalList());
            }
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
    }
}
