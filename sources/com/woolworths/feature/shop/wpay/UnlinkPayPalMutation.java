package com.woolworths.feature.shop.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.UnlinkPayPalMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$Data;", "Data", "UnlinkPayPal", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnlinkPayPalMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20413a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UnlinkPayPal f20414a;

        public Data(UnlinkPayPal unlinkPayPal) {
            this.f20414a = unlinkPayPal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20414a, ((Data) obj).f20414a);
        }

        public final int hashCode() {
            return this.f20414a.hashCode();
        }

        public final String toString() {
            return "Data(unlinkPayPal=" + this.f20414a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkPayPalMutation$UnlinkPayPal;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkPayPal {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20415a;
        public final String b;

        public UnlinkPayPal(boolean z, String str) {
            this.f20415a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlinkPayPal)) {
                return false;
            }
            UnlinkPayPal unlinkPayPal = (UnlinkPayPal) obj;
            return this.f20415a == unlinkPayPal.f20415a && Intrinsics.c(this.b, unlinkPayPal.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20415a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("UnlinkPayPal(success=", this.f20415a, ", message=", this.b, ")");
        }
    }

    public UnlinkPayPalMutation(String payPalId) {
        Intrinsics.h(payPalId, "payPalId");
        this.f20413a = payPalId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UnlinkPayPalMutation_ResponseAdapter.Data.f20468a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UnlinkPayPal($payPalId: String!) { unlinkPayPal(payPalId: $payPalId) { success message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnlinkPayPalMutation) && Intrinsics.c(this.f20413a, ((UnlinkPayPalMutation) obj).f20413a);
    }

    public final int hashCode() {
        return this.f20413a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b440bdcc1f6d27240bff5868dadc7b07b80f2ec815dac8468035ca512dc1f8e6";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UnlinkPayPal";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("payPalId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20413a);
    }

    public final String toString() {
        return YU.a.h("UnlinkPayPalMutation(payPalId=", this.f20413a, ")");
    }
}
