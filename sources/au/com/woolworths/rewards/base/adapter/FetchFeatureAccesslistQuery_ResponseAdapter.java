package au.com.woolworths.rewards.base.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.FetchFeatureAccesslistQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/base/adapter/FetchFeatureAccesslistQuery_ResponseAdapter;", "", "Data", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchFeatureAccesslistQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/base/adapter/FetchFeatureAccesslistQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/rewards/base/FetchFeatureAccesslistQuery$Data;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<FetchFeatureAccesslistQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f9354a = new Data();
        public static final List b = CollectionsKt.R("featureAccessList", "allFeaturesInAccessList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "featureAccessList");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new FetchFeatureAccesslistQuery.Data(arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "allFeaturesInAccessList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            FetchFeatureAccesslistQuery.Data value = (FetchFeatureAccesslistQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("featureAccessList");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.f9348a);
            writer.F1("allFeaturesInAccessList");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.b);
        }
    }
}
