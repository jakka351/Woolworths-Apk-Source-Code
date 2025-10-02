package com.woolworths.rewards.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.DeleteAccountMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/account/DeleteAccountMutation$Data;", "Data", "DeleteAccount", "PrimaryCta", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DeleteAccountMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20534a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeleteAccount f20535a;

        public Data(DeleteAccount deleteAccount) {
            this.f20535a = deleteAccount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20535a, ((Data) obj).f20535a);
        }

        public final int hashCode() {
            DeleteAccount deleteAccount = this.f20535a;
            if (deleteAccount == null) {
                return 0;
            }
            return deleteAccount.hashCode();
        }

        public final String toString() {
            return "Data(deleteAccount=" + this.f20535a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountMutation$DeleteAccount;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteAccount {

        /* renamed from: a, reason: collision with root package name */
        public final String f20536a;
        public final String b;
        public final String c;
        public final PrimaryCta d;

        public DeleteAccount(String str, String str2, String str3, PrimaryCta primaryCta) {
            this.f20536a = str;
            this.b = str2;
            this.c = str3;
            this.d = primaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteAccount)) {
                return false;
            }
            DeleteAccount deleteAccount = (DeleteAccount) obj;
            return Intrinsics.c(this.f20536a, deleteAccount.f20536a) && Intrinsics.c(this.b, deleteAccount.b) && Intrinsics.c(this.c, deleteAccount.c) && Intrinsics.c(this.d, deleteAccount.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f20536a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeleteAccount(navigationTitle=", this.f20536a, ", title=", this.b, ", markdownDescription=");
            sbV.append(this.c);
            sbV.append(", primaryCta=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountMutation$PrimaryCta;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20537a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f20537a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f20537a, primaryCta.f20537a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20537a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f20537a, ", url=", this.b, ")");
        }
    }

    public DeleteAccountMutation(String str) {
        this.f20534a = str;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeleteAccountMutation_ResponseAdapter.Data.f20610a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DeleteAccount($consentToken: String!) { deleteAccount(consentToken: $consentToken) { navigationTitle title markdownDescription primaryCta { label url } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAccountMutation) && Intrinsics.c(this.f20534a, ((DeleteAccountMutation) obj).f20534a);
    }

    public final int hashCode() {
        return this.f20534a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "461c17cae29856056114c81d13445aa610057a70bc083e45fdc3ee8546ee41bc";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeleteAccount";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("consentToken");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20534a);
    }

    public final String toString() {
        return a.h("DeleteAccountMutation(consentToken=", this.f20534a, ")");
    }
}
