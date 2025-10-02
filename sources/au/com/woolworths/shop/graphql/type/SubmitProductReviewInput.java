package au.com.woolworths.shop.graphql.type;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/SubmitProductReviewInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubmitProductReviewInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11941a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public SubmitProductReviewInput(String productId, double d, String title, String reviewText, String userNickname, boolean z) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(title, "title");
        Intrinsics.h(reviewText, "reviewText");
        Intrinsics.h(userNickname, "userNickname");
        this.f11941a = productId;
        this.b = d;
        this.c = title;
        this.d = reviewText;
        this.e = userNickname;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitProductReviewInput)) {
            return false;
        }
        SubmitProductReviewInput submitProductReviewInput = (SubmitProductReviewInput) obj;
        return Intrinsics.c(this.f11941a, submitProductReviewInput.f11941a) && Double.compare(this.b, submitProductReviewInput.b) == 0 && Intrinsics.c(this.c, submitProductReviewInput.c) && Intrinsics.c(this.d, submitProductReviewInput.d) && Intrinsics.c(this.e, submitProductReviewInput.e) && this.f == submitProductReviewInput.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + b.c(b.c(b.c(a.a(this.b, this.f11941a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "SubmitProductReviewInput(productId=", this.f11941a, ", rating=");
        androidx.constraintlayout.core.state.a.B(sbR, ", title=", this.c, ", reviewText=", this.d);
        sbR.append(", userNickname=");
        sbR.append(this.e);
        sbR.append(", agreedToTermsAndConditions=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
