package au.com.woolworths.product.details.models;

import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetailsExtKt;
import com.woolworths.product.details.ProductDetailsQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0005¨\u0006\u0006"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsRatingsDetails;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;", "", "Lau/com/woolworths/shop/graphql/type/ProductListChannelType;", "Lau/com/woolworths/shop/graphql/type/ProductListFacetType;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsDataKt {
    @NotNull
    public static final String toUiModel(@NotNull ProductListChannelType productListChannelType) {
        Intrinsics.h(productListChannelType, "<this>");
        return productListChannelType.d;
    }

    @NotNull
    public static final String toUiModel(@NotNull ProductListFacetType productListFacetType) {
        Intrinsics.h(productListFacetType, "<this>");
        return productListFacetType.d;
    }

    @NotNull
    public static final RatingsAndReviewsRatingsDetails toUiModel(@NotNull ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails) {
        Intrinsics.h(onRatingsAndReviewsRatingsDetails, "<this>");
        return RatingsAndReviewsRatingsDetailsExtKt.a(onRatingsAndReviewsRatingsDetails.getRatingsAndReviewsRatingsDetails());
    }
}
