package au.com.woolworths.shop.ratings.and.reviews.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/SubmitReviewResponse;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubmitReviewResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12734a;
    public final String b;
    public final Error c;

    public SubmitReviewResponse(boolean z, String str, Error error) {
        this.f12734a = z;
        this.b = str;
        this.c = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitReviewResponse)) {
            return false;
        }
        SubmitReviewResponse submitReviewResponse = (SubmitReviewResponse) obj;
        return this.f12734a == submitReviewResponse.f12734a && Intrinsics.c(this.b, submitReviewResponse.b) && Intrinsics.c(this.c, submitReviewResponse.c);
    }

    public final int hashCode() {
        int iC = b.c(Boolean.hashCode(this.f12734a) * 31, 31, this.b);
        Error error = this.c;
        return iC + (error == null ? 0 : error.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = a.t("SubmitReviewResponse(success=", ", message=", this.b, ", error=", this.f12734a);
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
