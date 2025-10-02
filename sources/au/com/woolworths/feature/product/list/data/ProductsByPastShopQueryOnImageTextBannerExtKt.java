package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.feature.shop.banners.imagetextbanner.data.ImageTextBanner;
import com.woolworths.product.list.ProductsByPastShopQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/shop/banners/imagetextbanner/data/ImageTextBanner;", "Lcom/woolworths/product/list/ProductsByPastShopQuery$OnImageTextBanner;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByPastShopQueryOnImageTextBannerExtKt {
    @NotNull
    public static final ImageTextBanner toUiModel(@NotNull ProductsByPastShopQuery.OnImageTextBanner onImageTextBanner) {
        Intrinsics.h(onImageTextBanner, "<this>");
        return new ImageTextBanner(onImageTextBanner.getImageUrl(), onImageTextBanner.getMessage());
    }
}
