package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import com.woolworths.product.list.ProductListQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "Lcom/woolworths/product/list/ProductListQuery$MarketplaceInfo;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryMarketplaceInfoExtKt {
    @NotNull
    public static final InfoSection toUiModel(@NotNull ProductListQuery.MarketplaceInfo marketplaceInfo) {
        Intrinsics.h(marketplaceInfo, "<this>");
        String title = marketplaceInfo.getTitle();
        List<ProductListQuery.Item1> items = marketplaceInfo.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductListQueryItem1ExtKt.toUiModel((ProductListQuery.Item1) it.next()));
        }
        ProductListQuery.Footer footer = marketplaceInfo.getFooter();
        return new InfoSection(title, arrayList, footer != null ? ProductListQueryFooterExtKt.toUiModel(footer) : null);
    }
}
