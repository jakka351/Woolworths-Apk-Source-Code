package com.woolworths.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.adapter.RewardsSecurePreferenceQuery_ResponseAdapter;
import com.woolworths.rewards.redemptionsettings.fragment.RewardsSecurePreferenceFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$Data;", "Data", "RewardsSecurePreference", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsSecurePreferenceQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsSecurePreference f21078a;

        public Data(RewardsSecurePreference rewardsSecurePreference) {
            this.f21078a = rewardsSecurePreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21078a, ((Data) obj).f21078a);
        }

        public final int hashCode() {
            RewardsSecurePreference rewardsSecurePreference = this.f21078a;
            if (rewardsSecurePreference == null) {
                return 0;
            }
            return rewardsSecurePreference.hashCode();
        }

        public final String toString() {
            return "Data(rewardsSecurePreference=" + this.f21078a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/RewardsSecurePreferenceQuery$RewardsSecurePreference;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsSecurePreference {

        /* renamed from: a, reason: collision with root package name */
        public final String f21079a;
        public final RewardsSecurePreferenceFields b;

        public RewardsSecurePreference(String str, RewardsSecurePreferenceFields rewardsSecurePreferenceFields) {
            this.f21079a = str;
            this.b = rewardsSecurePreferenceFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsSecurePreference)) {
                return false;
            }
            RewardsSecurePreference rewardsSecurePreference = (RewardsSecurePreference) obj;
            return Intrinsics.c(this.f21079a, rewardsSecurePreference.f21079a) && Intrinsics.c(this.b, rewardsSecurePreference.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21079a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardsSecurePreference(__typename=" + this.f21079a + ", rewardsSecurePreferenceFields=" + this.b + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsSecurePreferenceQuery_ResponseAdapter.Data.f21091a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RewardsSecurePreference { rewardsSecurePreference { __typename ...RewardsSecurePreferenceFields } }  fragment RewardsSecurePreferenceFields on RewardsSecurePreference { title summary infoItems { bulletText isEmoji itemTitle markdownDescription } securePreference { title subtitle value id altText analytics { label } iconUrl } loadingState { title label } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == RewardsSecurePreferenceQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(RewardsSecurePreferenceQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "656fda6883b7d61ed02cec4b72d9a6ed691e738fe9f8e5b62b4f471911b7123f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsSecurePreference";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
