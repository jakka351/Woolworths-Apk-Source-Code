package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRating;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRating {

    /* renamed from: a, reason: collision with root package name */
    public final String f7754a;
    public final DriverRatingStarsSurvey b;
    public final DriverRatingFeedbackAndComments c;
    public final DriverRatingThankYou d;
    public final String e;

    public DriverRating(String str, DriverRatingStarsSurvey driverRatingStarsSurvey, DriverRatingFeedbackAndComments driverRatingFeedbackAndComments, DriverRatingThankYou driverRatingThankYou, String str2) {
        this.f7754a = str;
        this.b = driverRatingStarsSurvey;
        this.c = driverRatingFeedbackAndComments;
        this.d = driverRatingThankYou;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRating)) {
            return false;
        }
        DriverRating driverRating = (DriverRating) obj;
        return Intrinsics.c(this.f7754a, driverRating.f7754a) && Intrinsics.c(this.b, driverRating.b) && Intrinsics.c(this.c, driverRating.c) && Intrinsics.c(this.d, driverRating.d) && Intrinsics.c(this.e, driverRating.e);
    }

    public final int hashCode() {
        int iHashCode = this.f7754a.hashCode() * 31;
        DriverRatingStarsSurvey driverRatingStarsSurvey = this.b;
        int iHashCode2 = (iHashCode + (driverRatingStarsSurvey == null ? 0 : driverRatingStarsSurvey.hashCode())) * 31;
        DriverRatingFeedbackAndComments driverRatingFeedbackAndComments = this.c;
        int iHashCode3 = (iHashCode2 + (driverRatingFeedbackAndComments == null ? 0 : driverRatingFeedbackAndComments.hashCode())) * 31;
        DriverRatingThankYou driverRatingThankYou = this.d;
        return this.e.hashCode() + ((iHashCode3 + (driverRatingThankYou != null ? driverRatingThankYou.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriverRating(surveyId=");
        sb.append(this.f7754a);
        sb.append(", starsRatingStep=");
        sb.append(this.b);
        sb.append(", feedbackAndCommentsStep=");
        sb.append(this.c);
        sb.append(", thankYouStep=");
        sb.append(this.d);
        sb.append(", orderNumber=");
        return a.o(sb, this.e, ")");
    }
}
