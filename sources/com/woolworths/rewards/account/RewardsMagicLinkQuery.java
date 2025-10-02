package com.woolworths.rewards.account;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.adapter.RewardsMagicLinkParameterInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.RewardsMagicLinkQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/RewardsMagicLinkQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$Data;", "Data", "RewardsMagicLink", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsMagicLinkQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20563a;
    public final Optional b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsMagicLink f20564a;

        public Data(RewardsMagicLink rewardsMagicLink) {
            this.f20564a = rewardsMagicLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20564a, ((Data) obj).f20564a);
        }

        public final int hashCode() {
            RewardsMagicLink rewardsMagicLink = this.f20564a;
            if (rewardsMagicLink == null) {
                return 0;
            }
            return rewardsMagicLink.hashCode();
        }

        public final String toString() {
            return "Data(rewardsMagicLink=" + this.f20564a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/RewardsMagicLinkQuery$RewardsMagicLink;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsMagicLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f20565a;
        public final String b;

        public RewardsMagicLink(String str, String str2) {
            this.f20565a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsMagicLink)) {
                return false;
            }
            RewardsMagicLink rewardsMagicLink = (RewardsMagicLink) obj;
            return Intrinsics.c(this.f20565a, rewardsMagicLink.f20565a) && Intrinsics.c(this.b, rewardsMagicLink.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20565a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RewardsMagicLink(url=", this.f20565a, ", label=", this.b, ")");
        }
    }

    public RewardsMagicLinkQuery(Optional optional, String page) {
        Intrinsics.h(page, "page");
        this.f20563a = page;
        this.b = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsMagicLinkQuery_ResponseAdapter.Data.f20636a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RewardsMagicLink($page: String!, $parameters: [RewardsMagicLinkParameterInput]) { rewardsMagicLink(page: $page, parameters: $parameters) { url label } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsMagicLinkQuery)) {
            return false;
        }
        RewardsMagicLinkQuery rewardsMagicLinkQuery = (RewardsMagicLinkQuery) obj;
        return Intrinsics.c(this.f20563a, rewardsMagicLinkQuery.f20563a) && Intrinsics.c(this.b, rewardsMagicLinkQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20563a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a2b0a0460c8d67bf7f469d185c5192661415fd8c31128501aa0f23de9f44afaa";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsMagicLink";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("page");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20563a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("parameters");
            Adapters.d(Adapters.b(Adapters.a(Adapters.b(Adapters.c(RewardsMagicLinkParameterInput_InputAdapter.f9961a, false))))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "RewardsMagicLinkQuery(page=" + this.f20563a + ", parameters=" + this.b + ")";
    }
}
