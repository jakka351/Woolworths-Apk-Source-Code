package com.woolworths.rewards.redemptionsettings.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.RewardsSecurePreferenceQuery;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFieldsImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RewardsSecurePreferenceQuery_ResponseAdapter;", "", "Data", "RewardsSecurePreference", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsSecurePreferenceQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RewardsSecurePreferenceQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RewardsSecurePreferenceQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21091a = new Data();
        public static final List b = CollectionsKt.Q("rewardsSecurePreference");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RewardsSecurePreferenceQuery.RewardsSecurePreference rewardsSecurePreference = null;
            while (reader.o2(b) == 0) {
                rewardsSecurePreference = (RewardsSecurePreferenceQuery.RewardsSecurePreference) Adapters.b(Adapters.c(RewardsSecurePreference.f21092a, true)).fromJson(reader, customScalarAdapters);
            }
            return new RewardsSecurePreferenceQuery.Data(rewardsSecurePreference);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceQuery.Data value = (RewardsSecurePreferenceQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsSecurePreference");
            Adapters.b(Adapters.c(RewardsSecurePreference.f21092a, true)).toJson(writer, customScalarAdapters, value.f21078a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RewardsSecurePreferenceQuery_ResponseAdapter$RewardsSecurePreference;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$RewardsSecurePreference;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSecurePreference implements Adapter<RewardsSecurePreferenceQuery.RewardsSecurePreference> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsSecurePreference f21092a = new RewardsSecurePreference();
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
            RewardsSecurePreferenceFields rewardsSecurePreferenceFieldsA = RewardsSecurePreferenceFieldsImpl_ResponseAdapter.RewardsSecurePreferenceFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new RewardsSecurePreferenceQuery.RewardsSecurePreference(str, rewardsSecurePreferenceFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RewardsSecurePreferenceQuery.RewardsSecurePreference value = (RewardsSecurePreferenceQuery.RewardsSecurePreference) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21079a);
            List list = RewardsSecurePreferenceFieldsImpl_ResponseAdapter.RewardsSecurePreferenceFields.f21123a;
            RewardsSecurePreferenceFieldsImpl_ResponseAdapter.RewardsSecurePreferenceFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
