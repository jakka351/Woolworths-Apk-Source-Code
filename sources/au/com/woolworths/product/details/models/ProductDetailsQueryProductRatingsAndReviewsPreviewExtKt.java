package au.com.woolworths.product.details.models;

import android.os.Parcelable;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import com.woolworths.product.details.ProductDetailsQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewData;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;", "shop-product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsQueryProductRatingsAndReviewsPreviewExtKt {
    @NotNull
    public static final RatingsAndReviewsPreviewData toUiModel(@NotNull ProductDetailsQuery.ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview) {
        Intrinsics.h(productRatingsAndReviewsPreview, "<this>");
        List<ProductDetailsQuery.Section> sections = productRatingsAndReviewsPreview.getSections();
        ArrayList arrayList = new ArrayList();
        for (ProductDetailsQuery.Section section : sections) {
            Parcelable uiModel = section.getOnRatingsAndReviewsPreviewHeader() != null ? ProductDetailsQueryOnRatingsAndReviewsPreviewHeaderExtKt.toUiModel(section.getOnRatingsAndReviewsPreviewHeader()) : section.getOnRatingsAndReviewsRatingsDetails() != null ? ProductDetailsDataKt.toUiModel(section.getOnRatingsAndReviewsRatingsDetails()) : section.getOnRatingsAndReviewsReviewDetails() != null ? ProductDetailsQueryOnRatingsAndReviewsReviewDetailsExtKt.toUiModel(section.getOnRatingsAndReviewsReviewDetails()) : section.getOnRatingsAndReviewsPreviewCta() != null ? ProductDetailsQueryOnRatingsAndReviewsPreviewCtaExtKt.toUiModel(section.getOnRatingsAndReviewsPreviewCta()) : null;
            if (uiModel != null) {
                arrayList.add(uiModel);
            }
        }
        return new RatingsAndReviewsPreviewData(arrayList);
    }
}
