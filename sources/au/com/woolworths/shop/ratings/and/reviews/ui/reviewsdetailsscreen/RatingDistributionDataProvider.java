package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.shop.ratingsandreviews.data.CtaText;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsOverview;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ui/reviewsdetailsscreen/RatingDistributionDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsRatingsDetails;", "TestCase", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingDistributionDataProvider implements PreviewParameterProvider<RatingsAndReviewsRatingsDetails> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ui/reviewsdetailsscreen/RatingDistributionDataProvider$TestCase;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TestCase {
        public static final /* synthetic */ TestCase[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            CollectionsKt.R(new RatingsOverview(4.3d, 4.5d, new CtaText("4.3", "4.3 out of 5"), 5, "48 reviews", null), new RatingsDistributionDetails(CollectionsKt.R(new RatingsDistributionDetails.DistributionItem(75.0d, "5", "30"), new RatingsDistributionDetails.DistributionItem(20.0d, "4", "5"), new RatingsDistributionDetails.DistributionItem(20.0d, "3", "5"), new RatingsDistributionDetails.DistributionItem(0.0d, "2", "0"), new RatingsDistributionDetails.DistributionItem(5.0d, "1", "1"))));
            TestCase testCase = new TestCase("Default", 0);
            CollectionsKt.Q(new RatingsOverview(3.1d, 3.0d, new CtaText("3.1", "4.3 out of 5"), 5, "3 reviews", null));
            TestCase[] testCaseArr = {testCase, new TestCase("LESS_REVIEWS", 1)};
            d = testCaseArr;
            e = EnumEntriesKt.a(testCaseArr);
        }

        public static TestCase valueOf(String str) {
            return (TestCase) Enum.valueOf(TestCase.class, str);
        }

        public static TestCase[] values() {
            return (TestCase[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
