package com.woolworths.feature.shop.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.account.adapter.DeleteAccountTnCQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery$Data;", "Data", "DeleteAccountTnC", "DeleteButton", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountTnCQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeleteAccountTnC f19343a;

        public Data(DeleteAccountTnC deleteAccountTnC) {
            this.f19343a = deleteAccountTnC;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19343a, ((Data) obj).f19343a);
        }

        public final int hashCode() {
            DeleteAccountTnC deleteAccountTnC = this.f19343a;
            if (deleteAccountTnC == null) {
                return 0;
            }
            return deleteAccountTnC.hashCode();
        }

        public final String toString() {
            return "Data(deleteAccountTnC=" + this.f19343a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery$DeleteAccountTnC;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteAccountTnC {

        /* renamed from: a, reason: collision with root package name */
        public final String f19344a;
        public final String b;
        public final String c;
        public final DeleteButton d;

        public DeleteAccountTnC(String str, String str2, String str3, DeleteButton deleteButton) {
            this.f19344a = str;
            this.b = str2;
            this.c = str3;
            this.d = deleteButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteAccountTnC)) {
                return false;
            }
            DeleteAccountTnC deleteAccountTnC = (DeleteAccountTnC) obj;
            return Intrinsics.c(this.f19344a, deleteAccountTnC.f19344a) && Intrinsics.c(this.b, deleteAccountTnC.b) && Intrinsics.c(this.c, deleteAccountTnC.c) && Intrinsics.c(this.d, deleteAccountTnC.d);
        }

        public final int hashCode() {
            return this.d.f19345a.hashCode() + b.c(b.c(this.f19344a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeleteAccountTnC(title=", this.f19344a, ", termsAndConditions=", this.b, ", termsAndConditionsAgreeText=");
            sbV.append(this.c);
            sbV.append(", deleteButton=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/DeleteAccountTnCQuery$DeleteButton;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19345a;

        public DeleteButton(String str) {
            this.f19345a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteButton) && Intrinsics.c(this.f19345a, ((DeleteButton) obj).f19345a);
        }

        public final int hashCode() {
            return this.f19345a.hashCode();
        }

        public final String toString() {
            return a.h("DeleteButton(label=", this.f19345a, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeleteAccountTnCQuery_ResponseAdapter.Data.f19386a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeleteAccountTnC { deleteAccountTnC { title termsAndConditions termsAndConditionsAgreeText deleteButton { label } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == DeleteAccountTnCQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(DeleteAccountTnCQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "04fdee051fa9156f34a4cfae5446f37a335e2a9e4d7b142eecadb68807deab52";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeleteAccountTnC";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
