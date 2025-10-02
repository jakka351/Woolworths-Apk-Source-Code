package au.com.woolworths.modules.collectionmode.adapter;

import au.com.woolworths.modules.collectionmode.ClearFulfilmentWindowMutation;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ClearFulfilmentWindowMutation_ResponseAdapter;", "", "Data", "ClearFulfilmentWindowState", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClearFulfilmentWindowMutation_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ClearFulfilmentWindowMutation_ResponseAdapter$ClearFulfilmentWindowState;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$ClearFulfilmentWindowState;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearFulfilmentWindowState implements Adapter<ClearFulfilmentWindowMutation.ClearFulfilmentWindowState> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClearFulfilmentWindowState f9121a = new ClearFulfilmentWindowState();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new ClearFulfilmentWindowMutation.ClearFulfilmentWindowState(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ClearFulfilmentWindowMutation.ClearFulfilmentWindowState value = (ClearFulfilmentWindowMutation.ClearFulfilmentWindowState) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f9081a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/modules/collectionmode/adapter/ClearFulfilmentWindowMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/modules/collectionmode/ClearFulfilmentWindowMutation$Data;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ClearFulfilmentWindowMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9122a = new Data();
        public static final List b = CollectionsKt.Q("clearFulfilmentWindowState");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ClearFulfilmentWindowMutation.ClearFulfilmentWindowState clearFulfilmentWindowState = null;
            while (reader.o2(b) == 0) {
                clearFulfilmentWindowState = (ClearFulfilmentWindowMutation.ClearFulfilmentWindowState) Adapters.b(Adapters.c(ClearFulfilmentWindowState.f9121a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ClearFulfilmentWindowMutation.Data(clearFulfilmentWindowState);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ClearFulfilmentWindowMutation.Data value = (ClearFulfilmentWindowMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("clearFulfilmentWindowState");
            Adapters.b(Adapters.c(ClearFulfilmentWindowState.f9121a, false)).toJson(writer, customScalarAdapters, value.f9082a);
        }
    }
}
