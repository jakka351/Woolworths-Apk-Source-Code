package com.woolworths.rewards.account;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.account.adapter.DeleteAccountPageQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/account/DeleteAccountPageQuery$Data;", "Data", "DeleteAccountPage", "PrimaryCta", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountPageQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final DeleteAccountPage f20538a;

        public Data(DeleteAccountPage deleteAccountPage) {
            this.f20538a = deleteAccountPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20538a, ((Data) obj).f20538a);
        }

        public final int hashCode() {
            DeleteAccountPage deleteAccountPage = this.f20538a;
            if (deleteAccountPage == null) {
                return 0;
            }
            return deleteAccountPage.hashCode();
        }

        public final String toString() {
            return "Data(deleteAccountPage=" + this.f20538a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountPageQuery$DeleteAccountPage;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteAccountPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20539a;
        public final String b;
        public final String c;
        public final PrimaryCta d;
        public final String e;
        public final String f;

        public DeleteAccountPage(String str, String str2, String str3, PrimaryCta primaryCta, String str4, String str5) {
            this.f20539a = str;
            this.b = str2;
            this.c = str3;
            this.d = primaryCta;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteAccountPage)) {
                return false;
            }
            DeleteAccountPage deleteAccountPage = (DeleteAccountPage) obj;
            return Intrinsics.c(this.f20539a, deleteAccountPage.f20539a) && Intrinsics.c(this.b, deleteAccountPage.b) && Intrinsics.c(this.c, deleteAccountPage.c) && Intrinsics.c(this.d, deleteAccountPage.d) && Intrinsics.c(this.e, deleteAccountPage.e) && Intrinsics.c(this.f, deleteAccountPage.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c((this.d.hashCode() + b.c(b.c(this.f20539a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("DeleteAccountPage(navigationTitle=", this.f20539a, ", title=", this.b, ", markdownDescription=");
            sbV.append(this.c);
            sbV.append(", primaryCta=");
            sbV.append(this.d);
            sbV.append(", consentLabel=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", consentToken=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/DeleteAccountPageQuery$PrimaryCta;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20540a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f20540a = str;
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
            return Intrinsics.c(this.f20540a, primaryCta.f20540a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20540a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f20540a, ", url=", this.b, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(DeleteAccountPageQuery_ResponseAdapter.Data.f20613a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query DeleteAccountPage { deleteAccountPage { navigationTitle title markdownDescription primaryCta { label url } consentLabel consentToken } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == DeleteAccountPageQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(DeleteAccountPageQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "90ee8366e19f7c71269933e5282b4ba3951fbe437a33381898ca1f3b4bbe4070";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "DeleteAccountPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
