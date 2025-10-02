package com.woolworths.rewards.offers.fragment.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFields;
import au.com.woolworths.sdui.rewards.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFieldsImpl_ResponseAdapter;", "", "ContentCtaFields", "OnCtaClickAnalytics", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCtaFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFieldsImpl_ResponseAdapter$ContentCtaFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFields;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCtaFields implements Adapter<com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20976a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url", "isExternalUrl", "onCtaClickAnalytics");

        public static com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            ContentCtaFields.OnCtaClickAnalytics onCtaClickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f20976a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    onCtaClickAnalytics = (ContentCtaFields.OnCtaClickAnalytics) Adapters.b(Adapters.c(OnCtaClickAnalytics.f20977a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields(str, str2, bool, onCtaClickAnalytics);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20974a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isExternalUrl");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("onCtaClickAnalytics");
            Adapters.b(Adapters.c(OnCtaClickAnalytics.f20977a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFieldsImpl_ResponseAdapter$OnCtaClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/fragment/fragment/ContentCtaFields$OnCtaClickAnalytics;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCtaClickAnalytics implements Adapter<ContentCtaFields.OnCtaClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnCtaClickAnalytics f20977a = new OnCtaClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ContentCtaFields.OnCtaClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ContentCtaFields.OnCtaClickAnalytics value = (ContentCtaFields.OnCtaClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20975a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10022a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
