package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/shop/contentpage/data/HorizontalListData;", "Lcom/woolworths/product/list/ProductListQuery$OnHorizontalList;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryOnHorizontalListExtKt {
    @NotNull
    public static final HorizontalListData toUiModel(@NotNull ProductListQuery.OnHorizontalList onHorizontalList) {
        Intrinsics.h(onHorizontalList, "<this>");
        String title = onHorizontalList.getTitle();
        String subtitle = onHorizontalList.getSubtitle();
        String actionTitle = onHorizontalList.getActionTitle();
        String deepLink = onHorizontalList.getDeepLink();
        List<ProductListQuery.Item> items = onHorizontalList.getItems();
        ArrayList arrayList = new ArrayList();
        for (ProductListQuery.Item item : items) {
            Object uiModel = item.getOnProductCard() != null ? ProductListQueryOnProductCardExtKt.toUiModel(item.getOnProductCard()) : item.getOnMerchCardFullImage() != null ? ProductListQueryOnMerchCardFullImageExtKt.toUiModel(item.getOnMerchCardFullImage()) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new HorizontalListData(title, subtitle, actionTitle, null, deepLink, arrayList, null, null, null, null, null, null);
    }
}
