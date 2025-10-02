package com.woolworths.rewards.offers.fragment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/StandardBannerFieldsImpl_ResponseAdapter;", "", "StandardBannerFields", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandardBannerFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/StandardBannerFieldsImpl_ResponseAdapter$StandardBannerFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/StandardBannerFields;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StandardBannerFields implements Adapter<com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21035a = CollectionsKt.R("bannerId", "bannerTitle", "bannerImageUrl", "bannerDescription", "bannerActionUrl", "bannerActionLabel", "bannerActionAccessibilityHint");

        public static com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f21035a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                    default:
                        if (str == null) {
                            Assertions.a(reader, "bannerId");
                            throw null;
                        }
                        if (str2 != null) {
                            return new com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields(str, str2, str3, str4, str5, str6, str7);
                        }
                        Assertions.a(reader, "bannerTitle");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21034a);
            writer.F1("bannerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerImageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerActionUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("bannerActionLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("bannerActionAccessibilityHint");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields) obj);
        }
    }
}
