package au.com.woolworths.product.models;

import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/models/products/ProductListMarketplace;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$Marketplace;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardMarketplaceExtKt {
    @NotNull
    public static final ProductListMarketplace toUiModel(@NotNull ProductCard.Marketplace marketplace) {
        Intrinsics.h(marketplace, "<this>");
        return new ProductListMarketplace(marketplace.f8964a, marketplace.b, marketplace.c, marketplace.d, marketplace.e);
    }
}
