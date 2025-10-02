package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewInputItemBodyField;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewInputItems;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewInputItemBodyField implements ReviewInputItems {

    /* renamed from: a, reason: collision with root package name */
    public final String f12748a;
    public final boolean b;
    public final Integer c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public ReviewInputItemBodyField(String str, boolean z, Integer num, int i, String str2, String str3, String str4, String str5, boolean z2) {
        this.f12748a = str;
        this.b = z;
        this.c = num;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z2;
    }

    public static ReviewInputItemBodyField a(ReviewInputItemBodyField reviewInputItemBodyField, String str, String str2, boolean z, int i) {
        String str3 = reviewInputItemBodyField.f12748a;
        boolean z2 = reviewInputItemBodyField.b;
        Integer num = reviewInputItemBodyField.c;
        int i2 = reviewInputItemBodyField.d;
        String str4 = reviewInputItemBodyField.e;
        String str5 = reviewInputItemBodyField.f;
        if ((i & 64) != 0) {
            str = reviewInputItemBodyField.g;
        }
        String text = str;
        Intrinsics.h(text, "text");
        return new ReviewInputItemBodyField(str3, z2, num, i2, str4, str5, text, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewInputItemBodyField)) {
            return false;
        }
        ReviewInputItemBodyField reviewInputItemBodyField = (ReviewInputItemBodyField) obj;
        return this.f12748a.equals(reviewInputItemBodyField.f12748a) && this.b == reviewInputItemBodyField.b && Intrinsics.c(this.c, reviewInputItemBodyField.c) && this.d == reviewInputItemBodyField.d && Intrinsics.c(this.e, reviewInputItemBodyField.e) && Intrinsics.c(this.f, reviewInputItemBodyField.f) && this.g.equals(reviewInputItemBodyField.g) && Intrinsics.c(this.h, reviewInputItemBodyField.h) && this.i == reviewInputItemBodyField.i;
    }

    public final int hashCode() {
        int iE = b.e(this.f12748a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iA = b.a(this.d, (iE + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iC = b.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        String str3 = this.h;
        return Boolean.hashCode(false) + b.e((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = a.q("ReviewInputItemBodyField(label=", this.f12748a, ", isOptional=", ", minCharacterCount=", this.b);
        sbQ.append(this.c);
        sbQ.append(", maxCharacterCount=");
        sbQ.append(this.d);
        sbQ.append(", helpText=");
        a.B(sbQ, this.e, ", placeholderText=", this.f, ", text=");
        a.B(sbQ, this.g, ", errorText=", this.h, ", isError=");
        return YU.a.k(", singleLine=false)", sbQ, this.i);
    }
}
