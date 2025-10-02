package com.woolworths.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.adapter.SetRewardsSecurePreferenceMutation_ResponseAdapter;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SetRewardsSecurePreferenceMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/redemptionsettings/SetRewardsSecurePreferenceMutation$Data;", "Data", "SetRewardsSecurePreference", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SetRewardsSecurePreferenceMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21083a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SetRewardsSecurePreferenceMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SetRewardsSecurePreferenceMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SetRewardsSecurePreference f21084a;

        public Data(SetRewardsSecurePreference setRewardsSecurePreference) {
            this.f21084a = setRewardsSecurePreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21084a, ((Data) obj).f21084a);
        }

        public final int hashCode() {
            SetRewardsSecurePreference setRewardsSecurePreference = this.f21084a;
            if (setRewardsSecurePreference == null) {
                return 0;
            }
            return setRewardsSecurePreference.hashCode();
        }

        public final String toString() {
            return "Data(setRewardsSecurePreference=" + this.f21084a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SetRewardsSecurePreferenceMutation$SetRewardsSecurePreference;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetRewardsSecurePreference {

        /* renamed from: a, reason: collision with root package name */
        public final String f21085a;
        public final RewardsSecurePreferenceFields b;

        public SetRewardsSecurePreference(String str, RewardsSecurePreferenceFields rewardsSecurePreferenceFields) {
            this.f21085a = str;
            this.b = rewardsSecurePreferenceFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetRewardsSecurePreference)) {
                return false;
            }
            SetRewardsSecurePreference setRewardsSecurePreference = (SetRewardsSecurePreference) obj;
            return Intrinsics.c(this.f21085a, setRewardsSecurePreference.f21085a) && Intrinsics.c(this.b, setRewardsSecurePreference.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21085a.hashCode() * 31);
        }

        public final String toString() {
            return "SetRewardsSecurePreference(__typename=" + this.f21085a + ", rewardsSecurePreferenceFields=" + this.b + ")";
        }
    }

    public SetRewardsSecurePreferenceMutation(boolean z) {
        this.f21083a = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SetRewardsSecurePreferenceMutation_ResponseAdapter.Data.f21095a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SetRewardsSecurePreference($optIn: Boolean!) { setRewardsSecurePreference(optIn: $optIn) { __typename ...RewardsSecurePreferenceFields } }  fragment RewardsSecurePreferenceFields on RewardsSecurePreference { title summary infoItems { bulletText isEmoji itemTitle markdownDescription } securePreference { title subtitle value id altText analytics { label } iconUrl } loadingState { title label } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetRewardsSecurePreferenceMutation) && this.f21083a == ((SetRewardsSecurePreferenceMutation) obj).f21083a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21083a);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a25c906dd4e5815bdd91efc04df3ea3c360bb64f32073c34d62a594d49ec2cd3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SetRewardsSecurePreference";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("optIn");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f21083a));
    }

    public final String toString() {
        return a.n("SetRewardsSecurePreferenceMutation(optIn=", ")", this.f21083a);
    }
}
