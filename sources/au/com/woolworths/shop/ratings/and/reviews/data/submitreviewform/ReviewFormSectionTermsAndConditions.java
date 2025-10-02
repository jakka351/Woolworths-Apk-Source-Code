package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSectionTermsAndConditions;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewFormSectionTermsAndConditions implements ReviewFormSection {

    /* renamed from: a, reason: collision with root package name */
    public final String f12745a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ReviewFormSectionTermsAndConditions(String str, String str2, boolean z, boolean z2) {
        this.f12745a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static ReviewFormSectionTermsAndConditions a(ReviewFormSectionTermsAndConditions reviewFormSectionTermsAndConditions, boolean z, boolean z2, int i) {
        String str = reviewFormSectionTermsAndConditions.f12745a;
        String str2 = reviewFormSectionTermsAndConditions.b;
        if ((i & 4) != 0) {
            z = reviewFormSectionTermsAndConditions.c;
        }
        if ((i & 8) != 0) {
            z2 = reviewFormSectionTermsAndConditions.d;
        }
        return new ReviewFormSectionTermsAndConditions(str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFormSectionTermsAndConditions)) {
            return false;
        }
        ReviewFormSectionTermsAndConditions reviewFormSectionTermsAndConditions = (ReviewFormSectionTermsAndConditions) obj;
        return Intrinsics.c(this.f12745a, reviewFormSectionTermsAndConditions.f12745a) && Intrinsics.c(this.b, reviewFormSectionTermsAndConditions.b) && this.c == reviewFormSectionTermsAndConditions.c && this.d == reviewFormSectionTermsAndConditions.d;
    }

    public final int hashCode() {
        String str = this.f12745a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + b.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return a.q(YU.a.v("ReviewFormSectionTermsAndConditions(markdownText=", this.f12745a, ", additionalTermsText=", this.b, ", agreedSelection="), this.c, ", isError=", this.d, ")");
    }
}
