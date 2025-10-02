package fragment;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import fragment.RatingsAndReviewsReviewDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter;", "", "RatingsAndReviewsReviewDetails", "Item", "Section", "OnRatingsAndReviewsReviewItemRating", "OnRatingsAndReviewsReviewItemReviewTitle", "OnRatingsAndReviewsReviewItemRecommendation", "OnRatingsAndReviewsReviewItemInfo", "OnRatingsAndReviewsReviewItemBody", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsReviewDetailsImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$Item;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<RatingsAndReviewsReviewDetails.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23825a = new Item();
        public static final List b = CollectionsKt.Q("sections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.f23832a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new RatingsAndReviewsReviewDetails.Item(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsReviewDetails.Item value = (RatingsAndReviewsReviewDetails.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f23832a, true)).toJson(writer, customScalarAdapters, value.f23818a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$OnRatingsAndReviewsReviewItemBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemBody;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemBody implements Adapter<RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23826a = CollectionsKt.Q("content");

        public static RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23826a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23819a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$OnRatingsAndReviewsReviewItemInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemInfo;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemInfo implements Adapter<RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23827a = CollectionsKt.R("userName", "createdAt");

        public static RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23827a);
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
                Assertions.a(reader, "userName");
                throw null;
            }
            if (str2 != null) {
                return new RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo(str, str2);
            }
            Assertions.a(reader, "createdAt");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("userName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23820a);
            writer.F1("createdAt");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$OnRatingsAndReviewsReviewItemRating;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemRating;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemRating implements Adapter<RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23828a = CollectionsKt.R("rating", "maximumRating", TextBundle.TEXT_ENTRY);

        public static RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f23828a);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "rating");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating(iIntValue, num2.intValue(), str);
            }
            Assertions.a(reader, "maximumRating");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rating");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f23821a, adapters$IntAdapter$1, writer, customScalarAdapters, "maximumRating");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$OnRatingsAndReviewsReviewItemRecommendation;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemRecommendation;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemRecommendation implements Adapter<RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23829a = CollectionsKt.Q("recommendationText");

        public static RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23829a) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation value = (RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recommendationText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23822a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$OnRatingsAndReviewsReviewItemReviewTitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$OnRatingsAndReviewsReviewItemReviewTitle;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemReviewTitle implements Adapter<RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23830a = CollectionsKt.Q("title");

        public static RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23830a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23823a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$RatingsAndReviewsReviewDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviewsReviewDetails implements Adapter<fragment.RatingsAndReviewsReviewDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23831a = CollectionsKt.Q("items");

        public static fragment.RatingsAndReviewsReviewDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23831a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f23825a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new fragment.RatingsAndReviewsReviewDetails(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, fragment.RatingsAndReviewsReviewDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f23825a, false)).toJson(writer, customScalarAdapters, value.f23817a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (fragment.RatingsAndReviewsReviewDetails) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsReviewDetailsImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsReviewDetails$Section;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<RatingsAndReviewsReviewDetails.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f23832a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRatingA;
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitleA;
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendationA;
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfoA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBodyA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemRating"))) {
                reader.o();
                onRatingsAndReviewsReviewItemRatingA = OnRatingsAndReviewsReviewItemRating.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemRatingA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemReviewTitle"))) {
                reader.o();
                onRatingsAndReviewsReviewItemReviewTitleA = OnRatingsAndReviewsReviewItemReviewTitle.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemReviewTitleA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemRecommendation"))) {
                reader.o();
                onRatingsAndReviewsReviewItemRecommendationA = OnRatingsAndReviewsReviewItemRecommendation.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemRecommendationA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemInfo"))) {
                reader.o();
                onRatingsAndReviewsReviewItemInfoA = OnRatingsAndReviewsReviewItemInfo.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemInfoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemBody"))) {
                reader.o();
                onRatingsAndReviewsReviewItemBodyA = OnRatingsAndReviewsReviewItemBody.a(reader, customScalarAdapters);
            }
            return new RatingsAndReviewsReviewDetails.Section(str, onRatingsAndReviewsReviewItemRatingA, onRatingsAndReviewsReviewItemReviewTitleA, onRatingsAndReviewsReviewItemRecommendationA, onRatingsAndReviewsReviewItemInfoA, onRatingsAndReviewsReviewItemBodyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsReviewDetails.Section value = (RatingsAndReviewsReviewDetails.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23824a);
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = value.b;
            if (onRatingsAndReviewsReviewItemRating != null) {
                OnRatingsAndReviewsReviewItemRating.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemRating);
            }
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = value.c;
            if (onRatingsAndReviewsReviewItemReviewTitle != null) {
                OnRatingsAndReviewsReviewItemReviewTitle.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemReviewTitle);
            }
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = value.d;
            if (onRatingsAndReviewsReviewItemRecommendation != null) {
                List list = OnRatingsAndReviewsReviewItemRecommendation.f23829a;
                writer.F1("recommendationText");
                Adapters.i.toJson(writer, customScalarAdapters, onRatingsAndReviewsReviewItemRecommendation.f23822a);
            }
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = value.e;
            if (onRatingsAndReviewsReviewItemInfo != null) {
                OnRatingsAndReviewsReviewItemInfo.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemInfo);
            }
            RatingsAndReviewsReviewDetails.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = value.f;
            if (onRatingsAndReviewsReviewItemBody != null) {
                OnRatingsAndReviewsReviewItemBody.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemBody);
            }
        }
    }
}
