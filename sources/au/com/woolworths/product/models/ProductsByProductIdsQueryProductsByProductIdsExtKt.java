package au.com.woolworths.product.models;

import au.com.woolworths.product.ProductsByProductIdsQuery;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/ProductListByProductIdsApiData;", "Lau/com/woolworths/product/ProductsByProductIdsQuery$ProductsByProductIds;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductsByProductIdsQueryProductsByProductIdsExtKt {
    @NotNull
    public static final ProductListByProductIdsApiData toUiModel(@NotNull ProductsByProductIdsQuery.ProductsByProductIds productsByProductIds) {
        Intrinsics.h(productsByProductIds, "<this>");
        ArrayList arrayList = productsByProductIds.f9232a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProductsByProductIdsQueryProductExtKt.toUiModel((ProductsByProductIdsQuery.Product) it.next()));
        }
        return new ProductListByProductIdsApiData(arrayList2);
    }
}
