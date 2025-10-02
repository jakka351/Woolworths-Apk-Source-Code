package au.com.woolworths.shop.ratings.and.reviews.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/Error;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Error {

    /* renamed from: a, reason: collision with root package name */
    public final String f12733a;
    public final String b;

    public Error(String str, String str2) {
        this.f12733a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return Intrinsics.c(this.f12733a, error.f12733a) && Intrinsics.c(this.b, error.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12733a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("Error(code=", this.f12733a, ", message=", this.b, ")");
    }
}
