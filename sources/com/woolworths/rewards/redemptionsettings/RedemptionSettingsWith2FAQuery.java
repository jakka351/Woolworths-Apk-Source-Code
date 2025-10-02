package com.woolworths.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.adapter.RedemptionSettingsWith2FAQuery_ResponseAdapter;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$Data;", "Data", "RewardsRedemptionSettings", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionSettingsWith2FAQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsRedemptionSettings f21076a;

        public Data(RewardsRedemptionSettings rewardsRedemptionSettings) {
            this.f21076a = rewardsRedemptionSettings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21076a, ((Data) obj).f21076a);
        }

        public final int hashCode() {
            RewardsRedemptionSettings rewardsRedemptionSettings = this.f21076a;
            if (rewardsRedemptionSettings == null) {
                return 0;
            }
            return rewardsRedemptionSettings.hashCode();
        }

        public final String toString() {
            return "Data(rewardsRedemptionSettings=" + this.f21076a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RedemptionSettingsWith2FAQuery$RewardsRedemptionSettings;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsRedemptionSettings {

        /* renamed from: a, reason: collision with root package name */
        public final String f21077a;
        public final RedemptionSettingsListFields b;

        public RewardsRedemptionSettings(String str, RedemptionSettingsListFields redemptionSettingsListFields) {
            this.f21077a = str;
            this.b = redemptionSettingsListFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsRedemptionSettings)) {
                return false;
            }
            RewardsRedemptionSettings rewardsRedemptionSettings = (RewardsRedemptionSettings) obj;
            return Intrinsics.c(this.f21077a, rewardsRedemptionSettings.f21077a) && Intrinsics.c(this.b, rewardsRedemptionSettings.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21077a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardsRedemptionSettings(__typename=" + this.f21077a + ", redemptionSettingsListFields=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RedemptionSettingsWith2FAQuery_ResponseAdapter.Data.f21089a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RedemptionSettingsWith2FA { rewardsRedemptionSettings { __typename ...RedemptionSettingsListFields } }  fragment RedemptionSettingsListFields on RewardsRedemptionSettingsList { twoFactorAuth { stepUpUrl } items { isSelected icon title body confirmationMessages { title message buttonLabel } isChangeEnabled cta { iconUrl cta { label url } } } actions { title items { iconUrl title body actionUrl } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == RedemptionSettingsWith2FAQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(RedemptionSettingsWith2FAQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "ceec467ab86806da8aa98c1f0b435256cfcce8e307643e9524be21a19f3ca8b1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RedemptionSettingsWith2FA";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
