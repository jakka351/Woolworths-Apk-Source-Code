package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.product.list.ProductsBySearchQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;", "Lcom/woolworths/product/list/ProductsBySearchQuery$OnHorizontalList;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsBySearchQueryOnHorizontalListExtKt {
    @NotNull
    public static final HorizontalListData toUiModel(@NotNull ProductsBySearchQuery.OnHorizontalList onHorizontalList) {
        Intrinsics.h(onHorizontalList, "<this>");
        String title = onHorizontalList.getTitle();
        List<ProductsBySearchQuery.Item2> items = onHorizontalList.getItems();
        ArrayList arrayList = new ArrayList();
        for (ProductsBySearchQuery.Item2 item2 : items) {
            ProductCard uiModel = item2.getOnProductCard() != null ? ProductsBySearchQueryOnProductCard1ExtKt.toUiModel(item2.getOnProductCard()) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new HorizontalListData(title, null, null, null, null, arrayList, null, null, null, null, null, null, 16, null);
    }
}
