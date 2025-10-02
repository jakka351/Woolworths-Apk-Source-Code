package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionFooter;
import au.com.woolworths.base.shopapp.data.models.InfoSectionItem;
import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListQueryMarketplaceInfoExtKt {
    public static final InfoSection a(ProductListQuery.MarketplaceInfo marketplaceInfo) {
        Intrinsics.h(marketplaceInfo, "<this>");
        String str = marketplaceInfo.f5449a;
        ArrayList<ProductListQuery.Item1> arrayList = marketplaceInfo.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (ProductListQuery.Item1 item1 : arrayList) {
            Intrinsics.h(item1, "<this>");
            arrayList2.add(new InfoSectionItem(item1.f5442a, item1.b, item1.c));
        }
        ProductListQuery.Footer footer = marketplaceInfo.c;
        return new InfoSection(str, arrayList2, footer != null ? new InfoSectionFooter(footer.f5437a, footer.b, footer.c) : null);
    }
}
