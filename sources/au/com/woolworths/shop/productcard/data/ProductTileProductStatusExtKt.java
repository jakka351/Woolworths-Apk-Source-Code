package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileProductStatusExtKt {
    public static final ProductStatus a(ProductTile.ProductStatus productStatus) {
        Intrinsics.h(productStatus, "<this>");
        ProductTile.Text text = productStatus.f23655a;
        ProductStatusScheme productStatusScheme = null;
        TextWithAltData textWithAltData = text != null ? new TextWithAltData(text.f23662a, text.b) : null;
        au.com.woolworths.shop.graphql.type.ProductStatusScheme productStatusScheme2 = productStatus.b;
        if (productStatusScheme2 != null) {
            int iOrdinal = productStatusScheme2.ordinal();
            productStatusScheme = iOrdinal != 0 ? iOrdinal != 1 ? ProductStatusScheme.e : ProductStatusScheme.e : ProductStatusScheme.d;
        }
        return new ProductStatus(textWithAltData, productStatusScheme);
    }
}
