package com.woolworths.rewards.redemptionsettings.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.RedemptionSettingsWith2FAQuery;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFieldsImpl_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RedemptionSettingsWith2FAQuery_ResponseAdapter;", "", "Data", "RewardsRedemptionSettings", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionSettingsWith2FAQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RedemptionSettingsWith2FAQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<RedemptionSettingsWith2FAQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21089a = new Data();
        public static final List b = CollectionsKt.Q("rewardsRedemptionSettings");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings rewardsRedemptionSettings = null;
            while (reader.o2(b) == 0) {
                rewardsRedemptionSettings = (RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings) Adapters.b(Adapters.c(RewardsRedemptionSettings.f21090a, true)).fromJson(reader, customScalarAdapters);
            }
            return new RedemptionSettingsWith2FAQuery.Data(rewardsRedemptionSettings);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsWith2FAQuery.Data value = (RedemptionSettingsWith2FAQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rewardsRedemptionSettings");
            Adapters.b(Adapters.c(RewardsRedemptionSettings.f21090a, true)).toJson(writer, customScalarAdapters, value.f21076a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/adapter/RedemptionSettingsWith2FAQuery_ResponseAdapter$RewardsRedemptionSettings;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$RewardsRedemptionSettings;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsRedemptionSettings implements Adapter<RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings> {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsRedemptionSettings f21090a = new RewardsRedemptionSettings();
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
            RedemptionSettingsListFields redemptionSettingsListFieldsA = RedemptionSettingsListFieldsImpl_ResponseAdapter.RedemptionSettingsListFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings(str, redemptionSettingsListFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings value = (RedemptionSettingsWith2FAQuery.RewardsRedemptionSettings) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21077a);
            List list = RedemptionSettingsListFieldsImpl_ResponseAdapter.RedemptionSettingsListFields.f21113a;
            RedemptionSettingsListFieldsImpl_ResponseAdapter.RedemptionSettingsListFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
