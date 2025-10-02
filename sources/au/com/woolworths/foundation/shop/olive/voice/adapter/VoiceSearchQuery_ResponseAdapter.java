package au.com.woolworths.foundation.shop.olive.voice.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/adapter/VoiceSearchQuery_ResponseAdapter;", "", "Data", "VoiceSearch", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VoiceSearchQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/adapter/VoiceSearchQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$Data;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<VoiceSearchQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f8819a = new Data();
        public static final List b = CollectionsKt.Q("voiceSearch");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            VoiceSearchQuery.VoiceSearch voiceSearch = null;
            while (reader.o2(b) == 0) {
                voiceSearch = (VoiceSearchQuery.VoiceSearch) Adapters.b(Adapters.c(VoiceSearch.f8820a, false)).fromJson(reader, customScalarAdapters);
            }
            return new VoiceSearchQuery.Data(voiceSearch);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            VoiceSearchQuery.Data value = (VoiceSearchQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("voiceSearch");
            Adapters.b(Adapters.c(VoiceSearch.f8820a, false)).toJson(writer, customScalarAdapters, value.f8816a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/adapter/VoiceSearchQuery_ResponseAdapter$VoiceSearch;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/foundation/shop/olive/voice/VoiceSearchQuery$VoiceSearch;", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VoiceSearch implements Adapter<VoiceSearchQuery.VoiceSearch> {

        /* renamed from: a, reason: collision with root package name */
        public static final VoiceSearch f8820a = new VoiceSearch();
        public static final List b = CollectionsKt.R(lqlqqlq.m006Dm006Dm006Dm, "selectedChips");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new VoiceSearchQuery.VoiceSearch(str, list);
            }
            Assertions.a(reader, lqlqqlq.m006Dm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            VoiceSearchQuery.VoiceSearch value = (VoiceSearchQuery.VoiceSearch) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.m006Dm006Dm006Dm);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f8817a);
            writer.F1("selectedChips");
            Adapters.b(Adapters.a(adapters$StringAdapter$1)).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
