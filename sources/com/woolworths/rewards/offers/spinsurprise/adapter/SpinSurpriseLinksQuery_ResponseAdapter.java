package com.woolworths.rewards.offers.spinsurprise.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.spinsurprise.SpinSurpriseLinksQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/adapter/SpinSurpriseLinksQuery_ResponseAdapter;", "", "Data", "SpinSurpriseLinks", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpinSurpriseLinksQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/adapter/SpinSurpriseLinksQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<SpinSurpriseLinksQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21054a = new Data();
        public static final List b = CollectionsKt.Q("spinSurpriseLinks");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            SpinSurpriseLinksQuery.SpinSurpriseLinks spinSurpriseLinks = null;
            while (reader.o2(b) == 0) {
                spinSurpriseLinks = (SpinSurpriseLinksQuery.SpinSurpriseLinks) Adapters.b(Adapters.c(SpinSurpriseLinks.f21055a, false)).fromJson(reader, customScalarAdapters);
            }
            return new SpinSurpriseLinksQuery.Data(spinSurpriseLinks);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpinSurpriseLinksQuery.Data value = (SpinSurpriseLinksQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("spinSurpriseLinks");
            Adapters.b(Adapters.c(SpinSurpriseLinks.f21055a, false)).toJson(writer, customScalarAdapters, value.f21052a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/offers/spinsurprise/adapter/SpinSurpriseLinksQuery_ResponseAdapter$SpinSurpriseLinks;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/offers/spinsurprise/SpinSurpriseLinksQuery$SpinSurpriseLinks;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpinSurpriseLinks implements Adapter<SpinSurpriseLinksQuery.SpinSurpriseLinks> {

        /* renamed from: a, reason: collision with root package name */
        public static final SpinSurpriseLinks f21055a = new SpinSurpriseLinks();
        public static final List b = CollectionsKt.R("initialUrl", "internalUrls");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "initialUrl");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new SpinSurpriseLinksQuery.SpinSurpriseLinks(str, arrayListFromJson);
            }
            Assertions.a(reader, "internalUrls");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            SpinSurpriseLinksQuery.SpinSurpriseLinks value = (SpinSurpriseLinksQuery.SpinSurpriseLinks) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("initialUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21053a);
            writer.F1("internalUrls");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
