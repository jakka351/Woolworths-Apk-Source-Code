package com.woolworths.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.RewardsBannerDismissedMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/rewards/offers/RewardsBannerDismissedMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/offers/RewardsBannerDismissedMutation$Data;", "Data", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsBannerDismissedMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20736a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/RewardsBannerDismissedMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/RewardsBannerDismissedMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f20737a;

        public Data(Boolean bool) {
            this.f20737a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20737a, ((Data) obj).f20737a);
        }

        public final int hashCode() {
            Boolean bool = this.f20737a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f20737a, "Data(rewardsBannerDismissed=", ")");
        }
    }

    public RewardsBannerDismissedMutation(String str) {
        this.f20736a = str;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsBannerDismissedMutation_ResponseAdapter.Data.f20773a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RewardsBannerDismissed($bannerId: ID!) { rewardsBannerDismissed(id: $bannerId) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsBannerDismissedMutation) && Intrinsics.c(this.f20736a, ((RewardsBannerDismissedMutation) obj).f20736a);
    }

    public final int hashCode() {
        return this.f20736a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a8bb84e5403bc556419d0c0f38547b3a489aed51fd4c0e1a01091660b5b00fdf";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsBannerDismissed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("bannerId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20736a);
    }

    public final String toString() {
        return YU.a.h("RewardsBannerDismissedMutation(bannerId=", this.f20736a, ")");
    }
}
