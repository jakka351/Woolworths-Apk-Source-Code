package au.com.woolworths.product.details.models;

import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/details/models/CountryOfOriginAndHealthInfo;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnProductOriginAndHealthInfoExtKt {
    @NotNull
    public static final CountryOfOriginAndHealthInfo toUiModel(@NotNull ProductDetailsQuery.OnProductOriginAndHealthInfo onProductOriginAndHealthInfo) {
        Intrinsics.h(onProductOriginAndHealthInfo, "<this>");
        ProductDetailsQuery.CountryOfOrigin countryOfOrigin = onProductOriginAndHealthInfo.getCountryOfOrigin();
        ImageContent uiModel = countryOfOrigin != null ? ProductDetailsQueryCountryOfOriginExtKt.toUiModel(countryOfOrigin) : null;
        ProductDetailsQuery.HealthStarRating healthStarRating = onProductOriginAndHealthInfo.getHealthStarRating();
        return new CountryOfOriginAndHealthInfo(uiModel, healthStarRating != null ? ProductDetailsQueryHealthStarRatingExtKt.toUiModel(healthStarRating) : null);
    }
}
