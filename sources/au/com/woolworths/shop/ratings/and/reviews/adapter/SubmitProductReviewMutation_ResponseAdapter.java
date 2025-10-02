package au.com.woolworths.shop.ratings.and.reviews.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.ratings.and.reviews.SubmitProductReviewMutation;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/SubmitProductReviewMutation_ResponseAdapter;", "", "Data", "SubmitProductReview", "Error", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubmitProductReviewMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/SubmitProductReviewMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SubmitProductReviewMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12716a = new Data();
        public static final List b = CollectionsKt.Q("submitProductReview");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SubmitProductReviewMutation.SubmitProductReview submitProductReview = null;
            while (reader.o2(b) == 0) {
                submitProductReview = (SubmitProductReviewMutation.SubmitProductReview) Adapters.c(SubmitProductReview.f12718a, false).fromJson(reader, customScalarAdapters);
            }
            if (submitProductReview != null) {
                return new SubmitProductReviewMutation.Data(submitProductReview);
            }
            Assertions.a(reader, "submitProductReview");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitProductReviewMutation.Data value = (SubmitProductReviewMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("submitProductReview");
            Adapters.c(SubmitProductReview.f12718a, false).toJson(writer, customScalarAdapters, value.f12684a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/SubmitProductReviewMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$Error;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements Adapter<SubmitProductReviewMutation.Error> {

        /* renamed from: a, reason: collision with root package name */
        public static final Error f12717a = new Error();
        public static final List b = CollectionsKt.R("code", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "code");
                throw null;
            }
            if (str2 != null) {
                return new SubmitProductReviewMutation.Error(str, str2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitProductReviewMutation.Error value = (SubmitProductReviewMutation.Error) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("code");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12685a);
            writer.F1("message");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/SubmitProductReviewMutation_ResponseAdapter$SubmitProductReview;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/SubmitProductReviewMutation$SubmitProductReview;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubmitProductReview implements Adapter<SubmitProductReviewMutation.SubmitProductReview> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitProductReview f12718a = new SubmitProductReview();
        public static final List b = CollectionsKt.R("success", "message", "error");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            SubmitProductReviewMutation.Error error = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    error = (SubmitProductReviewMutation.Error) Adapters.b(Adapters.c(Error.f12717a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "success");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str != null) {
                return new SubmitProductReviewMutation.SubmitProductReview(zBooleanValue, str, error);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SubmitProductReviewMutation.SubmitProductReview value = (SubmitProductReviewMutation.SubmitProductReview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("success");
            d.B(value.f12686a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("error");
            Adapters.b(Adapters.c(Error.f12717a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
