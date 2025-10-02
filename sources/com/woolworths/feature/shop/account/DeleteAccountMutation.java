package com.woolworths.feature.shop.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.account.adapter.DeleteAccountMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/account/DeleteAccountMutation$Data;", "Data", "DeleteAccount", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountMutation implements Mutation<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeleteAccount f19341a;

        public Data(DeleteAccount deleteAccount) {
            this.f19341a = deleteAccount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19341a, ((Data) obj).f19341a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19341a.f19342a);
        }

        public final String toString() {
            return "Data(deleteAccount=" + this.f19341a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountMutation$DeleteAccount;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteAccount {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19342a;

        public DeleteAccount(boolean z) {
            this.f19342a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteAccount) && this.f19342a == ((DeleteAccount) obj).f19342a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19342a);
        }

        public final String toString() {
            return a.n("DeleteAccount(success=", ")", this.f19342a);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeleteAccountMutation_ResponseAdapter.Data.f19384a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation DeleteAccount { deleteAccount { success } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == DeleteAccountMutation.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(DeleteAccountMutation.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c5e1c152b7162c26866603f196501ab3eace619a0245054ba7f43e0edf7cdca5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeleteAccount";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
