package fragment;

import YU.a;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/RatingsAndReviewsPreviewHeader;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RatingsAndReviewsPreviewHeader implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f23791a;
    public final String b;

    public RatingsAndReviewsPreviewHeader(String str, String str2) {
        this.f23791a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingsAndReviewsPreviewHeader)) {
            return false;
        }
        RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader = (RatingsAndReviewsPreviewHeader) obj;
        return Intrinsics.c(this.f23791a, ratingsAndReviewsPreviewHeader.f23791a) && Intrinsics.c(this.b, ratingsAndReviewsPreviewHeader.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23791a.hashCode() * 31);
    }

    public final String toString() {
        return a.j("RatingsAndReviewsPreviewHeader(title=", this.f23791a, ", subtitle=", this.b, ")");
    }
}
