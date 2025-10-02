package au.com.woolworths.product.details.models;

import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetailsItemExtKt;
import com.woolworths.product.details.ProductDetailsQuery;
import fragment.RatingsAndReviewsReviewDetails;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsReviewDetails;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnRatingsAndReviewsReviewDetailsExtKt {
    @NotNull
    public static final RatingsAndReviewsReviewDetails toUiModel(@NotNull ProductDetailsQuery.OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails) {
        Intrinsics.h(onRatingsAndReviewsReviewDetails, "<this>");
        ArrayList arrayList = onRatingsAndReviewsReviewDetails.getRatingsAndReviewsReviewDetails().f23817a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(RatingsAndReviewsReviewDetailsItemExtKt.a((RatingsAndReviewsReviewDetails.Item) it.next()));
        }
        return new au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetails(arrayList2);
    }
}
