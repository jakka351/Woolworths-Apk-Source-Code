package au.com.woolworths.shop.ratings.and.reviews;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.SubmitProductReviewInput;
import au.com.woolworths.shop.graphql.type.adapter.SubmitProductReviewInput_InputAdapter;
import au.com.woolworths.shop.ratings.and.reviews.adapter.SubmitProductReviewMutation_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Data;", "Data", "SubmitProductReview", "Error", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubmitProductReviewMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final SubmitProductReviewInput f12683a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SubmitProductReview f12684a;

        public Data(SubmitProductReview submitProductReview) {
            this.f12684a = submitProductReview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12684a, ((Data) obj).f12684a);
        }

        public final int hashCode() {
            return this.f12684a.hashCode();
        }

        public final String toString() {
            return "Data(submitProductReview=" + this.f12684a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Error;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final String f12685a;
        public final String b;

        public Error(String str, String str2) {
            this.f12685a = str;
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
            return Intrinsics.c(this.f12685a, error.f12685a) && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12685a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Error(code=", this.f12685a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$SubmitProductReview;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubmitProductReview {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12686a;
        public final String b;
        public final Error c;

        public SubmitProductReview(boolean z, String str, Error error) {
            this.f12686a = z;
            this.b = str;
            this.c = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitProductReview)) {
                return false;
            }
            SubmitProductReview submitProductReview = (SubmitProductReview) obj;
            return this.f12686a == submitProductReview.f12686a && Intrinsics.c(this.b, submitProductReview.b) && Intrinsics.c(this.c, submitProductReview.c);
        }

        public final int hashCode() {
            int iC = b.c(Boolean.hashCode(this.f12686a) * 31, 31, this.b);
            Error error = this.c;
            return iC + (error == null ? 0 : error.hashCode());
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("SubmitProductReview(success=", ", message=", this.b, ", error=", this.f12686a);
            sbT.append(this.c);
            sbT.append(")");
            return sbT.toString();
        }
    }

    public SubmitProductReviewMutation(SubmitProductReviewInput submitProductReviewInput) {
        Intrinsics.h(submitProductReviewInput, "submitProductReviewInput");
        this.f12683a = submitProductReviewInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SubmitProductReviewMutation_ResponseAdapter.Data.f12716a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation submitProductReview($submitProductReviewInput: SubmitProductReviewInput!) { submitProductReview(submitProductReviewInput: $submitProductReviewInput) { success message error { code message } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitProductReviewMutation) && Intrinsics.c(this.f12683a, ((SubmitProductReviewMutation) obj).f12683a);
    }

    public final int hashCode() {
        return this.f12683a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "32c69059fbbafc2d266b6bc25c25e24dbc81286b8f9962755d5d142745a5ff85";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "submitProductReview";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("submitProductReviewInput");
        Adapters.c(SubmitProductReviewInput_InputAdapter.f12122a, false).toJson(jsonWriter, customScalarAdapters, this.f12683a);
    }

    public final String toString() {
        return "SubmitProductReviewMutation(submitProductReviewInput=" + this.f12683a + ")";
    }
}
