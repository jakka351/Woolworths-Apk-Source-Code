package com.woolworths.rewards.redemptionsettings;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.adapter.UpdateRewardsRedemptionPreferenceMutation_ResponseAdapter;
import com.woolworths.rewards.redemptionsettings.fragment.RedemptionSettingsListFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/UpdateRewardsRedemptionPreferenceMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/redemptionsettings/UpdateRewardsRedemptionPreferenceMutation$Data;", "Data", "UpdateRewardsRedemptionPreference", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateRewardsRedemptionPreferenceMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21086a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/UpdateRewardsRedemptionPreferenceMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/UpdateRewardsRedemptionPreferenceMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateRewardsRedemptionPreference f21087a;

        public Data(UpdateRewardsRedemptionPreference updateRewardsRedemptionPreference) {
            this.f21087a = updateRewardsRedemptionPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21087a, ((Data) obj).f21087a);
        }

        public final int hashCode() {
            UpdateRewardsRedemptionPreference updateRewardsRedemptionPreference = this.f21087a;
            if (updateRewardsRedemptionPreference == null) {
                return 0;
            }
            return updateRewardsRedemptionPreference.hashCode();
        }

        public final String toString() {
            return "Data(updateRewardsRedemptionPreference=" + this.f21087a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/UpdateRewardsRedemptionPreferenceMutation$UpdateRewardsRedemptionPreference;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateRewardsRedemptionPreference {

        /* renamed from: a, reason: collision with root package name */
        public final String f21088a;
        public final RedemptionSettingsListFields b;

        public UpdateRewardsRedemptionPreference(String str, RedemptionSettingsListFields redemptionSettingsListFields) {
            this.f21088a = str;
            this.b = redemptionSettingsListFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateRewardsRedemptionPreference)) {
                return false;
            }
            UpdateRewardsRedemptionPreference updateRewardsRedemptionPreference = (UpdateRewardsRedemptionPreference) obj;
            return Intrinsics.c(this.f21088a, updateRewardsRedemptionPreference.f21088a) && Intrinsics.c(this.b, updateRewardsRedemptionPreference.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21088a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateRewardsRedemptionPreference(__typename=" + this.f21088a + ", redemptionSettingsListFields=" + this.b + ")";
        }
    }

    public UpdateRewardsRedemptionPreferenceMutation(String preference) {
        Intrinsics.h(preference, "preference");
        this.f21086a = preference;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateRewardsRedemptionPreferenceMutation_ResponseAdapter.Data.f21097a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UpdateRewardsRedemptionPreference($preference: String!) { updateRewardsRedemptionPreference(preference: $preference) { __typename ...RedemptionSettingsListFields } }  fragment RedemptionSettingsListFields on RewardsRedemptionSettingsList { twoFactorAuth { stepUpUrl } items { isSelected icon title body confirmationMessages { title message buttonLabel } isChangeEnabled cta { iconUrl cta { label url } } } actions { title items { iconUrl title body actionUrl } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateRewardsRedemptionPreferenceMutation) && Intrinsics.c(this.f21086a, ((UpdateRewardsRedemptionPreferenceMutation) obj).f21086a);
    }

    public final int hashCode() {
        return this.f21086a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "d5d6049866981998f2924b4928c6902d011bbb99d47855019e66ebd3da77f15b";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UpdateRewardsRedemptionPreference";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("preference");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f21086a);
    }

    public final String toString() {
        return a.h("UpdateRewardsRedemptionPreferenceMutation(preference=", this.f21086a, ")");
    }
}
