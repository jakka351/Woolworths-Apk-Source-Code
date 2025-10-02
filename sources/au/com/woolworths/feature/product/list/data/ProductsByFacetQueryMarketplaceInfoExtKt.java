package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.shop.graphql.ProductsByFacetQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/base/shopapp/data/models/InfoSection;", "Lau/com/woolworths/shop/graphql/ProductsByFacetQuery$MarketplaceInfo;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByFacetQueryMarketplaceInfoExtKt {
    @NotNull
    public static final InfoSection toUiModel(@NotNull ProductsByFacetQuery.MarketplaceInfo marketplaceInfo) {
        Intrinsics.h(marketplaceInfo, "<this>");
        String str = marketplaceInfo.f10934a;
        ArrayList arrayList = marketplaceInfo.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductsByFacetQueryItemExtKt.toUiModel((ProductsByFacetQuery.Item) it.next()));
        }
        ProductsByFacetQuery.Footer footer = marketplaceInfo.c;
        return new InfoSection(str, arrayList2, footer != null ? ProductsByFacetQueryFooterExtKt.toUiModel(footer) : null);
    }
}
