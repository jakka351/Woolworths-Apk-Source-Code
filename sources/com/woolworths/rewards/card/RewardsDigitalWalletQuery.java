package com.woolworths.rewards.card;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.card.adapter.RewardsDigitalWalletQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$Data;", "Data", "RewardsDigitalWalletToken", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsDigitalWalletQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsDigitalWalletToken f20667a;

        public Data(RewardsDigitalWalletToken rewardsDigitalWalletToken) {
            this.f20667a = rewardsDigitalWalletToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20667a, ((Data) obj).f20667a);
        }

        public final int hashCode() {
            RewardsDigitalWalletToken rewardsDigitalWalletToken = this.f20667a;
            if (rewardsDigitalWalletToken == null) {
                return 0;
            }
            return rewardsDigitalWalletToken.f20668a.hashCode();
        }

        public final String toString() {
            return "Data(rewardsDigitalWalletToken=" + this.f20667a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsDigitalWalletQuery$RewardsDigitalWalletToken;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsDigitalWalletToken {

        /* renamed from: a, reason: collision with root package name */
        public final String f20668a;

        public RewardsDigitalWalletToken(String str) {
            this.f20668a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RewardsDigitalWalletToken) && Intrinsics.c(this.f20668a, ((RewardsDigitalWalletToken) obj).f20668a);
        }

        public final int hashCode() {
            return this.f20668a.hashCode();
        }

        public final String toString() {
            return a.h("RewardsDigitalWalletToken(connectToken=", this.f20668a, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsDigitalWalletQuery_ResponseAdapter.Data.f20689a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RewardsDigitalWallet { rewardsDigitalWalletToken { connectToken } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == RewardsDigitalWalletQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(RewardsDigitalWalletQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "a88b58560523bf7adda89834f0900cc0dbe5061a30c233499ece807de7af206f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsDigitalWallet";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
