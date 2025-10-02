package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryFacetChipExtKt {
    public static final ProductListChip a(ProductListQuery.FacetChip facetChip) {
        Intrinsics.h(facetChip, "<this>");
        String str = facetChip.f5433a;
        boolean z = facetChip.b;
        ProductListQuery.Text1 text1 = facetChip.c;
        Intrinsics.h(text1, "<this>");
        return new ProductListChip(str, z, new ChipText(text1.f5489a, text1.b), null);
    }
}
