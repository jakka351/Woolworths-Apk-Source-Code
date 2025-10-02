package com.woolworths.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.redemptionsettings.adapter.SecureRewardsDollarsMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$Data;", "Data", "SecureRewardsDollars", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SecureRewardsDollarsMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21080a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SecureRewardsDollars f21081a;

        public Data(SecureRewardsDollars secureRewardsDollars) {
            this.f21081a = secureRewardsDollars;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21081a, ((Data) obj).f21081a);
        }

        public final int hashCode() {
            SecureRewardsDollars secureRewardsDollars = this.f21081a;
            if (secureRewardsDollars == null) {
                return 0;
            }
            return secureRewardsDollars.hashCode();
        }

        public final String toString() {
            return "Data(secureRewardsDollars=" + this.f21081a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/SecureRewardsDollarsMutation$SecureRewardsDollars;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecureRewardsDollars {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21082a;
        public final String b;

        public SecureRewardsDollars(boolean z, String str) {
            this.f21082a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecureRewardsDollars)) {
                return false;
            }
            SecureRewardsDollars secureRewardsDollars = (SecureRewardsDollars) obj;
            return this.f21082a == secureRewardsDollars.f21082a && Intrinsics.c(this.b, secureRewardsDollars.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f21082a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("SecureRewardsDollars(success=", this.f21082a, ", message=", this.b, ")");
        }
    }

    public SecureRewardsDollarsMutation(String token) {
        Intrinsics.h(token, "token");
        this.f21080a = token;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SecureRewardsDollarsMutation_ResponseAdapter.Data.f21093a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SecureRewardsDollars($token: String!) { secureRewardsDollars(token: $token) { success message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecureRewardsDollarsMutation) && Intrinsics.c(this.f21080a, ((SecureRewardsDollarsMutation) obj).f21080a);
    }

    public final int hashCode() {
        return this.f21080a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b72641630f80b28a45a8dceb37d8057bcb57d2c5a3ae7702cd9d0e88ce43f119";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SecureRewardsDollars";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("token");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f21080a);
    }

    public final String toString() {
        return YU.a.h("SecureRewardsDollarsMutation(token=", this.f21080a, ")");
    }
}
