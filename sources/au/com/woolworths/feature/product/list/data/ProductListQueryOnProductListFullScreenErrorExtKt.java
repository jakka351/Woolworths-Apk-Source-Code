package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/ProductListZeroResults$ProductListFullScreenError;", "Lcom/woolworths/product/list/ProductListQuery$OnProductListFullScreenError;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnProductListFullScreenErrorExtKt {
    @NotNull
    public static final ProductListZeroResults.ProductListFullScreenError toUiModel(@NotNull ProductListQuery.OnProductListFullScreenError onProductListFullScreenError) {
        Intrinsics.h(onProductListFullScreenError, "<this>");
        String image = onProductListFullScreenError.getImage();
        String title = onProductListFullScreenError.getTitle();
        String description = onProductListFullScreenError.getDescription();
        ProductListQuery.Cta cta = onProductListFullScreenError.getCta();
        return new ProductListZeroResults.ProductListFullScreenError(image, title, description, cta != null ? ProductListQueryCtaExtKt.toUiModel(cta) : null);
    }
}
