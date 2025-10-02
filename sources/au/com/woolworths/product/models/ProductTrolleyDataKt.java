package au.com.woolworths.product.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"defaultProductTrolleyData", "Lau/com/woolworths/product/models/ProductTrolleyData;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTrolleyDataKt {
    @NotNull
    public static final ProductTrolleyData defaultProductTrolleyData() {
        return new ProductTrolleyData(1.0d, 36.0d, 1.0d, 1.0d, Double.valueOf(0.0d), "", ProductTileButtonType.ADD, "Add", "0", null);
    }
}
