package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcelable;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetails;
import au.com.woolworths.shop.ratingsandreviews.data.ReviewItem;
import fragment.RatingsAndReviewsReviewDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsAndReviewsReviewDetailsItemExtKt {
    public static final RatingsAndReviewsReviewDetails.ReviewDetailsItem a(RatingsAndReviewsReviewDetails.Item item) {
        Parcelable body;
        Intrinsics.h(item, "<this>");
        ArrayList<RatingsAndReviewsReviewDetails.Section> arrayList = item.f23818a;
        ArrayList arrayList2 = new ArrayList();
        for (RatingsAndReviewsReviewDetails.Section section : arrayList) {
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = section.b;
            if (onRatingsAndReviewsReviewItemRating != null) {
                body = new ReviewItem.Rating(onRatingsAndReviewsReviewItemRating.f23821a, onRatingsAndReviewsReviewItemRating.b, onRatingsAndReviewsReviewItemRating.c);
            } else {
                RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = section.c;
                if (onRatingsAndReviewsReviewItemReviewTitle != null) {
                    body = new ReviewItem.Title(onRatingsAndReviewsReviewItemReviewTitle.f23823a);
                } else {
                    RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = section.d;
                    if (onRatingsAndReviewsReviewItemRecommendation != null) {
                        body = new ReviewItem.Recommendation(onRatingsAndReviewsReviewItemRecommendation.f23822a, null);
                    } else {
                        RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = section.e;
                        if (onRatingsAndReviewsReviewItemInfo != null) {
                            body = new ReviewItem.Info(onRatingsAndReviewsReviewItemInfo.f23820a, onRatingsAndReviewsReviewItemInfo.b);
                        } else {
                            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = section.f;
                            body = onRatingsAndReviewsReviewItemBody != null ? new ReviewItem.Body(onRatingsAndReviewsReviewItemBody.f23819a) : null;
                        }
                    }
                }
            }
            if (body != null) {
                arrayList2.add(body);
            }
        }
        return new RatingsAndReviewsReviewDetails.ReviewDetailsItem(arrayList2);
    }
}
