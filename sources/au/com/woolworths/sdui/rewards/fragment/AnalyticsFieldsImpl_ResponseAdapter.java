package au.com.woolworths.sdui.rewards.fragment;

import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/sdui/rewards/fragment/AnalyticsFieldsImpl_ResponseAdapter;", "", "AnalyticsFields", "ExtraContent", "graphql-fragments-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsFieldsImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/rewards/fragment/AnalyticsFieldsImpl_ResponseAdapter$AnalyticsFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/rewards/fragment/AnalyticsFields;", "graphql-fragments-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnalyticsFields implements Adapter<au.com.woolworths.sdui.rewards.fragment.AnalyticsFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f10022a = CollectionsKt.R("appSection", "screenName", "screenType", "eventAction", "eventCategory", "eventLabel", "eventValue", "eventDescription", "tealiumEvent", "extraContent");

        public static au.com.woolworths.sdui.rewards.fragment.AnalyticsFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            List list = null;
            while (true) {
                switch (reader.o2(f10022a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str8 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str9 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(ExtraContent.f10023a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new au.com.woolworths.sdui.rewards.fragment.AnalyticsFields(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, au.com.woolworths.sdui.rewards.fragment.AnalyticsFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("appSection");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f10020a);
            writer.F1("screenName");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("screenType");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("eventAction");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("eventCategory");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("eventLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("eventValue");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("eventDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("tealiumEvent");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
            writer.F1("extraContent");
            Adapters.b(Adapters.a(Adapters.c(ExtraContent.f10023a, false))).toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (au.com.woolworths.sdui.rewards.fragment.AnalyticsFields) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/rewards/fragment/AnalyticsFieldsImpl_ResponseAdapter$ExtraContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/sdui/rewards/fragment/AnalyticsFields$ExtraContent;", "graphql-fragments-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraContent implements Adapter<AnalyticsFields.ExtraContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraContent f10023a = new ExtraContent();
        public static final List b = CollectionsKt.R("key", "value", "values");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new AnalyticsFields.ExtraContent(str, str2, list);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AnalyticsFields.ExtraContent value = (AnalyticsFields.ExtraContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f10021a);
            writer.F1("value");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("values");
            Adapters.b(Adapters.a(adapters$StringAdapter$1)).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
