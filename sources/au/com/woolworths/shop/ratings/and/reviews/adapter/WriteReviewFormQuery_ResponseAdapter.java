package au.com.woolworths.shop.ratings.and.reviews.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.ratings.and.reviews.WriteReviewFormQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter;", "", "Data", "WriteReviewForm", "Section", "OnWriteReviewFormTargetProduct", "Product", "OnWriteReviewFormReview", "Item", "OnWriteReviewFormReviewItemTitle", "OnWriteReviewFormRatings", "OnWriteReviewFormReviewTitle", "OnWriteReviewFormReviewBody", "OnWriteReviewFormNameField", "OnWriteReviewFormTermsConditions", "SubmitButton", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WriteReviewFormQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<WriteReviewFormQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12719a = new Data();
        public static final List b = CollectionsKt.Q("writeReviewForm");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            WriteReviewFormQuery.WriteReviewForm writeReviewForm = null;
            while (reader.o2(b) == 0) {
                writeReviewForm = (WriteReviewFormQuery.WriteReviewForm) Adapters.c(WriteReviewForm.f12732a, false).fromJson(reader, customScalarAdapters);
            }
            if (writeReviewForm != null) {
                return new WriteReviewFormQuery.Data(writeReviewForm);
            }
            Assertions.a(reader, "writeReviewForm");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.Data value = (WriteReviewFormQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("writeReviewForm");
            Adapters.c(WriteReviewForm.f12732a, false).toJson(writer, customScalarAdapters, value.f12688a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Item;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<WriteReviewFormQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f12720a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle onWriteReviewFormReviewItemTitleA;
            WriteReviewFormQuery.OnWriteReviewFormRatings onWriteReviewFormRatingsA;
            WriteReviewFormQuery.OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitleA;
            WriteReviewFormQuery.OnWriteReviewFormReviewBody onWriteReviewFormReviewBodyA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            WriteReviewFormQuery.OnWriteReviewFormNameField onWriteReviewFormNameFieldA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormReviewItemTitle"))) {
                reader.o();
                onWriteReviewFormReviewItemTitleA = OnWriteReviewFormReviewItemTitle.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormReviewItemTitleA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormRatings"))) {
                reader.o();
                onWriteReviewFormRatingsA = OnWriteReviewFormRatings.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormRatingsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormReviewTitle"))) {
                reader.o();
                onWriteReviewFormReviewTitleA = OnWriteReviewFormReviewTitle.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormReviewTitleA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormReviewBody"))) {
                reader.o();
                onWriteReviewFormReviewBodyA = OnWriteReviewFormReviewBody.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormReviewBodyA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormNameField"))) {
                reader.o();
                onWriteReviewFormNameFieldA = OnWriteReviewFormNameField.a(reader, customScalarAdapters);
            }
            return new WriteReviewFormQuery.Item(str, onWriteReviewFormReviewItemTitleA, onWriteReviewFormRatingsA, onWriteReviewFormReviewTitleA, onWriteReviewFormReviewBodyA, onWriteReviewFormNameFieldA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.Item value = (WriteReviewFormQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12689a);
            WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle onWriteReviewFormReviewItemTitle = value.b;
            if (onWriteReviewFormReviewItemTitle != null) {
                OnWriteReviewFormReviewItemTitle.b(writer, customScalarAdapters, onWriteReviewFormReviewItemTitle);
            }
            WriteReviewFormQuery.OnWriteReviewFormRatings onWriteReviewFormRatings = value.c;
            if (onWriteReviewFormRatings != null) {
                OnWriteReviewFormRatings.b(writer, customScalarAdapters, onWriteReviewFormRatings);
            }
            WriteReviewFormQuery.OnWriteReviewFormReviewTitle onWriteReviewFormReviewTitle = value.d;
            if (onWriteReviewFormReviewTitle != null) {
                OnWriteReviewFormReviewTitle.b(writer, customScalarAdapters, onWriteReviewFormReviewTitle);
            }
            WriteReviewFormQuery.OnWriteReviewFormReviewBody onWriteReviewFormReviewBody = value.e;
            if (onWriteReviewFormReviewBody != null) {
                OnWriteReviewFormReviewBody.b(writer, customScalarAdapters, onWriteReviewFormReviewBody);
            }
            WriteReviewFormQuery.OnWriteReviewFormNameField onWriteReviewFormNameField = value.f;
            if (onWriteReviewFormNameField != null) {
                OnWriteReviewFormNameField.b(writer, customScalarAdapters, onWriteReviewFormNameField);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormNameField;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormNameField;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormNameField implements Adapter<WriteReviewFormQuery.OnWriteReviewFormNameField> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12721a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "isOptional", "minCharacterCount", "maxCharacterCount", "helpText", "placeholderText");

        public static WriteReviewFormQuery.OnWriteReviewFormNameField a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f12721a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "isOptional");
                throw null;
            }
            Integer num3 = num;
            boolean zBooleanValue = bool3.booleanValue();
            if (num3 != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormNameField(str, zBooleanValue, num2, num3.intValue(), str2, str3);
            }
            Assertions.a(reader, "maxCharacterCount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormNameField value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12690a);
            writer.F1("isOptional");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "minCharacterCount");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
            writer.F1("maxCharacterCount");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "helpText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("placeholderText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormNameField) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormRatings;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormRatings;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormRatings implements Adapter<WriteReviewFormQuery.OnWriteReviewFormRatings> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12722a = CollectionsKt.Q("title");

        public static WriteReviewFormQuery.OnWriteReviewFormRatings a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12722a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormRatings(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormRatings value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12691a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormRatings) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormReview;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReview;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormReview implements Adapter<WriteReviewFormQuery.OnWriteReviewFormReview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12723a = CollectionsKt.Q("items");

        public static WriteReviewFormQuery.OnWriteReviewFormReview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f12723a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f12720a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormReview(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormReview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f12720a, true)).toJson(writer, customScalarAdapters, value.f12692a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormReview) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormReviewBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewBody;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormReviewBody implements Adapter<WriteReviewFormQuery.OnWriteReviewFormReviewBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12724a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "isOptional", "minCharacterCount", "maxCharacterCount", "helpText", "placeholderText");

        public static WriteReviewFormQuery.OnWriteReviewFormReviewBody a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f12724a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "isOptional");
                throw null;
            }
            Integer num3 = num;
            boolean zBooleanValue = bool3.booleanValue();
            if (num3 != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormReviewBody(str, zBooleanValue, num2, num3.intValue(), str2, str3);
            }
            Assertions.a(reader, "maxCharacterCount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormReviewBody value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12693a);
            writer.F1("isOptional");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "minCharacterCount");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
            writer.F1("maxCharacterCount");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "helpText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("placeholderText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormReviewBody) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormReviewItemTitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewItemTitle;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormReviewItemTitle implements Adapter<WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12725a = CollectionsKt.Q("title");

        public static WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12725a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12694a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormReviewItemTitle) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormReviewTitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormReviewTitle;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormReviewTitle implements Adapter<WriteReviewFormQuery.OnWriteReviewFormReviewTitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12726a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "isOptional", "minCharacterCount", "maxCharacterCount", "helpText", "placeholderText");

        public static WriteReviewFormQuery.OnWriteReviewFormReviewTitle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f12726a);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 == null) {
                Assertions.a(reader, "isOptional");
                throw null;
            }
            Integer num3 = num;
            boolean zBooleanValue = bool3.booleanValue();
            if (num3 != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormReviewTitle(str, zBooleanValue, num2, num3.intValue(), str2, str3);
            }
            Assertions.a(reader, "maxCharacterCount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormReviewTitle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12695a);
            writer.F1("isOptional");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "minCharacterCount");
            Adapters.k.toJson(writer, customScalarAdapters, value.c);
            writer.F1("maxCharacterCount");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "helpText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("placeholderText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormReviewTitle) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormTargetProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormTargetProduct;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormTargetProduct implements Adapter<WriteReviewFormQuery.OnWriteReviewFormTargetProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12727a = CollectionsKt.R("product", "altText");

        public static WriteReviewFormQuery.OnWriteReviewFormTargetProduct a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            WriteReviewFormQuery.Product product = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f12727a);
                if (iO2 == 0) {
                    product = (WriteReviewFormQuery.Product) Adapters.c(Product.f12729a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (product == null) {
                Assertions.a(reader, "product");
                throw null;
            }
            if (str != null) {
                return new WriteReviewFormQuery.OnWriteReviewFormTargetProduct(product, str);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormTargetProduct value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("product");
            Adapters.c(Product.f12729a, false).toJson(writer, customScalarAdapters, value.f12696a);
            writer.F1("altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormTargetProduct) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$OnWriteReviewFormTermsConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$OnWriteReviewFormTermsConditions;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnWriteReviewFormTermsConditions implements Adapter<WriteReviewFormQuery.OnWriteReviewFormTermsConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12728a = CollectionsKt.R("markdownText", "additionalTermsText");

        public static WriteReviewFormQuery.OnWriteReviewFormTermsConditions a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f12728a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new WriteReviewFormQuery.OnWriteReviewFormTermsConditions(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, WriteReviewFormQuery.OnWriteReviewFormTermsConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("markdownText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12697a);
            writer.F1("additionalTermsText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (WriteReviewFormQuery.OnWriteReviewFormTermsConditions) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Product;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<WriteReviewFormQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f12729a = new Product();
        public static final List b = CollectionsKt.R("productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "productImage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (str2 != null) {
                return new WriteReviewFormQuery.Product(str, str2, str3);
            }
            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.Product value = (WriteReviewFormQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12698a);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$Section;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<WriteReviewFormQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f12730a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            WriteReviewFormQuery.OnWriteReviewFormTargetProduct onWriteReviewFormTargetProductA;
            WriteReviewFormQuery.OnWriteReviewFormReview onWriteReviewFormReviewA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            WriteReviewFormQuery.OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditionsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormTargetProduct"))) {
                reader.o();
                onWriteReviewFormTargetProductA = OnWriteReviewFormTargetProduct.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormTargetProductA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormReview"))) {
                reader.o();
                onWriteReviewFormReviewA = OnWriteReviewFormReview.a(reader, customScalarAdapters);
            } else {
                onWriteReviewFormReviewA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("WriteReviewFormTermsConditions"))) {
                reader.o();
                onWriteReviewFormTermsConditionsA = OnWriteReviewFormTermsConditions.a(reader, customScalarAdapters);
            }
            return new WriteReviewFormQuery.Section(str, onWriteReviewFormTargetProductA, onWriteReviewFormReviewA, onWriteReviewFormTermsConditionsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.Section value = (WriteReviewFormQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12699a);
            WriteReviewFormQuery.OnWriteReviewFormTargetProduct onWriteReviewFormTargetProduct = value.b;
            if (onWriteReviewFormTargetProduct != null) {
                OnWriteReviewFormTargetProduct.b(writer, customScalarAdapters, onWriteReviewFormTargetProduct);
            }
            WriteReviewFormQuery.OnWriteReviewFormReview onWriteReviewFormReview = value.c;
            if (onWriteReviewFormReview != null) {
                OnWriteReviewFormReview.b(writer, customScalarAdapters, onWriteReviewFormReview);
            }
            WriteReviewFormQuery.OnWriteReviewFormTermsConditions onWriteReviewFormTermsConditions = value.d;
            if (onWriteReviewFormTermsConditions != null) {
                OnWriteReviewFormTermsConditions.b(writer, customScalarAdapters, onWriteReviewFormTermsConditions);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$SubmitButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$SubmitButton;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubmitButton implements Adapter<WriteReviewFormQuery.SubmitButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitButton f12731a = new SubmitButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new WriteReviewFormQuery.SubmitButton(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.SubmitButton value = (WriteReviewFormQuery.SubmitButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12700a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/WriteReviewFormQuery_ResponseAdapter$WriteReviewForm;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/WriteReviewFormQuery$WriteReviewForm;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WriteReviewForm implements Adapter<WriteReviewFormQuery.WriteReviewForm> {

        /* renamed from: a, reason: collision with root package name */
        public static final WriteReviewForm f12732a = new WriteReviewForm();
        public static final List b = CollectionsKt.R("pageTitle", "sections", "submitButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            WriteReviewFormQuery.SubmitButton submitButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f12730a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    submitButton = (WriteReviewFormQuery.SubmitButton) Adapters.c(SubmitButton.f12731a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "pageTitle");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "sections");
                throw null;
            }
            if (submitButton != null) {
                return new WriteReviewFormQuery.WriteReviewForm(str, arrayListFromJson, submitButton);
            }
            Assertions.a(reader, "submitButton");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            WriteReviewFormQuery.WriteReviewForm value = (WriteReviewFormQuery.WriteReviewForm) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("pageTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12701a);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f12730a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("submitButton");
            Adapters.c(SubmitButton.f12731a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
