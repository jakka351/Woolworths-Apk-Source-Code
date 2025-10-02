package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productcard-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTileRatingsAndReviewsExtKt {
    public static final ProductRatingsAndReviews a(ProductTile.RatingsAndReviews ratingsAndReviews) {
        Intrinsics.h(ratingsAndReviews, "<this>");
        Integer num = ratingsAndReviews.b;
        ProductTile.DisplayText displayText = ratingsAndReviews.c;
        return new ProductRatingsAndReviews(num, new TextWithAltData(displayText.f23641a, displayText.b));
    }
}
