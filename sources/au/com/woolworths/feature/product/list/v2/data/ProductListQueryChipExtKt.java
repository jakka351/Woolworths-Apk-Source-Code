package au.com.woolworths.feature.product.list.v2.data;

import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryChipExtKt {
    public static final ProductListChip a(ProductListQuery.Chip chip) {
        Intrinsics.h(chip, "<this>");
        String str = chip.f5428a;
        boolean z = chip.b;
        ProductListQuery.Text text = chip.c;
        Intrinsics.h(text, "<this>");
        return new ProductListChip(str, z, new ChipText(text.f5488a, text.b), chip.d);
    }
}
