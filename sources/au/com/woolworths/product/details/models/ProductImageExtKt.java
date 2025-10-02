package au.com.woolworths.product.details.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getContentDescription", "", "Lau/com/woolworths/product/details/models/ProductImage;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductImageExtKt {
    @NotNull
    public static final String getContentDescription(@NotNull ProductImage productImage) {
        Intrinsics.h(productImage, "<this>");
        String altText = productImage.getAltText();
        return altText == null ? "Product image" : altText;
    }
}
