package au.com.woolworths.product.details.models;

import au.com.woolworths.shop.ratingsandreviews.data.ButtonAction;
import au.com.woolworths.shop.ratingsandreviews.data.LinkButton;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewCta;
import com.woolworths.product.details.ProductDetailsQuery;
import fragment.RatingsAndReviewsPreviewCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewCta;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQueryOnRatingsAndReviewsPreviewCtaExtKt {
    @NotNull
    public static final RatingsAndReviewsPreviewCta toUiModel(@NotNull ProductDetailsQuery.OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta) {
        Intrinsics.h(onRatingsAndReviewsPreviewCta, "<this>");
        RatingsAndReviewsPreviewCta.Button button = onRatingsAndReviewsPreviewCta.getRatingsAndReviewsPreviewCta().f23785a;
        Intrinsics.h(button, "<this>");
        String str = button.f23786a;
        String str2 = button.b;
        boolean z = button.c;
        RatingsAndReviewsPreviewCta.ButtonAction buttonAction = button.d;
        return new au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewCta(new LinkButton(str, str2, z, buttonAction != null ? new ButtonAction(buttonAction.f23787a, buttonAction.b, buttonAction.c) : null));
    }
}
