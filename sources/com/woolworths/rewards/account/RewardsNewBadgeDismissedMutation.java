package com.woolworths.rewards.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsNewBadgeMenuType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.RewardsNewBadgeDismissedMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/rewards/account/RewardsNewBadgeDismissedMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/account/RewardsNewBadgeDismissedMutation$Data;", "Data", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsNewBadgeDismissedMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20566a;
    public final Optional b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/RewardsNewBadgeDismissedMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/RewardsNewBadgeDismissedMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f20567a;

        public Data(Boolean bool) {
            this.f20567a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20567a, ((Data) obj).f20567a);
        }

        public final int hashCode() {
            Boolean bool = this.f20567a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f20567a, "Data(rewardsNewBadgeDismissed=", ")");
        }
    }

    public RewardsNewBadgeDismissedMutation(Optional optional, String menuId) {
        Intrinsics.h(menuId, "menuId");
        this.f20566a = menuId;
        this.b = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsNewBadgeDismissedMutation_ResponseAdapter.Data.f20638a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RewardsNewBadgeDismissed($menuId: ID!, $menuType: RewardsNewBadgeMenuType) { rewardsNewBadgeDismissed(menuId: $menuId, menuType: $menuType) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsNewBadgeDismissedMutation)) {
            return false;
        }
        RewardsNewBadgeDismissedMutation rewardsNewBadgeDismissedMutation = (RewardsNewBadgeDismissedMutation) obj;
        return Intrinsics.c(this.f20566a, rewardsNewBadgeDismissedMutation.f20566a) && Intrinsics.c(this.b, rewardsNewBadgeDismissedMutation.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20566a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a99609d74176486161269effb312467e9c350103784dc88b84db061adc6601bf";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsNewBadgeDismissed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("menuId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20566a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("menuType");
            Adapters.d(Adapters.b(RewardsNewBadgeMenuType_ResponseAdapter.f9962a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "RewardsNewBadgeDismissedMutation(menuId=" + this.f20566a + ", menuType=" + this.b + ")";
    }
}
