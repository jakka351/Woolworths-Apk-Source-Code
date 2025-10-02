package au.com.woolworths.shop.ratingsandreviews.data;

import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionDetails;
import fragment.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsAndReviewsRatingsDetailsExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionWriteReview] */
    /* JADX WARN: Type inference failed for: r6v2, types: [au.com.woolworths.shop.ratingsandreviews.data.RatingsOverview] */
    public static final RatingsAndReviewsRatingsDetails a(fragment.RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails) {
        Iterator it;
        Intrinsics.h(ratingsAndReviewsRatingsDetails, "<this>");
        ArrayList arrayList = ratingsAndReviewsRatingsDetails.f23793a;
        ArrayList arrayList2 = new ArrayList();
        for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it) {
            RatingsAndReviewsRatingsDetails.Section section = (RatingsAndReviewsRatingsDetails.Section) it2.next();
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverview = section.b;
            RatingsDistributionDetails ratingsDistributionWriteReview = null;
            Cta cta = null;
            if (onRatingsAndReviewsRatingDistributionOverview != null) {
                double d = onRatingsAndReviewsRatingDistributionOverview.f23801a;
                double d2 = onRatingsAndReviewsRatingDistributionOverview.b;
                RatingsAndReviewsRatingsDetails.RatingText ratingText = onRatingsAndReviewsRatingDistributionOverview.c;
                CtaText ctaText = new CtaText(ratingText.f23803a, ratingText.b);
                int i = onRatingsAndReviewsRatingDistributionOverview.d;
                String str = onRatingsAndReviewsRatingDistributionOverview.e;
                RatingsAndReviewsRatingsDetails.Cta cta2 = onRatingsAndReviewsRatingDistributionOverview.f;
                if (cta2 != null) {
                    RatingsAndReviewsRatingsDetails.LinkAction linkAction = cta2.b;
                    it = it2;
                    CtaLinkAction ctaLinkAction = new CtaLinkAction(linkAction.f23798a, linkAction.b, linkAction.c);
                    RatingsAndReviewsRatingsDetails.LinkTextWithAlt linkTextWithAlt = cta2.c;
                    cta = new Cta(ctaLinkAction, new CtaText(linkTextWithAlt.f23799a, linkTextWithAlt.b));
                } else {
                    it = it2;
                }
                ratingsDistributionWriteReview = new RatingsOverview(d, d2, ctaText, i, str, cta);
            } else {
                it = it2;
                RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails onRatingsAndReviewsRatingDistributionDetails = section.c;
                if (onRatingsAndReviewsRatingDistributionDetails != null) {
                    ArrayList<RatingsAndReviewsRatingsDetails.Item> arrayList3 = onRatingsAndReviewsRatingDistributionDetails.f23800a;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                    for (RatingsAndReviewsRatingsDetails.Item item : arrayList3) {
                        Intrinsics.h(item, "<this>");
                        arrayList4.add(new RatingsDistributionDetails.DistributionItem(item.b, item.f23797a, item.c));
                    }
                    ratingsDistributionWriteReview = new RatingsDistributionDetails(arrayList4);
                } else {
                    RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview onRatingsAndReviewsRatingDistributionWriteReview = section.d;
                    if (onRatingsAndReviewsRatingDistributionWriteReview != null) {
                        RatingsAndReviewsRatingsDetails.Button button = onRatingsAndReviewsRatingDistributionWriteReview.f23802a;
                        String str2 = button.f23794a;
                        String str3 = button.b;
                        boolean z = button.c;
                        RatingsAndReviewsRatingsDetails.ButtonAction buttonAction = button.d;
                        ratingsDistributionWriteReview = new RatingsDistributionWriteReview(new ButtonData(str2, str3, z, buttonAction != null ? new CtaLinkAction(buttonAction.f23795a, buttonAction.b, buttonAction.c) : null));
                    }
                }
            }
            if (ratingsDistributionWriteReview != null) {
                arrayList2.add(ratingsDistributionWriteReview);
            }
        }
        return new RatingsAndReviewsRatingsDetails(arrayList2);
    }
}
